package com.dao;

import org.springframework.stereotype.Repository;

@Repository
// 体检报告表pojo
public interface CheckReport {
    /**
     * 新增体检报告
     * @param checkReport
     * @return
     */
    public boolean insertCheckReport(CheckReport checkReport);

    /**
     * 更新体检报告
     * @param checkReport
     * @return
     */
    public boolean updateCheckReport(CheckReport checkReport);

}
