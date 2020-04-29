package com.service;

public interface ICheckStationService {
    /**
     * 开单
     * @param cardNos 卡片编号
     * @return
     */
    public boolean createList(String cardNos);

}
