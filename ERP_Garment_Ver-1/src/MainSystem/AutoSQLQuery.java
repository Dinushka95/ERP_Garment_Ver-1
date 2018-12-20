/*
This class was developed to eliminate the need to type SQL statements, because even a small error in typeing can cause a error.
it was written to mySQL. 
you can ADD,update(edit),delete and even files can be added such as images
###VERY IMPORTANT #######This class needs 'AutoDBConnect' class to work properly 
Author -
3/3/2017
*/

package MainSystem;

import static MainSystem.AutoDB_Connect.DB_PreparedStatement;
import static MainSystem.AutoDB_Connect.DB_connection;
import static MainSystem.SystemConfig.DB_Name;
import static MainSystem.SystemConfig.DB_Password;
import static MainSystem.SystemConfig.DB_Port;
import static MainSystem.SystemConfig.DB_Username;
import Sales.SalesDesignInquiry;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import static MainSystem.SystemConfig.DB_Urls;

/**
 *
 * @author Dinushka
 */
//###VERY IMPORTANT #######This class needs 'AutoDBConnect' class to work properly 
public class AutoSQLQuery  extends AutoDB_Connect{
    
    private static AutoDB_Connect db_con;
    
    
    public AutoSQLQuery() {
       db_con= new  AutoDB_Connect(DB_Urls,Integer.valueOf(DB_Port),DB_Name,DB_Username,DB_Password);
       db_con.connect(); 
    }
    
    
    // used to return value from a search query
    // returns all values
    public ResultSet executeAutoViewAll(String TableName)
    {
        return db_con.executeQuery("SELECT * FROM "+DB_Name+"."+TableName+";");
    }
  
    // used to return value from a search query
    // returns only selected values
    public ResultSet executeAutoViewSelected(String SQL_String[],String TableName)
    {
        int length=SQL_String.length;
        String ArraySelect="";
        int count=0;
            
        while(count<length){

            if(ArraySelect.equals(""))
                {ArraySelect= ArraySelect+"`"+SQL_String[count]+"`";}
            else
                {ArraySelect= ArraySelect+",`"+SQL_String[count]+"`";}
            count++;
        }
        ArraySelect="select "+ArraySelect+" FROM `"+DB_Name+"`.`"+TableName+"`";
            
        return db_con.executeQuery(ArraySelect);        
    }
    
    // used to return value from a search query with a key
    // returns all values 
    public ResultSet executeAutoSearchAll(String TableName,String KeyName,String Key)
    {
        String ArraySelect="";
                    
        ArraySelect="SELECT * FROM "+DB_Name+"."+TableName+" where "+KeyName+" = '"+Key+"'";
        
        return db_con.executeQuery(ArraySelect);
    }
  
    // used to return value from a search query with a key
    // returns all values
    public ResultSet executeAutoSearchSelected(String SQL_String[],String TableName,String KeyName,String Key)
    {
        int length=SQL_String.length;
        String ArraySelect="";
        int count=0;
            
        while(count<length){

            if(ArraySelect.equals(""))
                {ArraySelect= ArraySelect+"`"+SQL_String[count]+"`";}
            else
                {ArraySelect= ArraySelect+",`"+SQL_String[count]+"`";}
            count++;
        }
        ArraySelect="select "+ArraySelect+" FROM `"+DB_Name+"`.`"+TableName+"`where "+KeyName+" = '"+Key+"'";
        
        return db_con.executeQuery(ArraySelect);
    }
   
    //auto search data ranges
    public ResultSet executeAutoSearchDateRange(String TableName,String KeyName,String DateFrom,String DateTo)
    {
            String ArraySelect="";
            ArraySelect="SELECT  * FROM  "+DB_Name+"."+TableName+" WHERE  "+KeyName+" >= '"+DateFrom+"' AND "+KeyName+" <= '"+DateTo+"'" ;
        return db_con.executeQuery(ArraySelect);
    }
    
    //auto search data ranges
    public ResultSet executeAutoSearchDate(String TableName,String KeyName,String Date)
    {
            String ArraySelect="";
            ArraySelect="SELECT  * FROM  "+DB_Name+"."+TableName+" WHERE  "+KeyName+" = '"+Date+"'" ;
        return db_con.executeQuery(ArraySelect);
    }
        
    // used to ADD values 
    public boolean executeAutoADD(String SQL_String[],String TableName)
    {
        int length=SQL_String.length;
        String ArraySelect="";
        String ArraySelect1[]= new String[length];
        String ArraySelect2[]=new String[length];
        String ArraySelect11="";
        String ArraySelect22="";
        int count=0;
            
        while(count<length){
            
            String tem=SQL_String[count];
            int x=tem.indexOf("=");
            ArraySelect1[count]=tem.substring(0,x);
            ArraySelect2[count]=tem.substring(x+1);
            
          // System.out.println(ArraySelect1);
           // System.out.println(tem.substring(x+1));

            count++;
            }

        count=0;
            
        while(count<length){
     
            if(ArraySelect11.equals(""))
                {ArraySelect11= ArraySelect11+"`"+ArraySelect1[count]+"`";}
            else
                {ArraySelect11= ArraySelect11+",`"+ArraySelect1[count]+"`";}
            
            count++;
        }
        
        count=0; 
        while(count<length){
     
            if(ArraySelect22.equals(""))
                {ArraySelect22= ArraySelect22+"'"+ArraySelect2[count]+"'";}
            else
                {ArraySelect22= ArraySelect22+",'"+ArraySelect2[count]+"'";}
            
            count++;
        }
        
        //System.out.println(ArraySelect);
        ArraySelect="INSERT INTO `"+DB_Name+"`.`"+TableName+"`("+ArraySelect11+") VALUES ("+ArraySelect22+")";   
        return db_con.execute(ArraySelect);  
    }
    
   
    // this method is used to edit values 
    public boolean executeAutoEdit(String SQL_String[],String TableName,String KeyName,String Key)
    {
    
        int length=SQL_String.length;
        String ArraySelect="";
        String ArraySelect1[]= new String[length];
        String ArraySelect2[]=new String[length];
        String ArraySelect11="";
        int count=0;
            
        while(count<length){
            
            String tem=SQL_String[count];
            int x=tem.indexOf("=");
            ArraySelect1[count]=tem.substring(0,x);
            ArraySelect2[count]=tem.substring(x+1);
            
            count++;
            }

        count=0;
            
        while(count<length){
     
            if(ArraySelect11.equals(""))
                {ArraySelect11= ArraySelect11+"`"+ArraySelect1[count]+"` ='"+ArraySelect2[count]+"'";}
            else
                {ArraySelect11= ArraySelect11+",`"+ArraySelect1[count]+"` ='"+ArraySelect2[count]+"'";}
            count++;
        }
        //System.out.println(ArraySelect);
        ArraySelect="UPDATE `"+DB_Name+"`.`"+TableName+"` SET "+ArraySelect11+" WHERE "+KeyName+" = '"+Key+"'";   
        return db_con.execute(ArraySelect);   
    }
    
    // used to delete values from the table
    public boolean executeAutoDelete(String TableName,String KeyName,String Key)
    {
        String ArraySelect="DELETE FROM `"+DB_Name+"`.`"+TableName+"` WHERE "+KeyName+" = '"+Key+"'";   
        return db_con.execute(ArraySelect); 
    }
    
    // used to add Images into the DB (.jpe)
    public boolean executeAutoAddImage(String FileNameId,File ImageFile)
    {
        
        FileInputStream filedata = null;
        try {
            filedata = new FileInputStream(ImageFile);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AutoSQLQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            DB_PreparedStatement =DB_connection.prepareStatement("insert into image_Table(img_title, img_data) values(?,?)");
            DB_PreparedStatement.setString(1,FileNameId);
            DB_PreparedStatement.setBinaryStream(2, (InputStream) filedata, (int)(ImageFile.length()));
            DB_PreparedStatement.executeUpdate();
         } 
        catch (SQLException ex) 
        {
            Logger.getLogger(SalesDesignInquiry.class.getName()).log(Level.SEVERE, null, ex);
        return false;
        }
        return true;
    } 
    
    //used to retrive images from the DB
    public ImageIcon executeAutoGetImage(String FileNameId)
    {       
    ImageIcon icon = null;
    AutoDB_Connect.DB_ResultSet = db_con.executeQuery("SELECT `image_Table`.`img_data`\n" +"FROM `"+DB_Name+"`.`image_Table` where `image_Table`.`img_title` ='"+FileNameId+"';");
    try {
        AutoDB_Connect.DB_ResultSet.next();
        Blob imageBlob=AutoDB_Connect.DB_ResultSet.getBlob("img_data");
        InputStream binaryStream = imageBlob.getBinaryStream(1, imageBlob.length()); 
        Image myImage;
            try (ByteArrayOutputStream output = new ByteArrayOutputStream()) {
                int a1 = binaryStream.read();
                while (a1 >= 0){
                    output.write((char) a1);
                    a1 = binaryStream.read();
                }       myImage = Toolkit.getDefaultToolkit().createImage(output.toByteArray());
            }
        icon = new ImageIcon(myImage);
         
    } catch (SQLException | IOException ex) {
        Logger.getLogger(SalesDesignInquiry.class.getName()).log(Level.SEVERE, null, ex);
    }   
    return icon;   
    }
    
}
