package com.model.pojo;

import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Date;

@Repository
// 流水表pojo
public class Batches implements Serializable {
    public final static long serialVersionUID = 111L;
    private Integer batchId;        // 流水id
    private Integer listId;         // 开单表id
    private String batchNo;         // 流水号
    private String batchPay;        // 是否缴费(参考值："已缴费", "未缴费")
    private Person person;          // 体检人表pojo
    private Integer perId;          // 外键(关系表person的id)
    private Summary summary;        // 体检总结表pojo
    private String batchCmp;        // 是否已经完成（参考值："已完成", "未完成"）
    private Integer sumId;          // 体检总结表id
    private Date batchDate;         // 流水日期

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

    public Integer getListId() {
        return listId;
    }

    public void setListId(Integer listId) {
        this.listId = listId;
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

    public Integer getSumId() {
        return sumId;
    }

    public void setSumId(Integer sumId) {
        this.sumId = sumId;
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


