/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package ProblemDomainComponent;

/**
 *
 * @author yoserizy
 */
import KFramework30.Base.KBusinessObjectClass;
import KFramework30.Base.KExceptionClass;
import java.awt.Component;
import java.awt.Container;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.TableGenerator;


@Entity
@TableGenerator( // SCOPE is Global to PU
    name="KIDGenerator", 
    table="SEQUENCE", 
    pkColumnName="SEQ_NAME", 
    valueColumnName="SEQ_COUNT", 
    pkColumnValue="SEQ_GEN_TABLE", 
    allocationSize=1)    
@Table(name = "STOCK")
public class stockClass 
extends KBusinessObjectClass
 {
    
        
    @Id
    @KBusinessObjectClass.KID    
    @Basic(optional = false)
    @GeneratedValue( strategy = javax.persistence.GenerationType.TABLE, generator="KIDGenerator" )    
    @Column(name = "id")
    private long id;
    
    @Column(name = "stocktypeid")
    private long stocktypeid;
    
    @Column(name = "buyerid")
    private long buyerid;

    @Column(name = "styleid")
    private long styleid;

    @Column(name = "product")
    private String product;

    @Column(name = "colour")
    private String colour;

    @Column(name = "qty")
    private long qty;

    @KBusinessObjectClass.KObjectVersion
    @Column(name = "version")
    private long version;    
    
    @Lob
    @Column(name = "image")
    private byte[] image;    

// ==============================================================================    
            
    @Override
    public void materializeFromDisplay(Container visualDisplay, List extraList, int missingFieldsBehavior) throws KExceptionClass {
                
        super.materializeFromDisplay(visualDisplay, extraList, missingFieldsBehavior);
        
        //if( prodCost <= 0 ) throw new KExceptionClass( "Product Cost must be assigned", null);
    }    
    
// ==============================================================================    

    public stockClass()
    throws KExceptionClass
    {
        //fieldTypes.put( "prodCost", CURRENCY_TYPE );
        
    }

    // ==============================================================================            
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getStocktypeid() {
        return stocktypeid;
    }

    public void setStocktypeid(long stocktypeid) {
        this.stocktypeid = stocktypeid;
    }

    public long getBuyerid() {
        return buyerid;
    }

    public void setBuyerid(long buyerid) {
        this.buyerid = buyerid;
    }

    public long getStyleid() {
        return styleid;
    }

    public void setStyleid(long styleid) {
        this.styleid = styleid;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public long getQty() {
        return qty;
    }

    public void setQty(long qty) {
        this.qty = qty;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
        
    
    
    
    @Override
    public void validateInput(String currentField, Component currentComponent) throws KExceptionClass {
    }

    
}