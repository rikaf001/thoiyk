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
    pkColumnValue="SEQ_PO_ITEM", 
    allocationSize=1)    
@Table(name = "V_PO_ITEM")
public class v_PO_ItemClass 
extends KBusinessObjectClass
{
    @Id
    @KBusinessObjectClass.KID    
    @Basic(optional = false)
    @GeneratedValue( strategy = javax.persistence.GenerationType.TABLE, generator="KIDGenerator" )    
    @Column(name = "id")
    private long ID;
    
    @Column(name = "prno")
    private String PRNo;

    
 

    public v_PO_ItemClass() throws KExceptionClass {
    }

    //=================================================================
    public long getID() {
        return ID;
    }


    public String getPRNo() {
        return PRNo;
    }


    

    
    
    @Override
    public void validateInput(String currentField, Component currentComponent) throws KExceptionClass {
    }
    
    
}
