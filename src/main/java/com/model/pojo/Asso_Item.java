package com.model.pojo;

import org.springframework.stereotype.Repository;

// 套项表pojo
@Repository
public class Asso_Item {
    private Integer assoId;     // 套餐id
    private Integer itemId;     // 项目id

    public Integer getAssoId() {
        return assoId;
    }

    public void setAssoId(Integer assoId) {
        this.assoId = assoId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }
}