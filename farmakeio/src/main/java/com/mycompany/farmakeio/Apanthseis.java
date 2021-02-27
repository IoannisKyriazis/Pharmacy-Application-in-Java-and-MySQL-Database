package com.mycompany.farmakeio;
import javax.swing.*;
import java.awt.event.*;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.awt.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;



//ΑΝΑΚΤΗΣΗ ΑΠΟ ΒΑΣΗ ΔΕΔΟΜΕΝΩΝ ΚΑΙ ΕΜΦΑΝΙΣΗ ΑΠΟΤΕΛΕΣΜΑΤΟΣ ΣΕ ΝΕΟ ΠΑΡΑΘΥΡΟ ΚΑΙ ΣΕ ΠΙΝΑΚΑ
public class Apanthseis extends JFrame {
    int mikos=1050;
    int ipsos=450;
    JFrame frame;
    JLabel label;
    JPanel panel;
    static JTable pinakas;
    
    String driver="com.mysql.jdbc.Driver";
    String url="jdbc:mysql://***.***.***.***:****/******";
    String username="*****";
    String password="*******";
    
    public void erotisi1(){ //ΕΜΦΑΝΙΣΗ ΠΕΛΑΤΟΛΟΓΙΟΥ
        
        String[] onomatastilwn={"ΑΜΚΑ", "Όνομα", "Επώνυμο", "Αριθμός Τηλεφώνου", "Ασφάλεια"};
        frame=new JFrame("ΑΠΑΝΤΗΣΗ ΕΡΩΤΗΣΗΣ 1");
        frame.setLayout(new BorderLayout()); 
        DefaultTableModel model=new DefaultTableModel();
        model.setColumnIdentifiers(onomatastilwn);
        pinakas=new JTable();
        pinakas.setModel(model); 
        pinakas.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        pinakas.setFillsViewportHeight(true);
        JScrollPane scroll = new JScrollPane(pinakas);
        scroll.setHorizontalScrollBarPolicy(
        JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(
        JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        
        String amka="";
        String onoma="";
        String eponimo="";
        String til="";
        String asfaleia="";
        
        try{ 
            Class.forName(driver); 
            Connection con=DriverManager.getConnection(url,username,password);
            String sql="SELECT H1.ΑΜΚΑ,H1.Όνομα,H1.Επώνυμο,H1.Αριθμός_Τηλεφώνου,H1.Ασφάλεια FROM ΠΕΛΑΤΗΣ H1;";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            int i=0;
            
            while(rs.next()){
                amka=rs.getString("ΑΜΚΑ");
                onoma=rs.getString("Όνομα");
                eponimo=rs.getString("Επώνυμο");
                til=rs.getString("Αριθμός_Τηλεφώνου");
                asfaleia=rs.getString("Ασφάλεια"); 
                model.addRow(new Object[]{amka, onoma, eponimo, til, asfaleia});
                i++; 
            }
            if(i<1){
                JOptionPane.showMessageDialog(null, "Δεν βρέθηκε καμία εγγραφή εντός του πίνακα","ΑΠΟΤΥΧΙΑ",
                JOptionPane.ERROR_MESSAGE);
            }
            if(i==1){
                System.out.println(i+" εγγραφή βρέθηκε!");
            }
            else{
                System.out.println(i+" εγγρφαφές βρέθηκαν!");
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(),"ΑΠΟΤΥΧΙΑ",
            JOptionPane.ERROR_MESSAGE);
        }
        frame.add(scroll);
        frame.setVisible(true);
        frame.setSize(mikos,ipsos);
    }
    
    
    
    
    public void erotisi2(){ //ΕΜΦΑΝΙΣΗ ΠΡΟΪΟΝΤΩΝ
        
        String[] onomatastilwn={"ID Προϊόντος", "Όνομα", "Κατηγορία", "Απόθεμα"};
        frame=new JFrame("ΑΠΑΝΤΗΣΗ ΕΡΩΤΗΣΗΣ 2");
        frame.setLayout(new BorderLayout()); 
        DefaultTableModel model=new DefaultTableModel();
        model.setColumnIdentifiers(onomatastilwn);
        pinakas=new JTable();
        pinakas.setModel(model); 
        pinakas.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        pinakas.setFillsViewportHeight(true);
        JScrollPane scroll = new JScrollPane(pinakas);
        scroll.setHorizontalScrollBarPolicy(
        JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(
        JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        
        String idproiontos="";
        String onoma="";
        String katigoria="";
        String apothema="";
        
        try{ 
            Class.forName(driver); 
            Connection con=DriverManager.getConnection(url,username,password);
            String sql="SELECT H2.ID_Προϊόντος,H2.Όνομα,H2.Κατηγορία,H2.Απόθεμα FROM ΠΡΟΪΟΝ H2;";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            int i=0;
            
            while(rs.next()){
                idproiontos=rs.getString("ID_Προϊόντος");
                onoma=rs.getString("Όνομα");
                katigoria=rs.getString("Κατηγορία");
                apothema=rs.getString("Απόθεμα");
                model.addRow(new Object[]{idproiontos, onoma, katigoria, apothema});
                i++; 
            }
            if(i<1){
                JOptionPane.showMessageDialog(null, "Δεν βρέθηκε καμία εγγραφή εντός του πίνακα","ΑΠΟΤΥΧΙΑ",
                JOptionPane.ERROR_MESSAGE);
            }
            if(i==1){
                System.out.println(i+" εγγραφή βρέθηκε!");
            }
            else{
                System.out.println(i+" εγγρφαφές βρέθηκαν!");
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(),"ΑΠΟΤΥΧΙΑ",
            JOptionPane.ERROR_MESSAGE);
        }
        frame.add(scroll);
        frame.setVisible(true);
        frame.setSize(mikos,ipsos);
    }
    
    
    
    
    public void erotisi3(){ //ΕΜΦΑΝΙΣΗ ΠΡΟΜΗΘΕΥΤΩΝ
        
        String[] onomatastilwn={"ID Προμηθευτή", "Επωνυμία Προμηθευτή", "Αριθμός Τηλεφώνου"};
        frame=new JFrame("ΑΠΑΝΤΗΣΗ ΕΡΩΤΗΣΗΣ 3");
        frame.setLayout(new BorderLayout()); 
        DefaultTableModel model=new DefaultTableModel();
        model.setColumnIdentifiers(onomatastilwn);
        pinakas=new JTable();
        pinakas.setModel(model); 
        pinakas.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        pinakas.setFillsViewportHeight(true);
        JScrollPane scroll = new JScrollPane(pinakas);
        scroll.setHorizontalScrollBarPolicy(
        JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(
        JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        
        String idpromitheuti="";
        String eponimia="";
        String til="";
        
        try{ 
            Class.forName(driver); 
            Connection con=DriverManager.getConnection(url,username,password);
            String sql="SELECT H4.ID_Προμηθευτή,H4.Επωνυμία_Προμηθευτή,H4.Αριθμός_Τηλεφώνου FROM ΠΡΟΜΗΘΕΥΤΗΣ H4;";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            int i=0;
            
            while(rs.next()){
                idpromitheuti=rs.getString("ID_Προμηθευτή");
                eponimia=rs.getString("Επωνυμία_Προμηθευτή");
                til=rs.getString("Αριθμός_Τηλεφώνου");
                model.addRow(new Object[]{idpromitheuti, eponimia, til});
                i++; 
            }
            if(i<1){
                JOptionPane.showMessageDialog(null, "Δεν βρέθηκε καμία εγγραφή εντός του πίνακα","ΑΠΟΤΥΧΙΑ",
                JOptionPane.ERROR_MESSAGE);
            }
            if(i==1){
                System.out.println(i+" εγγραφή βρέθηκε!");
            }
            else{
                System.out.println(i+" εγγρφαφές βρέθηκαν!");
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(),"ΑΠΟΤΥΧΙΑ",
            JOptionPane.ERROR_MESSAGE);
        }
        frame.add(scroll);
        frame.setVisible(true);
        frame.setSize(mikos,ipsos);
    }
    
    
    
    
    public void erotisi4(){ //ΕΜΦΑΝΙΣΗ ΑΓΟΡΩΝ
        
        String[] onomatastilwn={"ID Αγοράς", "Ημερομηνία Αγοράς"};
        frame=new JFrame("ΑΠΑΝΤΗΣΗ ΕΡΩΤΗΣΗΣ 4");
        frame.setLayout(new BorderLayout()); 
        DefaultTableModel model=new DefaultTableModel();
        model.setColumnIdentifiers(onomatastilwn);
        pinakas=new JTable();
        pinakas.setModel(model); 
        pinakas.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        pinakas.setFillsViewportHeight(true);
        JScrollPane scroll = new JScrollPane(pinakas);
        scroll.setHorizontalScrollBarPolicy(
        JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(
        JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        
        String idagoras="";
        String imerominia="";
        
        try{ 
            Class.forName(driver); 
            Connection con=DriverManager.getConnection(url,username,password);
            String sql="SELECT H3.ID_Αγοράς,H3.Ημερομηνία_Αγοράς FROM ΑΓΟΡΑ H3;";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            int i=0;
            
            while(rs.next()){
                idagoras=rs.getString("ID_Αγοράς");
                imerominia=rs.getString("Ημερομηνία_Αγοράς");
                model.addRow(new Object[]{idagoras, imerominia});
                i++; 
            }
            if(i<1){
                JOptionPane.showMessageDialog(null, "Δεν βρέθηκε καμία εγγραφή εντός του πίνακα","ΑΠΟΤΥΧΙΑ",
                JOptionPane.ERROR_MESSAGE);
            }
            if(i==1){
                System.out.println(i+" εγγραφή βρέθηκε!");
            }
            else{
                System.out.println(i+" εγγρφαφές βρέθηκαν!");
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(),"ΑΠΟΤΥΧΙΑ",
            JOptionPane.ERROR_MESSAGE);
        }
        frame.add(scroll);
        frame.setVisible(true);
        frame.setSize(mikos,ipsos);
    }
    
    
    
    
    public void erotisi5(){ //ΕΜΦΑΝΙΣΗ ΠΡΟΪΟΝΤΩΝ ΠΟΥ ΒΡΙΣΚΟΝΤΑΙ ΣΤΟΝ ΔΙΑΔΡΟΜΟ 4
        
        String[] onomatastilwn={"ID Αποθήκης", "Διάδρομος"};
        frame=new JFrame("ΑΠΑΝΤΗΣΗ ΕΡΩΤΗΣΗΣ 5");
        frame.setLayout(new BorderLayout()); 
        DefaultTableModel model=new DefaultTableModel();
        model.setColumnIdentifiers(onomatastilwn);
        pinakas=new JTable();
        pinakas.setModel(model); 
        pinakas.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        pinakas.setFillsViewportHeight(true);
        JScrollPane scroll = new JScrollPane(pinakas);
        scroll.setHorizontalScrollBarPolicy(
        JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(
        JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        
        String idapothikis="";
        String diadromos="";
        
        try{ 
            Class.forName(driver); 
            Connection con=DriverManager.getConnection(url,username,password);
            String sql="SELECT H5.ID_Αποθήκης,H5.Διάδρομος FROM ΑΠΟΘΗΚΗ H5 WHERE H5.Διάδρομος=4;";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            int i=0;
            
            while(rs.next()){
                idapothikis=rs.getString("ID_Αποθήκης");
                diadromos=rs.getString("Διάδρομος");
                model.addRow(new Object[]{idapothikis, diadromos});
                i++; 
            }
            if(i<1){
                JOptionPane.showMessageDialog(null, "Δεν βρέθηκε καμία εγγραφή εντός του πίνακα","ΑΠΟΤΥΧΙΑ",
                JOptionPane.ERROR_MESSAGE);
            }
            if(i==1){
                System.out.println(i+" εγγραφή βρέθηκε!");
            }
            else{
                System.out.println(i+" εγγρφαφές βρέθηκαν!");
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(),"ΑΠΟΤΥΧΙΑ",
            JOptionPane.ERROR_MESSAGE);
        }
        frame.add(scroll);
        frame.setVisible(true);
        frame.setSize(mikos,ipsos);
    }
    
    
    
    
    public void erotisi6(){ //ΕΜΦΑΝΙΣΗ ΠΡΟΪΟΝΤΩΝ ΜΕ ΑΥΞΟΥΣΑ ΤΙΜΗ
        
        String[] onomatastilwn={"ID Προϊόντος", "Όνομα", "Τιμή", "Κατηγορία", "Απόθεμα"};
        frame=new JFrame("ΑΠΑΝΤΗΣΗ ΕΡΩΤΗΣΗΣ 6");
        frame.setLayout(new BorderLayout()); 
        DefaultTableModel model=new DefaultTableModel();
        model.setColumnIdentifiers(onomatastilwn);
        pinakas=new JTable();
        pinakas.setModel(model); 
        pinakas.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        pinakas.setFillsViewportHeight(true);
        JScrollPane scroll = new JScrollPane(pinakas);
        scroll.setHorizontalScrollBarPolicy(
        JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(
        JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        
        String idproiontos="";
        String onoma="";
        String timi="";
        String katigoria="";
        String apothema="";
        
        try{ 
            Class.forName(driver); 
            Connection con=DriverManager.getConnection(url,username,password);
            String sql="SELECT H8.ID_Προϊόντος,H8.Όνομα,H8.Τιμή,H8.Κατηγορία,H8.Απόθεμα FROM ΠΡΟΪΟΝ H8 ORDER BY H8.Τιμή ASC;";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            int i=0;
            
            while(rs.next()){
                idproiontos=rs.getString("ID_Προϊόντος");
                onoma=rs.getString("Όνομα");
                timi=rs.getString("Τιμή");
                katigoria=rs.getString("Κατηγορία");
                apothema=rs.getString("Απόθεμα");
                model.addRow(new Object[]{idproiontos, onoma, timi, katigoria, apothema});
                i++; 
            }
            if(i<1){
                JOptionPane.showMessageDialog(null, "Δεν βρέθηκε καμία εγγραφή εντός του πίνακα","ΑΠΟΤΥΧΙΑ",
                JOptionPane.ERROR_MESSAGE);
            }
            if(i==1){
                System.out.println(i+" εγγραφή βρέθηκε!");
            }
            else{
                System.out.println(i+" εγγρφαφές βρέθηκαν!");
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(),"ΑΠΟΤΥΧΙΑ",
            JOptionPane.ERROR_MESSAGE);
        }
        frame.add(scroll);
        frame.setVisible(true);
        frame.setSize(mikos,ipsos);
    }
    
    
    
    
    public void erotisi7(){ //ΕΜΦΑΝΙΣΗ ΠΕΛΑΤΩΝ ΑΠΟ ΘΕΣΣΑΛΟΝΙΚΗ Ή ΑΠΟ ΕΥΟΣΜΟ
        
        String[] onomatastilwn={"ΑΜΚΑ", "Όνομα", "Επώνυμο", "Αριθμός Τηλεφώνου", "Ασφάλεια", "Πόλη"};
        frame=new JFrame("ΑΠΑΝΤΗΣΗ ΕΡΩΤΗΣΗΣ 7");
        frame.setLayout(new BorderLayout()); 
        DefaultTableModel model=new DefaultTableModel();
        model.setColumnIdentifiers(onomatastilwn);
        pinakas=new JTable();
        pinakas.setModel(model); 
        pinakas.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        pinakas.setFillsViewportHeight(true);
        JScrollPane scroll = new JScrollPane(pinakas);
        scroll.setHorizontalScrollBarPolicy(
        JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(
        JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        
        String amka="";
        String onoma="";
        String eponimo="";
        String til="";
        String asfaleia="";
        String poli="";
        
        try{ 
            Class.forName(driver); 
            Connection con=DriverManager.getConnection(url,username,password);
            String sql="SELECT H6.ΑΜΚΑ,H6.Όνομα,H6.Επώνυμο,H6.Αριθμός_Τηλεφώνου,H6.Ασφάλεια,H6.Πόλη FROM ΠΕΛΑΤΗΣ H6 WHERE H6.Πόλη='ΘΕΣΣΑΛΟΝΙΚΗ' OR H6.Πόλη='ΕΥΟΣΜΟΣ';";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            int i=0;
            
            while(rs.next()){
                amka=rs.getString("ΑΜΚΑ");
                onoma=rs.getString("Όνομα");
                eponimo=rs.getString("Επώνυμο");
                til=rs.getString("Αριθμός_Τηλεφώνου");
                asfaleia=rs.getString("Ασφάλεια");
                poli=rs.getString("Πόλη");
                model.addRow(new Object[]{amka, onoma, eponimo, til, asfaleia, poli});
                i++; 
            }
            if(i<1){
                JOptionPane.showMessageDialog(null, "Δεν βρέθηκε καμία εγγραφή εντός του πίνακα","ΑΠΟΤΥΧΙΑ",
                JOptionPane.ERROR_MESSAGE);
            }
            if(i==1){
                System.out.println(i+" εγγραφή βρέθηκε!");
            }
            else{
                System.out.println(i+" εγγρφαφές βρέθηκαν!");
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(),"ΑΠΟΤΥΧΙΑ",
            JOptionPane.ERROR_MESSAGE);
        }
        frame.add(scroll);
        frame.setVisible(true);
        frame.setSize(mikos,ipsos);
    }
    
    
    
    
    public void erotisi8(){ //ΕΜΦΑΝΙΣΗ ΠΡΟΜΗΘΕΥΤΩΝ ΠΟΥ ΔΕΝ ΕΙΝΑΙ ΑΠΟ ΘΕΣΣΑΛΟΝΙΚΗ
        
        String[] onomatastilwn={"ID Προμηθευτή", "Επωνυμία Προμηθευτή", "Αριθμός Τηλεφώνου", "Έδρα"};
        frame=new JFrame("ΑΠΑΝΤΗΣΗ ΕΡΩΤΗΣΗΣ 8");
        frame.setLayout(new BorderLayout()); 
        DefaultTableModel model=new DefaultTableModel();
        model.setColumnIdentifiers(onomatastilwn);
        pinakas=new JTable();
        pinakas.setModel(model); 
        pinakas.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        pinakas.setFillsViewportHeight(true);
        JScrollPane scroll = new JScrollPane(pinakas);
        scroll.setHorizontalScrollBarPolicy(
        JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(
        JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        
        String idpromitheuti="";
        String eponimia="";
        String til="";
        String edra="";
        
        try{ 
            Class.forName(driver); 
            Connection con=DriverManager.getConnection(url,username,password);
            String sql="SELECT H7.ID_Προμηθευτή,H7.Επωνυμία_Προμηθευτή,H7.Αριθμός_Τηλεφώνου,H7.Έδρα FROM ΠΡΟΜΗΘΕΥΤΗΣ H7 WHERE H7.Έδρα!='ΘΕΣΣΑΛΟΝΙΚΗ';";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            int i=0;
            
            while(rs.next()){
                idpromitheuti=rs.getString("ID_Προμηθευτή");
                eponimia=rs.getString("Επωνυμία_Προμηθευτή");
                til=rs.getString("Αριθμός_Τηλεφώνου");
                edra=rs.getString("Έδρα");
                model.addRow(new Object[]{idpromitheuti, eponimia, til, edra});
                i++; 
            }
            if(i<1){
                JOptionPane.showMessageDialog(null, "Δεν βρέθηκε καμία εγγραφή εντός του πίνακα","ΑΠΟΤΥΧΙΑ",
                JOptionPane.ERROR_MESSAGE);
            }
            if(i==1){
                System.out.println(i+" εγγραφή βρέθηκε!");
            }
            else{
                System.out.println(i+" εγγρφαφές βρέθηκαν!");
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(),"ΑΠΟΤΥΧΙΑ",
            JOptionPane.ERROR_MESSAGE);
        }
        frame.add(scroll);
        frame.setVisible(true);
        frame.setSize(mikos,ipsos);
    }
    
    
    
    
    public void erotisi9(){ //ΕΜΦΑΝΙΣΗ ΠΡΟΪΟΝΤΩΝ ΜΕ ΑΠΟΘΕΜΑ <4
        
        String[] onomatastilwn={"ID Προϊόντος", "Όνομα", "Κατηγορία", "Απόθεμα"};
        frame=new JFrame("ΑΠΑΝΤΗΣΗ ΕΡΩΤΗΣΗΣ 9");
        frame.setLayout(new BorderLayout()); 
        DefaultTableModel model=new DefaultTableModel();
        model.setColumnIdentifiers(onomatastilwn);
        pinakas=new JTable();
        pinakas.setModel(model); 
        pinakas.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        pinakas.setFillsViewportHeight(true);
        JScrollPane scroll = new JScrollPane(pinakas);
        scroll.setHorizontalScrollBarPolicy(
        JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(
        JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        
        String idproiontos="";
        String onoma="";
        String katigoria="";
        String apothema="";
        
        try{ 
            Class.forName(driver); 
            Connection con=DriverManager.getConnection(url,username,password);
            String sql="SELECT H8.ID_Προϊόντος,H8.Όνομα,H8.Κατηγορία,H8.Απόθεμα FROM ΠΡΟΪΟΝ H8 WHERE H8.Απόθεμα<4;";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            int i=0;
            
            while(rs.next()){
                idproiontos=rs.getString("ID_Προϊόντος");
                onoma=rs.getString("Όνομα");
                katigoria=rs.getString("Κατηγορία");
                apothema=rs.getString("Απόθεμα");
                model.addRow(new Object[]{idproiontos, onoma, katigoria, apothema});
                i++; 
            }
            if(i<1){
                JOptionPane.showMessageDialog(null, "Δεν βρέθηκε καμία εγγραφή εντός του πίνακα","ΑΠΟΤΥΧΙΑ",
                JOptionPane.ERROR_MESSAGE);
            }
            if(i==1){
                System.out.println(i+" εγγραφή βρέθηκε!");
            }
            else{
                System.out.println(i+" εγγρφαφές βρέθηκαν!");
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(),"ΑΠΟΤΥΧΙΑ",
            JOptionPane.ERROR_MESSAGE);
        }
        frame.add(scroll);
        frame.setVisible(true);
        frame.setSize(mikos,ipsos);
    }
    
    
    
    
    public void erotisi10(){ //ΕΜΦΑΝΙΣΗ ΠΡΟΪΟΝΤΩΝ ΠΟΥ ΕΙΝΑΙ ΟΡΘΟΠΕΔΙΚΑ
        
        String[] onomatastilwn={"ID Προϊόντος", "Όνομα", "Τιμή", "Κατηγορία", "Απόθεμα", "Κατηγορία Φαρμάκου"};
        frame=new JFrame("ΑΠΑΝΤΗΣΗ ΕΡΩΤΗΣΗΣ 10");
        frame.setLayout(new BorderLayout()); 
        DefaultTableModel model=new DefaultTableModel();
        model.setColumnIdentifiers(onomatastilwn);
        pinakas=new JTable();
        pinakas.setModel(model); 
        pinakas.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        pinakas.setFillsViewportHeight(true);
        JScrollPane scroll = new JScrollPane(pinakas);
        scroll.setHorizontalScrollBarPolicy(
        JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(
        JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        
        String idproiontos="";
        String onoma="";
        String timi="";
        String katigoria="";
        String apothema="";
        String katigoriafarmakou="";
        
        try{ 
            Class.forName(driver); 
            Connection con=DriverManager.getConnection(url,username,password);
            String sql="SELECT H10.ID_Προϊόντος, H10.Όνομα,H10.Τιμή,H10.Κατηγορία,H10.Απόθεμα,P10.Όνομα AS 'Κατηγορία Φαρμάκου' FROM ΠΡΟΪΟΝ H10,ΚΑΤΗΓΟΡΙΑ P10,ΠΡΟΪΟΝ_ΜΕ_ΚΑΤΗΓΟΡΙΑ N10 WHERE P10.Όνομα='ΟΡΘΟΠΕΔΙΚΑ' AND P10.ID_Κατηγορίας= N10.ID_Κατηγορίας AND N10.ID_Προϊόντος=H10.ID_Προϊόντος;";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            int i=0;
            
            while(rs.next()){
                idproiontos=rs.getString("ID_Προϊόντος");
                onoma=rs.getString("Όνομα");
                timi=rs.getString("Τιμή");
                katigoria=rs.getString("Κατηγορία");
                apothema=rs.getString("Απόθεμα");
                katigoriafarmakou=rs.getString("Κατηγορία Φαρμάκου");
                model.addRow(new Object[]{idproiontos, onoma, timi, katigoria, apothema, katigoriafarmakou});
                i++; 
            }
            if(i<1){
                JOptionPane.showMessageDialog(null, "Δεν βρέθηκε καμία εγγραφή εντός του πίνακα","ΑΠΟΤΥΧΙΑ",
                JOptionPane.ERROR_MESSAGE);
            }
            if(i==1){
                System.out.println(i+" εγγραφή βρέθηκε!");
            }
            else{
                System.out.println(i+" εγγρφαφές βρέθηκαν!");
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(),"ΑΠΟΤΥΧΙΑ",
            JOptionPane.ERROR_MESSAGE);
        }
        frame.add(scroll);
        frame.setVisible(true);
        frame.setSize(mikos,ipsos);
    }
    
    
    
    
    public void erotisiepipleon(){ //ΕΜΦΑΝΙΣΗ ΠΕΛΑΤΩΝ ΑΡΙΘΜΟΥ ΑΠΟ ΚΑΘΕ ΠΟΛΗ
        
        String[] onomatastilwn={"Αριθμός Πελατών", "Πόλη"};
        frame=new JFrame("ΑΠΑΝΤΗΣΗ ΕΠΙΠΛΕΟΝ ΕΡΩΤΗΣΗΣ");
        frame.setLayout(new BorderLayout()); 
        DefaultTableModel model=new DefaultTableModel();
        model.setColumnIdentifiers(onomatastilwn);
        pinakas=new JTable();
        pinakas.setModel(model); 
        pinakas.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        pinakas.setFillsViewportHeight(true);
        JScrollPane scroll = new JScrollPane(pinakas);
        scroll.setHorizontalScrollBarPolicy(
        JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(
        JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        
        String arithmos="";
        String poli="";
        
        try{ 
            Class.forName(driver); 
            Connection con=DriverManager.getConnection(url,username,password);
            String sql="SELECT COUNT(ΑΜΚΑ), Πόλη FROM ΠΕΛΑΤΗΣ GROUP BY Πόλη ORDER BY COUNT(ΑΜΚΑ) DESC;";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            int i=0;
            
            while(rs.next()){
                arithmos=rs.getString("COUNT(ΑΜΚΑ)");
                poli=rs.getString("Πόλη");
                model.addRow(new Object[]{arithmos, poli});
                i++; 
            }
            if(i<1){
                JOptionPane.showMessageDialog(null, "Δεν βρέθηκε καμία εγγραφή εντός του πίνακα","ΑΠΟΤΥΧΙΑ",
                JOptionPane.ERROR_MESSAGE);
            }
            if(i==1){
                System.out.println(i+" εγγραφή βρέθηκε!");
            }
            else{
                System.out.println(i+" εγγρφαφές βρέθηκαν!");
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(),"ΑΠΟΤΥΧΙΑ",
            JOptionPane.ERROR_MESSAGE);
        }
        frame.add(scroll);
        frame.setVisible(true);
        frame.setSize(mikos,ipsos);
    }


}
