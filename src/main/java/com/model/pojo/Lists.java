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
    private String listName;        // 名称
    private String listType;        // 性质
    private Double listPrice;       // 价格

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

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public String getListType() {
        return listType;
    }

    public void setListType(String listType) {
        this.listType = listType;
    }

    public Double getListPrice() {
        return listPrice;
    }

    public void setListPrice(Double listPrice) {
        this.listPrice = listPrice;
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
                ", listName='" + listName + '\'' +
                ", listType='" + listType + '\'' +
                ", listPrice=" + listPrice +
                '}';
    }
}
