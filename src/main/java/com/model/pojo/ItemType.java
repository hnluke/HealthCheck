package com.model.pojo;

import org.springframework.stereotype.Repository;

// 项目类别表pojo
@Repository
public class ItemType {
    private Integer typeId;        // 项目类别id
    private String typeName;       // 项目类别名称

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
