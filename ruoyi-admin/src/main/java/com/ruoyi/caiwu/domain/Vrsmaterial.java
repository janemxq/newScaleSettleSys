package com.ruoyi.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 vrsmaterial
 * 
 * @author ruoyi
 * @date 2021-09-25
 */
public class Vrsmaterial extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String materialcode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String materialname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String relatedcode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String pycode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String units;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long singlegross;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long standardpackage;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String materialspc;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String materialtype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal comparisontype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long comparisonvalue;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String spareStr1;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String spareStr2;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String spareStr3;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String note;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String spareStr4;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String spareStr5;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long spareStr6;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long spareStr7;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String spareStr8;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String spareStr9;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String spareStr10;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String spareStr11;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String organization;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String companycode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String materialclass;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal ismanage;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long standardtare;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String factorycode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String materialid;

    public void setMaterialcode(String materialcode) 
    {
        this.materialcode = materialcode;
    }

    public String getMaterialcode() 
    {
        return materialcode;
    }
    public void setMaterialname(String materialname) 
    {
        this.materialname = materialname;
    }

    public String getMaterialname() 
    {
        return materialname;
    }
    public void setRelatedcode(String relatedcode) 
    {
        this.relatedcode = relatedcode;
    }

    public String getRelatedcode() 
    {
        return relatedcode;
    }
    public void setPycode(String pycode) 
    {
        this.pycode = pycode;
    }

    public String getPycode() 
    {
        return pycode;
    }
    public void setUnits(String units) 
    {
        this.units = units;
    }

    public String getUnits() 
    {
        return units;
    }
    public void setSinglegross(Long singlegross) 
    {
        this.singlegross = singlegross;
    }

    public Long getSinglegross() 
    {
        return singlegross;
    }
    public void setStandardpackage(Long standardpackage) 
    {
        this.standardpackage = standardpackage;
    }

    public Long getStandardpackage() 
    {
        return standardpackage;
    }
    public void setMaterialspc(String materialspc) 
    {
        this.materialspc = materialspc;
    }

    public String getMaterialspc() 
    {
        return materialspc;
    }
    public void setMaterialtype(String materialtype) 
    {
        this.materialtype = materialtype;
    }

    public String getMaterialtype() 
    {
        return materialtype;
    }
    public void setComparisontype(BigDecimal comparisontype) 
    {
        this.comparisontype = comparisontype;
    }

    public BigDecimal getComparisontype() 
    {
        return comparisontype;
    }
    public void setComparisonvalue(Long comparisonvalue) 
    {
        this.comparisonvalue = comparisonvalue;
    }

    public Long getComparisonvalue() 
    {
        return comparisonvalue;
    }
    public void setSpareStr1(String spareStr1) 
    {
        this.spareStr1 = spareStr1;
    }

    public String getSpareStr1() 
    {
        return spareStr1;
    }
    public void setSpareStr2(String spareStr2) 
    {
        this.spareStr2 = spareStr2;
    }

    public String getSpareStr2() 
    {
        return spareStr2;
    }
    public void setSpareStr3(String spareStr3) 
    {
        this.spareStr3 = spareStr3;
    }

    public String getSpareStr3() 
    {
        return spareStr3;
    }
    public void setNote(String note) 
    {
        this.note = note;
    }

    public String getNote() 
    {
        return note;
    }
    public void setSpareStr4(String spareStr4) 
    {
        this.spareStr4 = spareStr4;
    }

    public String getSpareStr4() 
    {
        return spareStr4;
    }
    public void setSpareStr5(String spareStr5) 
    {
        this.spareStr5 = spareStr5;
    }

    public String getSpareStr5() 
    {
        return spareStr5;
    }
    public void setSpareStr6(Long spareStr6) 
    {
        this.spareStr6 = spareStr6;
    }

    public Long getSpareStr6() 
    {
        return spareStr6;
    }
    public void setSpareStr7(Long spareStr7) 
    {
        this.spareStr7 = spareStr7;
    }

    public Long getSpareStr7() 
    {
        return spareStr7;
    }
    public void setSpareStr8(String spareStr8) 
    {
        this.spareStr8 = spareStr8;
    }

    public String getSpareStr8() 
    {
        return spareStr8;
    }
    public void setSpareStr9(String spareStr9) 
    {
        this.spareStr9 = spareStr9;
    }

    public String getSpareStr9() 
    {
        return spareStr9;
    }
    public void setSpareStr10(String spareStr10) 
    {
        this.spareStr10 = spareStr10;
    }

    public String getSpareStr10() 
    {
        return spareStr10;
    }
    public void setSpareStr11(String spareStr11) 
    {
        this.spareStr11 = spareStr11;
    }

    public String getSpareStr11() 
    {
        return spareStr11;
    }
    public void setOrganization(String organization) 
    {
        this.organization = organization;
    }

    public String getOrganization() 
    {
        return organization;
    }
    public void setCompanycode(String companycode) 
    {
        this.companycode = companycode;
    }

    public String getCompanycode() 
    {
        return companycode;
    }
    public void setMaterialclass(String materialclass) 
    {
        this.materialclass = materialclass;
    }

    public String getMaterialclass() 
    {
        return materialclass;
    }
    public void setIsmanage(BigDecimal ismanage) 
    {
        this.ismanage = ismanage;
    }

    public BigDecimal getIsmanage() 
    {
        return ismanage;
    }
    public void setStandardtare(Long standardtare) 
    {
        this.standardtare = standardtare;
    }

    public Long getStandardtare() 
    {
        return standardtare;
    }
    public void setFactorycode(String factorycode) 
    {
        this.factorycode = factorycode;
    }

    public String getFactorycode() 
    {
        return factorycode;
    }
    public void setMaterialid(String materialid) 
    {
        this.materialid = materialid;
    }

    public String getMaterialid() 
    {
        return materialid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("materialcode", getMaterialcode())
            .append("materialname", getMaterialname())
            .append("relatedcode", getRelatedcode())
            .append("pycode", getPycode())
            .append("units", getUnits())
            .append("singlegross", getSinglegross())
            .append("standardpackage", getStandardpackage())
            .append("materialspc", getMaterialspc())
            .append("materialtype", getMaterialtype())
            .append("comparisontype", getComparisontype())
            .append("comparisonvalue", getComparisonvalue())
            .append("spareStr1", getSpareStr1())
            .append("spareStr2", getSpareStr2())
            .append("spareStr3", getSpareStr3())
            .append("note", getNote())
            .append("createTime", getCreateTime())
            .append("spareStr4", getSpareStr4())
            .append("spareStr5", getSpareStr5())
            .append("spareStr6", getSpareStr6())
            .append("spareStr7", getSpareStr7())
            .append("spareStr8", getSpareStr8())
            .append("spareStr9", getSpareStr9())
            .append("spareStr10", getSpareStr10())
            .append("spareStr11", getSpareStr11())
            .append("organization", getOrganization())
            .append("companycode", getCompanycode())
            .append("materialclass", getMaterialclass())
            .append("ismanage", getIsmanage())
            .append("standardtare", getStandardtare())
            .append("factorycode", getFactorycode())
            .append("materialid", getMaterialid())
            .toString();
    }
}
