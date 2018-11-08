package com.rocka;


import com.rocka.security.CurrentUserHolder;
import com.rocka.service.ProductService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringAopApplicationTests {

    @Autowired
    ProductService productService;

    @Test(expected = Exception.class)
    public void adminDelete() {
        CurrentUserHolder.set("Rocka");
        productService.deleteWithOnlyCheck(1l);
        System.out.println("------------------------------Done------------------------------");
    }

    @Test
    public void adminInsert() {
        CurrentUserHolder.set("admin");
        productService.insertWithOnlyCheck(1l);
        System.out.println("------------------------------Done------------------------------");
    }

    @Test
    public void adminAnnotDelete() {
        CurrentUserHolder.set("admin");
        productService.delete(1l);
        System.out.println("------------------------------Done------------------------------");
    }

    @Test
    public void admiAnnotInsert() {
        CurrentUserHolder.set("Rocka");
        productService.insert(1l);
        System.out.println("------------------------------Done------------------------------");
    }

}
