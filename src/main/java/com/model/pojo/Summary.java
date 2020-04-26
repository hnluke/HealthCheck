package com.model.pojo;

import org.springframework.stereotype.Repository;

import java.util.Date;

// 体检总结表pojo
@Repository
public class Summary {
    private Integer sumId;          // 总结表id
    private String sumName;         // 总结表名称
    private Date sumDate;           // 体检日期
    private Person person;          // 体检人pojo
    private String sumDesc;       // 总结表描述


    public Integer getSumId() {
        return sumId;
    }

    public void setSumId(Integer sumId) {
        this.sumId = sumId;
    }

    public String getSumName() {
        return sumName;
    }

    public void setSumName(String sumName) {
        this.sumName = sumName;
    }

    public Date getSumDate() {
        return sumDate;
    }

    public void setSumDate(Date sumDate) {
        this.sumDate = sumDate;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getSumDesc() {
        return sumDesc;
    }

    public void setSumDesc(String sumDesc) {
        this.sumDesc = sumDesc;
    }

    @Override
    public String toString() {
        return "Summary{" +
                "sumId=" + sumId +
                ", sumName='" + sumName + '\'' +
                ", sumDate=" + sumDate +
                ", person=" + person +
                ", sumDesc='" + sumDesc + '\'' +
                '}';
    }
}
