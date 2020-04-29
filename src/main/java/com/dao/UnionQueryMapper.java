package com.dao;

import com.model.pojo.Cards;
import com.model.pojo.Item;
import com.model.pojo.Person;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UnionQueryMapper {
    /**
     * 依据卡片编号来对卡片表-检查人表关联查询
     * @param cardNos   卡片编号，如果是""或null ,则查询全部的记录
     * @return
     */
    public List<Cards> queryCardsPerson(@Param("cardNos") String cardNos);

    /**
     * 关联查询套餐及项目信息(套餐表-项目表-项目类别表-科室表)
     * @param assoName  套餐名
     * @param itemName
     * @return 返回Item对象列表
     */
    public List<Item> queryAssoItemTypeOff(@Param("assoName") String assoName,
                                           @Param("itemName") String itemName);


}
