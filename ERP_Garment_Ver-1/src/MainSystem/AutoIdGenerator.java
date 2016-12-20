package MainSystem;


import java.util.Date;


/**
 *This class is used to generate unique ID numbers  
 * @author Dinushka- email-Dinushka95@yahoo.com
 */
public class AutoIdGenerator {


Date now;
public String generate (String UserID,String Prefix){
    now=new Date();     
    int hc=now.hashCode();
    String hhc=Integer.toHexString(hc);
    String ff=UserID+Prefix+hhc;
   // System.out.println(ff);
    return ff;
}
    
}
