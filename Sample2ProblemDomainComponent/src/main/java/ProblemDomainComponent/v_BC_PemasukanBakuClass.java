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
import javax.persistence.Basic;
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
    pkColumnValue="SEQ_GEN_TABLE", 
    allocationSize=1)
@Table(name = "V_BC_PEMASUKAN_BAKU")
public class v_BC_PemasukanBakuClass 
extends KBusinessObjectClass{

    
    @Id
    @KBusinessObjectClass.KID    
    @Basic(optional = false)
    @GeneratedValue( strategy = javax.persistence.GenerationType.TABLE, generator="KIDGenerator" )    
    @Column(name = "id")
    private long ID;

    @Column(name = "kawasanid")
    private long KawasanID;

    @Column(name = "Kawasan")
    private String Kawasan;

    @Column(name = "dokbc")
    private String DokBC;

    @Column(name = "nobc")
    private String NoBC;

    
    @Column(name = "tglbc") 
    private String TglBC;
    
    @Column(name = "notrima")
    private String NoTrima;

    @Column(name = "tgltrima")
    private String TglTrima;

    @Column(name = "pengirim")
    private String Pengirim;

    @Column(name = "kodebrng")
    private String KodeBrng;

    @Column(name = "nama")
    private String Nama;

    @Column(name = "unit")
    private String Unit;

    @Column(name = "jumlah")
    private long Jumlah;

    @Column(name = "currency")
    private String Currency;

    @Column(name = "nilai")
    private double Nilai;

    public v_BC_PemasukanBakuClass() throws KExceptionClass {
    }

    //=================================================================    
    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getDokBC() {
        return DokBC;
    }

    public void setDokBC(String DokBC) {
        this.DokBC = DokBC;
    }

    public String getNoBC() {
        return NoBC;
    }

    public void setNoBC(String NoBC) {
        this.NoBC = NoBC;
    }

    public String getTglBC() {
        return TglBC;
    }

    public void setTglBC(String TglBC) {
        this.TglBC = TglBC;
    }

    public String getNoTrima() {
        return NoTrima;
    }

    public void setNoTrima(String NoTrima) {
        this.NoTrima = NoTrima;
    }

    public String getTglTrima() {
        return TglTrima;
    }

    public void setTglTrima(String TglTrima) {
        this.TglTrima = TglTrima;
    }

    public String getPengirim() {
        return Pengirim;
    }

    public void setPengirim(String Pengirim) {
        this.Pengirim = Pengirim;
    }

    public String getKodeBrng() {
        return KodeBrng;
    }

    public void setKodeBrng(String KodeBrng) {
        this.KodeBrng = KodeBrng;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    public long getJumlah() {
        return Jumlah;
    }

    public void setJumlah(long Jumlah) {
        this.Jumlah = Jumlah;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    public double getNilai() {
        return Nilai;
    }

    public void setNilai(double Nilai) {
        this.Nilai = Nilai;
    }
    
    
    
    //=================================================================
        @Override
    public void validateInput(String currentField, Component currentComponent) throws KExceptionClass {
    }


}
