package com.model.pojo;

import org.springframework.stereotype.Repository;

// 权限表pojo
@Repository
public class Priority {
    private Integer prioId;        // 权限表id
    private String prioName;       // 权限名

    public Integer getPrioId() {
        return prioId;
    }

    public void setPrioId(Integer prioId) {
        this.prioId = prioId;
    }

    public String getPrioName() {
        return prioName;
    }

    public void setPrioName(String prioName) {
        this.prioName = prioName;
    }

    @Override
    public String toString() {
        return "Priority{" +
                "prioId=" + prioId +
                ", prioName='" + prioName + '\'' +
                '}';
    }
}
