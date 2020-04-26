package com.dao;

import com.model.pojo.Batches;
import com.model.pojo.Lists;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ListsMapper {
    /**
     *  向开单表插入数据
     * @param lists 开单表对象
     * @return
     */
    public boolean insertBatches(Lists lists);

    /**
     *  更新开单表id对应的记录
     * @param list  是否开单。参考值"已开单"， "未开单"
     * @param comp  是否已完成体检。参考值"已完成", "未完成"
     * @param pay   是否已缴费。参考值"已缴费", "未缴费"
     * @param id   开单表id
     * @return
     */
    public boolean updateBatches(@Param("list") String list,
                                 @Param("comp") String comp,
                                 @Param("pay") String pay,
                                 @Param("id") Integer id);

    /**
     * 删除开单表记录
     * @param id 依据开单表id删除对应的开单记录。
     * @return
     */
    public boolean deleteLists(Integer id);

    /**
     * 依据开单表id来查询开单记录，如果id为0，则查询所有的开单记录
     * @param id
     * @return
     */
    public List<Lists> findLists(Integer id);
}
