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
    private long ItemID;

    @Column(name = "markerid")
    private long MarkerID;

    @Column(name = "ttlqtyratio")
    private Long TtlQtyRatio;


    @Column(name = "colour")
    private String Colour;

    @Column(name = "itemname")
    private String ItemName;
        
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
            
    @Column(name = "xs")
    private double XS;
        
    @Column(name = "s")
    private double S;
        
    @Column(name = "m")
    private double M;

    @Column(name = "l")
    private double L;
        
    @Column(name = "xl")
    private double XL;
    
    @Column(name = "xxl")
    private double XXL;
        
    @Column(name = "xxxl")
    private double XXXL;
        
    @Column(name = "lxs")
    private double LXS;
        
    @Column(name = "ls")
    private double LS;
        
    @Column(name = "lm")
    private double LM;

    @Column(name = "ll")
    private double LL;
        
    @Column(name = "lxl")
    private double LXL;
    
    @Column(name = "lxxl")
    private double LXXL;
        
    @Column(name = "lxxxl")
    private double LXXXL;
    
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

    public long getItemID() {
        return ItemID;
    }

    public void setItemID(long ItemID) {
        this.ItemID = ItemID;
    }

    public long getMarkerID() {
        return MarkerID;
    }

    public void setMarkerID(long MarkerID) {
        this.MarkerID = MarkerID;
    }

    public Long getTtlQtyRatio() {
        return TtlQtyRatio;
    }

    public void setTtlQtyRatio(Long TtlQtyRatio) {
        this.TtlQtyRatio = TtlQtyRatio;
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

    public double getXS() {
        return XS;
    }

    public void setXS(double XS) {
        this.XS = XS;
    }

    public double getS() {
        return S;
    }

    public void setS(double S) {
        this.S = S;
    }

    public double getM() {
        return M;
    }

    public void setM(double M) {
        this.M = M;
    }

    public double getL() {
        return L;
    }

    public void setL(double L) {
        this.L = L;
    }

    public double getXL() {
        return XL;
    }

    public void setXL(double XL) {
        this.XL = XL;
    }

    public double getXXL() {
        return XXL;
    }

    public void setXXL(double XXL) {
        this.XXL = XXL;
    }

    public double getXXXL() {
        return XXXL;
    }

    public void setXXXL(double XXXL) {
        this.XXXL = XXXL;
    }

    public double getLXS() {
        return LXS;
    }

    public void setLXS(double LXS) {
        this.LXS = LXS;
    }

    public double getLS() {
        return LS;
    }

    public void setLS(double LS) {
        this.LS = LS;
    }

    public double getLM() {
        return LM;
    }

    public void setLM(double LM) {
        this.LM = LM;
    }

    public double getLL() {
        return LL;
    }

    public void setLL(double LL) {
        this.LL = LL;
    }

    public double getLXL() {
        return LXL;
    }

    public void setLXL(double LXL) {
        this.LXL = LXL;
    }

    public double getLXXL() {
        return LXXL;
    }

    public void setLXXL(double LXXL) {
        this.LXXL = LXXL;
    }

    public double getLXXXL() {
        return LXXXL;
    }

    public void setLXXXL(double LXXXL) {
        this.LXXXL = LXXXL;
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
    
    
    
    @Override
    public void validateInput(String currentField, Component currentComponent) throws KExceptionClass {
    }


}
