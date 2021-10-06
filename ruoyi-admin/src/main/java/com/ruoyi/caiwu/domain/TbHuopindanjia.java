package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 tb_huopindanjia
 * 
 * @author ruoyi
 * @date 2021-09-26
 */
public class TbHuopindanjia extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String idZhanghu;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String idHuopin;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date kaihushijian;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal kaihujine;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal danjia;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal dangqianyue;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal xingyongedu;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal xingyongyue;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date zuihouxiugairiqi;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long shifouyishanchu;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long shunxuhao;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setIdZhanghu(String idZhanghu) 
    {
        this.idZhanghu = idZhanghu;
    }

    public String getIdZhanghu() 
    {
        return idZhanghu;
    }
    public void setIdHuopin(String idHuopin) 
    {
        this.idHuopin = idHuopin;
    }

    public String getIdHuopin() 
    {
        return idHuopin;
    }
    public void setKaihushijian(Date kaihushijian) 
    {
        this.kaihushijian = kaihushijian;
    }

    public Date getKaihushijian() 
    {
        return kaihushijian;
    }
    public void setKaihujine(BigDecimal kaihujine) 
    {
        this.kaihujine = kaihujine;
    }

    public BigDecimal getKaihujine() 
    {
        return kaihujine;
    }
    public void setDanjia(BigDecimal danjia) 
    {
        this.danjia = danjia;
    }

    public BigDecimal getDanjia() 
    {
        return danjia;
    }
    public void setDangqianyue(BigDecimal dangqianyue) 
    {
        this.dangqianyue = dangqianyue;
    }

    public BigDecimal getDangqianyue() 
    {
        return dangqianyue;
    }
    public void setXingyongedu(BigDecimal xingyongedu) 
    {
        this.xingyongedu = xingyongedu;
    }

    public BigDecimal getXingyongedu() 
    {
        return xingyongedu;
    }
    public void setXingyongyue(BigDecimal xingyongyue) 
    {
        this.xingyongyue = xingyongyue;
    }

    public BigDecimal getXingyongyue() 
    {
        return xingyongyue;
    }
    public void setZuihouxiugairiqi(Date zuihouxiugairiqi) 
    {
        this.zuihouxiugairiqi = zuihouxiugairiqi;
    }

    public Date getZuihouxiugairiqi() 
    {
        return zuihouxiugairiqi;
    }
    public void setShifouyishanchu(Long shifouyishanchu) 
    {
        this.shifouyishanchu = shifouyishanchu;
    }

    public Long getShifouyishanchu() 
    {
        return shifouyishanchu;
    }
    public void setShunxuhao(Long shunxuhao) 
    {
        this.shunxuhao = shunxuhao;
    }

    public Long getShunxuhao() 
    {
        return shunxuhao;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("idZhanghu", getIdZhanghu())
            .append("idHuopin", getIdHuopin())
            .append("kaihushijian", getKaihushijian())
            .append("kaihujine", getKaihujine())
            .append("danjia", getDanjia())
            .append("dangqianyue", getDangqianyue())
            .append("xingyongedu", getXingyongedu())
            .append("xingyongyue", getXingyongyue())
            .append("zuihouxiugairiqi", getZuihouxiugairiqi())
            .append("shifouyishanchu", getShifouyishanchu())
            .append("shunxuhao", getShunxuhao())
            .toString();
    }
}
