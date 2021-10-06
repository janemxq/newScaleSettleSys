package com.ruoyi.caiwu.controller;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.caiwu.domain.VYuncunkuanzhanhu;
import com.ruoyi.caiwu.service.IVYuncunkuanzhanhuService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 账户Controller
 * 
 * @author ruoyi
 * @date 2021-09-24
 */
@RestController
@RequestMapping("/zhanghu/yuncunkuanzhanhu")
public class VYuncunkuanzhanhuController extends BaseController
{
    @Autowired
    private IVYuncunkuanzhanhuService vYuncunkuanzhanhuService;

    /**
     * 查询账户列表
     */
    @PreAuthorize("@ss.hasPermi('zhanghu:yuncunkuanzhanhu:list')")
    @GetMapping("/list")
    public TableDataInfo list(VYuncunkuanzhanhu vYuncunkuanzhanhu)
    {
        startPage();
        List<VYuncunkuanzhanhu> list = vYuncunkuanzhanhuService.selectVYuncunkuanzhanhuList(vYuncunkuanzhanhu);
        return getDataTable(list);
    }

    /**
     * 导出账户列表
     */
    @PreAuthorize("@ss.hasPermi('zhanghu:yuncunkuanzhanhu:export')")
    @Log(title = "账户", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(VYuncunkuanzhanhu vYuncunkuanzhanhu)
    {
        List<VYuncunkuanzhanhu> list = vYuncunkuanzhanhuService.selectVYuncunkuanzhanhuList(vYuncunkuanzhanhu);
        ExcelUtil<VYuncunkuanzhanhu> util = new ExcelUtil<VYuncunkuanzhanhu>(VYuncunkuanzhanhu.class);
        return util.exportExcel(list, "账户数据");
    }

    /**
     * 获取账户详细信息
     */
    @PreAuthorize("@ss.hasPermi('zhanghu:yuncunkuanzhanhu:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(vYuncunkuanzhanhuService.selectVYuncunkuanzhanhuById(id));
    }

    /**
     * 新增账户
     */
    @PreAuthorize("@ss.hasPermi('zhanghu:yuncunkuanzhanhu:add')")
    @Log(title = "账户", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VYuncunkuanzhanhu vYuncunkuanzhanhu)
    {
        return toAjax(vYuncunkuanzhanhuService.insertVYuncunkuanzhanhu(vYuncunkuanzhanhu));
    }

    /**
     * 修改账户
     */
    @PreAuthorize("@ss.hasPermi('zhanghu:yuncunkuanzhanhu:edit')")
    @Log(title = "账户", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VYuncunkuanzhanhu vYuncunkuanzhanhu)
    {
        return toAjax(vYuncunkuanzhanhuService.updateVYuncunkuanzhanhu(vYuncunkuanzhanhu));
    }

    /**
     * 删除账户
     */
    @PreAuthorize("@ss.hasPermi('zhanghu:yuncunkuanzhanhu:remove')")
    @Log(title = "账户", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(vYuncunkuanzhanhuService.deleteVYuncunkuanzhanhuByIds(ids));
    }
}
