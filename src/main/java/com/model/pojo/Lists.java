package com.model.pojo;

import java.util.Date;

// 开单表pojo
public class Lists {
    private Integer listId;         // 开单表id
    private Batches batches;        // 流水表pojo;
    private String listIf;          // 是否开单 (参考值："已开单", "未开单")
    private String listComp;        // 是否完成体检(参考值："已完成", "未完成")
    private String listPay;         // 是否已缴费(参考值："已缴费", "未缴费")
    private Date listDate;          // 开单日期
    private String listItemName;    // 项目名称

    public Integer getListId() {
        return listId;
    }

    public void setListId(Integer listId) {
        this.listId = listId;
    }

    public Batches getBatches() {
        return batches;
    }

    public void setBatches(Batches batches) {
        this.batches = batches;
    }

    public String getListIf() {
        return listIf;
    }

    public void setListIf(String listIf) {
        this.listIf = listIf;
    }

    public String getListComp() {
        return listComp;
    }

    public void setListComp(String listComp) {
        this.listComp = listComp;
    }

    public String getListPay() {
        return listPay;
    }

    public void setListPay(String listPay) {
        this.listPay = listPay;
    }

    public Date getListDate() {
        return listDate;
    }

    public void setListDate(Date listDate) {
        this.listDate = listDate;
    }

    public String getListItemName() {
        return listItemName;
    }

    public void setListItemName(String listItemName) {
        this.listItemName = listItemName;
    }

    @Override
    public String toString() {
        return "Lists{" +
                "listId=" + listId +
                ", batches=" + batches +
                ", listIf='" + listIf + '\'' +
                ", listComp='" + listComp + '\'' +
                ", listPay='" + listPay + '\'' +
                ", listDate=" + listDate +
                ", listItemName='" + listItemName + '\'' +
                '}';
    }
}
