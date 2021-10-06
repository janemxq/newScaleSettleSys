package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.VwHuopindanjiaMapper;
import com.ruoyi.system.domain.VwHuopindanjia;
import com.ruoyi.system.service.IVwHuopindanjiaService;

/**
 * VIEWService业务层处理
 * 
 * @author ruoyi
 * @date 2021-09-25
 */
@Service
public class VwHuopindanjiaServiceImpl implements IVwHuopindanjiaService 
{
    @Autowired
    private VwHuopindanjiaMapper vwHuopindanjiaMapper;

    /**
     * 查询VIEW
     * 
     * @param id VIEW主键
     * @return VIEW
     */
    @Override
    public VwHuopindanjia selectVwHuopindanjiaById(Long id)
    {
        return vwHuopindanjiaMapper.selectVwHuopindanjiaById(id);
    }

    /**
     * 查询VIEW列表
     * 
     * @param vwHuopindanjia VIEW
     * @return VIEW
     */
    @Override
    public List<VwHuopindanjia> selectVwHuopindanjiaList(VwHuopindanjia vwHuopindanjia)
    {
        return vwHuopindanjiaMapper.selectVwHuopindanjiaList(vwHuopindanjia);
    }

    /**
     * 新增VIEW
     * 
     * @param vwHuopindanjia VIEW
     * @return 结果
     */
    @Override
    public int insertVwHuopindanjia(VwHuopindanjia vwHuopindanjia)
    {
        return vwHuopindanjiaMapper.insertVwHuopindanjia(vwHuopindanjia);
    }

    /**
     * 修改VIEW
     * 
     * @param vwHuopindanjia VIEW
     * @return 结果
     */
    @Override
    public int updateVwHuopindanjia(VwHuopindanjia vwHuopindanjia)
    {
        return vwHuopindanjiaMapper.updateVwHuopindanjia(vwHuopindanjia);
    }

    /**
     * 批量删除VIEW
     * 
     * @param ids 需要删除的VIEW主键
     * @return 结果
     */
    @Override
    public int deleteVwHuopindanjiaByIds(Long[] ids)
    {
        return vwHuopindanjiaMapper.deleteVwHuopindanjiaByIds(ids);
    }

    /**
     * 删除VIEW信息
     * 
     * @param id VIEW主键
     * @return 结果
     */
    @Override
    public int deleteVwHuopindanjiaById(Long id)
    {
        return vwHuopindanjiaMapper.deleteVwHuopindanjiaById(id);
    }
}
