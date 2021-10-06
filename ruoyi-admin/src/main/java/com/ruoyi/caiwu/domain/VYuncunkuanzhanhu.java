package com.ruoyi.caiwu.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 账户对象 v_yuncunkuanzhanhu
 * 
 * @author ruoyi
 * @date 2021-09-24
 */
public class VYuncunkuanzhanhu extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 账号编码 */
    @Excel(name = "账号编码")
    private String yucunkuanzhanghu;

    /** $column.columnComment */
    private String idKehu;

    /** 客户名称 */
    @Excel(name = "客户名称")
    private String kehumingcheng;

    /** 开户时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开户时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date kaihushijian;

    /** $column.columnComment */
    private Long zhangkuzhuangtai;

    /** 账号状态 */
    @Excel(name = "账号状态")
    private String zhangkuzhuangtaimingcheng;

    /** $column.columnComment */
    private String miaoshu;

    /** $column.columnComment */
    private Long idXinzengren;

    /**  */
    private String xingzengren;

    /** 新增人姓名 */
    @Excel(name = "新增人姓名")
    private String xingzengrenxingming;

    /** $column.columnComment */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "新增人姓名", width = 30, dateFormat = "yyyy-MM-dd")
    private Date xinzengriqi;

    /** $column.columnComment */
    private Long idZuihouxiugairen;

    /** 用户账号 */
    @Excel(name = "用户账号")
    private String zuihouxiugairen;

    /** 最后修改人 */
    @Excel(name = "最后修改人")
    private String zuihouxiugairenxingming;

    /** 最后修改日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "最后修改日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date zuihouxiugairiqi;

    /** 当前余额 */
    @Excel(name = "当前余额")
    private BigDecimal dangqianyue;

    /** 已用信用 */
    @Excel(name = "已用信用")
    private BigDecimal xingyongyiyong;

    /** 信用额度 */
    @Excel(name = "信用额度")
    private BigDecimal xingyongedu;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setYucunkuanzhanghu(String yucunkuanzhanghu) 
    {
        this.yucunkuanzhanghu = yucunkuanzhanghu;
    }

    public String getYucunkuanzhanghu() 
    {
        return yucunkuanzhanghu;
    }
    public void setIdKehu(String idKehu) 
    {
        this.idKehu = idKehu;
    }

    public String getIdKehu() 
    {
        return idKehu;
    }
    public void setKehumingcheng(String kehumingcheng) 
    {
        this.kehumingcheng = kehumingcheng;
    }

    public String getKehumingcheng() 
    {
        return kehumingcheng;
    }
    public void setKaihushijian(Date kaihushijian) 
    {
        this.kaihushijian = kaihushijian;
    }

    public Date getKaihushijian() 
    {
        return kaihushijian;
    }
    public void setZhangkuzhuangtai(Long zhangkuzhuangtai) 
    {
        this.zhangkuzhuangtai = zhangkuzhuangtai;
    }

    public Long getZhangkuzhuangtai() 
    {
        return zhangkuzhuangtai;
    }
    public void setZhangkuzhuangtaimingcheng(String zhangkuzhuangtaimingcheng) 
    {
        this.zhangkuzhuangtaimingcheng = zhangkuzhuangtaimingcheng;
    }

    public String getZhangkuzhuangtaimingcheng() 
    {
        return zhangkuzhuangtaimingcheng;
    }
    public void setMiaoshu(String miaoshu) 
    {
        this.miaoshu = miaoshu;
    }

    public String getMiaoshu() 
    {
        return miaoshu;
    }
    public void setIdXinzengren(Long idXinzengren) 
    {
        this.idXinzengren = idXinzengren;
    }

    public Long getIdXinzengren() 
    {
        return idXinzengren;
    }
    public void setXingzengren(String xingzengren) 
    {
        this.xingzengren = xingzengren;
    }

    public String getXingzengren() 
    {
        return xingzengren;
    }
    public void setXingzengrenxingming(String xingzengrenxingming) 
    {
        this.xingzengrenxingming = xingzengrenxingming;
    }

    public String getXingzengrenxingming() 
    {
        return xingzengrenxingming;
    }
    public void setXinzengriqi(Date xinzengriqi) 
    {
        this.xinzengriqi = xinzengriqi;
    }

    public Date getXinzengriqi() 
    {
        return xinzengriqi;
    }
    public void setIdZuihouxiugairen(Long idZuihouxiugairen) 
    {
        this.idZuihouxiugairen = idZuihouxiugairen;
    }

    public Long getIdZuihouxiugairen() 
    {
        return idZuihouxiugairen;
    }
    public void setZuihouxiugairen(String zuihouxiugairen) 
    {
        this.zuihouxiugairen = zuihouxiugairen;
    }

    public String getZuihouxiugairen() 
    {
        return zuihouxiugairen;
    }
    public void setZuihouxiugairenxingming(String zuihouxiugairenxingming) 
    {
        this.zuihouxiugairenxingming = zuihouxiugairenxingming;
    }

    public String getZuihouxiugairenxingming() 
    {
        return zuihouxiugairenxingming;
    }
    public void setZuihouxiugairiqi(Date zuihouxiugairiqi) 
    {
        this.zuihouxiugairiqi = zuihouxiugairiqi;
    }

    public Date getZuihouxiugairiqi() 
    {
        return zuihouxiugairiqi;
    }
    public void setDangqianyue(BigDecimal dangqianyue) 
    {
        this.dangqianyue = dangqianyue;
    }

    public BigDecimal getDangqianyue() 
    {
        return dangqianyue;
    }
    public void setXingyongyiyong(BigDecimal xingyongyiyong) 
    {
        this.xingyongyiyong = xingyongyiyong;
    }

    public BigDecimal getXingyongyiyong() 
    {
        return xingyongyiyong;
    }
    public void setXingyongedu(BigDecimal xingyongedu) 
    {
        this.xingyongedu = xingyongedu;
    }

    public BigDecimal getXingyongedu() 
    {
        return xingyongedu;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("yucunkuanzhanghu", getYucunkuanzhanghu())
            .append("idKehu", getIdKehu())
            .append("kehumingcheng", getKehumingcheng())
            .append("kaihushijian", getKaihushijian())
            .append("zhangkuzhuangtai", getZhangkuzhuangtai())
            .append("zhangkuzhuangtaimingcheng", getZhangkuzhuangtaimingcheng())
            .append("miaoshu", getMiaoshu())
            .append("idXinzengren", getIdXinzengren())
            .append("xingzengren", getXingzengren())
            .append("xingzengrenxingming", getXingzengrenxingming())
            .append("xinzengriqi", getXinzengriqi())
            .append("idZuihouxiugairen", getIdZuihouxiugairen())
            .append("zuihouxiugairen", getZuihouxiugairen())
            .append("zuihouxiugairenxingming", getZuihouxiugairenxingming())
            .append("zuihouxiugairiqi", getZuihouxiugairiqi())
            .append("dangqianyue", getDangqianyue())
            .append("xingyongyiyong", getXingyongyiyong())
            .append("xingyongedu", getXingyongedu())
            .toString();
    }
}
