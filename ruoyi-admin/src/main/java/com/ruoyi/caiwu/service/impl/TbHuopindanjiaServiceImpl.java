package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TbHuopindanjiaMapper;
import com.ruoyi.system.domain.TbHuopindanjia;
import com.ruoyi.system.service.ITbHuopindanjiaService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-09-26
 */
@Service
public class TbHuopindanjiaServiceImpl implements ITbHuopindanjiaService 
{
    @Autowired
    private TbHuopindanjiaMapper tbHuopindanjiaMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public TbHuopindanjia selectTbHuopindanjiaById(Long id)
    {
        return tbHuopindanjiaMapper.selectTbHuopindanjiaById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param tbHuopindanjia 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<TbHuopindanjia> selectTbHuopindanjiaList(TbHuopindanjia tbHuopindanjia)
    {
        return tbHuopindanjiaMapper.selectTbHuopindanjiaList(tbHuopindanjia);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param tbHuopindanjia 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertTbHuopindanjia(TbHuopindanjia tbHuopindanjia)
    {
        return tbHuopindanjiaMapper.insertTbHuopindanjia(tbHuopindanjia);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param tbHuopindanjia 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateTbHuopindanjia(TbHuopindanjia tbHuopindanjia)
    {
        return tbHuopindanjiaMapper.updateTbHuopindanjia(tbHuopindanjia);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteTbHuopindanjiaByIds(Long[] ids)
    {
        return tbHuopindanjiaMapper.deleteTbHuopindanjiaByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteTbHuopindanjiaById(Long id)
    {
        return tbHuopindanjiaMapper.deleteTbHuopindanjiaById(id);
    }
}
