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
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;


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
    pkColumnValue="SEQ_GEN_MUTASISISA", 
    allocationSize=1)
@Table(name = "V_SELECT_MUTASISISA")
public class v_Select_MutasiSisaClass 
extends KBusinessObjectClass{

    
    @Id
    @KBusinessObjectClass.KID    
    @Basic(optional = false)
    @GeneratedValue( strategy = javax.persistence.GenerationType.TABLE, generator="KIDGenerator" )    
    @Column(name = "id")
    private long ID;

    @Column(name = "description")
    private String Description;

    @Column(name = "msk")
    private long Msk;

    @Column(name = "kel")
    private Long Kel;

    @KBusinessObjectClass.KObjectVersion
    @Column(name = "version")
    private long version;

    public v_Select_MutasiSisaClass() throws KExceptionClass {
    }

    //=================================================================    
    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    
    public long getMsk() {
        return Msk;
    }

    public void setMsk(long Msk) {
        this.Msk = Msk;
    }

    public Long getKel() {
        return Kel;
    }

    public void setKel(Long Kel) {
        this.Kel = Kel;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }
    
    //=================================================================
        @Override
    public void validateInput(String currentField, Component currentComponent) throws KExceptionClass {
    }


}
