package com.model.pojo;

// 小结明细表pojo
public class Detail {
    private Integer detId;          // 小结明细表id
    private Briefs briefs;          // 小结表pojo
    private SubItem subItem;        // 子项目pojo
    private String detItemName;     // 子项目名称
    private String detResult;       // 结果
    private String detPrompt;       // 提示
    private String detCmp;          // 是否已完成
    private String detBmp;          // 影像路径


    public Integer getDetId() {
        return detId;
    }

    public void setDetId(Integer detId) {
        this.detId = detId;
    }

    public Briefs getBriefs() {
        return briefs;
    }

    public void setBriefs(Briefs briefs) {
        this.briefs = briefs;
    }

    public SubItem getSubItem() {
        return subItem;
    }

    public void setSubItem(SubItem subItem) {
        this.subItem = subItem;
    }

    public String getDetItemName() {
        return detItemName;
    }

    public void setDetItemName(String detItemName) {
        this.detItemName = detItemName;
    }

    public String getDetResult() {
        return detResult;
    }

    public void setDetResult(String detResult) {
        this.detResult = detResult;
    }

    public String getDetPrompt() {
        return detPrompt;
    }

    public void setDetPrompt(String detPrompt) {
        this.detPrompt = detPrompt;
    }

    public String getDetCmp() {
        return detCmp;
    }

    public void setDetCmp(String detCmp) {
        this.detCmp = detCmp;
    }

    public String getDetBmp() {
        return detBmp;
    }

    public void setDetBmp(String detBmp) {
        this.detBmp = detBmp;
    }

    @Override
    public String toString() {
        return "Detail{" +
                "detId=" + detId +
                ", briefs=" + briefs +
                ", subItem=" + subItem +
                ", detItemName='" + detItemName + '\'' +
                ", detResult='" + detResult + '\'' +
                ", detPrompt='" + detPrompt + '\'' +
                ", detCmp='" + detCmp + '\'' +
                ", detBmp='" + detBmp + '\'' +
                '}';
    }
}
