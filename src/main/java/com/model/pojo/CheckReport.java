package com.model.pojo;

// 体检报告表pojo
public class CheckReport {
    private Integer chkId;          // 体检报告id
    private String chkItemName;     // 项目名称
    private String chkSub;          // 子项目名称
    private String chkScope;        // 参考范围
    private String chkUnit;         // 单位
    private Batches batches;        // 流水表pojo
    private String chk_result;      // 检查结果
    private String chk_prompt;      // 提示
    private String chk_sum;         // 小结
    private String chk_bmp;         // 影像路径
    private String chk_user;        // 检查医生

    public Integer getChkId() {
        return chkId;
    }

    public void setChkId(Integer chkId) {
        this.chkId = chkId;
    }

    public String getChkItemName() {
        return chkItemName;
    }

    public void setChkItemName(String chkItemName) {
        this.chkItemName = chkItemName;
    }

    public String getChkSub() {
        return chkSub;
    }

    public void setChkSub(String chkSub) {
        this.chkSub = chkSub;
    }

    public String getChkScope() {
        return chkScope;
    }

    public void setChkScope(String chkScope) {
        this.chkScope = chkScope;
    }

    public String getChkUnit() {
        return chkUnit;
    }

    public void setChkUnit(String chkUnit) {
        this.chkUnit = chkUnit;
    }

    public Batches getBatches() {
        return batches;
    }

    public void setBatches(Batches batches) {
        this.batches = batches;
    }

    public String getChk_result() {
        return chk_result;
    }

    public void setChk_result(String chk_result) {
        this.chk_result = chk_result;
    }

    public String getChk_prompt() {
        return chk_prompt;
    }

    public void setChk_prompt(String chk_prompt) {
        this.chk_prompt = chk_prompt;
    }

    public String getChk_sum() {
        return chk_sum;
    }

    public void setChk_sum(String chk_sum) {
        this.chk_sum = chk_sum;
    }

    public String getChk_bmp() {
        return chk_bmp;
    }

    public void setChk_bmp(String chk_bmp) {
        this.chk_bmp = chk_bmp;
    }

    public String getChk_user() {
        return chk_user;
    }

    public void setChk_user(String chk_user) {
        this.chk_user = chk_user;
    }

    @Override
    public String toString() {
        return "CheckReport{" +
                "chkId=" + chkId +
                ", chkItemName='" + chkItemName + '\'' +
                ", chkSub='" + chkSub + '\'' +
                ", chkScope='" + chkScope + '\'' +
                ", chkUnit='" + chkUnit + '\'' +
                ", batches=" + batches +
                ", chk_result='" + chk_result + '\'' +
                ", chk_prompt='" + chk_prompt + '\'' +
                ", chk_sum='" + chk_sum + '\'' +
                ", chk_bmp='" + chk_bmp + '\'' +
                ", chk_user='" + chk_user + '\'' +
                '}';
    }
}
