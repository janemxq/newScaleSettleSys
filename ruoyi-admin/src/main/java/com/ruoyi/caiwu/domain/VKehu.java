package com.ruoyi.caiwu.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * VIEW对象 v_kehu
 * 
 * @author ruoyi
 * @date 2021-09-23
 */
public class VKehu extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String kehubianhao;

    /** $column.columnComment */
    private Long idKehuleixing;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String kehuleixing;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String kehumingcheng;

    /** $column.columnComment */
    private String farendaibiao;

    /** $column.columnComment */
    private String farendaibiaodianhua;

    /** $column.columnComment */
    private String farendaibiaodizhi;

    /** $column.columnComment */
    private String farendaibiaoshenfenzhenghao;

    /** $column.columnComment */
    private String lianxiren;

    /** $column.columnComment */
    private String lianxidianhua;

    /** $column.columnComment */
    private Long rizuidatihuocheshu;

    /** $column.columnComment */
    private BigDecimal rizuidatihuoliang;

    /** $column.columnComment */
    private Long idSuoshukehuzu;

    /** $column.columnComment */
    private String suoshukehuzu;

    /** $column.columnComment */
    private String miaoshu;

    /** $column.columnComment */
    private Long shifouyishanchu;

    /** $column.columnComment */
    private Long idXinzengren;

    /** 用户账号 */
    private String xinzenren;

    /** 用户昵称 */
    private String xingzenrenxingming;

    /** $column.columnComment */
    private Date xinzengriqi;

    /** $column.columnComment */
    private Long idZuihouxiugairen;

    /** 用户账号 */
    private String zuihouxiugairen;

    /** 用户昵称 */
    private String zuihouxiugairenxingming;

    /** $column.columnComment */
    private Date zuihouxiugairiqi;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setKehubianhao(String kehubianhao) 
    {
        this.kehubianhao = kehubianhao;
    }

    public String getKehubianhao() 
    {
        return kehubianhao;
    }
    public void setIdKehuleixing(Long idKehuleixing) 
    {
        this.idKehuleixing = idKehuleixing;
    }

    public Long getIdKehuleixing() 
    {
        return idKehuleixing;
    }
    public void setKehuleixing(String kehuleixing) 
    {
        this.kehuleixing = kehuleixing;
    }

    public String getKehuleixing() 
    {
        return kehuleixing;
    }
    public void setKehumingcheng(String kehumingcheng) 
    {
        this.kehumingcheng = kehumingcheng;
    }

    public String getKehumingcheng() 
    {
        return kehumingcheng;
    }
    public void setFarendaibiao(String farendaibiao) 
    {
        this.farendaibiao = farendaibiao;
    }

    public String getFarendaibiao() 
    {
        return farendaibiao;
    }
    public void setFarendaibiaodianhua(String farendaibiaodianhua) 
    {
        this.farendaibiaodianhua = farendaibiaodianhua;
    }

    public String getFarendaibiaodianhua() 
    {
        return farendaibiaodianhua;
    }
    public void setFarendaibiaodizhi(String farendaibiaodizhi) 
    {
        this.farendaibiaodizhi = farendaibiaodizhi;
    }

    public String getFarendaibiaodizhi() 
    {
        return farendaibiaodizhi;
    }
    public void setFarendaibiaoshenfenzhenghao(String farendaibiaoshenfenzhenghao) 
    {
        this.farendaibiaoshenfenzhenghao = farendaibiaoshenfenzhenghao;
    }

    public String getFarendaibiaoshenfenzhenghao() 
    {
        return farendaibiaoshenfenzhenghao;
    }
    public void setLianxiren(String lianxiren) 
    {
        this.lianxiren = lianxiren;
    }

    public String getLianxiren() 
    {
        return lianxiren;
    }
    public void setLianxidianhua(String lianxidianhua) 
    {
        this.lianxidianhua = lianxidianhua;
    }

    public String getLianxidianhua() 
    {
        return lianxidianhua;
    }
    public void setRizuidatihuocheshu(Long rizuidatihuocheshu) 
    {
        this.rizuidatihuocheshu = rizuidatihuocheshu;
    }

    public Long getRizuidatihuocheshu() 
    {
        return rizuidatihuocheshu;
    }
    public void setRizuidatihuoliang(BigDecimal rizuidatihuoliang) 
    {
        this.rizuidatihuoliang = rizuidatihuoliang;
    }

    public BigDecimal getRizuidatihuoliang() 
    {
        return rizuidatihuoliang;
    }
    public void setIdSuoshukehuzu(Long idSuoshukehuzu) 
    {
        this.idSuoshukehuzu = idSuoshukehuzu;
    }

    public Long getIdSuoshukehuzu() 
    {
        return idSuoshukehuzu;
    }
    public void setSuoshukehuzu(String suoshukehuzu) 
    {
        this.suoshukehuzu = suoshukehuzu;
    }

    public String getSuoshukehuzu() 
    {
        return suoshukehuzu;
    }
    public void setMiaoshu(String miaoshu) 
    {
        this.miaoshu = miaoshu;
    }

    public String getMiaoshu() 
    {
        return miaoshu;
    }
    public void setShifouyishanchu(Long shifouyishanchu) 
    {
        this.shifouyishanchu = shifouyishanchu;
    }

    public Long getShifouyishanchu() 
    {
        return shifouyishanchu;
    }
    public void setIdXinzengren(Long idXinzengren) 
    {
        this.idXinzengren = idXinzengren;
    }

    public Long getIdXinzengren() 
    {
        return idXinzengren;
    }
    public void setXinzenren(String xinzenren) 
    {
        this.xinzenren = xinzenren;
    }

    public String getXinzenren() 
    {
        return xinzenren;
    }
    public void setXingzenrenxingming(String xingzenrenxingming) 
    {
        this.xingzenrenxingming = xingzenrenxingming;
    }

    public String getXingzenrenxingming() 
    {
        return xingzenrenxingming;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("kehubianhao", getKehubianhao())
            .append("idKehuleixing", getIdKehuleixing())
            .append("kehuleixing", getKehuleixing())
            .append("kehumingcheng", getKehumingcheng())
            .append("farendaibiao", getFarendaibiao())
            .append("farendaibiaodianhua", getFarendaibiaodianhua())
            .append("farendaibiaodizhi", getFarendaibiaodizhi())
            .append("farendaibiaoshenfenzhenghao", getFarendaibiaoshenfenzhenghao())
            .append("lianxiren", getLianxiren())
            .append("lianxidianhua", getLianxidianhua())
            .append("rizuidatihuocheshu", getRizuidatihuocheshu())
            .append("rizuidatihuoliang", getRizuidatihuoliang())
            .append("idSuoshukehuzu", getIdSuoshukehuzu())
            .append("suoshukehuzu", getSuoshukehuzu())
            .append("miaoshu", getMiaoshu())
            .append("shifouyishanchu", getShifouyishanchu())
            .append("idXinzengren", getIdXinzengren())
            .append("xinzenren", getXinzenren())
            .append("xingzenrenxingming", getXingzenrenxingming())
            .append("xinzengriqi", getXinzengriqi())
            .append("idZuihouxiugairen", getIdZuihouxiugairen())
            .append("zuihouxiugairen", getZuihouxiugairen())
            .append("zuihouxiugairenxingming", getZuihouxiugairenxingming())
            .append("zuihouxiugairiqi", getZuihouxiugairiqi())
            .toString();
    }
}
