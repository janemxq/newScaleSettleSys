package com.ruoyi.caiwu.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.caiwu.mapper.VKehuMapper;
import com.ruoyi.caiwu.domain.VKehu;
import com.ruoyi.caiwu.service.IVKehuService;

/**
 * VIEWService业务层处理
 * 
 * @author ruoyi
 * @date 2021-09-23
 */
@Service
public class VKehuServiceImpl implements IVKehuService 
{
    @Autowired
    private VKehuMapper vKehuMapper;

    /**
     * 查询VIEW
     * 
     * @param id VIEW主键
     * @return VIEW
     */
    @Override
    public VKehu selectVKehuById(Long id)
    {
        return vKehuMapper.selectVKehuById(id);
    }

    /**
     * 查询VIEW列表
     * 
     * @param vKehu VIEW
     * @return VIEW
     */
    @Override
    public List<VKehu> selectVKehuList(VKehu vKehu)
    {
        return vKehuMapper.selectVKehuList(vKehu);
    }

    /**
     * 新增VIEW
     * 
     * @param vKehu VIEW
     * @return 结果
     */
    @Override
    public int insertVKehu(VKehu vKehu)
    {
        return vKehuMapper.insertVKehu(vKehu);
    }

    /**
     * 修改VIEW
     * 
     * @param vKehu VIEW
     * @return 结果
     */
    @Override
    public int updateVKehu(VKehu vKehu)
    {
        return vKehuMapper.updateVKehu(vKehu);
    }

    /**
     * 批量删除VIEW
     * 
     * @param ids 需要删除的VIEW主键
     * @return 结果
     */
    @Override
    public int deleteVKehuByIds(Long[] ids)
    {
        return vKehuMapper.deleteVKehuByIds(ids);
    }

    /**
     * 删除VIEW信息
     * 
     * @param id VIEW主键
     * @return 结果
     */
    @Override
    public int deleteVKehuById(Long id)
    {
        return vKehuMapper.deleteVKehuById(id);
    }
}
