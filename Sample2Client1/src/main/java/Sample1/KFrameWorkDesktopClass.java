/*
 * This source code is part of the Thoyik
 * Copyright (C) 2013  Yoserizal
 * Feedback / Bug Reports yoser174@gmail.com
 * 
 * This project used:
 * KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package Sample1;

// framework
import KFramework30.Base.*;
import KFramework30.Printing.*;

// app
import Sample1.HumanInterfaceComponent.sample_cliente.clientFrameClass;
import Sample1.HumanInterfaceComponent.LIMSDataNavigatorDemo.LimsDataNavigatorFrameClass;
import Sample1.HumanInterfaceComponent.system_mail.mailFrameClass;
import Sample1.HumanInterfaceComponent.system_log.systemLogFrameClass;
import Sample1.HumanInterfaceComponent.system_users.userFrameClass;
import Sample1.HumanInterfaceComponent.system_users.changePasswordEditDialogClass;
import Sample1.HumanInterfaceComponent.LIMSReportsDemo.*;
import Sample1.HumanInterfaceComponent.sample_product.productFrameClass;
import thoiyk.HumanInterfaceComponent.buyer.buyerFrameClass;

// rtl
import java.applet.*;
import java.awt.Toolkit;
import java.awt.event.*;
import java.awt.print.PrinterJob;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.util.Locale;
import javax.swing.*;
import thoiyk.HumanInterfaceComponent.BCPemasukanBaku.BCPemasukanBakuFrameClass;
import thoiyk.HumanInterfaceComponent.BKBHeader.BKBHeaderFrameClass;
import thoiyk.HumanInterfaceComponent.BKSHeader.BKSHeaderFrameClass;
import thoiyk.HumanInterfaceComponent.BRPHeader.BRPHeaderFrameClass;
import thoiyk.HumanInterfaceComponent.BRSHeader.BRSHeaderFrameClass;
import thoiyk.HumanInterfaceComponent.BTBHeader.BTBHeaderFrameClass;
import thoiyk.HumanInterfaceComponent.BTSHeader.BTSHeaderFrameClass;
import thoiyk.HumanInterfaceComponent.BarangDalamProses.BarangDalamProsesFrameClass;
import thoiyk.HumanInterfaceComponent.BarangKeluarBaku.BarangKeluarBakuFrameClass;
import thoiyk.HumanInterfaceComponent.BarangKeluarJadi.BarangKeluarJadiFrameClass;
import thoiyk.HumanInterfaceComponent.BarangKeluarSisa.BarangKeluarSisaFrameClass;
import thoiyk.HumanInterfaceComponent.BarangMasukJadi.BarangMasukJadiFrameClass;
import thoiyk.HumanInterfaceComponent.BarangMasukSisa.BarangMasukSisaFrameClass;
import thoiyk.HumanInterfaceComponent.FormCuttingHeader.FormCuttingHeaderFrameClass;
import thoiyk.HumanInterfaceComponent.FormFinishingHeader.FormFinishingHeaderFrameClass;
import thoiyk.HumanInterfaceComponent.FormKainHeader.FormKainHeaderFrameClass;
import thoiyk.HumanInterfaceComponent.FormPackingHeader.FormPackingHeaderFrameClass;
import thoiyk.HumanInterfaceComponent.FormSewingHeader.FormSewingHeaderFrameClass;
import thoiyk.HumanInterfaceComponent.FormShippingHeader.FormShippingHeaderFrameClass;
import thoiyk.HumanInterfaceComponent.FormWashingHeader.FormWashingHeaderFrameClass;
import thoiyk.HumanInterfaceComponent.JenisDokPabean.JenisDokPabeanFrameClass;
import thoiyk.HumanInterfaceComponent.KodeKawasan.KodeKawasanFrameClass;
import thoiyk.HumanInterfaceComponent.LaporanProduksiHeader.LaporanProduksiHeaderFrameClass;
import thoiyk.HumanInterfaceComponent.MutasiBaku.MutasiBakuFrameClass;
import thoiyk.HumanInterfaceComponent.MutasiJadi.MutasiJadiFrameClass;
import thoiyk.HumanInterfaceComponent.MutasiMesin.MutasiMesinFrameClass;
import thoiyk.HumanInterfaceComponent.MutasiSisa.MutasiSisaFrameClass;
import thoiyk.HumanInterfaceComponent.PurchaseOrder.PurchaseOrderFrameClass;
import thoiyk.HumanInterfaceComponent.accessories.accessoriesFrameClass;
import thoiyk.HumanInterfaceComponent.accessoriestype.accessoriestypeFrameClass;
import thoiyk.HumanInterfaceComponent.fabric.fabricFrameClass;
import thoiyk.HumanInterfaceComponent.fabrictype.fabrictypeFrameClass;
import thoiyk.HumanInterfaceComponent.kontak.kontakFrameClass;
import thoiyk.HumanInterfaceComponent.mesin.mesinFrameClass;
import thoiyk.HumanInterfaceComponent.mesintype.mesintypeFrameClass;
import thoiyk.HumanInterfaceComponent.negara.negaraFrameClass;
import thoiyk.HumanInterfaceComponent.outstandingorder.outstandingorderFrameClass;
import thoiyk.HumanInterfaceComponent.ProductionRecord.ProdRecFrameClass;
import thoiyk.HumanInterfaceComponent.Service.ServiceFrameClass;
import thoiyk.HumanInterfaceComponent.ServiceType.ServiceTypeFrameClass;
import thoiyk.HumanInterfaceComponent.SizeColour.SizeColourFrameClass;
import thoiyk.HumanInterfaceComponent.inv_PemasukanSisa.inv_PemasukanSisaFrameClass;
import thoiyk.HumanInterfaceComponent.inv_PengeluaranBaku.inv_PengeluaranBakuFrameClass;
import thoiyk.HumanInterfaceComponent.inv_PengeluaranSisa.inv_PengeluaranSisaFrameClass;
import thoiyk.HumanInterfaceComponent.samplerecord.samplerecordFrameClass;
import thoiyk.HumanInterfaceComponent.sparepart.sparepartFrameClass;
import thoiyk.HumanInterfaceComponent.spareparttype.spareparttypeFrameClass;
import thoiyk.HumanInterfaceComponent.stock.stockFrameClass;
import thoiyk.HumanInterfaceComponent.stocktype.stocktypeFrameClass;
import thoiyk.HumanInterfaceComponent.supplier.supplierFrameClass;

// misc

       
public class KFrameWorkDesktopClass 
extends javax.swing.JApplet 
implements desktopAccessInterface, ActionListener
{

    // has -  defaulted
    public KConfigurationClass                  configuration;
    public KLogClass                            log;  
                    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        StatusBar = new javax.swing.JPanel();
        desktopStatusLabel = new javax.swing.JLabel();
        mainProgressIcon = new javax.swing.JLabel();
        DesktopToolbar = new javax.swing.JToolBar();
        newButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        sortButton = new javax.swing.JButton();
        filterButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        printButton = new javax.swing.JButton();
        exportButton1 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        refreshButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        MainMenu = new javax.swing.JMenu();
        masterData = new javax.swing.JMenu();
        accessoriesItem = new javax.swing.JMenuItem();
        accessoriestypeItem = new javax.swing.JMenuItem();
        buyerItem = new javax.swing.JMenuItem();
        countryandcurrItem = new javax.swing.JMenuItem();
        fabricItem = new javax.swing.JMenuItem();
        fabrictypeItem = new javax.swing.JMenuItem();
        JenisDokPabean = new javax.swing.JMenuItem();
        KodeKwsn = new javax.swing.JMenuItem();
        kontakItem = new javax.swing.JMenuItem();
        mesinItem = new javax.swing.JMenuItem();
        mesintypeItem = new javax.swing.JMenuItem();
        serviceItem = new javax.swing.JMenuItem();
        servicetypeItem = new javax.swing.JMenuItem();
        sparepartItem = new javax.swing.JMenuItem();
        spareparttypeItem = new javax.swing.JMenuItem();
        stockItem = new javax.swing.JMenuItem();
        stocktypeItem = new javax.swing.JMenuItem();
        supplierItem = new javax.swing.JMenuItem();
        SampleRecord = new javax.swing.JMenuItem();
        SizeItem = new javax.swing.JMenuItem();
        outstandingorderItem = new javax.swing.JMenuItem();
        PRItem = new javax.swing.JMenuItem();
        POItem = new javax.swing.JMenuItem();
        Gudang = new javax.swing.JMenu();
        BTBItem = new javax.swing.JMenuItem();
        BKBItem = new javax.swing.JMenuItem();
        BTSItem = new javax.swing.JMenuItem();
        BKSItem = new javax.swing.JMenuItem();
        BRBItem = new javax.swing.JMenuItem();
        BRSItem = new javax.swing.JMenuItem();
        Produksi = new javax.swing.JMenu();
        FormKain = new javax.swing.JMenuItem();
        FormCutting = new javax.swing.JMenuItem();
        FormSewing = new javax.swing.JMenuItem();
        FormWashing = new javax.swing.JMenuItem();
        FormFinishing = new javax.swing.JMenuItem();
        FormPacking = new javax.swing.JMenuItem();
        FormShipping = new javax.swing.JMenuItem();
        LaporanProduksi = new javax.swing.JMenuItem();
        LaporanBC = new javax.swing.JMenu();
        PemasukanBaku = new javax.swing.JMenuItem();
        BrngDlmProses = new javax.swing.JMenuItem();
        BrngKelBaku = new javax.swing.JMenuItem();
        BrngMskJadi = new javax.swing.JMenuItem();
        BrngKelJadi = new javax.swing.JMenuItem();
        BrngKelSisa = new javax.swing.JMenuItem();
        BrngMskSisa = new javax.swing.JMenuItem();
        inventory = new javax.swing.JMenu();
        PengeluaranBaku = new javax.swing.JMenuItem();
        PemasukanJadi = new javax.swing.JMenuItem();
        PemasukanSisa = new javax.swing.JMenuItem();
        PengeluaranSisa = new javax.swing.JMenuItem();
        LaporanInventory = new javax.swing.JMenu();
        MutasiBaku = new javax.swing.JMenuItem();
        MutasiJadi = new javax.swing.JMenuItem();
        MutasiSisa = new javax.swing.JMenuItem();
        MutasiMesin = new javax.swing.JMenuItem();
        jSeparator17 = new javax.swing.JSeparator();
        cambioPasswordMenu = new javax.swing.JMenuItem();
        jSeparator131 = new javax.swing.JSeparator();
        setPage = new javax.swing.JMenuItem();
        setPrinter = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JSeparator();
        Exit = new javax.swing.JMenuItem();
        MenuEdit = new javax.swing.JMenu();
        newMenuItem = new javax.swing.JMenuItem();
        editMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JSeparator();
        sortMenuItem = new javax.swing.JMenuItem();
        filterMenuItem = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JSeparator();
        printMenuItem = new javax.swing.JMenuItem();
        exportCsvMenuItem = new javax.swing.JMenuItem();
        refreshMenuItem = new javax.swing.JMenuItem();
        MenuConf = new javax.swing.JMenu();
        menuCatalogosAdmin = new javax.swing.JMenu();
        Usuarios = new javax.swing.JMenuItem();
        mail = new javax.swing.JMenuItem();
        logViewer = new javax.swing.JMenuItem();
        MenuHelp = new javax.swing.JMenu();
        openHelp = new javax.swing.JMenuItem();

        desktop.setBackground(java.awt.SystemColor.activeCaptionBorder);
        desktop.setMinimumSize(new java.awt.Dimension(10, 10));
        desktop.setName("desktop"); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/DesktopBackground.jpg"))); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N
        jLabel1.setBounds(-40, 0, 2000, 800);
        desktop.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        StatusBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        StatusBar.setAutoscrolls(true);
        StatusBar.setName("StatusBar"); // NOI18N

        desktopStatusLabel.setFont(new java.awt.Font("Shruti", 0, 10)); // NOI18N
        desktopStatusLabel.setText("Starting...");
        desktopStatusLabel.setName("desktopStatusLabel"); // NOI18N

        mainProgressIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainProgressIcon.setName("mainProgressIcon"); // NOI18N

        javax.swing.GroupLayout StatusBarLayout = new javax.swing.GroupLayout(StatusBar);
        StatusBar.setLayout(StatusBarLayout);
        StatusBarLayout.setHorizontalGroup(
            StatusBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StatusBarLayout.createSequentialGroup()
                .addComponent(desktopStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 253, Short.MAX_VALUE)
                .addComponent(mainProgressIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        StatusBarLayout.setVerticalGroup(
            StatusBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopStatusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
            .addComponent(mainProgressIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
        );

        DesktopToolbar.setFloatable(false);
        DesktopToolbar.setRollover(true);
        DesktopToolbar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DesktopToolbar.setMaximumSize(new java.awt.Dimension(367, 42));
        DesktopToolbar.setName("DesktopToolbar"); // NOI18N

        newButton.setFont(new java.awt.Font("Shruti", 0, 10)); // NOI18N
        newButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/new1.jpg"))); // NOI18N
        newButton.setText("New");
        newButton.setToolTipText("Crea nuevo elemento");
        newButton.setActionCommand("new");
        newButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        newButton.setEnabled(false);
        newButton.setFocusable(false);
        newButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        newButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        newButton.setMaximumSize(new java.awt.Dimension(40, 40));
        newButton.setName("newButton"); // NOI18N
        newButton.setPreferredSize(new java.awt.Dimension(40, 40));
        newButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DesktopToolbar.add(newButton);

        editButton.setFont(new java.awt.Font("Shruti", 0, 10)); // NOI18N
        editButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/edit1.jpg"))); // NOI18N
        editButton.setText("Edit");
        editButton.setActionCommand("edit");
        editButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        editButton.setEnabled(false);
        editButton.setFocusable(false);
        editButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        editButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        editButton.setMaximumSize(new java.awt.Dimension(40, 40));
        editButton.setName("editButton"); // NOI18N
        editButton.setPreferredSize(new java.awt.Dimension(40, 40));
        editButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DesktopToolbar.add(editButton);

        deleteButton.setFont(new java.awt.Font("Shruti", 0, 10)); // NOI18N
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/delete1.jpg"))); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.setActionCommand("delete");
        deleteButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        deleteButton.setEnabled(false);
        deleteButton.setFocusable(false);
        deleteButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deleteButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        deleteButton.setMaximumSize(new java.awt.Dimension(40, 40));
        deleteButton.setName("deleteButton"); // NOI18N
        deleteButton.setPreferredSize(new java.awt.Dimension(40, 40));
        deleteButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DesktopToolbar.add(deleteButton);

        jSeparator1.setMaximumSize(new java.awt.Dimension(15, 32767));
        jSeparator1.setName("jSeparator1"); // NOI18N
        jSeparator1.setPreferredSize(new java.awt.Dimension(15, 0));
        DesktopToolbar.add(jSeparator1);

        sortButton.setFont(new java.awt.Font("Shruti", 0, 10)); // NOI18N
        sortButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/sort1.jpg"))); // NOI18N
        sortButton.setText("Sort");
        sortButton.setActionCommand("sort");
        sortButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        sortButton.setEnabled(false);
        sortButton.setFocusable(false);
        sortButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sortButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        sortButton.setMaximumSize(new java.awt.Dimension(40, 40));
        sortButton.setName("sortButton"); // NOI18N
        sortButton.setPreferredSize(new java.awt.Dimension(40, 40));
        sortButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DesktopToolbar.add(sortButton);

        filterButton.setFont(new java.awt.Font("Shruti", 0, 10)); // NOI18N
        filterButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/filter1.jpg"))); // NOI18N
        filterButton.setText("Filter");
        filterButton.setActionCommand("filter");
        filterButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        filterButton.setEnabled(false);
        filterButton.setFocusable(false);
        filterButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        filterButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        filterButton.setMaximumSize(new java.awt.Dimension(40, 40));
        filterButton.setName("filterButton"); // NOI18N
        filterButton.setPreferredSize(new java.awt.Dimension(40, 40));
        filterButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DesktopToolbar.add(filterButton);

        jSeparator2.setMaximumSize(new java.awt.Dimension(15, 32767));
        jSeparator2.setName("jSeparator2"); // NOI18N
        jSeparator2.setPreferredSize(new java.awt.Dimension(15, 0));
        DesktopToolbar.add(jSeparator2);

        printButton.setFont(new java.awt.Font("Shruti", 0, 10)); // NOI18N
        printButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/print1.jpg"))); // NOI18N
        printButton.setText("Print");
        printButton.setActionCommand("print");
        printButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        printButton.setEnabled(false);
        printButton.setFocusable(false);
        printButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        printButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        printButton.setMaximumSize(new java.awt.Dimension(60, 40));
        printButton.setName("printButton"); // NOI18N
        printButton.setPreferredSize(new java.awt.Dimension(60, 40));
        printButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DesktopToolbar.add(printButton);

        exportButton1.setFont(new java.awt.Font("Shruti", 0, 10)); // NOI18N
        exportButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/export1.jpg"))); // NOI18N
        exportButton1.setText("Export");
        exportButton1.setActionCommand("exportcsv");
        exportButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        exportButton1.setEnabled(false);
        exportButton1.setFocusable(false);
        exportButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exportButton1.setMargin(new java.awt.Insets(2, 2, 2, 2));
        exportButton1.setMaximumSize(new java.awt.Dimension(60, 40));
        exportButton1.setName("exportButton1"); // NOI18N
        exportButton1.setPreferredSize(new java.awt.Dimension(60, 40));
        exportButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DesktopToolbar.add(exportButton1);

        jSeparator3.setMaximumSize(new java.awt.Dimension(15, 32767));
        jSeparator3.setName("jSeparator3"); // NOI18N
        jSeparator3.setPreferredSize(new java.awt.Dimension(15, 0));
        DesktopToolbar.add(jSeparator3);

        refreshButton.setFont(new java.awt.Font("Shruti", 0, 10)); // NOI18N
        refreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/refresh1.jpg"))); // NOI18N
        refreshButton.setText("Refresh");
        refreshButton.setActionCommand("refresh");
        refreshButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        refreshButton.setEnabled(false);
        refreshButton.setFocusable(false);
        refreshButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        refreshButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        refreshButton.setMaximumSize(new java.awt.Dimension(60, 40));
        refreshButton.setName("refreshButton"); // NOI18N
        refreshButton.setPreferredSize(new java.awt.Dimension(60, 40));
        refreshButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DesktopToolbar.add(refreshButton);

        jMenuBar1.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        jMenuBar1.setName("jMenuBar1"); // NOI18N

        MainMenu.setText("Start");
        MainMenu.setAutoscrolls(true);
        MainMenu.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        MainMenu.setName("Opciones"); // NOI18N

        masterData.setText("Master");
        masterData.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        masterData.setName("masterData"); // NOI18N

        accessoriesItem.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        accessoriesItem.setText("Accessories");
        accessoriesItem.setName("accessoriesItem"); // NOI18N
        accessoriesItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accessoriesItemActionPerformed(evt);
            }
        });
        masterData.add(accessoriesItem);

        accessoriestypeItem.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        accessoriestypeItem.setText("Accessories Type");
        accessoriestypeItem.setName("accessoriestypeItem"); // NOI18N
        accessoriestypeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accessoriestypeItemActionPerformed(evt);
            }
        });
        masterData.add(accessoriestypeItem);

        buyerItem.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        buyerItem.setText("Buyer");
        buyerItem.setName("buyerItem"); // NOI18N
        buyerItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyerItemActionPerformed(evt);
            }
        });
        masterData.add(buyerItem);

        countryandcurrItem.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        countryandcurrItem.setText("Country & Currency");
        countryandcurrItem.setName("countryandcurrItem"); // NOI18N
        countryandcurrItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryandcurrItemActionPerformed(evt);
            }
        });
        masterData.add(countryandcurrItem);

        fabricItem.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        fabricItem.setText("Fabric");
        fabricItem.setName("fabricItem"); // NOI18N
        fabricItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fabricItemActionPerformed(evt);
            }
        });
        masterData.add(fabricItem);

        fabrictypeItem.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        fabrictypeItem.setText("Fabric Type");
        fabrictypeItem.setName("fabrictypeItem"); // NOI18N
        fabrictypeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fabrictypeItemActionPerformed(evt);
            }
        });
        masterData.add(fabrictypeItem);

        JenisDokPabean.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        JenisDokPabean.setText("Jenis Dokumen Pabean");
        JenisDokPabean.setName("JenisDokPabean"); // NOI18N
        JenisDokPabean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JenisDokPabeanActionPerformed(evt);
            }
        });
        masterData.add(JenisDokPabean);

        KodeKwsn.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        KodeKwsn.setText("Kode Kawasan");
        KodeKwsn.setName("KodeKwsn"); // NOI18N
        KodeKwsn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KodeKwsnActionPerformed(evt);
            }
        });
        masterData.add(KodeKwsn);

        kontakItem.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        kontakItem.setText("Kontak");
        kontakItem.setName("kontakItem"); // NOI18N
        kontakItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kontakItemActionPerformed(evt);
            }
        });
        masterData.add(kontakItem);

        mesinItem.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        mesinItem.setText("Mesin");
        mesinItem.setName("mesinItem"); // NOI18N
        mesinItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesinItemActionPerformed(evt);
            }
        });
        masterData.add(mesinItem);

        mesintypeItem.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        mesintypeItem.setText("Mesin Type");
        mesintypeItem.setName("mesintypeItem"); // NOI18N
        mesintypeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesintypeItemActionPerformed(evt);
            }
        });
        masterData.add(mesintypeItem);

        serviceItem.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        serviceItem.setText("Service");
        serviceItem.setName("serviceItem"); // NOI18N
        serviceItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceItemActionPerformed(evt);
            }
        });
        masterData.add(serviceItem);

        servicetypeItem.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        servicetypeItem.setText("Service Type");
        servicetypeItem.setName("servicetypeItem"); // NOI18N
        servicetypeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servicetypeItemActionPerformed(evt);
            }
        });
        masterData.add(servicetypeItem);

        sparepartItem.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        sparepartItem.setText("Sparepart");
        sparepartItem.setName("sparepartItem"); // NOI18N
        sparepartItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sparepartItemActionPerformed(evt);
            }
        });
        masterData.add(sparepartItem);

        spareparttypeItem.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        spareparttypeItem.setText("Sparepart Type");
        spareparttypeItem.setName("spareparttypeItem"); // NOI18N
        spareparttypeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spareparttypeItemActionPerformed(evt);
            }
        });
        masterData.add(spareparttypeItem);

        stockItem.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        stockItem.setText("Stock Product");
        stockItem.setName("stockItem"); // NOI18N
        stockItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockItemActionPerformed(evt);
            }
        });
        masterData.add(stockItem);

        stocktypeItem.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        stocktypeItem.setText("Stock Type");
        stocktypeItem.setName("stocktypeItem"); // NOI18N
        stocktypeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stocktypeItemActionPerformed(evt);
            }
        });
        masterData.add(stocktypeItem);

        supplierItem.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        supplierItem.setText("Supplier");
        supplierItem.setName("supplierItem"); // NOI18N
        supplierItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierItemActionPerformed(evt);
            }
        });
        masterData.add(supplierItem);

        SampleRecord.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        SampleRecord.setText("Sample Record");
        SampleRecord.setName("SampleRecord"); // NOI18N
        SampleRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SampleRecordActionPerformed(evt);
            }
        });
        masterData.add(SampleRecord);

        SizeItem.setText("Size");
        SizeItem.setName("SizeItem"); // NOI18N
        SizeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SizeItemActionPerformed(evt);
            }
        });
        masterData.add(SizeItem);

        MainMenu.add(masterData);

        outstandingorderItem.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        outstandingorderItem.setText("Received Order");
        outstandingorderItem.setName("outstandingorderItem"); // NOI18N
        outstandingorderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outstandingorderItemActionPerformed(evt);
            }
        });
        MainMenu.add(outstandingorderItem);

        PRItem.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        PRItem.setText("Production Record");
        PRItem.setName("PRItem"); // NOI18N
        PRItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRItemActionPerformed(evt);
            }
        });
        MainMenu.add(PRItem);

        POItem.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        POItem.setText("Purchase Order");
        POItem.setName("POItem"); // NOI18N
        POItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                POItemActionPerformed(evt);
            }
        });
        MainMenu.add(POItem);

        Gudang.setText("Gudang");
        Gudang.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        Gudang.setName("Gudang"); // NOI18N

        BTBItem.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        BTBItem.setText("BTB (Bukti Terima Barang)");
        BTBItem.setName("BTBItem"); // NOI18N
        BTBItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTBItemActionPerformed(evt);
            }
        });
        Gudang.add(BTBItem);

        BKBItem.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        BKBItem.setText("BKB (Bukti Keluar Barang)");
        BKBItem.setName("BKBItem"); // NOI18N
        BKBItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BKBItemActionPerformed(evt);
            }
        });
        Gudang.add(BKBItem);

        BTSItem.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        BTSItem.setText("BTS (Bukti Terima Service)");
        BTSItem.setName("BTSItem"); // NOI18N
        BTSItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTSItemActionPerformed(evt);
            }
        });
        Gudang.add(BTSItem);

        BKSItem.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        BKSItem.setText("BKS (Bukti Keluar Service)");
        BKSItem.setName("BKSItem"); // NOI18N
        BKSItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BKSItemActionPerformed(evt);
            }
        });
        Gudang.add(BKSItem);

        BRBItem.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        BRBItem.setText("BRP (Bukti Return Pabrik)");
        BRBItem.setName("BRBItem"); // NOI18N
        BRBItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRBItemActionPerformed(evt);
            }
        });
        Gudang.add(BRBItem);

        BRSItem.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        BRSItem.setText("BRS (Bukti Return Supplier)");
        BRSItem.setName("BRSItem"); // NOI18N
        BRSItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRSItemActionPerformed(evt);
            }
        });
        Gudang.add(BRSItem);

        MainMenu.add(Gudang);

        Produksi.setText("Produksi");
        Produksi.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        Produksi.setName("Produksi"); // NOI18N

        FormKain.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        FormKain.setText("FormKain");
        FormKain.setName("FormKain"); // NOI18N
        FormKain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormKainActionPerformed(evt);
            }
        });
        Produksi.add(FormKain);

        FormCutting.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        FormCutting.setText("FormCutting");
        FormCutting.setName("FormCutting"); // NOI18N
        FormCutting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormCuttingActionPerformed(evt);
            }
        });
        Produksi.add(FormCutting);

        FormSewing.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        FormSewing.setText("FormSewing");
        FormSewing.setName("FormSewing"); // NOI18N
        FormSewing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormSewingActionPerformed(evt);
            }
        });
        Produksi.add(FormSewing);

        FormWashing.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        FormWashing.setText("FormWashing");
        FormWashing.setName("FormWashing"); // NOI18N
        FormWashing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormWashingActionPerformed(evt);
            }
        });
        Produksi.add(FormWashing);

        FormFinishing.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        FormFinishing.setText("FormFinishing");
        FormFinishing.setName("FormFinishing"); // NOI18N
        FormFinishing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormFinishingActionPerformed(evt);
            }
        });
        Produksi.add(FormFinishing);

        FormPacking.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        FormPacking.setText("FormPacking");
        FormPacking.setName("FormPacking"); // NOI18N
        FormPacking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormPackingActionPerformed(evt);
            }
        });
        Produksi.add(FormPacking);

        FormShipping.setText("Form Shipping");
        FormShipping.setName("FormShipping"); // NOI18N
        FormShipping.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormShippingActionPerformed(evt);
            }
        });
        Produksi.add(FormShipping);

        LaporanProduksi.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LaporanProduksi.setText("Laporan Produksi");
        LaporanProduksi.setName("LaporanProduksi"); // NOI18N
        LaporanProduksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaporanProduksiActionPerformed(evt);
            }
        });
        Produksi.add(LaporanProduksi);

        MainMenu.add(Produksi);

        LaporanBC.setText("Laporan BC");
        LaporanBC.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LaporanBC.setName("LaporanBC"); // NOI18N

        PemasukanBaku.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        PemasukanBaku.setText("Pemasukan Bahan Baku & Penolong");
        PemasukanBaku.setName("PemasukanBaku"); // NOI18N
        PemasukanBaku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PemasukanBakuActionPerformed(evt);
            }
        });
        LaporanBC.add(PemasukanBaku);

        BrngDlmProses.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        BrngDlmProses.setText("Barang Dalam Proses");
        BrngDlmProses.setName("BrngDlmProses"); // NOI18N
        BrngDlmProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrngDlmProsesActionPerformed(evt);
            }
        });
        LaporanBC.add(BrngDlmProses);

        BrngKelBaku.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        BrngKelBaku.setText("Barang Keluar Baku");
        BrngKelBaku.setName("BrngKelBaku"); // NOI18N
        BrngKelBaku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrngKelBakuActionPerformed(evt);
            }
        });
        LaporanBC.add(BrngKelBaku);

        BrngMskJadi.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        BrngMskJadi.setText("Barang Masuk Jadi");
        BrngMskJadi.setName("BrngMskJadi"); // NOI18N
        BrngMskJadi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrngMskJadiActionPerformed(evt);
            }
        });
        LaporanBC.add(BrngMskJadi);

        BrngKelJadi.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        BrngKelJadi.setText("Barang Keluar Jadi");
        BrngKelJadi.setName("BrngKelJadi"); // NOI18N
        BrngKelJadi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrngKelJadiActionPerformed(evt);
            }
        });
        LaporanBC.add(BrngKelJadi);

        BrngKelSisa.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        BrngKelSisa.setText("Barang Keluar Sisa");
        BrngKelSisa.setName("BrngKelSisa"); // NOI18N
        BrngKelSisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrngKelSisaActionPerformed(evt);
            }
        });
        LaporanBC.add(BrngKelSisa);

        BrngMskSisa.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        BrngMskSisa.setText("Barang Masuk Sisa");
        BrngMskSisa.setName("BrngMskSisa"); // NOI18N
        BrngMskSisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrngMskSisaActionPerformed(evt);
            }
        });
        LaporanBC.add(BrngMskSisa);

        MainMenu.add(LaporanBC);

        inventory.setText("Inventory");
        inventory.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        inventory.setName("inventory"); // NOI18N

        PengeluaranBaku.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        PengeluaranBaku.setText("Pengeluaran Barang Baku & Penolong");
        PengeluaranBaku.setName("PengeluaranBaku"); // NOI18N
        PengeluaranBaku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PengeluaranBakuActionPerformed(evt);
            }
        });
        inventory.add(PengeluaranBaku);

        PemasukanJadi.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        PemasukanJadi.setText("Pemasukan Barang Jadi");
        PemasukanJadi.setName("PemasukanJadi"); // NOI18N
        PemasukanJadi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PemasukanJadiActionPerformed(evt);
            }
        });
        inventory.add(PemasukanJadi);

        PemasukanSisa.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        PemasukanSisa.setText("Pemasukan Barang Sisa & Scrap");
        PemasukanSisa.setName("PemasukanSisa"); // NOI18N
        PemasukanSisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PemasukanSisaActionPerformed(evt);
            }
        });
        inventory.add(PemasukanSisa);

        PengeluaranSisa.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        PengeluaranSisa.setText("Pengeluaran Barang Sisa & Scrap");
        PengeluaranSisa.setName("PengeluaranSisa"); // NOI18N
        PengeluaranSisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PengeluaranSisaActionPerformed(evt);
            }
        });
        inventory.add(PengeluaranSisa);

        MainMenu.add(inventory);

        LaporanInventory.setText("Laporan Inventory");
        LaporanInventory.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LaporanInventory.setName("LaporanInventory"); // NOI18N

        MutasiBaku.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        MutasiBaku.setText("Mutasi Bahan Baku & Penolong");
        MutasiBaku.setName("MutasiBaku"); // NOI18N
        MutasiBaku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MutasiBakuActionPerformed(evt);
            }
        });
        LaporanInventory.add(MutasiBaku);

        MutasiJadi.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        MutasiJadi.setText("Mutasi Barang Jadi");
        MutasiJadi.setName("MutasiJadi"); // NOI18N
        MutasiJadi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MutasiJadiActionPerformed(evt);
            }
        });
        LaporanInventory.add(MutasiJadi);

        MutasiSisa.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        MutasiSisa.setText("Mutasi Bahan Sisa & Scrap");
        MutasiSisa.setName("MutasiSisa"); // NOI18N
        MutasiSisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MutasiSisaActionPerformed(evt);
            }
        });
        LaporanInventory.add(MutasiSisa);

        MutasiMesin.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        MutasiMesin.setText("Mutasi Mesin");
        MutasiMesin.setName("MutasiMesin"); // NOI18N
        MutasiMesin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MutasiMesinActionPerformed(evt);
            }
        });
        LaporanInventory.add(MutasiMesin);

        MainMenu.add(LaporanInventory);

        jSeparator17.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jSeparator17.setName("jSeparator17"); // NOI18N
        MainMenu.add(jSeparator17);

        cambioPasswordMenu.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        cambioPasswordMenu.setText("Change User Password");
        cambioPasswordMenu.setName("cambioPasswordMenu"); // NOI18N
        cambioPasswordMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambioPasswordMenuActionPerformed(evt);
            }
        });
        MainMenu.add(cambioPasswordMenu);

        jSeparator131.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jSeparator131.setName("jSeparator131"); // NOI18N
        MainMenu.add(jSeparator131);

        setPage.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        setPage.setText("Page Settings");
        setPage.setName("setPage"); // NOI18N
        setPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setPageActionPerformed(evt);
            }
        });
        MainMenu.add(setPage);

        setPrinter.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        setPrinter.setText("Printer Settings");
        setPrinter.setName("setPrinter"); // NOI18N
        setPrinter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setPrinterActionPerformed(evt);
            }
        });
        MainMenu.add(setPrinter);

        jSeparator8.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jSeparator8.setName("jSeparator8"); // NOI18N
        MainMenu.add(jSeparator8);

        Exit.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        Exit.setText("Exit System");
        Exit.setName("Exit"); // NOI18N
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        MainMenu.add(Exit);

        jMenuBar1.add(MainMenu);

        MenuEdit.setText("Edit");
        MenuEdit.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        MenuEdit.setName("Edicion"); // NOI18N

        newMenuItem.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        newMenuItem.setText("New");
        newMenuItem.setActionCommand("new");
        newMenuItem.setEnabled(false);
        newMenuItem.setName("newMenuItem"); // NOI18N
        MenuEdit.add(newMenuItem);

        editMenuItem.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        editMenuItem.setText("Edit");
        editMenuItem.setActionCommand("edit");
        editMenuItem.setEnabled(false);
        editMenuItem.setName("editMenuItem"); // NOI18N
        MenuEdit.add(editMenuItem);

        deleteMenuItem.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        deleteMenuItem.setText("Delete");
        deleteMenuItem.setActionCommand("delete");
        deleteMenuItem.setEnabled(false);
        deleteMenuItem.setName("deleteMenuItem"); // NOI18N
        MenuEdit.add(deleteMenuItem);

        jSeparator4.setName("jSeparator4"); // NOI18N
        MenuEdit.add(jSeparator4);

        sortMenuItem.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        sortMenuItem.setText("Sort");
        sortMenuItem.setActionCommand("sort");
        sortMenuItem.setEnabled(false);
        sortMenuItem.setName("sortMenuItem"); // NOI18N
        MenuEdit.add(sortMenuItem);

        filterMenuItem.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        filterMenuItem.setText("Filter");
        filterMenuItem.setActionCommand("filter");
        filterMenuItem.setEnabled(false);
        filterMenuItem.setName("filterMenuItem"); // NOI18N
        filterMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterMenuItemActionPerformed(evt);
            }
        });
        MenuEdit.add(filterMenuItem);

        jSeparator5.setName("jSeparator5"); // NOI18N
        MenuEdit.add(jSeparator5);

        printMenuItem.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        printMenuItem.setText("Print Report");
        printMenuItem.setActionCommand("print");
        printMenuItem.setEnabled(false);
        printMenuItem.setName("printMenuItem"); // NOI18N
        MenuEdit.add(printMenuItem);

        exportCsvMenuItem.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        exportCsvMenuItem.setText("Export Table Data");
        exportCsvMenuItem.setActionCommand("exportcsv");
        exportCsvMenuItem.setEnabled(false);
        exportCsvMenuItem.setName("exportCsvMenuItem"); // NOI18N
        MenuEdit.add(exportCsvMenuItem);

        refreshMenuItem.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        refreshMenuItem.setText("Refresh");
        refreshMenuItem.setActionCommand("refresh");
        refreshMenuItem.setEnabled(false);
        refreshMenuItem.setName("refreshMenuItem"); // NOI18N
        MenuEdit.add(refreshMenuItem);

        jMenuBar1.add(MenuEdit);

        MenuConf.setText("Configuration");
        MenuConf.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        MenuConf.setName("MenuConf"); // NOI18N

        menuCatalogosAdmin.setText("System Admin Menu");
        menuCatalogosAdmin.setEnabled(false);
        menuCatalogosAdmin.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        menuCatalogosAdmin.setName("menuCatalogosAdmin"); // NOI18N

        Usuarios.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        Usuarios.setText("Configure Users");
        Usuarios.setName("Usuarios"); // NOI18N
        Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariosActionPerformed(evt);
            }
        });
        menuCatalogosAdmin.add(Usuarios);

        mail.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        mail.setText("E-mail");
        mail.setName("mail"); // NOI18N
        mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailActionPerformed(evt);
            }
        });
        menuCatalogosAdmin.add(mail);

        MenuConf.add(menuCatalogosAdmin);

        logViewer.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        logViewer.setText("View Log");
        logViewer.setName("logViewer"); // NOI18N
        logViewer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logViewerActionPerformed(evt);
            }
        });
        MenuConf.add(logViewer);

        jMenuBar1.add(MenuConf);

        MenuHelp.setText("Help");
        MenuHelp.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        MenuHelp.setName("Ayuda"); // NOI18N

        openHelp.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        openHelp.setText("See Manual");
        openHelp.setName("openHelp"); // NOI18N
        openHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openHelpActionPerformed(evt);
            }
        });
        MenuHelp.add(openHelp);

        jMenuBar1.add(MenuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopToolbar, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
            .addComponent(StatusBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(DesktopToolbar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StatusBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
      exitSystem();
}//GEN-LAST:event_ExitActionPerformed

private void filterMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterMenuItemActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_filterMenuItemActionPerformed

private void setPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setPageActionPerformed
    openPageSetupDialog();        
}//GEN-LAST:event_setPageActionPerformed

private void setPrinterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setPrinterActionPerformed
    openPrinterSetupDialog();
}//GEN-LAST:event_setPrinterActionPerformed

private void UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariosActionPerformed
    openUserManager();
}//GEN-LAST:event_UsuariosActionPerformed

private void mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailActionPerformed
    openMailViewer();    
}//GEN-LAST:event_mailActionPerformed

private void logViewerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logViewerActionPerformed
    openSystemLogViewer();    
}//GEN-LAST:event_logViewerActionPerformed

private void cambioPasswordMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambioPasswordMenuActionPerformed
    openChangePassword();    
}//GEN-LAST:event_cambioPasswordMenuActionPerformed

private void openHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openHelpActionPerformed
    
//  JSObject win = JSObject.getWindow(this);	
//  Object[] args = new Object[0];
//  win.call("openManual", args );	    
    
}//GEN-LAST:event_openHelpActionPerformed




    private void buyerItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyerItemActionPerformed
    openInternalFrame( buyerFrameClass.class, "Buyer" );                     
    }//GEN-LAST:event_buyerItemActionPerformed

    private void kontakItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kontakItemActionPerformed
    openInternalFrame( kontakFrameClass.class, "Kontak" );                     
    }//GEN-LAST:event_kontakItemActionPerformed

    private void stockItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockItemActionPerformed
    openInternalFrame( stockFrameClass.class, "Stock" );                     
    }//GEN-LAST:event_stockItemActionPerformed

    private void SampleRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SampleRecordActionPerformed
    openInternalFrame( samplerecordFrameClass.class, "Sample Record" );                     
    }//GEN-LAST:event_SampleRecordActionPerformed

    private void accessoriesItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accessoriesItemActionPerformed
    openInternalFrame( accessoriesFrameClass.class, "Accessories" );                     
    }//GEN-LAST:event_accessoriesItemActionPerformed

    private void accessoriestypeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accessoriestypeItemActionPerformed
    openInternalFrame( accessoriestypeFrameClass.class, "Accessories Type" );                     
    }//GEN-LAST:event_accessoriestypeItemActionPerformed

    private void fabricItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fabricItemActionPerformed
    openInternalFrame( fabricFrameClass.class, "Fabric" );                     
    }//GEN-LAST:event_fabricItemActionPerformed

    private void fabrictypeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fabrictypeItemActionPerformed
    openInternalFrame( fabrictypeFrameClass.class, "Fabric Type" );                     
    }//GEN-LAST:event_fabrictypeItemActionPerformed

    private void mesinItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesinItemActionPerformed
    openInternalFrame( mesinFrameClass.class, "Machine" );                     
    }//GEN-LAST:event_mesinItemActionPerformed

    private void mesintypeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesintypeItemActionPerformed
    openInternalFrame( mesintypeFrameClass.class, "Machine Type" );                     
    }//GEN-LAST:event_mesintypeItemActionPerformed

    private void countryandcurrItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryandcurrItemActionPerformed
    openInternalFrame( negaraFrameClass.class, "Negara" );                     
    }//GEN-LAST:event_countryandcurrItemActionPerformed

    private void sparepartItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sparepartItemActionPerformed
    openInternalFrame( sparepartFrameClass.class, "Sparepart" );                     
    }//GEN-LAST:event_sparepartItemActionPerformed

    private void spareparttypeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spareparttypeItemActionPerformed
    openInternalFrame( spareparttypeFrameClass.class, "Sparepart Type" );                     
    }//GEN-LAST:event_spareparttypeItemActionPerformed

    private void stocktypeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stocktypeItemActionPerformed
    openInternalFrame( stocktypeFrameClass.class, "Stock Type" );                     
    }//GEN-LAST:event_stocktypeItemActionPerformed

    private void supplierItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierItemActionPerformed
    openInternalFrame( supplierFrameClass.class, "Supplier" );                     
    }//GEN-LAST:event_supplierItemActionPerformed

    private void outstandingorderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outstandingorderItemActionPerformed
    openInternalFrame( outstandingorderFrameClass.class, "Received Order" );                      
    }//GEN-LAST:event_outstandingorderItemActionPerformed

    private void POItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_POItemActionPerformed
     openInternalFrame( PurchaseOrderFrameClass.class, "Purchase Order" );
    }//GEN-LAST:event_POItemActionPerformed

    private void PRItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRItemActionPerformed
      openInternalFrame( ProdRecFrameClass.class, "Prodocution Record" );
    }//GEN-LAST:event_PRItemActionPerformed

    private void serviceItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceItemActionPerformed
      openInternalFrame( ServiceFrameClass.class, "Service" );
    }//GEN-LAST:event_serviceItemActionPerformed

    private void servicetypeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servicetypeItemActionPerformed
      openInternalFrame( ServiceTypeFrameClass.class, "Service Type" );
    }//GEN-LAST:event_servicetypeItemActionPerformed

    private void BTBItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTBItemActionPerformed
      openInternalFrame( BTBHeaderFrameClass.class, "BTB (Bukti Terima Barang)" );
    }//GEN-LAST:event_BTBItemActionPerformed

    private void BKBItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BKBItemActionPerformed
      openInternalFrame( BKBHeaderFrameClass.class, "BKB (Bukti Keluar Barang)" );
    }//GEN-LAST:event_BKBItemActionPerformed

    private void BTSItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTSItemActionPerformed
      openInternalFrame( BTSHeaderFrameClass.class, "BTS (Bukti Terima Service)" );
    }//GEN-LAST:event_BTSItemActionPerformed

    private void BKSItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BKSItemActionPerformed
      openInternalFrame( BKSHeaderFrameClass.class, "BKS (Bukti Keluar Service)" );
    }//GEN-LAST:event_BKSItemActionPerformed

    private void BRBItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRBItemActionPerformed
      openInternalFrame( BRPHeaderFrameClass.class, "BRP (Bukti Return Pabrik)" );
    }//GEN-LAST:event_BRBItemActionPerformed

    private void BRSItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRSItemActionPerformed
      openInternalFrame( BRSHeaderFrameClass.class, "BRS (Bukti Return Supplier)" );
    }//GEN-LAST:event_BRSItemActionPerformed

    private void FormKainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormKainActionPerformed
         openInternalFrame( FormKainHeaderFrameClass.class, "Form Kain" );
    }//GEN-LAST:event_FormKainActionPerformed

    private void FormCuttingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormCuttingActionPerformed
         openInternalFrame( FormCuttingHeaderFrameClass.class, "Form Cutting" );
    }//GEN-LAST:event_FormCuttingActionPerformed

    private void FormSewingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormSewingActionPerformed
         openInternalFrame( FormSewingHeaderFrameClass.class, "Form Sewing" );
    }//GEN-LAST:event_FormSewingActionPerformed

    private void FormWashingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormWashingActionPerformed
         openInternalFrame( FormWashingHeaderFrameClass.class, "Form Washing" );
    }//GEN-LAST:event_FormWashingActionPerformed

    private void FormFinishingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormFinishingActionPerformed
         openInternalFrame( FormFinishingHeaderFrameClass.class, "Form Finishing" );
    }//GEN-LAST:event_FormFinishingActionPerformed

    private void FormPackingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormPackingActionPerformed
         openInternalFrame( FormPackingHeaderFrameClass.class, "Form Packing" );
    }//GEN-LAST:event_FormPackingActionPerformed

    private void LaporanProduksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaporanProduksiActionPerformed
         openInternalFrame( LaporanProduksiHeaderFrameClass.class, "Laporan Produksi" );
    }//GEN-LAST:event_LaporanProduksiActionPerformed

    private void PemasukanBakuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PemasukanBakuActionPerformed
        openInternalFrame( BCPemasukanBakuFrameClass.class, "Pemasukan Bahan Baku & Penolong" );
    }//GEN-LAST:event_PemasukanBakuActionPerformed

    private void KodeKwsnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KodeKwsnActionPerformed
        openInternalFrame( KodeKawasanFrameClass.class, "Kode Kawasan Berikat" );
    }//GEN-LAST:event_KodeKwsnActionPerformed

    private void JenisDokPabeanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JenisDokPabeanActionPerformed
        openInternalFrame( JenisDokPabeanFrameClass.class, "Jenis Dokumen Pabean" );
    }//GEN-LAST:event_JenisDokPabeanActionPerformed

    private void BrngDlmProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrngDlmProsesActionPerformed
        openInternalFrame( BarangDalamProsesFrameClass.class, "Barang Dalam Proses" );
    }//GEN-LAST:event_BrngDlmProsesActionPerformed

    private void BrngKelBakuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrngKelBakuActionPerformed
        openInternalFrame( BarangKeluarBakuFrameClass.class, "Barang Keluar Bahan Baku & Penolong" );
    }//GEN-LAST:event_BrngKelBakuActionPerformed

    private void BrngMskJadiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrngMskJadiActionPerformed
        openInternalFrame( BarangMasukJadiFrameClass.class, "Barang Masuk Jadi" );
    }//GEN-LAST:event_BrngMskJadiActionPerformed

    private void BrngKelJadiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrngKelJadiActionPerformed
          openInternalFrame( BarangKeluarJadiFrameClass.class, "Barang Keluar Jadi" );
    }//GEN-LAST:event_BrngKelJadiActionPerformed

    private void BrngKelSisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrngKelSisaActionPerformed
          openInternalFrame( BarangKeluarSisaFrameClass.class, "Barang Keluar Sisa" );
    }//GEN-LAST:event_BrngKelSisaActionPerformed

    private void BrngMskSisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrngMskSisaActionPerformed
          openInternalFrame( BarangMasukSisaFrameClass.class, "Barang Masuk Sisa" );
    }//GEN-LAST:event_BrngMskSisaActionPerformed

    private void PengeluaranBakuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PengeluaranBakuActionPerformed
        openInternalFrame( inv_PengeluaranBakuFrameClass.class, "Pengeluaran Barang Baku & Penolong" );
    }//GEN-LAST:event_PengeluaranBakuActionPerformed

    private void PemasukanJadiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PemasukanJadiActionPerformed
        openInternalFrame( BarangMasukJadiFrameClass.class, "Pemasukan Barang Jadi" );
    }//GEN-LAST:event_PemasukanJadiActionPerformed

    private void PemasukanSisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PemasukanSisaActionPerformed
        openInternalFrame( inv_PemasukanSisaFrameClass.class, "Pemasukan Barang Sisa & Scrap" );
    }//GEN-LAST:event_PemasukanSisaActionPerformed

    private void PengeluaranSisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PengeluaranSisaActionPerformed
        openInternalFrame( inv_PengeluaranSisaFrameClass.class, "Pengeluaran Barang Sisa & Scrap" );
    }//GEN-LAST:event_PengeluaranSisaActionPerformed

    private void MutasiBakuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MutasiBakuActionPerformed
        openInternalFrame( MutasiBakuFrameClass.class, "Mutasi Bahan Baku & Penolong" );
    }//GEN-LAST:event_MutasiBakuActionPerformed

    private void MutasiJadiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MutasiJadiActionPerformed
        openInternalFrame( MutasiJadiFrameClass.class, "Mutasi Barang Jadi" );
    }//GEN-LAST:event_MutasiJadiActionPerformed

    private void MutasiSisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MutasiSisaActionPerformed
        openInternalFrame( MutasiSisaFrameClass.class, "Mutasi Bahan Sisa & Scrap" );
    }//GEN-LAST:event_MutasiSisaActionPerformed

    private void MutasiMesinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MutasiMesinActionPerformed
         openInternalFrame( MutasiMesinFrameClass.class, "Mutasi Mesin" );
    }//GEN-LAST:event_MutasiMesinActionPerformed

    private void FormShippingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormShippingActionPerformed
        openInternalFrame( FormShippingHeaderFrameClass.class, "Form Shipping" );
    }//GEN-LAST:event_FormShippingActionPerformed

    private void SizeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SizeItemActionPerformed
        openInternalFrame( SizeColourFrameClass.class, "Size" );
    }//GEN-LAST:event_SizeItemActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BKBItem;
    private javax.swing.JMenuItem BKSItem;
    private javax.swing.JMenuItem BRBItem;
    private javax.swing.JMenuItem BRSItem;
    private javax.swing.JMenuItem BTBItem;
    private javax.swing.JMenuItem BTSItem;
    private javax.swing.JMenuItem BrngDlmProses;
    private javax.swing.JMenuItem BrngKelBaku;
    private javax.swing.JMenuItem BrngKelJadi;
    private javax.swing.JMenuItem BrngKelSisa;
    private javax.swing.JMenuItem BrngMskJadi;
    private javax.swing.JMenuItem BrngMskSisa;
    private javax.swing.JToolBar DesktopToolbar;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenuItem FormCutting;
    private javax.swing.JMenuItem FormFinishing;
    private javax.swing.JMenuItem FormKain;
    private javax.swing.JMenuItem FormPacking;
    private javax.swing.JMenuItem FormSewing;
    private javax.swing.JMenuItem FormShipping;
    private javax.swing.JMenuItem FormWashing;
    private javax.swing.JMenu Gudang;
    private javax.swing.JMenuItem JenisDokPabean;
    private javax.swing.JMenuItem KodeKwsn;
    private javax.swing.JMenu LaporanBC;
    private javax.swing.JMenu LaporanInventory;
    private javax.swing.JMenuItem LaporanProduksi;
    private javax.swing.JMenu MainMenu;
    private javax.swing.JMenu MenuConf;
    private javax.swing.JMenu MenuEdit;
    private javax.swing.JMenu MenuHelp;
    private javax.swing.JMenuItem MutasiBaku;
    private javax.swing.JMenuItem MutasiJadi;
    private javax.swing.JMenuItem MutasiMesin;
    private javax.swing.JMenuItem MutasiSisa;
    private javax.swing.JMenuItem POItem;
    private javax.swing.JMenuItem PRItem;
    private javax.swing.JMenuItem PemasukanBaku;
    private javax.swing.JMenuItem PemasukanJadi;
    private javax.swing.JMenuItem PemasukanSisa;
    private javax.swing.JMenuItem PengeluaranBaku;
    private javax.swing.JMenuItem PengeluaranSisa;
    private javax.swing.JMenu Produksi;
    private javax.swing.JMenuItem SampleRecord;
    private javax.swing.JMenuItem SizeItem;
    private javax.swing.JPanel StatusBar;
    private javax.swing.JMenuItem Usuarios;
    private javax.swing.JMenuItem accessoriesItem;
    private javax.swing.JMenuItem accessoriestypeItem;
    private javax.swing.JMenuItem buyerItem;
    private javax.swing.JMenuItem cambioPasswordMenu;
    private javax.swing.JMenuItem countryandcurrItem;
    private javax.swing.JButton deleteButton;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel desktopStatusLabel;
    private javax.swing.JButton editButton;
    private javax.swing.JMenuItem editMenuItem;
    private javax.swing.JButton exportButton1;
    private javax.swing.JMenuItem exportCsvMenuItem;
    private javax.swing.JMenuItem fabricItem;
    private javax.swing.JMenuItem fabrictypeItem;
    private javax.swing.JButton filterButton;
    private javax.swing.JMenuItem filterMenuItem;
    private javax.swing.JMenu inventory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator131;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JMenuItem kontakItem;
    private javax.swing.JMenuItem logViewer;
    private javax.swing.JMenuItem mail;
    private javax.swing.JLabel mainProgressIcon;
    private javax.swing.JMenu masterData;
    private javax.swing.JMenu menuCatalogosAdmin;
    private javax.swing.JMenuItem mesinItem;
    private javax.swing.JMenuItem mesintypeItem;
    private javax.swing.JButton newButton;
    private javax.swing.JMenuItem newMenuItem;
    private javax.swing.JMenuItem openHelp;
    private javax.swing.JMenuItem outstandingorderItem;
    private javax.swing.JButton printButton;
    private javax.swing.JMenuItem printMenuItem;
    private javax.swing.JButton refreshButton;
    private javax.swing.JMenuItem refreshMenuItem;
    private javax.swing.JMenuItem serviceItem;
    private javax.swing.JMenuItem servicetypeItem;
    private javax.swing.JMenuItem setPage;
    private javax.swing.JMenuItem setPrinter;
    private javax.swing.JButton sortButton;
    private javax.swing.JMenuItem sortMenuItem;
    private javax.swing.JMenuItem sparepartItem;
    private javax.swing.JMenuItem spareparttypeItem;
    private javax.swing.JMenuItem stockItem;
    private javax.swing.JMenuItem stocktypeItem;
    private javax.swing.JMenuItem supplierItem;
    // End of variables declaration//GEN-END:variables

    
    public void init() {
        
        try {
                                   
            // uses
                         
            // has - defaulted                       
            String ConfigAddress = new String();
            
            
            try{
            
                System.out.println( "*********************************************" );                
                System.out.println( "KFramework starting..." );                
                System.out.println( "*********************************************" );                
                
                URL configURL = getClass().getResource("/config/clientMagnus.conf");                
                configuration = new KConfigurationClass( ConfigAddress );
                configuration.loadFromNetwork( configURL );
                
            }catch( Exception error ){
                
                System.out.println( "... could not get magnus from network:" );                
                System.out.println( KMetaUtilsClass.getStackTrace( error ) );                
                throw new KExceptionClass( "Could not locate a magnus.conf file", error );                  
                
            }
                                                        
            configuration.parse();

            // create a log
            log =  new KLogClass( configuration );

            //===========================================================================
            
            try{		
                
                Toolkit.getDefaultToolkit().setDynamicLayout(true);
                System.setProperty("sun.awt.noerasebackground", "true");
                JFrame.setDefaultLookAndFeelDecorated(true);
                JDialog.setDefaultLookAndFeelDecorated(true);
                
                
                /*
                 *   This should work for all platforms
                 */
                try{
                        UIManager.setLookAndFeel(
                                 UIManager.getCrossPlatformLookAndFeelClassName()
                        );

                }catch( Exception error ){} // go with what ever is defaulted in the platform 
                
                                                
                    log.log( this, "Setting LOCALE" );                    
                    Locale.setDefault(  new Locale( configuration.getField("locale_lang"), configuration.getField("local_region") ) );                
                    
                    
            //===========================================================================                                
                        logonScreenClass logonScreen =
                                new logonScreenClass( 
                                        configuration, log, getDesktopsWindow()                                       
                                        );	                        
            //===========================================================================                        
                        
                        
                        // width, height, position
                        //logonScreen.setSize( 400, 380 );
                        KMetaUtilsClass.centerInScreen( logonScreen );				
                        if( !logonScreen.showLoginDialog() ){
                                throw new KExceptionClass(
                                        "\n" +
                                        "*** User authentication failed ***\n" +
                                        "*** System will not start ***\n" ,null 
                                );
                        }
                    
 
            //===========================================================================                        
                        
                    // we start .... 
                    initComponents();
                                
                    // hook menus
                    newMenuItem.addActionListener( this );
                    editMenuItem.addActionListener( this );
                    deleteMenuItem.addActionListener( this );
                    sortMenuItem.addActionListener( this );
                    filterMenuItem.addActionListener( this );
                    printMenuItem.addActionListener( this );
                    exportCsvMenuItem.addActionListener( this );
                    refreshMenuItem.addActionListener( this );

                    // hook buttons
                    newButton.addActionListener( this );
                    editButton.addActionListener( this );
                    deleteButton.addActionListener( this );
                    sortButton.addActionListener( this );
                    filterButton.addActionListener( this );
                    refreshButton.addActionListener( this );
                    printButton.addActionListener( this );
                    exportButton1.addActionListener( this );
                  

                    String statusBarMessage = new String();
                    statusBarMessage = "Connected as [ ";
                    statusBarMessage += configuration.getField( "system_user_name" );                                        
                    statusBarMessage += " (" + configuration.getField( "system_user_email" ) + ")";                    
                    statusBarMessage += " / ";
                    statusBarMessage += configuration.getField( "system_user_role" );                    
                    statusBarMessage += " ]";                                                                                               
                    desktopStatusLabel.setText( statusBarMessage );			

                    // FINAL MISC STUFF                               
                    desktop.setDragMode(JDesktopPane.LIVE_DRAG_MODE);   
                                        
                    KMetaUtilsClass.setMainProgressIcon( this, mainProgressIcon, configuration, log);
                                        
                                                        
                    // security                                                                           
                    if( configuration.getField( "system_user_role" ).equals( "Default" ) ){
                     
                        menuCatalogosAdmin.setEnabled( false );                        
                    }                    
                    if( configuration.getField( "system_user_role" ).equals( "Admin" ) ){
                     
                        menuCatalogosAdmin.setEnabled( true );                        
                    }                                        
                    else{                     
                        menuCatalogosAdmin.setEnabled( false );                        
                    }
                                                                                                   
                                                
            }
            // error after log
            catch( Exception error ){

                    // save to disk
                    log.log( this, KMetaUtilsClass.getStackTrace( error ) );

                    // re throw to shutdown
                    // use normal handler to show screen
                    throw error;
            }

            // done initializing...

        }
        // error before log...
        catch( Exception error ){

                // 1. show in console
                System.out.println( KMetaUtilsClass.getStackTrace( error ) );

                // show to screen
                KMetaUtilsClass.showErrorMessageFromException( getDesktopsWindow(), error );

                // Shutdown, and clean up...
                // ****************************************************
                removeAll();
        }          
           
    
    }

    

    // ------------------------------------------------------------------------- 
    
    void exitSystem(){
        
         if( 
            KMetaUtilsClass.showConfirmationMessage( getDesktopsWindow(),
               " Are you sure, do you want to exit the application ? "
                ).equals( " OK " )
            )
         
         {

            try{
                                
                AppletContext context = getAppletContext();
                //context.showDocument( new URL( "javascript:window.opener='x';window.close();" ) );                
                context.showDocument( new URL( "javascript:closeWindow();" ) );                
                    
                                           
            }catch( Exception error ){}
              
         }
        
    }   

    // ------------------------------------------------------------------------- 
    
    // manage all toolbar actions for all inner frames
    public void actionPerformed(java.awt.event.ActionEvent evt) {  

        try {

            desktopToolbarListenerInterface activeInternalFrame = ( desktopToolbarListenerInterface ) desktop.getSelectedFrame();

            if( activeInternalFrame != null ) {  
                if( activeInternalFrame.getDesktopToolbarActionListener() != null ){
                    // forward event to active browswer in active frame
                    activeInternalFrame.getDesktopToolbarActionListener().actionPerformed(evt);                                                            
                }                                
            }
        }
        catch( Exception error ){
                // log error
                log.log( this, KMetaUtilsClass.getStackTrace( error ) );		                
                // show error message
                KMetaUtilsClass.showErrorMessageFromException( getDesktopsWindow(), error );
        };               

    }        

    @Override
    public boolean enableNew(boolean state) {
        boolean oldState = newButton.isEnabled();
        newButton.setEnabled( state );
        newMenuItem.setEnabled( state );
        return oldState;
    }

    @Override
    public boolean enableEdit(boolean state) {
        boolean oldState = editButton.isEnabled();
        editButton.setEnabled( state );
        editMenuItem.setEnabled( state );
        return oldState;
    }

    @Override
    public boolean enableDelete(boolean state) {
        boolean oldState = deleteButton.isEnabled();
        deleteButton.setEnabled( state );
        deleteMenuItem.setEnabled( state ); 
        return oldState;
    }

    @Override
    public boolean enableSort(boolean state) {
        boolean oldState = sortButton.isEnabled();
        sortButton.setEnabled( state );
        sortMenuItem.setEnabled( state );  
        return oldState;
    }

    @Override
    public boolean enableFilter(boolean state) {
        boolean oldState = filterButton.isEnabled();
        filterButton.setEnabled( state );
        filterMenuItem.setEnabled( state );  
        return oldState;
    }      

    @Override
    public boolean enablePrint(boolean state) {
        boolean oldState = printButton.isEnabled();
        printButton.setEnabled( state );
        printMenuItem.setEnabled( state );  
        return oldState;
    }
    
    @Override
    public boolean enableExport(boolean state) {
        boolean oldState = exportButton1.isEnabled();
        exportButton1.setEnabled( state );
        exportCsvMenuItem.setEnabled( state );  
        return oldState;
    }

    @Override
    public boolean enableRefresh(boolean state) {
        boolean oldState = refreshButton.isEnabled();
        refreshButton.setEnabled( state );
        refreshMenuItem.setEnabled( state );  
        return oldState;
    }  

    @Override
    public java.awt.Window getDesktopsWindow() {
        return( KMetaUtilsClass.getParentWindow( this ) );
    }
    
    @Override
    public JDesktopPane getDesktop() {
        return desktop;
    }
    
    
    // -------------------------------------------------------------------------                   
        
    public void openUserManager(){        
        openInternalFrame( userFrameClass.class, "System Users" );                
    }

    // -------------------------------------------------------------------------                   
               
    public void openMailViewer(){   
        
        openInternalFrame( mailFrameClass.class, "Mail" );        
    }    
    
    // -------------------------------------------------------------------------                   
    
    public void openSystemLogViewer(){           
        openInternalFrame( systemLogFrameClass.class, "System Log" );
    } 
    
    // -------------------------------------------------------------------------                   
        
    public void openChangePassword(){
        
        try{            
                // ---------------------------------
                log.log( this, "Openning change password screen..." );     
            
                changePasswordEditDialogClass changePassword 
                    = new changePasswordEditDialogClass(
                        configuration, log, getDesktopsWindow() );                    
                                            
                changePassword.setTitle("Change Password");			

                log.log( this, "Openning change password screen completed." );    
            
                changePassword.setVisible( true );                    
                
        

	}catch( Exception error ){
                                                                                                              
		// save to disk
		log.log( this, KMetaUtilsClass.getStackTrace( error ) );	

		// show to screen
		KMetaUtilsClass.showErrorMessageFromException(  getDesktopsWindow(), error );				
	}      
    }
       
   
    public void openPrinterSetupDialog(){

        try{
        
            // initialize if required            
            if( KPrintJobClass.defaultPrinterJob == null || KPrintJobClass.defaultPageFormat == null ){

                PrinterJob printerJob = PrinterJob.getPrinterJob();
                KPrintJobClass.setPrintingDefaults( 
                    printerJob, printerJob.defaultPage()
                );
            };
                        
            KPrintJobClass.defaultPrinterJob.printDialog();

        }
        catch( Exception error ){                                                                                            
            
		// save to disk
		log.log( this, KMetaUtilsClass.getStackTrace( error ) );	

		// show to screen
		KMetaUtilsClass.showErrorMessageFromException( getDesktopsWindow(),error );				
	}
        
    }

    // ------------------------------------------------------------------------- 
    
    public void openPageSetupDialog(){

        try{
        
            // initialize if required
            if( KPrintJobClass.defaultPrinterJob == null || KPrintJobClass.defaultPageFormat == null ){

                PrinterJob printerJob = PrinterJob.getPrinterJob();
                KPrintJobClass.setPrintingDefaults( 
                    printerJob, printerJob.defaultPage()
                );
            };
                        
            KPrintJobClass.defaultPageFormat = 
                KPrintJobClass.defaultPrinterJob.pageDialog( KPrintJobClass.defaultPageFormat );
                               
            
        }
        catch( Exception error ){
		                                                                                        
            
		// save to disk
		log.log( this, KMetaUtilsClass.getStackTrace( error ) );	

		// show to screen
		KMetaUtilsClass.showErrorMessageFromException( getDesktopsWindow(), error );				
	}
        
    }     
    
    //--------------------------------------------------------------------------
    
    @Override
    public JInternalFrame openInternalFrame( 
            Class< ? extends JInternalFrame > internalFrameClass, String internalFrameTitle 
            ){
        
            return doOpenInternalFrame( configuration, log,  this,  internalFrameClass, internalFrameTitle );
    }
            
    
    public static JInternalFrame doOpenInternalFrame( 
            KConfigurationClass configuration, KLogClass log, desktopAccessInterface desktopAccess, 
            Class< ? extends JInternalFrame > internalFrameClass, String internalFrameTitle 
            ){
    
        JInternalFrame result = null;
        
        try{

                result = KMetaUtilsClass.bringInternalFrameToFront(  desktopAccess.getDesktop(), internalFrameTitle );
            
		// bring to front if already there, or...
		if( result == null ){
		                                                       
                            
			// nop, then open it
			String message = new String();
			message = "Building window: [";
			message += internalFrameTitle;
			message += "]";
			log.log( null, message );
			
                        Class[]  frameConstructorRequiredParam   = new Class[] { KConfigurationClass.class, KLogClass.class, desktopAccessInterface.class };
                        Object[] frameConstructorActualArguments = new Object[] { configuration, log, desktopAccess };
                        Constructor frameConstructor;
                        try{
                            frameConstructor = internalFrameClass.getConstructor( frameConstructorRequiredParam );
                        }catch(NoSuchMethodException error){
                            throw new KExceptionClass( 
                                    " Window frame" + internalFrameClass.getName() + 
                                    " does not provide the required constructor, can not open it. " 
                                    , error );
                        }
                        
                        
                        result = (JInternalFrame) frameConstructor.newInstance( frameConstructorActualArguments );
			result.setTitle( internalFrameTitle );		
			KMetaUtilsClass.showInternalFrame( desktopAccess.getDesktop(), result );
                        
			log.log( null, "Window created successfully." );                                                                                                                               
		}

	}catch( Exception error ){
                                                                                                       
		log.log( null, "Could not open internal window + " + KMetaUtilsClass.getStackTrace( error ) );	
		KMetaUtilsClass.showErrorMessageFromText1( desktopAccess.getDesktopsWindow(), "Could not open internal window + " + KMetaUtilsClass.getStackTrace( error ) );
	}   
       
        return result;
    
    }                                            
    
        
    
    //--------------------------------------------------------------------------

    
}


