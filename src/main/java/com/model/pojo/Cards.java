package com.model.pojo;

import org.springframework.stereotype.Repository;

// 卡片表pojo
@Repository
public class Cards {
    private Integer cardId;         // 卡片id
    private String cardNo;          // 卡片编号
    private Double cardMoney;       // 余额
    private Person person;          // 体检人pojo

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

    public Double getCardMoney() {
        return cardMoney;
    }

    public void setCardMoney(Double cardMoney) {
        this.cardMoney = cardMoney;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Cards{" +
                "cardId=" + cardId +
                ", cardNo='" + cardNo + '\'' +
                ", cardMoney=" + cardMoney +
                ", person=" + person +
                '}';
    }
}
