/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package ProblemDomainComponent;

import KFramework30.Base.KBusinessObjectClass;
import KFramework30.Base.KExceptionClass;
import java.awt.Component;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author yoserizy
 */
@Entity
@TableGenerator( // SCOPE is Global to PU
    name="KIDGenerator", 
    table="SEQUENCE", 
    pkColumnName="SEQ_NAME", 
    valueColumnName="SEQ_COUNT", 
    pkColumnValue="GEN_LAPROD_DTL", 
    allocationSize=1)    
@Table(name = "LAPORANPRODUKSI_DTL")
public class LaporanProduksiDetailClass 
extends KBusinessObjectClass
{
    @KBusinessObjectClass.KID
    @Id   
    @GeneratedValue( strategy = javax.persistence.GenerationType.TABLE, generator="KIDGenerator" )    
    @Column(name = "id")
    private long ID;

    @Column(name = "hdrid")
    private Long HdrID;

    @Column(name = "buyerid")
    private Long BuyerID;

    @Column(name = "buyername")
    private String BuyerName;

    @Column(name = "style")
    private String Style;

    @Column(name = "color")
    private String Color;

    @Column(name = "costumer")
    private String Costumer;
    
    @Column(name = "repackcode")
    private String RepackCode;

    @Column(name = "qtyofpack")
    private Long QtyOfPack;

    @Column(name = "ref0")
    private String Ref0;

    @Column(name = "xs")
    private Long XS;

    @Column(name = "s")
    private Long S;
    
    @Column(name = "m")
    private Long M;

    @Column(name = "l")
    private Long L;
   
    @Column(name = "xl")
    private Long XL;
    
    @Column(name = "xxl")
    private Long XXL;

    @Column(name = "xxxl")
    private Long XXXL;

    @Column(name = "reject")
    private Long Reject;

    @Column(name = "createdby")
    private String CreatedBy;
    
    @Column(name = "datecreated")
    @Temporal(TemporalType.TIMESTAMP)   
    private Date DateCreated;


    @KBusinessObjectClass.KObjectVersion
    @Column(name = "version")
    private long version;
    
    public LaporanProduksiDetailClass() throws KExceptionClass{
    }

    //=================================================================
    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public Long getHdrID() {
        return HdrID;
    }

    public void setHdrID(Long HdrID) {
        this.HdrID = HdrID;
    }

    public Long getBuyerID() {
        return BuyerID;
    }

    public void setBuyerID(Long BuyerID) {
        this.BuyerID = BuyerID;
    }

    public String getBuyerName() {
        return BuyerName;
    }

    public void setBuyerName(String BuyerName) {
        this.BuyerName = BuyerName;
    }

    public String getStyle() {
        return Style;
    }

    public void setStyle(String Style) {
        this.Style = Style;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getCostumer() {
        return Costumer;
    }

    public void setCostumer(String Costumer) {
        this.Costumer = Costumer;
    }

    public String getRepackCode() {
        return RepackCode;
    }

    public void setRepackCode(String RepackCode) {
        this.RepackCode = RepackCode;
    }

    public Long getQtyOfPack() {
        return QtyOfPack;
    }

    public void setQtyOfPack(Long QtyOfPack) {
        this.QtyOfPack = QtyOfPack;
    }

    public String getRef0() {
        return Ref0;
    }

    public void setRef0(String Ref0) {
        this.Ref0 = Ref0;
    }

    public Long getXS() {
        return XS;
    }

    public void setXS(Long XS) {
        this.XS = XS;
    }

    public Long getS() {
        return S;
    }

    public void setS(Long S) {
        this.S = S;
    }

    public Long getM() {
        return M;
    }

    public void setM(Long M) {
        this.M = M;
    }

    public Long getL() {
        return L;
    }

    public void setL(Long L) {
        this.L = L;
    }

    public Long getXL() {
        return XL;
    }

    public void setXL(Long XL) {
        this.XL = XL;
    }

    public Long getXXL() {
        return XXL;
    }

    public void setXXL(Long XXL) {
        this.XXL = XXL;
    }

    public Long getXXXL() {
        return XXXL;
    }

    public void setXXXL(Long XXXL) {
        this.XXXL = XXXL;
    }

    public Long getReject() {
        return Reject;
    }

    public void setReject(Long Reject) {
        this.Reject = Reject;
    }

    public String getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(String CreatedBy) {
        this.CreatedBy = CreatedBy;
    }

    public Date getDateCreated() {
        return DateCreated;
    }

    public void setDateCreated(Date DateCreated) {
        this.DateCreated = DateCreated;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    
    public void validateInput(String currentField, Component currentComponent) throws KExceptionClass {
    }
    
}
