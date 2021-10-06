package com.ruoyi.caiwu.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.caiwu.mapper.VYuncunkuanzhanhuMapper;
import com.ruoyi.caiwu.domain.VYuncunkuanzhanhu;
import com.ruoyi.caiwu.service.IVYuncunkuanzhanhuService;

/**
 * 账户Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-09-24
 */
@Service
public class VYuncunkuanzhanhuServiceImpl implements IVYuncunkuanzhanhuService 
{
    @Autowired
    private VYuncunkuanzhanhuMapper vYuncunkuanzhanhuMapper;

    /**
     * 查询账户
     * 
     * @param id 账户主键
     * @return 账户
     */
    @Override
    public VYuncunkuanzhanhu selectVYuncunkuanzhanhuById(Long id)
    {
        return vYuncunkuanzhanhuMapper.selectVYuncunkuanzhanhuById(id);
    }

    /**
     * 查询账户列表
     * 
     * @param vYuncunkuanzhanhu 账户
     * @return 账户
     */
    @Override
    public List<VYuncunkuanzhanhu> selectVYuncunkuanzhanhuList(VYuncunkuanzhanhu vYuncunkuanzhanhu)
    {
        return vYuncunkuanzhanhuMapper.selectVYuncunkuanzhanhuList(vYuncunkuanzhanhu);
    }

    /**
     * 新增账户
     * 
     * @param vYuncunkuanzhanhu 账户
     * @return 结果
     */
    @Override
    public int insertVYuncunkuanzhanhu(VYuncunkuanzhanhu vYuncunkuanzhanhu)
    {
        return vYuncunkuanzhanhuMapper.insertVYuncunkuanzhanhu(vYuncunkuanzhanhu);
    }

    /**
     * 修改账户
     * 
     * @param vYuncunkuanzhanhu 账户
     * @return 结果
     */
    @Override
    public int updateVYuncunkuanzhanhu(VYuncunkuanzhanhu vYuncunkuanzhanhu)
    {
        return vYuncunkuanzhanhuMapper.updateVYuncunkuanzhanhu(vYuncunkuanzhanhu);
    }

    /**
     * 批量删除账户
     * 
     * @param ids 需要删除的账户主键
     * @return 结果
     */
    @Override
    public int deleteVYuncunkuanzhanhuByIds(Long[] ids)
    {
        return vYuncunkuanzhanhuMapper.deleteVYuncunkuanzhanhuByIds(ids);
    }

    /**
     * 删除账户信息
     * 
     * @param id 账户主键
     * @return 结果
     */
    @Override
    public int deleteVYuncunkuanzhanhuById(Long id)
    {
        return vYuncunkuanzhanhuMapper.deleteVYuncunkuanzhanhuById(id);
    }
}
