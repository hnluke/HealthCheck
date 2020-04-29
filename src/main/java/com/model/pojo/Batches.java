package com.model.pojo;

import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
// 流水表pojo
public class Batches {
    private Integer batchId;        // 流水id
    private String batchNo;         // 流水号
    private String batchPay;        // 是否缴费(参考值："已缴费", "未缴费")
    private Person person;          // 体检人表pojo
    private Integer perId;          // 外键(关系表person的id)
    private Summary summary;        // 体检总结表pojo
    private String batchCmp;        // 是否已经完成（参考值："已完成", "未完成"）
    private Date batchDate;

    public Integer getBatchId() {
        return batchId;
    }

    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getBatchPay() {
        return batchPay;
    }

    public void setBatchPay(String batchPay) {
        this.batchPay = batchPay;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    public String getBatchCmp() {
        return batchCmp;
    }

    public void setBatchCmp(String batchCmp) {
        this.batchCmp = batchCmp;
    }

    public Date getBatchDate() {
        return batchDate;
    }

    public void setBatchDate(Date batchDate) {
        this.batchDate = batchDate;
    }

    public Integer getPerId() {
        return perId;
    }

    public void setPerId(Integer perId) {
        this.perId = perId;
    }

    @Override
    public String toString() {
        return "Batches{" +
                "batchId=" + batchId +
                ", batchNo='" + batchNo + '\'' +
                ", batchPay='" + batchPay + '\'' +
                ", person=" + person +
                ", summary=" + summary +
                ", batchCmp='" + batchCmp + '\'' +
                ", batchDate=" + batchDate +
                '}';
    }
}


