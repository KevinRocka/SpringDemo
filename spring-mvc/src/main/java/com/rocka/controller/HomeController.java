package com.rocka.controller;

import com.rocka.dao.Home;
import com.rocka.service.HomeService;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: Rocka
 * @version: 1.0
 * @description: TODO
 * @time:2018/11/5
 */
@Controller
@RequestMapping("/home")
public class HomeController {
    private static Logger log = LoggerFactory.getLogger(HomeController.class);

    private HomeService homeService;

    @Autowired
    public void setHomeService(HomeService homeService) {
        this.homeService = homeService;
    }

    //方式1：字符串参数来处理http://localhost:8080/home/index?homeId=4777
    //返回index，是返回jsp页面的名称
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(@RequestParam("homeId") Integer homeId, Model model) {
        log.debug("This is a out put homeId = {}", homeId);
        Home home = homeService.getHomeById(homeId);
        model.addAttribute(home);
        return "index";
    }

    //方式2：使用路径变量来处理http://localhost:8080/home/index2/5666
    @RequestMapping(value = "/index2/{homeId}", method = RequestMethod.GET)
    public String index2(@PathVariable("homeId") Integer homeId, Map<String, Object> map) {
        log.debug("This is a out put homeId = {}", homeId);
        Home home = homeService.getHomeById(homeId);
        map.put("home", home);
        return "index";
    }

    //方式3：使用HttpServletRequest处理http://localhost:8080/home/index3?homeId=333
    @RequestMapping(value = "index3", method = RequestMethod.GET)
    public String index3(HttpServletRequest httpServletRequest) {
        Integer homeId = Integer.valueOf(httpServletRequest.getParameter("homeId"));
        Home home = homeService.getHomeById(homeId);
        httpServletRequest.setAttribute("home", home);
        return "index";
    }


    //访问地址:http://localhost:8080/home/admin?add
    @RequestMapping(value = "/admin", method = RequestMethod.GET, params = "add")
    public String createHome() {
        return "create";
    }


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveForum(@ModelAttribute Home home) {
        //可以进行数据库持久化操作。
        System.out.println(ReflectionToStringBuilder.toString(home));
        return "redirect:index2/" + home.getId();
    }

    //访问地址:http://localhost:8080/home/showUpload
    @RequestMapping(value = "/showUpload", method = RequestMethod.GET)
    public String showUploadPage() {
        return "upload";
    }


    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String upload(@RequestParam("file") MultipartFile file) throws IOException {
        if (!file.isEmpty()) {
            FileUtils.copyInputStreamToFile(file.getInputStream(), new File("/Users/Rocka/" + file.getOriginalFilename()));
        }
        return "success";
    }

    //访问地址:http://localhost:8080/home/33333
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody Home getHomeInJson(@PathVariable Integer id) {
        return homeService.getHomeById(id);
    }

    //访问地址:http://localhost:8080/home/jsontype/33333
    @RequestMapping(value = "/jsontype/{id}", method = RequestMethod.GET)
    public ResponseEntity<Home> getHomeInJson2(@PathVariable Integer id) {
        Home home = homeService.getHomeById(id);
        return new ResponseEntity<>(home, HttpStatus.OK);
    }
}
