package com.spider.pojo;

import java.util.Date;

public class Feedback {
    private Integer id;

    private String content;

    private Date time;

    private Integer status;

    public Feedback(Integer id, String content, Date time, Integer status) {
        this.id = id;
        this.content = content;
        this.time = time;
        this.status = status;
    }

    public Feedback() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}