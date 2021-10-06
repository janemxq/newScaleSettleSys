package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * VIEW对象 vw_huopindanjia
 * 
 * @author ruoyi
 * @date 2021-09-25
 */
public class VwHuopindanjia extends BaseEntity
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
    private String yucunkuanzhanghu;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String idKehu;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String kehumingcheng;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long zhangkuzhuangtai;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String zhangkuzhuangtaimingcheng;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long idXinzengren;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String idHuopin;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String huopinmingcheng;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal kaihujine;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long idHuopindanjia;

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
    private Date kaihushijian;

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
    public void setIdXinzengren(Long idXinzengren) 
    {
        this.idXinzengren = idXinzengren;
    }

    public Long getIdXinzengren() 
    {
        return idXinzengren;
    }
    public void setIdHuopin(String idHuopin) 
    {
        this.idHuopin = idHuopin;
    }

    public String getIdHuopin() 
    {
        return idHuopin;
    }
    public void setHuopinmingcheng(String huopinmingcheng) 
    {
        this.huopinmingcheng = huopinmingcheng;
    }

    public String getHuopinmingcheng() 
    {
        return huopinmingcheng;
    }
    public void setKaihujine(BigDecimal kaihujine) 
    {
        this.kaihujine = kaihujine;
    }

    public BigDecimal getKaihujine() 
    {
        return kaihujine;
    }
    public void setIdHuopindanjia(Long idHuopindanjia) 
    {
        this.idHuopindanjia = idHuopindanjia;
    }

    public Long getIdHuopindanjia() 
    {
        return idHuopindanjia;
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
    public void setKaihushijian(Date kaihushijian) 
    {
        this.kaihushijian = kaihushijian;
    }

    public Date getKaihushijian() 
    {
        return kaihushijian;
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
            .append("yucunkuanzhanghu", getYucunkuanzhanghu())
            .append("idKehu", getIdKehu())
            .append("kehumingcheng", getKehumingcheng())
            .append("zhangkuzhuangtai", getZhangkuzhuangtai())
            .append("zhangkuzhuangtaimingcheng", getZhangkuzhuangtaimingcheng())
            .append("idXinzengren", getIdXinzengren())
            .append("idHuopin", getIdHuopin())
            .append("huopinmingcheng", getHuopinmingcheng())
            .append("kaihujine", getKaihujine())
            .append("idHuopindanjia", getIdHuopindanjia())
            .append("danjia", getDanjia())
            .append("dangqianyue", getDangqianyue())
            .append("xingyongedu", getXingyongedu())
            .append("xingyongyue", getXingyongyue())
            .append("zuihouxiugairiqi", getZuihouxiugairiqi())
            .append("shifouyishanchu", getShifouyishanchu())
            .append("kaihushijian", getKaihushijian())
            .append("shunxuhao", getShunxuhao())
            .toString();
    }
}
