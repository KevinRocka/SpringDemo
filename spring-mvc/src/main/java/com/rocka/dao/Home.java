package com.rocka.dao;

/**
 * @author: Rocka
 * @version: 1.0
 * @description: 模型类(与JSP里的界面文件进行名称匹配)
 * @time:2018/11/5
 */
public class Home {

    int id;
    String name;
    String title;
    String content;
    String inter;
    String desc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
