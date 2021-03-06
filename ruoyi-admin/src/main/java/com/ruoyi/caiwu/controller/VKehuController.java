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
import com.ruoyi.caiwu.domain.VKehu;
import com.ruoyi.caiwu.service.IVKehuService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * VIEWController
 * 
 * @author ruoyi
 * @date 2021-09-23
 */
@RestController
@RequestMapping("/kehumanage/kehu")
public class VKehuController extends BaseController
{
    @Autowired
    private IVKehuService vKehuService;

    /**
     * 查询VIEW列表
     */
    @PreAuthorize("@ss.hasPermi('kehumanage:kehu:list')")
    @GetMapping("/list")
    public TableDataInfo list(VKehu vKehu)
    {
        startPage();
        List<VKehu> list = vKehuService.selectVKehuList(vKehu);
        return getDataTable(list);
    }

    /**
     * 导出VIEW列表
     */
    @PreAuthorize("@ss.hasPermi('kehumanage:kehu:export')")
    @Log(title = "VIEW", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(VKehu vKehu)
    {
        List<VKehu> list = vKehuService.selectVKehuList(vKehu);
        ExcelUtil<VKehu> util = new ExcelUtil<VKehu>(VKehu.class);
        return util.exportExcel(list, "VIEW数据");
    }

    /**
     * 获取VIEW详细信息
     */
    @PreAuthorize("@ss.hasPermi('kehumanage:kehu:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(vKehuService.selectVKehuById(id));
    }

    /**
     * 新增VIEW
     */
    @PreAuthorize("@ss.hasPermi('kehumanage:kehu:add')")
    @Log(title = "VIEW", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VKehu vKehu)
    {
        return toAjax(vKehuService.insertVKehu(vKehu));
    }

    /**
     * 修改VIEW
     */
    @PreAuthorize("@ss.hasPermi('kehumanage:kehu:edit')")
    @Log(title = "VIEW", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VKehu vKehu)
    {
        return toAjax(vKehuService.updateVKehu(vKehu));
    }

    /**
     * 删除VIEW
     */
    @PreAuthorize("@ss.hasPermi('kehumanage:kehu:remove')")
    @Log(title = "VIEW", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(vKehuService.deleteVKehuByIds(ids));
    }
}
