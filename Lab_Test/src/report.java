
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saad_BAD
 */
public class report {
      /*
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
   
        File file=new File("D://Reports//"+n1+".docx");
  String a="D://Reports//"+n1+".docx";
  System.out.println(a);
        
        FileOutputStream out = null;
        try {
          String name=  cb1.getSelectedItem().toString();
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
          String Username="root";
        String password="root123";
        String q = "update patient set Report='"+a+"' where Patients_Name='"+n+"'" ;
        String url = "jdbc:mysql://localhost:3306/lab";
                 n=model.getValueAt(selectedRowIndex, 1).toString();  
              Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection(url,Username,password);
        PreparedStatement pst=con.prepareStatement(q);
        
         
    
            
         boolean rs=pst.execute();
   if((rs==false))
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
 
    
 
            
             
   
   */
        

   
        
	    
	    
        
}
