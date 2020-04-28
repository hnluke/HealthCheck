package com.model.pojo;

import org.springframework.stereotype.Repository;

// 套餐表pojo
@Repository
public class Association {
    private Integer assoId;         // 套餐id
    private String assoName;        // 套餐名称
    private AssoItem asso_item;    // 套项表pojo;
    private Double asso_price;      // 套餐价格

    public Integer getAssoId() {
        return assoId;
    }

    public void setAssoId(Integer assoId) {
        this.assoId = assoId;
    }

    public String getAssoName() {
        return assoName;
    }

    public void setAssoName(String assoName) {
        this.assoName = assoName;
    }

    public AssoItem getAsso_item() {
        return asso_item;
    }

    public void setAsso_item(AssoItem asso_item) {
        this.asso_item = asso_item;
    }

    public Double getAsso_price() {
        return asso_price;
    }

    public void setAsso_price(Double asso_price) {
        this.asso_price = asso_price;
    }
}
