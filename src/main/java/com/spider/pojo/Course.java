package com.spider.pojo;

public class Course {
    private Integer id;

    private String num;

    private String name;

    private String index;

    private Float score;

    private String testtype;

    private String academy;

    private String teacher;

    private Integer day;

    private Integer time;

    private String campus;

    private String building;

    private String room;

    private Integer weekstart;

    private Integer weekend;

    private String remark;

    public Course(Integer id, String num, String name, String index, Float score, String testtype, String academy, String teacher, Integer day, Integer time, String campus, String building, String room, Integer weekstart, Integer weekend, String remark) {
        this.id = id;
        this.num = num;
        this.name = name;
        this.index = index;
        this.score = score;
        this.testtype = testtype;
        this.academy = academy;
        this.teacher = teacher;
        this.day = day;
        this.time = time;
        this.campus = campus;
        this.building = building;
        this.room = room;
        this.weekstart = weekstart;
        this.weekend = weekend;
        this.remark = remark;
    }

    public Course() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num == null ? null : num.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index == null ? null : index.trim();
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public String getTesttype() {
        return testtype;
    }

    public void setTesttype(String testtype) {
        this.testtype = testtype == null ? null : testtype.trim();
    }

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy == null ? null : academy.trim();
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher == null ? null : teacher.trim();
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus == null ? null : campus.trim();
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building == null ? null : building.trim();
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room == null ? null : room.trim();
    }

    public Integer getWeekstart() {
        return weekstart;
    }

    public void setWeekstart(Integer weekstart) {
        this.weekstart = weekstart;
    }

    public Integer getWeekend() {
        return weekend;
    }

    public void setWeekend(Integer weekend) {
        this.weekend = weekend;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}