/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xwpf.usermodel.*;

import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumbering;

import java.util.List;
import java.lang.reflect.Field;
/**
 *
 * @author Saad_BAD
 */
public class CopyWordParagraphsDocToDoc {
    
    public static void main(String[] args)throws Exception {

  XWPFDocument docx1 = new XWPFDocument(new  FileInputStream("D:\\THIGH.docx"));
  XWPFNumbering numberingDocx1 = docx1.getNumbering();
  // get paragraphListDocx1 as a List of all paragraphs from docx1
  List<XWPFParagraph> paragraphListDocx1 =  docx1.getParagraphs();

  // get the numbering.xml from docx1 to docx2
  // this is needed if some of the paragraphs from docx1 are numbered
  XWPFDocument docx2= new XWPFDocument(); 
  if (numberingDocx1 != null) {
   XWPFNumbering numberingDocx2 = docx2.createNumbering();
   try {
    Field f = numberingDocx1.getClass().getDeclaredField("ctNumbering");
    f.setAccessible(true);
    numberingDocx2.setNumbering((CTNumbering)f.get(numberingDocx1));
   } catch (NoSuchFieldException nsfex) {
   } catch (IllegalAccessException iaex) {
   }
  }

  // create a paragraph in docx2
  XWPFParagraph paragraphDocx2 = docx2.createParagraph();
  XWPFRun run = paragraphDocx2.createRun();
  run.setText("This is from Test1.docx:");

  // this will copy all paragraphs from paragraphListDocx1 to docx2
  for (XWPFParagraph paragraphDocx1 : paragraphListDocx1) { 
   paragraphDocx2 = docx2.createParagraph();
   docx2.setParagraph(paragraphDocx1, docx2.getPosOfParagraph(paragraphDocx2));            
  }

  paragraphDocx2 = docx2.createParagraph();
  run = paragraphDocx2.createRun();
  run.setText("^-- this was from Test1.docx.");


  FileOutputStream out = new FileOutputStream(new File("D:\\Test2.docx"));
  docx2.write(out); 
  //docx2.close();   

  System.out.println("Test2.docx written successfully");
 }
}

/*
 FileOutputStream out = null;
        try {
            XWPFDocument docx1 = new XWPFDocument(new  FileInputStream("D:\\THIGH.docx"));
            XWPFNumbering numberingDocx1 = docx1.getNumbering();
            // get paragraphListDocx1 as a List of all paragraphs from docx1
            List<XWPFParagraph> paragraphListDocx1 =  docx1.getParagraphs();
            // get the numbering.xml from docx1 to docx2
            // this is needed if some of the paragraphs from docx1 are numbered
            XWPFDocument docx2= new XWPFDocument();
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
            XWPFRun run = paragraphDocx2.createRun();
            run.setText("This is from Test1.docx:");
            // this will copy all paragraphs from paragraphListDocx1 to docx2
            for (XWPFParagraph paragraphDocx1 : paragraphListDocx1) {
                paragraphDocx2 = docx2.createParagraph();
                docx2.setParagraph(paragraphDocx1, docx2.getPosOfParagraph(paragraphDocx2));
            }         paragraphDocx2 = docx2.createParagraph();
            run = paragraphDocx2.createRun();
            run.setText("^-- this was from Test1.docx.");
            out = new FileOutputStream(new File("D:\\Test2.docx"));
            docx2.write(out);
            //docx2.close();   
            System.out.println("Test2.docx written successfully");
                   if(!Desktop.isDesktopSupported())//check if Desktop is supported by Platform or not
            {
                System.out.println("not supported");
                return;
            }
                   File file=new File("D://Test2.docx");
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
/*
XWPFParagraph p1 = docx2.createParagraph();
XWPFRun run = p1.createRun();
run.setBold(true);
run.setText("Date:- "+model.getValueAt(selectedRowIndex, 0).toString()+"  ");
run.setBold(true);
run.setText("Name:- "+model.getValueAt(selectedRowIndex, 1).toString()+"  ");
run.setBold(true);
run.setText("Age:- "+model.getValueAt(selectedRowIndex, 2).toString()+"  ");
run.setBold(true);
run.setText("Gender:- "+model.getValueAt(selectedRowIndex, 4).toString()+"  ");
run.setBold(true);
run.setText("Referred By:- "+model.getValueAt(selectedRowIndex, 6).toString()+"  ");

if (numberingDocx1 != null) {
                XWPFNumbering numberingDocx2 = docx2.createNumbering();
                try {
                    Field f = numberingDocx1.getClass().getDeclaredField("ctNumbering");
                    f.setAccessible(true);
                    numberingDocx2.setNumbering((CTNumbering)f.get(numberingDocx1));
XWPFTable table = docx2.createTable();

      //create first row
      XWPFTableRow tableRowOne = table.getRow(0);
      
      tableRowOne.getCell(0).setText("col one, row one");
      tableRowOne.addNewTableCell().setText("col two, row one");
      tableRowOne.addNewTableCell().setText("col three, row one");

      //create second row
      XWPFTableRow tableRowTwo = table.createRow();
      
      tableRowTwo.getCell(0).setText("col one, row two");
      tableRowTwo.getCell(1).setText("col two, row two");
      tableRowTwo.getCell(2).setText("col three, row two");

      //create third row
      XWPFTableRow tableRowThree = table.createRow();
      
      tableRowThree.getCell(0).setText("col one, row three");
      tableRowThree.getCell(1).setText("col two, row three");
      tableRowThree.getCell(2).setText("col three, row three");

      
             // create a paragraph in docx2
            XWPFParagraph paragraphDocx2 = docx2.createParagraph();
//XWPFRun run = paragraphDocx2.createRun();

          // this will copy all paragraphs from paragraphListDocx1 to docx2
            for (XWPFParagraph paragraphDocx1 : paragraphListDocx1) {
                paragraphDocx2 = docx2.createParagraph();
                System.out.println(paragraphDocx1);
                docx2.setParagraph(paragraphDocx1, docx2.getPosOfParagraph(paragraphDocx2));
            }        // paragraphDocx2 = docx2.createParagraph();
         //   run = paragraphDocx2.createRun();
 

                } catch (NoSuchFieldException | IllegalAccessException nsfex) {
                }
            }         // create a paragraph in docx2
            XWPFParagraph paragraphDocx2 = docx2.createParagraph();
//XWPFRun run = paragraphDocx2.createRun();


*/


















































