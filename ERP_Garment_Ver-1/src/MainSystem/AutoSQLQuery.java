/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainSystem;

import java.sql.ResultSet;
import javax.swing.JComponent;

/**
 *
 * @author Dinushka
 */
public class AutoSQLQuery  {
    
    public static DB_Connect db_con;
    
    public AutoSQLQuery() {
       db_con= new DB_Connect();
       db_con.connect(); 
    }
    
    
     // used to return value from a search query
  // returns all values
    public ResultSet executeAutoViewAll(String TableName)
    {
        return db_con.executeQuery("SELECT * FROM garmentsystem."+TableName+";");
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
            
        return db_con.executeQuery(ArraySelect);        
    }
    
  // used to return value from a search query with a key
  // returns all values 
    public ResultSet executeAutoSearchAll(String TableName,String KeyName,String Key)
    {
        String ArraySelect="";
                    
        ArraySelect="SELECT * FROM garmentsystem."+TableName+"`where "+KeyName+" = '"+Key+"'";
        
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
        ArraySelect="select "+ArraySelect+" FROM `garmentsystem`.`"+TableName+"`where "+KeyName+" = '"+Key+"'";
        
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
        ArraySelect="INSERT INTO `garmentsystem`.`"+TableName+"`("+ArraySelect11+") VALUES ("+ArraySelect22+")";   
        return db_con.execute(ArraySelect);  
    }
    
    public boolean executeAutoADD(JComponent SQL_String[],String TableName)
    {
        int length=SQL_String.length;
        String ArraySelect="";
        String ArraySelect1[]= new String[length];
        String ArraySelect2[]=new String[length];
        String ArraySelect11="";
        String ArraySelect22="";
        int count=0;
            
        while(count<length){
            
            String tem=SQL_String[count].toString();
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
        return db_con.execute(ArraySelect);  
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
        return db_con.execute(ArraySelect);   
    }
    
    public boolean executeAutoDelete(String TableName,String KeyName,String Key)
    {
        String ArraySelect="DELETE FROM `garmentsystem`.`"+TableName+"` WHERE "+KeyName+" = "+Key;   
        return db_con.execute(ArraySelect); 
    }

    
    
}
