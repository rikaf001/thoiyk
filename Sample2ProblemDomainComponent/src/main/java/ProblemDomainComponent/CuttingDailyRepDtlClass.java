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
    pkColumnValue="SEQ_PR_DTL", 
    allocationSize=1)    
@Table(name = "CUTTINGDAILYREP_DTL")
public class CuttingDailyRepDtlClass 
extends KBusinessObjectClass
{

    @KID
    @Id   
    @GeneratedValue( strategy = javax.persistence.GenerationType.TABLE, generator="KIDGenerator" )    
    @Column(name = "id")
    private long ID;
    
    @Column(name = "hdrid")
    private long HdrID;

    @Column(name = "itemid")
    private double ItemID;

    @Column(name = "markerid")
    private long MarkerID;
    
    @Column(name = "sizedtlid")
    private long SizeDtlID;
    

    @Column(name = "ttlqtyratio")
    private Long TtlQtyRatio;


    @Column(name = "colour")
    private String Colour;

    @Column(name = "itemname")
    private String ItemName;
        
    @Column(name = "tipe")
    private String Tipe;
        
    @Column(name = "layer")
    private double Layer;

    @Column(name = "totalcut")
    private double TotalCut;

    @Column(name = "markerlenght")
    private double MarkerLenght;
        
    @Column(name = "totalfabricused")
    private double TotalFabricUsed;
    
    @Column(name = "yard")
    private double Yard;
    
    @Column(name = "yy")
    private double Yy;

    @Column(name = "inch")
    private double Inch;


    @Column(name = "size1")
    private String Size1;

    @Column(name = "size2")
    private String Size2;

    @Column(name = "size3")
    private String Size3;

    @Column(name = "size4")
    private String Size4;

    @Column(name = "size5")
    private String Size5;

    @Column(name = "size6")
    private String Size6;

    @Column(name = "size7")
    private String Size7;

    @Column(name = "size8")
    private String Size8;

    @Column(name = "size9")
    private String Size9;

    @Column(name = "size10")
    private String Size10;

    @Column(name = "size11")
    private String Size11;

    @Column(name = "size12")
    private String Size12;

    @Column(name = "size13")
    private String Size13;

    @Column(name = "size14")
    private String Size14;

    @Column(name = "size15")
    private String Size15;


    @Column(name = "slayer1")
    private String SLayer1;

    @Column(name = "slayer2")
    private String SLayer2;

    @Column(name = "slayer3")
    private String SLayer3;

    @Column(name = "slayer4")
    private String SLayer4;

    @Column(name = "slayer5")
    private String SLayer5;

    @Column(name = "slayer6")
    private String SLayer6;

    @Column(name = "slayer7")
    private String SLayer7;

    @Column(name = "slayer8")
    private String SLayer8;

    @Column(name = "slayer9")
    private String SLayer9;

    @Column(name = "slayer10")
    private String SLayer10;

    @Column(name = "slayer11")
    private String SLayer11;

    @Column(name = "slayer12")
    private String SLayer12;

    @Column(name = "slayer13")
    private String SLayer13;

    @Column(name = "slayer14")
    private String SLayer14;

    @Column(name = "slayer15")
    private String SLayer15;

    @Column(name = "sratio1")
    private String SRatio1;

    @Column(name = "sratio2")
    private String SRatio2;
    
    @Column(name = "sratio3")
    private String SRatio3;
    
    @Column(name = "sratio4")
    private String SRatio4;
    
    @Column(name = "sratio5")
    private String SRatio5;
    
    @Column(name = "sratio6")
    private String SRatio6;
    
    @Column(name = "sratio7")
    private String SRatio7;
    
    @Column(name = "sratio8")
    private String SRatio8;
    
    @Column(name = "sratio9")
    private String SRatio9;
    
    @Column(name = "sratio10")
    private String SRatio10;
    
    @Column(name = "sratio11")
    private String SRatio11;
    
    @Column(name = "sratio12")
    private String SRatio12;
    
    @Column(name = "sratio13")
    private String SRatio13;
    
    @Column(name = "sratio14")
    private String SRatio14;
    
    @Column(name = "sratio15")
    private String SRatio15;
    
    @Column(name = "sbdown1")
    private String SSDown1;
    
    @Column(name = "sbdown2")
    private String SSDown2;

    @Column(name = "sbdown3")
    private String SSDown3;

    @Column(name = "sbdown4")
    private String SSDown4;

    @Column(name = "sbdown5")
    private String SSDown5;

    @Column(name = "sbdown6")
    private String SSDown6;

    @Column(name = "sbdown7")
    private String SSDown7;

    @Column(name = "sbdown8")
    private String SSDown8;

    @Column(name = "sbdown9")
    private String SSDown9;

    @Column(name = "sbdown10")
    private String SSDown10;

    @Column(name = "sbdown11")
    private String SSDown11;

    @Column(name = "sbdown12")
    private String SSDown12;

    @Column(name = "sbdown13")
    private String SSDown13;

    @Column(name = "sbdown14")
    private String SSDown14;

    @Column(name = "sbdown15")
    private String SSDown15;


    @Column(name = "auditdate")
    @Temporal(TemporalType.TIMESTAMP)   
    private Date AuditDate;

    @Column(name = "audituser")
    private String AuditUser;
    

    @KBusinessObjectClass.KObjectVersion
    @Column(name = "version")
    private long version;

    
    public CuttingDailyRepDtlClass() throws KExceptionClass {
    }

    //=================================================================
    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public long getHdrID() {
        return HdrID;
    }

    public void setHdrID(long HdrID) {
        this.HdrID = HdrID;
    }

    public double getItemID() {
        return ItemID;
    }

    public void setItemID(double ItemID) {
        this.ItemID = ItemID;
    }

    public long getMarkerID() {
        return MarkerID;
    }

    public void setMarkerID(long MarkerID) {
        this.MarkerID = MarkerID;
    }

    public long getSizeDtlID() {
        return SizeDtlID;
    }

    public void setSizeDtlID(long SizeDtlID) {
        this.SizeDtlID = SizeDtlID;
    }

    public Long getTtlQtyRatio() {
        return TtlQtyRatio;
    }

    public void setTtlQtyRatio(Long TtlQtyRatio) {
        this.TtlQtyRatio = TtlQtyRatio;
    }

    public String getColour() {
        return Colour;
    }

    public void setColour(String Colour) {
        this.Colour = Colour;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    public double getLayer() {
        return Layer;
    }

    public void setLayer(double Layer) {
        this.Layer = Layer;
    }

    public double getTotalCut() {
        return TotalCut;
    }

    public void setTotalCut(double TotalCut) {
        this.TotalCut = TotalCut;
    }

    public double getMarkerLenght() {
        return MarkerLenght;
    }

    public void setMarkerLenght(double MarkerLenght) {
        this.MarkerLenght = MarkerLenght;
    }

    public double getTotalFabricUsed() {
        return TotalFabricUsed;
    }

    public void setTotalFabricUsed(double TotalFabricUsed) {
        this.TotalFabricUsed = TotalFabricUsed;
    }

    public double getYard() {
        return Yard;
    }

    public void setYard(double Yard) {
        this.Yard = Yard;
    }

    public double getYy() {
        return Yy;
    }

    public void setYy(double Yy) {
        this.Yy = Yy;
    }

    public double getInch() {
        return Inch;
    }

    public void setInch(double Inch) {
        this.Inch = Inch;
    }

    public String getSize1() {
        return Size1;
    }

    public void setSize1(String Size1) {
        this.Size1 = Size1;
    }

    public String getSize2() {
        return Size2;
    }

    public void setSize2(String Size2) {
        this.Size2 = Size2;
    }

    public String getSize3() {
        return Size3;
    }

    public void setSize3(String Size3) {
        this.Size3 = Size3;
    }

    public String getSize4() {
        return Size4;
    }

    public void setSize4(String Size4) {
        this.Size4 = Size4;
    }

    public String getSize5() {
        return Size5;
    }

    public void setSize5(String Size5) {
        this.Size5 = Size5;
    }

    public String getSize6() {
        return Size6;
    }

    public void setSize6(String Size6) {
        this.Size6 = Size6;
    }

    public String getSize7() {
        return Size7;
    }

    public void setSize7(String Size7) {
        this.Size7 = Size7;
    }

    public String getSize8() {
        return Size8;
    }

    public void setSize8(String Size8) {
        this.Size8 = Size8;
    }

    public String getSize9() {
        return Size9;
    }

    public void setSize9(String Size9) {
        this.Size9 = Size9;
    }

    public String getSize10() {
        return Size10;
    }

    public void setSize10(String Size10) {
        this.Size10 = Size10;
    }

    public String getSize11() {
        return Size11;
    }

    public void setSize11(String Size11) {
        this.Size11 = Size11;
    }

    public String getSize12() {
        return Size12;
    }

    public void setSize12(String Size12) {
        this.Size12 = Size12;
    }

    public String getSize13() {
        return Size13;
    }

    public void setSize13(String Size13) {
        this.Size13 = Size13;
    }

    public String getSize14() {
        return Size14;
    }

    public void setSize14(String Size14) {
        this.Size14 = Size14;
    }

    public String getSize15() {
        return Size15;
    }

    public void setSize15(String Size15) {
        this.Size15 = Size15;
    }

    public String getSLayer1() {
        return SLayer1;
    }

    public void setSLayer1(String SLayer1) {
        this.SLayer1 = SLayer1;
    }

    public String getSLayer2() {
        return SLayer2;
    }

    public void setSLayer2(String SLayer2) {
        this.SLayer2 = SLayer2;
    }

    public String getSLayer3() {
        return SLayer3;
    }

    public void setSLayer3(String SLayer3) {
        this.SLayer3 = SLayer3;
    }

    public String getSLayer4() {
        return SLayer4;
    }

    public void setSLayer4(String SLayer4) {
        this.SLayer4 = SLayer4;
    }

    public String getSLayer5() {
        return SLayer5;
    }

    public void setSLayer5(String SLayer5) {
        this.SLayer5 = SLayer5;
    }

    public String getSLayer6() {
        return SLayer6;
    }

    public void setSLayer6(String SLayer6) {
        this.SLayer6 = SLayer6;
    }

    public String getSLayer7() {
        return SLayer7;
    }

    public void setSLayer7(String SLayer7) {
        this.SLayer7 = SLayer7;
    }

    public String getSLayer8() {
        return SLayer8;
    }

    public void setSLayer8(String SLayer8) {
        this.SLayer8 = SLayer8;
    }

    public String getSLayer9() {
        return SLayer9;
    }

    public void setSLayer9(String SLayer9) {
        this.SLayer9 = SLayer9;
    }

    public String getSLayer10() {
        return SLayer10;
    }

    public void setSLayer10(String SLayer10) {
        this.SLayer10 = SLayer10;
    }

    public String getSLayer11() {
        return SLayer11;
    }

    public void setSLayer11(String SLayer11) {
        this.SLayer11 = SLayer11;
    }

    public String getSLayer12() {
        return SLayer12;
    }

    public void setSLayer12(String SLayer12) {
        this.SLayer12 = SLayer12;
    }

    public String getSLayer13() {
        return SLayer13;
    }

    public void setSLayer13(String SLayer13) {
        this.SLayer13 = SLayer13;
    }

    public String getSLayer14() {
        return SLayer14;
    }

    public void setSLayer14(String SLayer14) {
        this.SLayer14 = SLayer14;
    }

    public String getSLayer15() {
        return SLayer15;
    }

    public void setSLayer15(String SLayer15) {
        this.SLayer15 = SLayer15;
    }

    public String getSRatio1() {
        return SRatio1;
    }

    public void setSRatio1(String SRatio1) {
        this.SRatio1 = SRatio1;
    }

    public String getSRatio2() {
        return SRatio2;
    }

    public void setSRatio2(String SRatio2) {
        this.SRatio2 = SRatio2;
    }

    public String getSRatio3() {
        return SRatio3;
    }

    public void setSRatio3(String SRatio3) {
        this.SRatio3 = SRatio3;
    }

    public String getSRatio4() {
        return SRatio4;
    }

    public void setSRatio4(String SRatio4) {
        this.SRatio4 = SRatio4;
    }

    public String getSRatio5() {
        return SRatio5;
    }

    public void setSRatio5(String SRatio5) {
        this.SRatio5 = SRatio5;
    }

    public String getSRatio6() {
        return SRatio6;
    }

    public void setSRatio6(String SRatio6) {
        this.SRatio6 = SRatio6;
    }

    public String getSRatio7() {
        return SRatio7;
    }

    public void setSRatio7(String SRatio7) {
        this.SRatio7 = SRatio7;
    }

    public String getSRatio8() {
        return SRatio8;
    }

    public void setSRatio8(String SRatio8) {
        this.SRatio8 = SRatio8;
    }

    public String getSRatio9() {
        return SRatio9;
    }

    public void setSRatio9(String SRatio9) {
        this.SRatio9 = SRatio9;
    }

    public String getSRatio10() {
        return SRatio10;
    }

    public void setSRatio10(String SRatio10) {
        this.SRatio10 = SRatio10;
    }

    public String getSRatio11() {
        return SRatio11;
    }

    public void setSRatio11(String SRatio11) {
        this.SRatio11 = SRatio11;
    }

    public String getSRatio12() {
        return SRatio12;
    }

    public void setSRatio12(String SRatio12) {
        this.SRatio12 = SRatio12;
    }

    public String getSRatio13() {
        return SRatio13;
    }

    public void setSRatio13(String SRatio13) {
        this.SRatio13 = SRatio13;
    }

    public String getSRatio14() {
        return SRatio14;
    }

    public void setSRatio14(String SRatio14) {
        this.SRatio14 = SRatio14;
    }

    public String getSRatio15() {
        return SRatio15;
    }

    public void setSRatio15(String SRatio15) {
        this.SRatio15 = SRatio15;
    }

    public String getSSDown1() {
        return SSDown1;
    }

    public void setSSDown1(String SSDown1) {
        this.SSDown1 = SSDown1;
    }

    public String getSSDown2() {
        return SSDown2;
    }

    public void setSSDown2(String SSDown2) {
        this.SSDown2 = SSDown2;
    }

    public String getSSDown3() {
        return SSDown3;
    }

    public void setSSDown3(String SSDown3) {
        this.SSDown3 = SSDown3;
    }

    public String getSSDown4() {
        return SSDown4;
    }

    public void setSSDown4(String SSDown4) {
        this.SSDown4 = SSDown4;
    }

    public String getSSDown5() {
        return SSDown5;
    }

    public void setSSDown5(String SSDown5) {
        this.SSDown5 = SSDown5;
    }

    public String getSSDown6() {
        return SSDown6;
    }

    public void setSSDown6(String SSDown6) {
        this.SSDown6 = SSDown6;
    }

    public String getSSDown7() {
        return SSDown7;
    }

    public void setSSDown7(String SSDown7) {
        this.SSDown7 = SSDown7;
    }

    public String getSSDown8() {
        return SSDown8;
    }

    public void setSSDown8(String SSDown8) {
        this.SSDown8 = SSDown8;
    }

    public String getSSDown9() {
        return SSDown9;
    }

    public void setSSDown9(String SSDown9) {
        this.SSDown9 = SSDown9;
    }

    public String getSSDown10() {
        return SSDown10;
    }

    public void setSSDown10(String SSDown10) {
        this.SSDown10 = SSDown10;
    }

    public String getSSDown11() {
        return SSDown11;
    }

    public void setSSDown11(String SSDown11) {
        this.SSDown11 = SSDown11;
    }

    public String getSSDown12() {
        return SSDown12;
    }

    public void setSSDown12(String SSDown12) {
        this.SSDown12 = SSDown12;
    }

    public String getSSDown13() {
        return SSDown13;
    }

    public void setSSDown13(String SSDown13) {
        this.SSDown13 = SSDown13;
    }

    public String getSSDown14() {
        return SSDown14;
    }

    public void setSSDown14(String SSDown14) {
        this.SSDown14 = SSDown14;
    }

    public String getSSDown15() {
        return SSDown15;
    }

    public void setSSDown15(String SSDown15) {
        this.SSDown15 = SSDown15;
    }

    public Date getAuditDate() {
        return AuditDate;
    }

    public void setAuditDate(Date AuditDate) {
        this.AuditDate = AuditDate;
    }

    public String getAuditUser() {
        return AuditUser;
    }

    public void setAuditUser(String AuditUser) {
        this.AuditUser = AuditUser;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public String getTipe() {
        return Tipe;
    }

    public void setTipe(String Tipe) {
        this.Tipe = Tipe;
    }

    
    
    
    @Override
    public void validateInput(String currentField, Component currentComponent) throws KExceptionClass {
    }


}
