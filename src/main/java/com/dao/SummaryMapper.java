package com.dao;

import org.springframework.stereotype.Repository;
// 体检总结表pojo
@Repository
public interface SummaryMapper {
    /**
     * 新增体检总结记录
     * @param summaryMapper
     * @return
     */
    public boolean insertSummary(SummaryMapper summaryMapper);

}
