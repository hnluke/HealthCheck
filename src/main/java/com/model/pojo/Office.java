package com.model.pojo;

import org.springframework.stereotype.Repository;

// 科室表pojo
@Repository
public class Office {
    private Integer offId;      // 科室表id
    private String offName;     // 科室名称

    public Integer getOffId() {
        return offId;
    }

    public void setOffId(Integer offId) {
        this.offId = offId;
    }

    public String getOffName() {
        return offName;
    }

    public void setOffName(String offName) {
        this.offName = offName;
    }
}
