package MainSystem;

// This class is used to validate textboxes using jtextfield object. you can check isEmpty , lenth check and type check
//Author- Dinushka95@yahoo.com
//Contructor needs the text object then weather u want to check the is empty check then you have to enter a number from 
// negative to postive number. for example negative -5 is less than five and 5 means  grater than five and zero means no length check
// then the final check is type check it needs a char input if a number is input it will allow numbers only if letter is input then only letters
// to accept any input use special character 
import javax.swing.JOptionPane;
import javax.swing.text.JTextComponent;

public class Validation {
    
JTextComponent Textbox1;
char TypeCheck1;


    
    public  boolean ValidationCheck(JTextComponent Textbox,boolean IsEmptyCheck,int LenghtCheck,char TypeCheck){
        Textbox1=Textbox;
        TypeCheck1=TypeCheck;
        //Check if it is empty 
        if(IsEmptyCheck){
         
            if(Textbox1.getText().equals("")){
                JOptionPane.showMessageDialog(null, Textbox1.getName()+" Empty textbox ", "InfoBox: " + "titleBar", JOptionPane.ERROR_MESSAGE);
            }
        
            else{  
                //Lenght checking
                if(LenghtCheck<0){
            
                    if(Textbox1.getText().length()>=Math.abs(LenghtCheck)){
                    JOptionPane.showMessageDialog(null, Textbox1.getName()+" = textbox lenth error;should be < "+Math.abs(LenghtCheck), "InfoBox: " + "titleBar",JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                    if(typecheck()){return true;}
                    }
                }
                else if (LenghtCheck>0){
                    if(Textbox1.getText().length()<=Math.abs(LenghtCheck)){
                    JOptionPane.showMessageDialog(null, Textbox1.getName()+" = textbox lenth error;should be > "+Math.abs(LenghtCheck), "InfoBox: " + "titleBar",JOptionPane.ERROR_MESSAGE);
                    }
                    else {
                   if(typecheck()){return true;}
                   
                    }
                }else {
                if(typecheck()){return true;}
                }
 
            }
    
        }
        else {
        return true;
        }

    return false;
        
    } 
    

  private boolean typecheck(){
        //Type check if it's a number
        if(Character.isDigit(TypeCheck1)){
            boolean l=false;
            String tem=Textbox1.getText();
            int count=0;
            while(count<tem.length()){
            if(Character.isDigit(tem.charAt(count))){
                // do nothing
                count++;
            }
            else{
                l=true;
                count++;
            }
            }
            if(l){
            JOptionPane.showMessageDialog(null, "type error- only digit= textbox "+Textbox1.getName(), "InfoBox: " + "titleBar",JOptionPane.ERROR_MESSAGE);
            return false;
            }
        }
        
         //Type check if it's a letter
        else if(Character.isAlphabetic(TypeCheck1)){
             boolean l=false;
            String tem=Textbox1.getText();
            int count=0;
            while(count<tem.length()){
            if(Character.isAlphabetic(tem.charAt(count))){
                // do nothing
                count++;
            }
            else{
                l=true;
                count++;
            }
            }
            if(l){
            JOptionPane.showMessageDialog(null, "type error- only alphabetic= textbox "+Textbox1.getName(), "InfoBox: " + "titleBar",JOptionPane.ERROR_MESSAGE);
            return false;
            }
        }
        else {
        //do nothing 
        //accept any input 
        
        
        }
    return true;
    }
}

