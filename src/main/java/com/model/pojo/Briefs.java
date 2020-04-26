package com.model.pojo;

import org.springframework.stereotype.Repository;

@Repository
// 小结表pojo
public class Briefs {
    private String briefId;         // 小结表id
    private Lists lists;            // 开单表pojo
    private String briefDesc;       // 小结描述
    private String briefName;       // 科室名

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

    @Override
    public String toString() {
        return "Briefs{" +
                "briefId='" + briefId + '\'' +
                ", lists=" + lists +
                ", briefDesc='" + briefDesc + '\'' +
                ", briefName='" + briefName + '\'' +
                '}';
    }
}
