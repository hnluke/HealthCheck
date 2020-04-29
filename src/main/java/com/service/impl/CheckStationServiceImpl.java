package com.service.impl;

import com.dao.BatchesMapper;
import com.dao.BriefsMapper;
import com.dao.UnionQueryMapper;
import com.model.pojo.Batches;
import com.service.ICheckStationService;
import org.springframework.beans.factory.annotation.Autowired;

public class CheckStationServiceImpl  implements ICheckStationService {
    /**
     * 开单
     * @param cardNos 卡片编号
     * @return
     */
    @Autowired
    private BatchesMapper batchesMapper;
    @Autowired
    private UnionQueryMapper unionQueryMapper;
    @Autowired
    private BriefsMapper briefsMapper;
    @Override
    public boolean createList(String cardNos) {
        boolean flag = false;

        return flag;
    }
}
