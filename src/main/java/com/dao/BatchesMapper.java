package com.dao;

import com.model.pojo.Batches;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BatchesMapper {
    /**
     * 新增流水记录
     * @param batches 流水表对象
     * @return
     */
    public boolean insertBatches(Batches batches);

    /**
     * 更新流水表
     * @param ifPay     是否缴费。参考值（"已缴费", "未缴费"）
     * @param ifComp    是否完成。参考值("已完成", "未完成")
     * @param id        流水表id
     * @return
     */
    public boolean updateBatches(@Param("ifPay") String ifPay,
                                 @Param("ifComp") String ifComp,
                                 @Param("id") Integer id);

    /**
     * 查询流水表
     * @param id  依据流水表id查询，如果id=0，则查询所有的流水记录
     * @return 流水表对象
     */
    public List<Batches> findBatches(Integer id);
}
