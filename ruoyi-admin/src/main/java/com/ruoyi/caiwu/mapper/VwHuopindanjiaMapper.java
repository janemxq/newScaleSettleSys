package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.VwHuopindanjia;

/**
 * VIEWMapper接口
 * 
 * @author ruoyi
 * @date 2021-09-25
 */
public interface VwHuopindanjiaMapper 
{
    /**
     * 查询VIEW
     * 
     * @param id VIEW主键
     * @return VIEW
     */
    public VwHuopindanjia selectVwHuopindanjiaById(Long id);

    /**
     * 查询VIEW列表
     * 
     * @param vwHuopindanjia VIEW
     * @return VIEW集合
     */
    public List<VwHuopindanjia> selectVwHuopindanjiaList(VwHuopindanjia vwHuopindanjia);

    /**
     * 新增VIEW
     * 
     * @param vwHuopindanjia VIEW
     * @return 结果
     */
    public int insertVwHuopindanjia(VwHuopindanjia vwHuopindanjia);

    /**
     * 修改VIEW
     * 
     * @param vwHuopindanjia VIEW
     * @return 结果
     */
    public int updateVwHuopindanjia(VwHuopindanjia vwHuopindanjia);

    /**
     * 删除VIEW
     * 
     * @param id VIEW主键
     * @return 结果
     */
    public int deleteVwHuopindanjiaById(Long id);

    /**
     * 批量删除VIEW
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVwHuopindanjiaByIds(Long[] ids);
}
