//This class is able to be used in any project or with another class to connect with
//MySQL database.
//Author -Dinushka95@yahoo.com
//11/12/2016
package MainSystem;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DB_Connect {
    //Thses varriables are the main varriables ued in this and other class that's why 
    //it is public and Static because i  wanted it to be in globle level
    public static Connection DB_connection =null;
    public static PreparedStatement DB_PreparedStatement =null;
    public static ResultSet DB_ResultSet =null;
    
    //Default Contructor will use above valuse 
    public static String DB_Host= "jdbc:mysql://itp2016ver1fdgd.cht0bvbob1wj.us-west-2.rds.amazonaws.com:3306/garmentsystem";       // "jdbc:mysql://localhost:3306/garmentsystem"; 
    public static String username="rosliit216v";
    public static String password="JS9sd56dss5";
   
    //Default Contructor 
    public DB_Connect() {
    
    }
    
    // this constructor can be used to change your connection settings
    public DB_Connect(String Database_URL,int Port,String DatabaseName,String Username,String Password) {
        DB_Host="jdbc:mysql://"+Database_URL+":"+Port+"/"+DatabaseName+"";
        username=Username;
        password=Password;
    
    }
    
// used to start a connection with the above selected settings
    public void connect()
   {
   try
    {  
        Class.forName("com.mysql.jdbc.Driver");
        DB_connection=(Connection) DriverManager.getConnection(DB_Host,username,password);
        System.out.println("Succesfully connected to "+DB_Host);
    }
   catch(Exception e)
    {
        System.out.println(e);
    }
   } 
    
// Close the DB connection
    public  void close()
    {
        try {
            DB_connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connect.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
   
// this method is used to excute SQL queryies without a return value
// this method will return a boolen value if it is sucessfull and a message in the console 
    public  boolean execute(String SQL_String){
       
        DB_ResultSet =null;
        //System.out.println(SQL_String);
        try {
            DB_PreparedStatement =DB_connection.prepareStatement(SQL_String);
            DB_PreparedStatement.execute();
            System.out.println("***Successfull***Excuted "+SQL_String);
            
            return true;
       
        } catch (SQLException ex) {
            System.out.println("***Fail***Excuted "+SQL_String);
            Logger.getLogger(DB_Connect.class.getName()).log(Level.SEVERE, null, ex);
            
            return false;
        }
    }
   
// this method is used to excute SQL queryies with a return value
// this method will return a Resultset  if it is sucessfull Or NULL value if it fails and a message in the console 
    public ResultSet executeQuery(String SQL_String)
    {   
       DB_ResultSet =null;
       System.out.println(SQL_String);
        try {
            DB_PreparedStatement =DB_connection.prepareStatement(SQL_String);
            DB_ResultSet=DB_PreparedStatement.executeQuery();
            System.out.println("***Successfull***Excuted "+SQL_String);
            
            return DB_ResultSet;
            
        } catch (SQLException ex) {
            System.out.println("***Fail***Excuted "+SQL_String);
            Logger.getLogger(DB_Connect.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
            
    }
  
  // used to return value from a search query
  // returns all values
    public ResultSet executeAutoViewAll(String TableName)
    {
        return executeQuery("SELECT * FROM garmentsystem."+TableName+";");
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
        ArraySelect="select "+ArraySelect+" FROM `garmentsystem`.`"+TableName+"`";
            
        return executeQuery(ArraySelect);        
    }
    
  // used to return value from a search query with a key
  // returns all values 
    public ResultSet executeAutoSearchAll(String TableName,String KeyName,String Key)
    {
        String ArraySelect="";
                    
        ArraySelect="SELECT * FROM garmentsystem."+TableName+"`where "+KeyName+" = '"+Key+"'";
        
        return executeQuery(ArraySelect);
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
        ArraySelect="select "+ArraySelect+" FROM `garmentsystem`.`"+TableName+"`where "+KeyName+" = '"+Key+"'";
        
        return executeQuery(ArraySelect);
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
        ArraySelect="INSERT INTO `garmentsystem`.`"+TableName+"`("+ArraySelect11+") VALUES ("+ArraySelect22+")";   
        return execute(ArraySelect);  
    }
   
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
        ArraySelect="UPDATE `garmentsystem`.`"+TableName+"` SET "+ArraySelect11+" WHERE "+KeyName+" = "+Key;   
        return execute(ArraySelect);   
    }
    
    public boolean executeAutoDelete(String TableName,String KeyName,String Key)
    {
        String ArraySelect="DELETE FROM `garmentsystem`.`"+TableName+"` WHERE "+KeyName+" = "+Key;   
        return execute(ArraySelect); 
    }

}
