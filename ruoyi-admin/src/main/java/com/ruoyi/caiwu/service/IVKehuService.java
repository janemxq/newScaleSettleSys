package com.ruoyi.caiwu.service;

import java.util.List;
import com.ruoyi.caiwu.domain.VKehu;

/**
 * VIEWService接口
 * 
 * @author ruoyi
 * @date 2021-09-23
 */
public interface IVKehuService 
{
    /**
     * 查询VIEW
     * 
     * @param id VIEW主键
     * @return VIEW
     */
    public VKehu selectVKehuById(Long id);

    /**
     * 查询VIEW列表
     * 
     * @param vKehu VIEW
     * @return VIEW集合
     */
    public List<VKehu> selectVKehuList(VKehu vKehu);

    /**
     * 新增VIEW
     * 
     * @param vKehu VIEW
     * @return 结果
     */
    public int insertVKehu(VKehu vKehu);

    /**
     * 修改VIEW
     * 
     * @param vKehu VIEW
     * @return 结果
     */
    public int updateVKehu(VKehu vKehu);

    /**
     * 批量删除VIEW
     * 
     * @param ids 需要删除的VIEW主键集合
     * @return 结果
     */
    public int deleteVKehuByIds(Long[] ids);

    /**
     * 删除VIEW信息
     * 
     * @param id VIEW主键
     * @return 结果
     */
    public int deleteVKehuById(Long id);
}
