package com.model.pojo;

import org.springframework.stereotype.Repository;

@Repository
// 小结表pojo
public class Briefs {
    private String briefId;         // 小结表id
    private Lists lists;            // 开单表pojo
    private Integer listId;         // 关联lists外键
    private String briefDesc;       // 小结描述
    private String briefName;       // 科室名
    private String briefItemName;       // 项目名称
    private String briefCmp;        // 是否已完成
    private String briefUser;       // 检查医生
    private String briefPay;        // 是否缴费
    private String briefBetchNo;    // 流水号
    private String briefCardNo;     // 卡片编号
    private String briefPerson;      // 体检人


    public String getBriefId() {
        return briefId;
    }

    public void setBriefId(String briefId) {
        this.briefId = briefId;
    }

    public Integer getListId() {
        return listId;
    }

    public void setListId(Integer listId) {
        this.listId = listId;
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

    public String getBriefItemName() {
        return briefItemName;
    }

    public void setBriefItemName(String briefItemName) {
        this.briefItemName = briefItemName;
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

    public String getBriefPay() {
        return briefPay;
    }

    public void setBriefPay(String briefPay) {
        this.briefPay = briefPay;
    }

    public String getBriefBetchNo() {
        return briefBetchNo;
    }

    public void setBriefBetchNo(String briefBetchNo) {
        this.briefBetchNo = briefBetchNo;
    }

    public String getBriefCardNo() {
        return briefCardNo;
    }

    public void setBriefCardNo(String briefCardNo) {
        this.briefCardNo = briefCardNo;
    }

    public String getBriefPerson() {
        return briefPerson;
    }

    public void setBriefPerson(String briefPerson) {
        this.briefPerson = briefPerson;
    }

    @Override
    public String toString() {
        return "Briefs{" +
                "briefId='" + briefId + '\'' +
                ", lists=" + lists +
                ", briefDesc='" + briefDesc + '\'' +
                ", briefName='" + briefName + '\'' +
                ", briefItemName='" + briefItemName + '\'' +
                ", briefCmp='" + briefCmp + '\'' +
                ", briefUser='" + briefUser + '\'' +
                ", briefPay='" + briefPay + '\'' +
                ", briefBetchNo='" + briefBetchNo + '\'' +
                ", briefCardNo='" + briefCardNo + '\'' +
                ", briefPerson='" + briefPerson + '\'' +
                '}';
    }
}
