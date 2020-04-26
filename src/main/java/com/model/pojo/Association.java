package com.model.pojo;

import org.springframework.stereotype.Repository;

// 套餐表pojo
@Repository
public class Association {
    private Integer assoId;         // 套餐id
    private String assoName;        // 套餐名称
    private Asso_Item asso_item;    // 套项表pojo;

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

    public Asso_Item getAsso_item() {
        return asso_item;
    }

    public void setAsso_item(Asso_Item asso_item) {
        this.asso_item = asso_item;
    }
}
