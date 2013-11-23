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
    pkColumnValue="GEN_MUTASIJADI", 
    allocationSize=1)
@Table(name = "MUTASIJADI")
public class MutasiJadiClass 
extends KBusinessObjectClass{

    
    @Id
    @KBusinessObjectClass.KID    
    @Basic(optional = false)
    @GeneratedValue( strategy = javax.persistence.GenerationType.TABLE, generator="KIDGenerator" )    
    @Column(name = "id")
    private long ID;

    @Column(name = "kodekawasanid")
    private long KodeKawasanID;

    @Column(name = "barangid")
    private long BarangID;

    @Column(name = "barangnama")
    private String BarangNama;

    @Column(name = "unittypeid")
    private long UnitTypeID;

    @Column(name = "stockopname")
    private long StockOpname;

    @Column(name = "selisih")
    private long Selisih;

    @Column(name = "saldoawal")
    private long SaldoAwal;

    @Column(name = "pemasukan")
    private long Pemasukan;

    @Column(name = "pengeluaran")
    private long Pengeluaran;

    @Column(name = "penyesuaian")
    private long Penyesuaian;

    @Column(name = "saldoakhir")
    private long SaldoAkhir;

    @Column(name = "createdby")
    private String createdby;
   
    @Column(name = "datecreated")
    @Temporal(TemporalType.TIMESTAMP)   
    private Date DateCreated;

    public MutasiJadiClass() throws KExceptionClass {
    }

    //=================================================================    
    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public long getKodeKawasanID() {
        return KodeKawasanID;
    }

    public void setKodeKawasanID(long KodeKawasanID) {
        this.KodeKawasanID = KodeKawasanID;
    }

    public long getBarangID() {
        return BarangID;
    }

    public void setBarangID(long BarangID) {
        this.BarangID = BarangID;
    }

    public String getBarangNama() {
        return BarangNama;
    }

    public void setBarangNama(String BarangNama) {
        this.BarangNama = BarangNama;
    }

    public long getUnitTypeID() {
        return UnitTypeID;
    }

    public void setUnitTypeID(long UnitTypeID) {
        this.UnitTypeID = UnitTypeID;
    }

    public long getStockOpname() {
        return StockOpname;
    }

    public void setStockOpname(long StockOpname) {
        this.StockOpname = StockOpname;
    }

    public long getSelisih() {
        return Selisih;
    }

    public void setSelisih(long Selisih) {
        this.Selisih = Selisih;
    }

    public long getSaldoAwal() {
        return SaldoAwal;
    }

    public void setSaldoAwal(long SaldoAwal) {
        this.SaldoAwal = SaldoAwal;
    }

    public long getPemasukan() {
        return Pemasukan;
    }

    public void setPemasukan(long Pemasukan) {
        this.Pemasukan = Pemasukan;
    }

    public long getPengeluaran() {
        return Pengeluaran;
    }

    public void setPengeluaran(long Pengeluaran) {
        this.Pengeluaran = Pengeluaran;
    }

    public long getPenyesuaian() {
        return Penyesuaian;
    }

    public void setPenyesuaian(long Penyesuaian) {
        this.Penyesuaian = Penyesuaian;
    }

    public long getSaldoAkhir() {
        return SaldoAkhir;
    }

    public void setSaldoAkhir(long SaldoAkhir) {
        this.SaldoAkhir = SaldoAkhir;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public Date getDateCreated() {
        return DateCreated;
    }

    public void setDateCreated(Date DateCreated) {
        this.DateCreated = DateCreated;
    }
    
    //=================================================================
        @Override
    public void validateInput(String currentField, Component currentComponent) throws KExceptionClass {
    }


}
