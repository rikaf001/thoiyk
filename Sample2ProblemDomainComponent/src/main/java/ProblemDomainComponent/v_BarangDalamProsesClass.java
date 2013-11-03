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
    pkColumnValue="GEN_BRNGDLMPROSES", 
    allocationSize=1)    
@Table(name = "V_BARANGDALAMPROSES")
public class v_BarangDalamProsesClass 
extends KBusinessObjectClass
{
    @KBusinessObjectClass.KID
    @Id   
    @GeneratedValue( strategy = javax.persistence.GenerationType.TABLE, generator="KIDGenerator" )    
    @Column(name = "id")
    private long ID;

    @Column(name = "tanggal")
    @Temporal(TemporalType.TIMESTAMP)   
    private Date Tanggal;

    @Column(name = "kodekawasanid")
    private Long KodeKawasanID;
    
    @Column(name = "kodekawasannama")
    private String KodeKawasanNama;

    @Column(name = "barangid")
    private long BarangID;

    @Column(name = "barangkode")
    private String BarangKode;

    @Column(name = "barangnama")
    private String BarangNama;

    @Column(name = "barangstyle")
    private String BarangStyle;

    @Column(name = "catatan")
    private String Catatan;

    @Column(name = "jumlah")
    private long Jumlah;

    @Column(name = "createdby")
    private String CreatedBy;
    
    @Column(name = "datecreated")
    @Temporal(TemporalType.TIMESTAMP)   
    private Date DateCreated;



    @KBusinessObjectClass.KObjectVersion
    @Column(name = "version")
    private long version;
    
    public v_BarangDalamProsesClass() throws KExceptionClass{
    }

    //=================================================================
    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public Date getTanggal() {
        return Tanggal;
    }

    public void setTanggal(Date Tanggal) {
        this.Tanggal = Tanggal;
    }

    public Long getKodeKawasanID() {
        return KodeKawasanID;
    }

    public void setKodeKawasanID(Long KodeKawasanID) {
        this.KodeKawasanID = KodeKawasanID;
    }

    public String getKodeKawasanNama() {
        return KodeKawasanNama;
    }

    public void setKodeKawasanNama(String KodeKawasanNama) {
        this.KodeKawasanNama = KodeKawasanNama;
    }

    public long getBarangID() {
        return BarangID;
    }

    public void setBarangID(long BarangID) {
        this.BarangID = BarangID;
    }

    public String getBarangKode() {
        return BarangKode;
    }

    public void setBarangKode(String BarangKode) {
        this.BarangKode = BarangKode;
    }

    public String getBarangNama() {
        return BarangNama;
    }

    public void setBarangNama(String BarangNama) {
        this.BarangNama = BarangNama;
    }

    public String getBarangStyle() {
        return BarangStyle;
    }

    public void setBarangStyle(String BarangStyle) {
        this.BarangStyle = BarangStyle;
    }

    public String getCatatan() {
        return Catatan;
    }

    public void setCatatan(String Catatan) {
        this.Catatan = Catatan;
    }

    public long getJumlah() {
        return Jumlah;
    }

    public void setJumlah(long Jumlah) {
        this.Jumlah = Jumlah;
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
