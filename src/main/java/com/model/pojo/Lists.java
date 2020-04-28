package com.model.pojo;

import java.util.Date;

// 开单表pojo
public class Lists {
    private Integer listId;         // 开单表id
    private Batches batches;        // 流水表pojo;
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
                ", listName='" + listName + '\'' +
                ", listType='" + listType + '\'' +
                ", listPrice=" + listPrice +
                '}';
    }
}
