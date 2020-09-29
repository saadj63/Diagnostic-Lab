
import java.awt.Desktop;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFNumbering;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumbering;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saad_BAD
 */
public class NewClass {

public static void main(String args[]) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException
{
try {
String url = "jdbc:mysql://localhost:3306/lab";
       String Username="root";
       String password="root123";
       String t3="select Report from patient where Patient_id="+101;
       //   n=model.getValueAt(selectedRowIndex, 1).toString();  
              Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection(url,Username,password);
        PreparedStatement pst=con.prepareStatement(t3);
      ResultSet rs= pst.executeQuery();
          boolean b=rs.next();
String ab = rs.getString("Report");
  
          if (ab==null)
         
          {
         JOptionPane.showMessageDialog(null,"Empty");
          }
         else
        {
                JOptionPane.showMessageDialog(null,"NOt EMpyt");
                }
}catch(Exception e)
{
 JOptionPane.showMessageDialog(null,e);   
}
}     
          
}
