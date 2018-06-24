package com.spider.pojo;

public class Student {
    private Integer id;

    private String stdnum;

    private String name;

    private String gender;

    private String classnum;

    private String major;

    private String academy;

    private String campus;

    private String stdtype;

    private String tel;

    private String qq;

    private Integer permission;

    public Student(Integer id, String stdnum, String name, String gender, String classnum, String major, String academy, String campus, String stdtype, String tel, String qq, Integer permission) {
        this.id = id;
        this.stdnum = stdnum;
        this.name = name;
        this.gender = gender;
        this.classnum = classnum;
        this.major = major;
        this.academy = academy;
        this.campus = campus;
        this.stdtype = stdtype;
        this.tel = tel;
        this.qq = qq;
        this.permission = permission;
    }

    public Student() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStdnum() {
        return stdnum;
    }

    public void setStdnum(String stdnum) {
        this.stdnum = stdnum == null ? null : stdnum.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getClassnum() {
        return classnum;
    }

    public void setClassnum(String classnum) {
        this.classnum = classnum == null ? null : classnum.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy == null ? null : academy.trim();
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus == null ? null : campus.trim();
    }

    public String getStdtype() {
        return stdtype;
    }

    public void setStdtype(String stdtype) {
        this.stdtype = stdtype == null ? null : stdtype.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public Integer getPermission() {
        return permission;
    }

    public void setPermission(Integer permission) {
        this.permission = permission;
    }
}