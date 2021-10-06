package com.ruoyi.caiwu.mapper;

import java.util.List;
import com.ruoyi.caiwu.domain.VYuncunkuanzhanhu;

/**
 * 账户Mapper接口
 * 
 * @author ruoyi
 * @date 2021-09-24
 */
public interface VYuncunkuanzhanhuMapper 
{
    /**
     * 查询账户
     * 
     * @param id 账户主键
     * @return 账户
     */
    public VYuncunkuanzhanhu selectVYuncunkuanzhanhuById(Long id);

    /**
     * 查询账户列表
     * 
     * @param vYuncunkuanzhanhu 账户
     * @return 账户集合
     */
    public List<VYuncunkuanzhanhu> selectVYuncunkuanzhanhuList(VYuncunkuanzhanhu vYuncunkuanzhanhu);

    /**
     * 新增账户
     * 
     * @param vYuncunkuanzhanhu 账户
     * @return 结果
     */
    public int insertVYuncunkuanzhanhu(VYuncunkuanzhanhu vYuncunkuanzhanhu);

    /**
     * 修改账户
     * 
     * @param vYuncunkuanzhanhu 账户
     * @return 结果
     */
    public int updateVYuncunkuanzhanhu(VYuncunkuanzhanhu vYuncunkuanzhanhu);

    /**
     * 删除账户
     * 
     * @param id 账户主键
     * @return 结果
     */
    public int deleteVYuncunkuanzhanhuById(Long id);

    /**
     * 批量删除账户
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVYuncunkuanzhanhuByIds(Long[] ids);
}
