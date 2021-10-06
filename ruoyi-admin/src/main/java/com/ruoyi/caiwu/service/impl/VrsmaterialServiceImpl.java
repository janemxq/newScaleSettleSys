package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.VrsmaterialMapper;
import com.ruoyi.system.domain.Vrsmaterial;
import com.ruoyi.system.service.IVrsmaterialService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-09-25
 */
@Service
public class VrsmaterialServiceImpl implements IVrsmaterialService 
{
    @Autowired
    private VrsmaterialMapper vrsmaterialMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param materialcode 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Vrsmaterial selectVrsmaterialByMaterialcode(String materialcode)
    {
        return vrsmaterialMapper.selectVrsmaterialByMaterialcode(materialcode);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param vrsmaterial 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Vrsmaterial> selectVrsmaterialList(Vrsmaterial vrsmaterial)
    {
        return vrsmaterialMapper.selectVrsmaterialList(vrsmaterial);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param vrsmaterial 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertVrsmaterial(Vrsmaterial vrsmaterial)
    {
        vrsmaterial.setCreateTime(DateUtils.getNowDate());
        return vrsmaterialMapper.insertVrsmaterial(vrsmaterial);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param vrsmaterial 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateVrsmaterial(Vrsmaterial vrsmaterial)
    {
        return vrsmaterialMapper.updateVrsmaterial(vrsmaterial);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param materialcodes 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteVrsmaterialByMaterialcodes(String[] materialcodes)
    {
        return vrsmaterialMapper.deleteVrsmaterialByMaterialcodes(materialcodes);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param materialcode 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteVrsmaterialByMaterialcode(String materialcode)
    {
        return vrsmaterialMapper.deleteVrsmaterialByMaterialcode(materialcode);
    }
}
