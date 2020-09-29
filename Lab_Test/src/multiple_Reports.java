/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
 * 
 * 
 * 
 * 
 * @author Saad_BAD
 */
public class multiple_Reports {
   
    
    
    /*
    
        String q;
        
                    String Username="root";
        String password="root123";
        q = "Select Date,Patients_Name,Age,City,Gender,Contact_No,Refered_By,Type_of_Test,Ultrasonography_Test,RadioGraphy_Test,Price,Report from patient where Date = ?";
      String url = "jdbc:mysql://localhost:3306/lab";
          try{
              Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection(url,Username,password);
        PreparedStatement pst=con.prepareStatement(q);
           
     Date date=new Date();

String dateStr2=new Timestamp(date.getTime()).toString();

pst.setString(1,dateStr2.substring(0,10));
   
       
             ResultSet rs= pst.executeQuery();
       t.setModel(DbUtils.resultSetToTableModel(rs));
       
          }catch(   ClassNotFoundException | SQLException e){
          
          System.out.println(e);

               }          // TODO add your handling code here:
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         

  
        DefaultTableModel model = (DefaultTableModel)t.getModel();

        // get the selected row index
      
           int selectedRowIndex = t.getSelectedRow();
       
        // set the selected row data into jtextfields
       n=model.getValueAt(selectedRowIndex, 1).toString();
  String n2;
  String n1;
  n2=JOptionPane.showInputDialog(null,"Name of report");
 n1=n+n2;  
       
          
  System.out.println(n1);
   
  
  try {
String url = "jdbc:mysql://localhost:3306/lab";
       String Username="root";
       String password="root123";
       String t="select Report from patient where Patients_Name='"+n+"'";
       String t1="select Report1 from patient where Patients_Name='"+n+"'";
       String t2="select Report2 from patient where Patients_Name='"+n+"'";
       String t3="select Report3 from patient where Patients_Name='"+n+"'";
       String t4="select Report4 from patient where Patients_Name='"+n+"'";
       String t5="select Report5 from patient where Patients_Name='"+n+"'";
       String t6="select Report6 from patient where Patients_Name='"+n+"'";
       String t7="select Report7 from patient where Patients_Name='"+n+"'";
       String t8="select Report8 from patient where Patients_Name='"+n+"'";
       String t9="select Report9 from patient where Patients_Name='"+n+"'";
       String t10="select Report10 from patient where Patients_Name='"+n+"'";
       
//   n=model.getValueAt(selectedRowIndex, 1).toString();  
              Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection(url,Username,password);
        PreparedStatement pst=con.prepareStatement(t);
      PreparedStatement pst2=con.prepareStatement(t1);
      PreparedStatement pst3=con.prepareStatement(t2);
      PreparedStatement pst4=con.prepareStatement(t3);
      PreparedStatement pst5=con.prepareStatement(t4);
      PreparedStatement pst6=con.prepareStatement(t5);
      PreparedStatement pst7=con.prepareStatement(t6);
      PreparedStatement pst8=con.prepareStatement(t7);
      PreparedStatement pst9=con.prepareStatement(t8);
      PreparedStatement pst10=con.prepareStatement(t9);
      PreparedStatement pst11=con.prepareStatement(t10);
        ResultSet rs= pst.executeQuery();
        ResultSet rs2= pst2.executeQuery();
        ResultSet rs3= pst3.executeQuery();
        ResultSet rs4= pst4.executeQuery();
        ResultSet rs5= pst5.executeQuery();
        ResultSet rs6= pst6.executeQuery();
        ResultSet rs7= pst7.executeQuery();
        ResultSet rs8= pst8.executeQuery();
        ResultSet rs9= pst9.executeQuery();
        ResultSet rs10= pst10.executeQuery();
        ResultSet rs11= pst11.executeQuery();
        
        
        boolean b=rs.next();
        boolean b2=rs2.next();
        boolean b3=rs3.next();
        boolean b4=rs4.next();
        boolean b5=rs5.next();
        boolean b6=rs6.next();
        boolean b7=rs7.next();
        boolean b8=rs8.next();
        boolean b9=rs9.next();
        boolean b10=rs10.next();
        boolean b11=rs11.next();
  
        
        
        
String ab = rs.getString("Report");
String ab2 = rs2.getString("Report1");
String ab3 = rs3.getString("Report2");
String ab4 = rs4.getString("Report3");
String ab5 = rs5.getString("Report4");
String ab6 = rs6.getString("Report5");
String ab7 = rs7.getString("Report6");
String ab8 = rs8.getString("Report7");
String ab9 = rs9.getString("Report8");
String ab10 = rs10.getString("Report9");
String ab11 = rs11.getString("Report10");
  
          if (ab==null)
         
          {
           File file=new File("D://Reports//"+n1+".docx");
  String a="D://Reports//"+n1+".docx";
  System.out.println(a);
        
        FileOutputStream out = null;
        try {
          String name=  cb2.getSelectedItem().toString();
            XWPFDocument docx1 = new XWPFDocument(new  FileInputStream("D:\\Report Format\\"+name+".docx"));
            XWPFNumbering numberingDocx1 = docx1.getNumbering();
            
// get paragraphListDocx1 as a List of all paragraphs from docx1
            List<XWPFParagraph> paragraphListDocx1 =  docx1.getParagraphs();
            // get the numbering.xml from docx1 to docx2
            // this is needed if some of the paragraphs from docx1 are numbered
            XWPFDocument docx2= new XWPFDocument();
            
out = new FileOutputStream(new File("D:\\Reports\\"+n1+".docx"));
XWPFParagraph p1 = docx2.createParagraph();
XWPFRun run = p1.createRun();
run.setBold(true);
run.setText("Date:- "+model.getValueAt(selectedRowIndex, 0).toString()+"     \n");
run.setBold(true);
run.setText("Name:- "+model.getValueAt(selectedRowIndex, 1).toString()+"      ");
run.setBold(true);
run.setText("Age:- "+model.getValueAt(selectedRowIndex, 2).toString()+"       ");
run.setBold(true);
run.setText("Gender:- "+model.getValueAt(selectedRowIndex, 4).toString()+"      ");
run.setBold(true);
run.setText("Referred By:- "+model.getValueAt(selectedRowIndex, 6).toString()+"  ");

if (numberingDocx1 != null) {
                XWPFNumbering numberingDocx2 = docx2.createNumbering();
                try {
                    Field f = numberingDocx1.getClass().getDeclaredField("ctNumbering");
                    f.setAccessible(true);
                    numberingDocx2.setNumbering((CTNumbering)f.get(numberingDocx1));
                } catch (NoSuchFieldException | IllegalAccessException nsfex) {
                }
            }         // create a paragraph in docx2
            XWPFParagraph paragraphDocx2 = docx2.createParagraph();
//XWPFRun run = paragraphDocx2.createRun();



          // this will copy all paragraphs from paragraphListDocx1 to docx2
            for (XWPFParagraph paragraphDocx1 : paragraphListDocx1) {
                paragraphDocx2 = docx2.createParagraph();
                docx2.setParagraph(paragraphDocx1, docx2.getPosOfParagraph(paragraphDocx2));
            }         paragraphDocx2 = docx2.createParagraph();
            run = paragraphDocx2.createRun();
                      
 
            docx2.write(out);
            //docx2.close();   
            System.out.println(n+" written successfully");
        try
        {
          String p=file.getAbsolutePath();
      System.out.println(p);
        String q = "update patient set Report='"+a+"' where Patients_Name='"+n+"'" ;
                 n=model.getValueAt(selectedRowIndex, 1).toString();  
              Class.forName("com.mysql.cj.jdbc.Driver");
       // Connection con=DriverManager.getConnection(url,Username,password);
        PreparedStatement st=con.prepareStatement(q);
        
         
    
            
         boolean rs1=st.execute();
   if((rs1==false))
           {
       JOptionPane.showMessageDialog(null,"File Saved");
       
            
   }
   else
   {
       JOptionPane.showMessageDialog(null,"File Not Saved");
   } 
     
        }catch(HeadlessException | ClassNotFoundException | SQLException e)
                {
                    JOptionPane.showMessageDialog(null,e);
                }
                   if(!Desktop.isDesktopSupported())//check if Desktop is supported by Platform or not
            {
                System.out.println("not supported");
                return;
            }
                  
            Desktop desktop = Desktop.getDesktop();
            if(file.exists())
            {//checks file exists or not
                desktop.open(file);              //opens the specified file
            }
        } catch(IOException e)
        {
        }  
 finally {
            try {
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(Reporting.class.getName()).log(Level.SEVERE, null, ex);
            }
     
        }
  
          
          }
          else if(ab2==null)
          {
                     File file=new File("D://Reports//"+n1+".docx");
  String a="D://Reports//"+n1+".docx";
  System.out.println(a);
        
        FileOutputStream out = null;
        try {
          String name=  cb2.getSelectedItem().toString();
            XWPFDocument docx1 = new XWPFDocument(new  FileInputStream("D:\\Report Format\\"+name+".docx"));
            XWPFNumbering numberingDocx1 = docx1.getNumbering();
            
// get paragraphListDocx1 as a List of all paragraphs from docx1
            List<XWPFParagraph> paragraphListDocx1 =  docx1.getParagraphs();
            // get the numbering.xml from docx1 to docx2
            // this is needed if some of the paragraphs from docx1 are numbered
            XWPFDocument docx2= new XWPFDocument();
            
out = new FileOutputStream(new File("D:\\Reports\\"+n1+".docx"));
XWPFParagraph p1 = docx2.createParagraph();
XWPFRun run = p1.createRun();
run.setBold(true);
run.setText("Date:- "+model.getValueAt(selectedRowIndex, 0).toString()+"     \n");
run.setBold(true);
run.setText("Name:- "+model.getValueAt(selectedRowIndex, 1).toString()+"      ");
run.setBold(true);
run.setText("Age:- "+model.getValueAt(selectedRowIndex, 2).toString()+"       ");
run.setBold(true);
run.setText("Gender:- "+model.getValueAt(selectedRowIndex, 4).toString()+"      ");
run.setBold(true);
run.setText("Referred By:- "+model.getValueAt(selectedRowIndex, 6).toString()+"  ");

if (numberingDocx1 != null) {
                XWPFNumbering numberingDocx2 = docx2.createNumbering();
                try {
                    Field f = numberingDocx1.getClass().getDeclaredField("ctNumbering");
                    f.setAccessible(true);
                    numberingDocx2.setNumbering((CTNumbering)f.get(numberingDocx1));
                } catch (NoSuchFieldException | IllegalAccessException nsfex) {
                }
            }         // create a paragraph in docx2
            XWPFParagraph paragraphDocx2 = docx2.createParagraph();
//XWPFRun run = paragraphDocx2.createRun();



          // this will copy all paragraphs from paragraphListDocx1 to docx2
            for (XWPFParagraph paragraphDocx1 : paragraphListDocx1) {
                paragraphDocx2 = docx2.createParagraph();
                docx2.setParagraph(paragraphDocx1, docx2.getPosOfParagraph(paragraphDocx2));
            }         paragraphDocx2 = docx2.createParagraph();
            run = paragraphDocx2.createRun();
                      
 
            docx2.write(out);
            //docx2.close();   
            System.out.println(n+" written successfully");
        try
        {
          String p=file.getAbsolutePath();
      System.out.println(p);
        String q = "update patient set Report1='"+a+"' where Patients_Name='"+n+"'" ;
                 n=model.getValueAt(selectedRowIndex, 1).toString();  
              Class.forName("com.mysql.cj.jdbc.Driver");
       // Connection con=DriverManager.getConnection(url,Username,password);
        PreparedStatement st=con.prepareStatement(q);
        
         
    
            
         boolean rs1=st.execute();
   if((rs1==false))
           {
       JOptionPane.showMessageDialog(null,"File Saved");
       
            
   }
   else
   {
       JOptionPane.showMessageDialog(null,"File Not Saved");
   } 
     
        }catch(HeadlessException | ClassNotFoundException | SQLException e)
                {
                    JOptionPane.showMessageDialog(null,e);
                }
                   if(!Desktop.isDesktopSupported())//check if Desktop is supported by Platform or not
            {
                System.out.println("not supported");
                return;
            }
                  
            Desktop desktop = Desktop.getDesktop();
            if(file.exists())
            {//checks file exists or not
                desktop.open(file);              //opens the specified file
            }
        } catch(IOException e)
        {
        }  
 finally {
            try {
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(Reporting.class.getName()).log(Level.SEVERE, null, ex);
            }
     
        }   
          }
          else if(ab3==null)
          {
                     File file=new File("D://Reports//"+n1+".docx");
  String a="D://Reports//"+n1+".docx";
  System.out.println(a);
        
        FileOutputStream out = null;
        try {
          String name=  cb2.getSelectedItem().toString();
            XWPFDocument docx1 = new XWPFDocument(new  FileInputStream("D:\\Report Format\\"+name+".docx"));
            XWPFNumbering numberingDocx1 = docx1.getNumbering();
            
// get paragraphListDocx1 as a List of all paragraphs from docx1
            List<XWPFParagraph> paragraphListDocx1 =  docx1.getParagraphs();
            // get the numbering.xml from docx1 to docx2
            // this is needed if some of the paragraphs from docx1 are numbered
            XWPFDocument docx2= new XWPFDocument();
            
out = new FileOutputStream(new File("D:\\Reports\\"+n1+".docx"));
XWPFParagraph p1 = docx2.createParagraph();
XWPFRun run = p1.createRun();
run.setBold(true);
run.setText("Date:- "+model.getValueAt(selectedRowIndex, 0).toString()+"     \n");
run.setBold(true);
run.setText("Name:- "+model.getValueAt(selectedRowIndex, 1).toString()+"      ");
run.setBold(true);
run.setText("Age:- "+model.getValueAt(selectedRowIndex, 2).toString()+"       ");
run.setBold(true);
run.setText("Gender:- "+model.getValueAt(selectedRowIndex, 4).toString()+"      ");
run.setBold(true);
run.setText("Referred By:- "+model.getValueAt(selectedRowIndex, 6).toString()+"  ");

if (numberingDocx1 != null) {
                XWPFNumbering numberingDocx2 = docx2.createNumbering();
                try {
                    Field f = numberingDocx1.getClass().getDeclaredField("ctNumbering");
                    f.setAccessible(true);
                    numberingDocx2.setNumbering((CTNumbering)f.get(numberingDocx1));
                } catch (NoSuchFieldException | IllegalAccessException nsfex) {
                }
            }         // create a paragraph in docx2
            XWPFParagraph paragraphDocx2 = docx2.createParagraph();
//XWPFRun run = paragraphDocx2.createRun();



          // this will copy all paragraphs from paragraphListDocx1 to docx2
            for (XWPFParagraph paragraphDocx1 : paragraphListDocx1) {
                paragraphDocx2 = docx2.createParagraph();
                docx2.setParagraph(paragraphDocx1, docx2.getPosOfParagraph(paragraphDocx2));
            }         paragraphDocx2 = docx2.createParagraph();
            run = paragraphDocx2.createRun();
                      
 
            docx2.write(out);
            //docx2.close();   
            System.out.println(n+" written successfully");
        try
        {
          String p=file.getAbsolutePath();
      System.out.println(p);
        String q = "update patient set Report2='"+a+"' where Patients_Name='"+n+"'" ;
                 n=model.getValueAt(selectedRowIndex, 1).toString();  
              Class.forName("com.mysql.cj.jdbc.Driver");
       // Connection con=DriverManager.getConnection(url,Username,password);
        PreparedStatement st=con.prepareStatement(q);
        
         
    
            
         boolean rs1=st.execute();
   if((rs1==false))
           {
       JOptionPane.showMessageDialog(null,"File Saved");
       
            
   }
   else
   {
       JOptionPane.showMessageDialog(null,"File Not Saved");
   } 
     
        }catch(HeadlessException | ClassNotFoundException | SQLException e)
                {
                    JOptionPane.showMessageDialog(null,e);
                }
                   if(!Desktop.isDesktopSupported())//check if Desktop is supported by Platform or not
            {
                System.out.println("not supported");
                return;
            }
                  
            Desktop desktop = Desktop.getDesktop();
            if(file.exists())
            {//checks file exists or not
                desktop.open(file);              //opens the specified file
            }
        } catch(IOException e)
        {
        }  
 finally {
            try {
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(Reporting.class.getName()).log(Level.SEVERE, null, ex);
            }
     
        }   
          }
          else if (ab4==null)
          {
                     File file=new File("D://Reports//"+n1+".docx");
  String a="D://Reports//"+n1+".docx";
  System.out.println(a);
        
        FileOutputStream out = null;
        try {
          String name=  cb2.getSelectedItem().toString();
            XWPFDocument docx1 = new XWPFDocument(new  FileInputStream("D:\\Report Format\\"+name+".docx"));
            XWPFNumbering numberingDocx1 = docx1.getNumbering();
            
// get paragraphListDocx1 as a List of all paragraphs from docx1
            List<XWPFParagraph> paragraphListDocx1 =  docx1.getParagraphs();
            // get the numbering.xml from docx1 to docx2
            // this is needed if some of the paragraphs from docx1 are numbered
            XWPFDocument docx2= new XWPFDocument();
            
out = new FileOutputStream(new File("D:\\Reports\\"+n1+".docx"));
XWPFParagraph p1 = docx2.createParagraph();
XWPFRun run = p1.createRun();
run.setBold(true);
run.setText("Date:- "+model.getValueAt(selectedRowIndex, 0).toString()+"     \n");
run.setBold(true);
run.setText("Name:- "+model.getValueAt(selectedRowIndex, 1).toString()+"      ");
run.setBold(true);
run.setText("Age:- "+model.getValueAt(selectedRowIndex, 2).toString()+"       ");
run.setBold(true);
run.setText("Gender:- "+model.getValueAt(selectedRowIndex, 4).toString()+"      ");
run.setBold(true);
run.setText("Referred By:- "+model.getValueAt(selectedRowIndex, 6).toString()+"  ");

if (numberingDocx1 != null) {
                XWPFNumbering numberingDocx2 = docx2.createNumbering();
                try {
                    Field f = numberingDocx1.getClass().getDeclaredField("ctNumbering");
                    f.setAccessible(true);
                    numberingDocx2.setNumbering((CTNumbering)f.get(numberingDocx1));
                } catch (NoSuchFieldException | IllegalAccessException nsfex) {
                }
            }         // create a paragraph in docx2
            XWPFParagraph paragraphDocx2 = docx2.createParagraph();
//XWPFRun run = paragraphDocx2.createRun();



          // this will copy all paragraphs from paragraphListDocx1 to docx2
            for (XWPFParagraph paragraphDocx1 : paragraphListDocx1) {
                paragraphDocx2 = docx2.createParagraph();
                docx2.setParagraph(paragraphDocx1, docx2.getPosOfParagraph(paragraphDocx2));
            }         paragraphDocx2 = docx2.createParagraph();
            run = paragraphDocx2.createRun();
                      
 
            docx2.write(out);
            //docx2.close();   
            System.out.println(n+" written successfully");
        try
        {
          String p=file.getAbsolutePath();
      System.out.println(p);
        String q = "update patient set Report3='"+a+"' where Patients_Name='"+n+"'" ;
                 n=model.getValueAt(selectedRowIndex, 1).toString();  
              Class.forName("com.mysql.cj.jdbc.Driver");
       // Connection con=DriverManager.getConnection(url,Username,password);
        PreparedStatement st=con.prepareStatement(q);
        
         
    
            
         boolean rs1=st.execute();
   if((rs1==false))
           {
       JOptionPane.showMessageDialog(null,"File Saved");
       
            
   }
   else
   {
       JOptionPane.showMessageDialog(null,"File Not Saved");
   } 
     
        }catch(HeadlessException | ClassNotFoundException | SQLException e)
                {
                    JOptionPane.showMessageDialog(null,e);
                }
                   if(!Desktop.isDesktopSupported())//check if Desktop is supported by Platform or not
            {
               JOptionPane.showMessageDialog(null,"Desktop is not supported");
                return;
            }
                  
            Desktop desktop = Desktop.getDesktop();
            if(file.exists())
            {//checks file exists or not
                desktop.open(file);              //opens the specified file
            }
        } catch(IOException e)
        {
        }  
 finally {
            try {
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(Reporting.class.getName()).log(Level.SEVERE, null, ex);
            }
     
        }   
          }
           
          else if (ab5==null)
          {
          
                         File file=new File("D://Reports//"+n1+".docx");
  String a="D://Reports//"+n1+".docx";
  System.out.println(a);
        
        FileOutputStream out = null;
        try {
          String name=  cb2.getSelectedItem().toString();
            XWPFDocument docx1 = new XWPFDocument(new  FileInputStream("D:\\Report Format\\"+name+".docx"));
            XWPFNumbering numberingDocx1 = docx1.getNumbering();
            
// get paragraphListDocx1 as a List of all paragraphs from docx1
            List<XWPFParagraph> paragraphListDocx1 =  docx1.getParagraphs();
            // get the numbering.xml from docx1 to docx2
            // this is needed if some of the paragraphs from docx1 are numbered
            XWPFDocument docx2= new XWPFDocument();
            
out = new FileOutputStream(new File("D:\\Reports\\"+n1+".docx"));
XWPFParagraph p1 = docx2.createParagraph();
XWPFRun run = p1.createRun();
run.setBold(true);
run.setText("Date:- "+model.getValueAt(selectedRowIndex, 0).toString()+"     \n");
run.setBold(true);
run.setText("Name:- "+model.getValueAt(selectedRowIndex, 1).toString()+"      ");
run.setBold(true);
run.setText("Age:- "+model.getValueAt(selectedRowIndex, 2).toString()+"       ");
run.setBold(true);
run.setText("Gender:- "+model.getValueAt(selectedRowIndex, 4).toString()+"      ");
run.setBold(true);
run.setText("Referred By:- "+model.getValueAt(selectedRowIndex, 6).toString()+"  ");

if (numberingDocx1 != null) {
                XWPFNumbering numberingDocx2 = docx2.createNumbering();
                try {
                    Field f = numberingDocx1.getClass().getDeclaredField("ctNumbering");
                    f.setAccessible(true);
                    numberingDocx2.setNumbering((CTNumbering)f.get(numberingDocx1));
                } catch (NoSuchFieldException | IllegalAccessException nsfex) {
                }
            }         // create a paragraph in docx2
            XWPFParagraph paragraphDocx2 = docx2.createParagraph();
//XWPFRun run = paragraphDocx2.createRun();



          // this will copy all paragraphs from paragraphListDocx1 to docx2
            for (XWPFParagraph paragraphDocx1 : paragraphListDocx1) {
                paragraphDocx2 = docx2.createParagraph();
                docx2.setParagraph(paragraphDocx1, docx2.getPosOfParagraph(paragraphDocx2));
            }         paragraphDocx2 = docx2.createParagraph();
            run = paragraphDocx2.createRun();
                      
 
            docx2.write(out);
            //docx2.close();   
            System.out.println(n+" written successfully");
        try
        {
          String p=file.getAbsolutePath();
      System.out.println(p);
        String q = "update patient set Report4='"+a+"' where Patients_Name='"+n+"'" ;
                 n=model.getValueAt(selectedRowIndex, 1).toString();  
              Class.forName("com.mysql.cj.jdbc.Driver");
       // Connection con=DriverManager.getConnection(url,Username,password);
        PreparedStatement st=con.prepareStatement(q);
        
         
    
            
         boolean rs1=st.execute();
   if((rs1==false))
           {
       JOptionPane.showMessageDialog(null,"File Saved");
       
            
   }
   else
   {
       JOptionPane.showMessageDialog(null,"File Not Saved");
   } 
     
        }catch(HeadlessException | ClassNotFoundException | SQLException e)
                {
                    JOptionPane.showMessageDialog(null,e);
                }
                   if(!Desktop.isDesktopSupported())//check if Desktop is supported by Platform or not
            {
               JOptionPane.showMessageDialog(null,"Desktop is not supported");
                return;
            }
                  
            Desktop desktop = Desktop.getDesktop();
            if(file.exists())
            {//checks file exists or not
                desktop.open(file);              //opens the specified file
            }
        } catch(IOException e)
        {
        }  
 finally {
            try {
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(Reporting.class.getName()).log(Level.SEVERE, null, ex);
            }
     
        } 
              
          }
           
          else if (ab6==null)
          {
                       File file=new File("D://Reports//"+n1+".docx");
  String a="D://Reports//"+n1+".docx";
  System.out.println(a);
        
        FileOutputStream out = null;
        try {
          String name=  cb2.getSelectedItem().toString();
            XWPFDocument docx1 = new XWPFDocument(new  FileInputStream("D:\\Report Format\\"+name+".docx"));
            XWPFNumbering numberingDocx1 = docx1.getNumbering();
            
// get paragraphListDocx1 as a List of all paragraphs from docx1
            List<XWPFParagraph> paragraphListDocx1 =  docx1.getParagraphs();
            // get the numbering.xml from docx1 to docx2
            // this is needed if some of the paragraphs from docx1 are numbered
            XWPFDocument docx2= new XWPFDocument();
            
out = new FileOutputStream(new File("D:\\Reports\\"+n1+".docx"));
XWPFParagraph p1 = docx2.createParagraph();
XWPFRun run = p1.createRun();
run.setBold(true);
run.setText("Date:- "+model.getValueAt(selectedRowIndex, 0).toString()+"     \n");
run.setBold(true);
run.setText("Name:- "+model.getValueAt(selectedRowIndex, 1).toString()+"      ");
run.setBold(true);
run.setText("Age:- "+model.getValueAt(selectedRowIndex, 2).toString()+"       ");
run.setBold(true);
run.setText("Gender:- "+model.getValueAt(selectedRowIndex, 4).toString()+"      ");
run.setBold(true);
run.setText("Referred By:- "+model.getValueAt(selectedRowIndex, 6).toString()+"  ");

if (numberingDocx1 != null) {
                XWPFNumbering numberingDocx2 = docx2.createNumbering();
                try {
                    Field f = numberingDocx1.getClass().getDeclaredField("ctNumbering");
                    f.setAccessible(true);
                    numberingDocx2.setNumbering((CTNumbering)f.get(numberingDocx1));
                } catch (NoSuchFieldException | IllegalAccessException nsfex) {
                }
            }         // create a paragraph in docx2
            XWPFParagraph paragraphDocx2 = docx2.createParagraph();
//XWPFRun run = paragraphDocx2.createRun();



          // this will copy all paragraphs from paragraphListDocx1 to docx2
            for (XWPFParagraph paragraphDocx1 : paragraphListDocx1) {
                paragraphDocx2 = docx2.createParagraph();
                docx2.setParagraph(paragraphDocx1, docx2.getPosOfParagraph(paragraphDocx2));
            }         paragraphDocx2 = docx2.createParagraph();
            run = paragraphDocx2.createRun();
                      
 
            docx2.write(out);
            //docx2.close();   
            System.out.println(n+" written successfully");
        try
        {
          String p=file.getAbsolutePath();
      System.out.println(p);
        String q = "update patient set Report5='"+a+"' where Patients_Name='"+n+"'" ;
                 n=model.getValueAt(selectedRowIndex, 1).toString();  
              Class.forName("com.mysql.cj.jdbc.Driver");
       // Connection con=DriverManager.getConnection(url,Username,password);
        PreparedStatement st=con.prepareStatement(q);
        
         
    
            
         boolean rs1=st.execute();
   if((rs1==false))
           {
       JOptionPane.showMessageDialog(null,"File Saved");
       
            
   }
   else
   {
       JOptionPane.showMessageDialog(null,"File Not Saved");
   } 
     
        }catch(HeadlessException | ClassNotFoundException | SQLException e)
                {
                    JOptionPane.showMessageDialog(null,e);
                }
                   if(!Desktop.isDesktopSupported())//check if Desktop is supported by Platform or not
            {
               JOptionPane.showMessageDialog(null,"Desktop is not supported");
                return;
            }
                  
            Desktop desktop = Desktop.getDesktop();
            if(file.exists())
            {//checks file exists or not
                desktop.open(file);              //opens the specified file
            }
        } catch(IOException e)
        {
        }  
 finally {
            try {
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(Reporting.class.getName()).log(Level.SEVERE, null, ex);
            }
     
        }   
          }
           
          else if (ab7==null)
          {
                       File file=new File("D://Reports//"+n1+".docx");
  String a="D://Reports//"+n1+".docx";
  System.out.println(a);
        
        FileOutputStream out = null;
        try {
          String name=  cb2.getSelectedItem().toString();
            XWPFDocument docx1 = new XWPFDocument(new  FileInputStream("D:\\Report Format\\"+name+".docx"));
            XWPFNumbering numberingDocx1 = docx1.getNumbering();
            
// get paragraphListDocx1 as a List of all paragraphs from docx1
            List<XWPFParagraph> paragraphListDocx1 =  docx1.getParagraphs();
            // get the numbering.xml from docx1 to docx2
            // this is needed if some of the paragraphs from docx1 are numbered
            XWPFDocument docx2= new XWPFDocument();
            
out = new FileOutputStream(new File("D:\\Reports\\"+n1+".docx"));
XWPFParagraph p1 = docx2.createParagraph();
XWPFRun run = p1.createRun();
run.setBold(true);
run.setText("Date:- "+model.getValueAt(selectedRowIndex, 0).toString()+"     \n");
run.setBold(true);
run.setText("Name:- "+model.getValueAt(selectedRowIndex, 1).toString()+"      ");
run.setBold(true);
run.setText("Age:- "+model.getValueAt(selectedRowIndex, 2).toString()+"       ");
run.setBold(true);
run.setText("Gender:- "+model.getValueAt(selectedRowIndex, 4).toString()+"      ");
run.setBold(true);
run.setText("Referred By:- "+model.getValueAt(selectedRowIndex, 6).toString()+"  ");

if (numberingDocx1 != null) {
                XWPFNumbering numberingDocx2 = docx2.createNumbering();
                try {
                    Field f = numberingDocx1.getClass().getDeclaredField("ctNumbering");
                    f.setAccessible(true);
                    numberingDocx2.setNumbering((CTNumbering)f.get(numberingDocx1));
                } catch (NoSuchFieldException | IllegalAccessException nsfex) {
                }
            }         // create a paragraph in docx2
            XWPFParagraph paragraphDocx2 = docx2.createParagraph();
//XWPFRun run = paragraphDocx2.createRun();



          // this will copy all paragraphs from paragraphListDocx1 to docx2
            for (XWPFParagraph paragraphDocx1 : paragraphListDocx1) {
                paragraphDocx2 = docx2.createParagraph();
                docx2.setParagraph(paragraphDocx1, docx2.getPosOfParagraph(paragraphDocx2));
            }         paragraphDocx2 = docx2.createParagraph();
            run = paragraphDocx2.createRun();
                      
 
            docx2.write(out);
            //docx2.close();   
            System.out.println(n+" written successfully");
        try
        {
          String p=file.getAbsolutePath();
      System.out.println(p);
        String q = "update patient set Report6='"+a+"' where Patients_Name='"+n+"'" ;
                 n=model.getValueAt(selectedRowIndex, 1).toString();  
              Class.forName("com.mysql.cj.jdbc.Driver");
       // Connection con=DriverManager.getConnection(url,Username,password);
        PreparedStatement st=con.prepareStatement(q);
        
         
    
            
         boolean rs1=st.execute();
   if((rs1==false))
           {
       JOptionPane.showMessageDialog(null,"File Saved");
       
            
   }
   else
   {
       JOptionPane.showMessageDialog(null,"File Not Saved");
   } 
     
        }catch(HeadlessException | ClassNotFoundException | SQLException e)
                {
                    JOptionPane.showMessageDialog(null,e);
                }
                   if(!Desktop.isDesktopSupported())//check if Desktop is supported by Platform or not
            {
               JOptionPane.showMessageDialog(null,"Desktop is not supported");
                return;
            }
                  
            Desktop desktop = Desktop.getDesktop();
            if(file.exists())
            {//checks file exists or not
                desktop.open(file);              //opens the specified file
            }
        } catch(IOException e)
        {
        }  
 finally {
            try {
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(Reporting.class.getName()).log(Level.SEVERE, null, ex);
            }
     
        }   
          }
           
          else if (ab8==null)
          {
                      File file=new File("D://Reports//"+n1+".docx");
  String a="D://Reports//"+n1+".docx";
  System.out.println(a);
        
        FileOutputStream out = null;
        try {
          String name=  cb2.getSelectedItem().toString();
            XWPFDocument docx1 = new XWPFDocument(new  FileInputStream("D:\\Report Format\\"+name+".docx"));
            XWPFNumbering numberingDocx1 = docx1.getNumbering();
            
// get paragraphListDocx1 as a List of all paragraphs from docx1
            List<XWPFParagraph> paragraphListDocx1 =  docx1.getParagraphs();
            // get the numbering.xml from docx1 to docx2
            // this is needed if some of the paragraphs from docx1 are numbered
            XWPFDocument docx2= new XWPFDocument();
            
out = new FileOutputStream(new File("D:\\Reports\\"+n1+".docx"));
XWPFParagraph p1 = docx2.createParagraph();
XWPFRun run = p1.createRun();
run.setBold(true);
run.setText("Date:- "+model.getValueAt(selectedRowIndex, 0).toString()+"     \n");
run.setBold(true);
run.setText("Name:- "+model.getValueAt(selectedRowIndex, 1).toString()+"      ");
run.setBold(true);
run.setText("Age:- "+model.getValueAt(selectedRowIndex, 2).toString()+"       ");
run.setBold(true);
run.setText("Gender:- "+model.getValueAt(selectedRowIndex, 4).toString()+"      ");
run.setBold(true);
run.setText("Referred By:- "+model.getValueAt(selectedRowIndex, 6).toString()+"  ");

if (numberingDocx1 != null) {
                XWPFNumbering numberingDocx2 = docx2.createNumbering();
                try {
                    Field f = numberingDocx1.getClass().getDeclaredField("ctNumbering");
                    f.setAccessible(true);
                    numberingDocx2.setNumbering((CTNumbering)f.get(numberingDocx1));
                } catch (NoSuchFieldException | IllegalAccessException nsfex) {
                }
            }         // create a paragraph in docx2
            XWPFParagraph paragraphDocx2 = docx2.createParagraph();
//XWPFRun run = paragraphDocx2.createRun();



          // this will copy all paragraphs from paragraphListDocx1 to docx2
            for (XWPFParagraph paragraphDocx1 : paragraphListDocx1) {
                paragraphDocx2 = docx2.createParagraph();
                docx2.setParagraph(paragraphDocx1, docx2.getPosOfParagraph(paragraphDocx2));
            }         paragraphDocx2 = docx2.createParagraph();
            run = paragraphDocx2.createRun();
                      
 
            docx2.write(out);
            //docx2.close();   
            System.out.println(n+" written successfully");
        try
        {
          String p=file.getAbsolutePath();
      System.out.println(p);
        String q = "update patient set Report7='"+a+"' where Patients_Name='"+n+"'" ;
                 n=model.getValueAt(selectedRowIndex, 1).toString();  
              Class.forName("com.mysql.cj.jdbc.Driver");
       // Connection con=DriverManager.getConnection(url,Username,password);
        PreparedStatement st=con.prepareStatement(q);
        
         
    
            
         boolean rs1=st.execute();
   if((rs1==false))
           {
       JOptionPane.showMessageDialog(null,"File Saved");
       
            
   }
   else
   {
       JOptionPane.showMessageDialog(null,"File Not Saved");
   } 
     
        }catch(HeadlessException | ClassNotFoundException | SQLException e)
                {
                    JOptionPane.showMessageDialog(null,e);
                }
                   if(!Desktop.isDesktopSupported())//check if Desktop is supported by Platform or not
            {
               JOptionPane.showMessageDialog(null,"Desktop is not supported");
                return;
            }
                  
            Desktop desktop = Desktop.getDesktop();
            if(file.exists())
            {//checks file exists or not
                desktop.open(file);              //opens the specified file
            }
        } catch(IOException e)
        {
        }  
 finally {
            try {
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(Reporting.class.getName()).log(Level.SEVERE, null, ex);
            }
     
        }    
          }
           
          else if (ab9==null)
          {
                       File file=new File("D://Reports//"+n1+".docx");
  String a="D://Reports//"+n1+".docx";
  System.out.println(a);
        
        FileOutputStream out = null;
        try {
          String name=  cb2.getSelectedItem().toString();
            XWPFDocument docx1 = new XWPFDocument(new  FileInputStream("D:\\Report Format\\"+name+".docx"));
            XWPFNumbering numberingDocx1 = docx1.getNumbering();
            
// get paragraphListDocx1 as a List of all paragraphs from docx1
            List<XWPFParagraph> paragraphListDocx1 =  docx1.getParagraphs();
            // get the numbering.xml from docx1 to docx2
            // this is needed if some of the paragraphs from docx1 are numbered
            XWPFDocument docx2= new XWPFDocument();
            
out = new FileOutputStream(new File("D:\\Reports\\"+n1+".docx"));
XWPFParagraph p1 = docx2.createParagraph();
XWPFRun run = p1.createRun();
run.setBold(true);
run.setText("Date:- "+model.getValueAt(selectedRowIndex, 0).toString()+"     \n");
run.setBold(true);
run.setText("Name:- "+model.getValueAt(selectedRowIndex, 1).toString()+"      ");
run.setBold(true);
run.setText("Age:- "+model.getValueAt(selectedRowIndex, 2).toString()+"       ");
run.setBold(true);
run.setText("Gender:- "+model.getValueAt(selectedRowIndex, 4).toString()+"      ");
run.setBold(true);
run.setText("Referred By:- "+model.getValueAt(selectedRowIndex, 6).toString()+"  ");

if (numberingDocx1 != null) {
                XWPFNumbering numberingDocx2 = docx2.createNumbering();
                try {
                    Field f = numberingDocx1.getClass().getDeclaredField("ctNumbering");
                    f.setAccessible(true);
                    numberingDocx2.setNumbering((CTNumbering)f.get(numberingDocx1));
                } catch (NoSuchFieldException | IllegalAccessException nsfex) {
                }
            }         // create a paragraph in docx2
            XWPFParagraph paragraphDocx2 = docx2.createParagraph();
//XWPFRun run = paragraphDocx2.createRun();



          // this will copy all paragraphs from paragraphListDocx1 to docx2
            for (XWPFParagraph paragraphDocx1 : paragraphListDocx1) {
                paragraphDocx2 = docx2.createParagraph();
                docx2.setParagraph(paragraphDocx1, docx2.getPosOfParagraph(paragraphDocx2));
            }         paragraphDocx2 = docx2.createParagraph();
            run = paragraphDocx2.createRun();
                      
 
            docx2.write(out);
            //docx2.close();   
            System.out.println(n+" written successfully");
        try
        {
          String p=file.getAbsolutePath();
      System.out.println(p);
        String q = "update patient set Report8='"+a+"' where Patients_Name='"+n+"'" ;
                 n=model.getValueAt(selectedRowIndex, 1).toString();  
              Class.forName("com.mysql.cj.jdbc.Driver");
       // Connection con=DriverManager.getConnection(url,Username,password);
        PreparedStatement st=con.prepareStatement(q);
        
         
    
            
         boolean rs1=st.execute();
   if((rs1==false))
           {
       JOptionPane.showMessageDialog(null,"File Saved");
       
            
   }
   else
   {
       JOptionPane.showMessageDialog(null,"File Not Saved");
   } 
     
        }catch(HeadlessException | ClassNotFoundException | SQLException e)
                {
                    JOptionPane.showMessageDialog(null,e);
                }
                   if(!Desktop.isDesktopSupported())//check if Desktop is supported by Platform or not
            {
               JOptionPane.showMessageDialog(null,"Desktop is not supported");
                return;
            }
                  
            Desktop desktop = Desktop.getDesktop();
            if(file.exists())
            {//checks file exists or not
                desktop.open(file);              //opens the specified file
            }
        } catch(IOException e)
        {
        }  
 finally {
            try {
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(Reporting.class.getName()).log(Level.SEVERE, null, ex);
            }
     
        }   
          }
           
          else if (ab10==null)
          {
                     File file=new File("D://Reports//"+n1+".docx");
  String a="D://Reports//"+n1+".docx";
  System.out.println(a);
        
        FileOutputStream out = null;
        try {
          String name=  cb2.getSelectedItem().toString();
            XWPFDocument docx1 = new XWPFDocument(new  FileInputStream("D:\\Report Format\\"+name+".docx"));
            XWPFNumbering numberingDocx1 = docx1.getNumbering();
            
// get paragraphListDocx1 as a List of all paragraphs from docx1
            List<XWPFParagraph> paragraphListDocx1 =  docx1.getParagraphs();
            // get the numbering.xml from docx1 to docx2
            // this is needed if some of the paragraphs from docx1 are numbered
            XWPFDocument docx2= new XWPFDocument();
            
out = new FileOutputStream(new File("D:\\Reports\\"+n1+".docx"));
XWPFParagraph p1 = docx2.createParagraph();
XWPFRun run = p1.createRun();
run.setBold(true);
run.setText("Date:- "+model.getValueAt(selectedRowIndex, 0).toString()+"     \n");
run.setBold(true);
run.setText("Name:- "+model.getValueAt(selectedRowIndex, 1).toString()+"      ");
run.setBold(true);
run.setText("Age:- "+model.getValueAt(selectedRowIndex, 2).toString()+"       ");
run.setBold(true);
run.setText("Gender:- "+model.getValueAt(selectedRowIndex, 4).toString()+"      ");
run.setBold(true);
run.setText("Referred By:- "+model.getValueAt(selectedRowIndex, 6).toString()+"  ");

if (numberingDocx1 != null) {
                XWPFNumbering numberingDocx2 = docx2.createNumbering();
                try {
                    Field f = numberingDocx1.getClass().getDeclaredField("ctNumbering");
                    f.setAccessible(true);
                    numberingDocx2.setNumbering((CTNumbering)f.get(numberingDocx1));
                } catch (NoSuchFieldException | IllegalAccessException nsfex) {
                }
            }         // create a paragraph in docx2
            XWPFParagraph paragraphDocx2 = docx2.createParagraph();
//XWPFRun run = paragraphDocx2.createRun();



          // this will copy all paragraphs from paragraphListDocx1 to docx2
            for (XWPFParagraph paragraphDocx1 : paragraphListDocx1) {
                paragraphDocx2 = docx2.createParagraph();
                docx2.setParagraph(paragraphDocx1, docx2.getPosOfParagraph(paragraphDocx2));
            }         paragraphDocx2 = docx2.createParagraph();
            run = paragraphDocx2.createRun();
                      
 
            docx2.write(out);
            //docx2.close();   
            System.out.println(n+" written successfully");
        try
        {
          String p=file.getAbsolutePath();
      System.out.println(p);
        String q = "update patient set Report9='"+a+"' where Patients_Name='"+n+"'" ;
                 n=model.getValueAt(selectedRowIndex, 1).toString();  
              Class.forName("com.mysql.cj.jdbc.Driver");
       // Connection con=DriverManager.getConnection(url,Username,password);
        PreparedStatement st=con.prepareStatement(q);
        
         
    
            
         boolean rs1=st.execute();
   if((rs1==false))
           {
       JOptionPane.showMessageDialog(null,"File Saved");
       
            
   }
   else
   {
       JOptionPane.showMessageDialog(null,"File Not Saved");
   } 
     
        }catch(HeadlessException | ClassNotFoundException | SQLException e)
                {
                    JOptionPane.showMessageDialog(null,e);
                }
                   if(!Desktop.isDesktopSupported())//check if Desktop is supported by Platform or not
            {
               JOptionPane.showMessageDialog(null,"Desktop is not supported");
                return;
            }
                  
            Desktop desktop = Desktop.getDesktop();
            if(file.exists())
            {//checks file exists or not
                desktop.open(file);              //opens the specified file
            }
        } catch(IOException e)
        {
        }  
 finally {
            try {
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(Reporting.class.getName()).log(Level.SEVERE, null, ex);
            }
     
        }     
          }
           
          else if (ab11==null)
          {
                         File file=new File("D://Reports//"+n1+".docx");
  String a="D://Reports//"+n1+".docx";
  System.out.println(a);
        
        FileOutputStream out = null;
        try {
          String name=  cb2.getSelectedItem().toString();
            XWPFDocument docx1 = new XWPFDocument(new  FileInputStream("D:\\Report Format\\"+name+".docx"));
            XWPFNumbering numberingDocx1 = docx1.getNumbering();
            
// get paragraphListDocx1 as a List of all paragraphs from docx1
            List<XWPFParagraph> paragraphListDocx1 =  docx1.getParagraphs();
            // get the numbering.xml from docx1 to docx2
            // this is needed if some of the paragraphs from docx1 are numbered
            XWPFDocument docx2= new XWPFDocument();
            
out = new FileOutputStream(new File("D:\\Reports\\"+n1+".docx"));
XWPFParagraph p1 = docx2.createParagraph();
XWPFRun run = p1.createRun();
run.setBold(true);
run.setText("Date:- "+model.getValueAt(selectedRowIndex, 0).toString()+"     \n");
run.setBold(true);
run.setText("Name:- "+model.getValueAt(selectedRowIndex, 1).toString()+"      ");
run.setBold(true);
run.setText("Age:- "+model.getValueAt(selectedRowIndex, 2).toString()+"       ");
run.setBold(true);
run.setText("Gender:- "+model.getValueAt(selectedRowIndex, 4).toString()+"      ");
run.setBold(true);
run.setText("Referred By:- "+model.getValueAt(selectedRowIndex, 6).toString()+"  ");

if (numberingDocx1 != null) {
                XWPFNumbering numberingDocx2 = docx2.createNumbering();
                try {
                    Field f = numberingDocx1.getClass().getDeclaredField("ctNumbering");
                    f.setAccessible(true);
                    numberingDocx2.setNumbering((CTNumbering)f.get(numberingDocx1));
                } catch (NoSuchFieldException | IllegalAccessException nsfex) {
                }
            }         // create a paragraph in docx2
            XWPFParagraph paragraphDocx2 = docx2.createParagraph();
//XWPFRun run = paragraphDocx2.createRun();



          // this will copy all paragraphs from paragraphListDocx1 to docx2
            for (XWPFParagraph paragraphDocx1 : paragraphListDocx1) {
                paragraphDocx2 = docx2.createParagraph();
                docx2.setParagraph(paragraphDocx1, docx2.getPosOfParagraph(paragraphDocx2));
            }         paragraphDocx2 = docx2.createParagraph();
            run = paragraphDocx2.createRun();
                      
 
            docx2.write(out);
            //docx2.close();   
            System.out.println(n+" written successfully");
        try
        {
          String p=file.getAbsolutePath();
      System.out.println(p);
        String q = "update patient set Report10='"+a+"' where Patients_Name='"+n+"'" ;
                 n=model.getValueAt(selectedRowIndex, 1).toString();  
              Class.forName("com.mysql.cj.jdbc.Driver");
       // Connection con=DriverManager.getConnection(url,Username,password);
        PreparedStatement st=con.prepareStatement(q);
        
         
    
            
         boolean rs1=st.execute();
   if((rs1==false))
           {
       JOptionPane.showMessageDialog(null,"File Saved");
       
            
   }
   else
   {
       JOptionPane.showMessageDialog(null,"File Not Saved");
   } 
     
        }catch(HeadlessException | ClassNotFoundException | SQLException e)
                {
                    JOptionPane.showMessageDialog(null,e);
                }
                   if(!Desktop.isDesktopSupported())//check if Desktop is supported by Platform or not
            {
               JOptionPane.showMessageDialog(null,"Desktop is not supported");
                return;
            }
                  
            Desktop desktop = Desktop.getDesktop();
            if(file.exists())
            {//checks file exists or not
                desktop.open(file);              //opens the specified file
            }
        } catch(IOException e)
        {
        }  
 finally {
            try {
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(Reporting.class.getName()).log(Level.SEVERE, null, ex);
            }
     
        } 
          }
           
  }catch(HeadlessException | ClassNotFoundException | IllegalArgumentException | SecurityException | SQLException e)
  {
      JOptionPane.showMessageDialog(null, e);
  }
         // TODO add your handling code here:

    */
}
