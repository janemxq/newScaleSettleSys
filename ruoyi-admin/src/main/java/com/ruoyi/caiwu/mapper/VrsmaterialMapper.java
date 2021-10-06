package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Vrsmaterial;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2021-09-25
 */
public interface VrsmaterialMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param materialcode 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Vrsmaterial selectVrsmaterialByMaterialcode(String materialcode);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param vrsmaterial 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Vrsmaterial> selectVrsmaterialList(Vrsmaterial vrsmaterial);

    /**
     * 新增【请填写功能名称】
     * 
     * @param vrsmaterial 【请填写功能名称】
     * @return 结果
     */
    public int insertVrsmaterial(Vrsmaterial vrsmaterial);

    /**
     * 修改【请填写功能名称】
     * 
     * @param vrsmaterial 【请填写功能名称】
     * @return 结果
     */
    public int updateVrsmaterial(Vrsmaterial vrsmaterial);

    /**
     * 删除【请填写功能名称】
     * 
     * @param materialcode 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteVrsmaterialByMaterialcode(String materialcode);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param materialcodes 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVrsmaterialByMaterialcodes(String[] materialcodes);
}
