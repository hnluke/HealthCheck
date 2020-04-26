package com.model.pojo;

import org.springframework.stereotype.Repository;

// 卡片表pojo
@Repository
public class Cards {
    private Integer cardId;         // 卡片id
    private String cardNo;          // 卡片编号

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    @Override
    public String toString() {
        return "Cards{" +
                "cardId=" + cardId +
                ", cardNo='" + cardNo + '\'' +
                '}';
    }
}
