package com.model.pojo;

import org.springframework.stereotype.Repository;

@Repository
// 小结表pojo
public class Briefs {
    private String briefId;         // 小结表id
    private Lists lists;            // 开单表pojo
    private String briefDesc;       // 小结描述
    private String briefName;       // 科室名
    private String briefItem;       // 项目名称
    private String briefCmp;        // 是否已完成
    private String briefUser;       // 检查医生

    public String getBriefId() {
        return briefId;
    }

    public void setBriefId(String briefId) {
        this.briefId = briefId;
    }

    public Lists getLists() {
        return lists;
    }

    public void setLists(Lists lists) {
        this.lists = lists;
    }

    public String getBriefDesc() {
        return briefDesc;
    }

    public void setBriefDesc(String briefDesc) {
        this.briefDesc = briefDesc;
    }

    public String getBriefName() {
        return briefName;
    }

    public void setBriefName(String briefName) {
        this.briefName = briefName;
    }

    public String getBriefItem() {
        return briefItem;
    }

    public void setBriefItem(String briefItem) {
        this.briefItem = briefItem;
    }

    public String getBriefCmp() {
        return briefCmp;
    }

    public void setBriefCmp(String briefCmp) {
        this.briefCmp = briefCmp;
    }

    public String getBriefUser() {
        return briefUser;
    }

    public void setBriefUser(String briefUser) {
        this.briefUser = briefUser;
    }

    @Override
    public String toString() {
        return "Briefs{" +
                "briefId='" + briefId + '\'' +
                ", lists=" + lists +
                ", briefDesc='" + briefDesc + '\'' +
                ", briefName='" + briefName + '\'' +
                ", briefItem='" + briefItem + '\'' +
                ", briefCmp='" + briefCmp + '\'' +
                ", briefUser='" + briefUser + '\'' +
                '}';
    }
}
