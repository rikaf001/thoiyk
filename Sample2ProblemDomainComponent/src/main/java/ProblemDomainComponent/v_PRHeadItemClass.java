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
    pkColumnValue="SEQ_GEN_TABLE", 
    allocationSize=1)
@Table(name = "V_PRHEADITEM")
public class v_PRHeadItemClass 
extends KBusinessObjectClass
{
    
    @KID
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long ID;
    
    @Column(name = "prid")
    private Long PRID;

    @Column(name = "srid")
    private Long SRID;

    @Column(name = "prno")
    private Long PRNo;

    public v_PRHeadItemClass() throws KExceptionClass {
    }

    //=================================================================    
    public Long getID() {
        return ID;
    }

    public Long getPRID() {
        return PRID;
    }

    public Long getSRID() {
        return SRID;
    }

    public Long getPRNo() {
        return PRNo;
    }
    
    



    @Override
    public void validateInput(String currentField, Component currentComponent) throws KExceptionClass {
    }
    

}
