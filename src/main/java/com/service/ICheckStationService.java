package com.service;

import java.util.List;

public interface ICheckStationService {
    /**
     *
     * 开单
     * @author Luke
     * @param cardNos   卡片编号
     * @param itemNames  要开单的项目名称
     * @return
     */
    public boolean createList(String cardNos, List<String> itemNames);

}
