/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StyleManagement;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.text.JTextComponent;

/**
 *
 * @author Little_Lux
 */
public class Validation {
    JTextComponent jComboBox;
char TypeCheck1;
    
    
    public  boolean ValidationCheck(JComboBox<String> jComboBox,boolean IsEmptyCheck,int LenghtCheck,char TypeCheck){
        
        //Check if it is empty 
        if(IsEmptyCheck){
         
            if(jComboBox.getSelectedItem().toString().equals("")){
                JOptionPane.showMessageDialog(null, jComboBox.getName()+" Empty textbox ", "InfoBox: " + "titleBar", JOptionPane.ERROR_MESSAGE);
            }
        
            else{  
                //Lenght checking
                if(LenghtCheck<0){
            
                    if(jComboBox.getSelectedItem().toString().length()>=Math.abs(LenghtCheck)){
                    JOptionPane.showMessageDialog(null, jComboBox.getSelectedItem().toString()+" = textbox lenth error;should be < "+Math.abs(LenghtCheck), "InfoBox: " + "titleBar",JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                    if(typecheck()){return true;}
                    }
                }
                else if (LenghtCheck>0){
                    if(jComboBox.getSelectedItem().toString().length()<=Math.abs(LenghtCheck)){
                    JOptionPane.showMessageDialog(null, jComboBox.getSelectedItem().toString()+" = textbox lenth error;should be > "+Math.abs(LenghtCheck), "InfoBox: " + "titleBar",JOptionPane.ERROR_MESSAGE);
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
        char TypeCheck1 = 0;
        //Type check if it's a number
        if(Character.isDigit(TypeCheck1)){
            boolean l=false;
            String tem=jComboBox.getSelectedText().toString();
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
            JOptionPane.showMessageDialog(null, "type error- only digit= textbox "
                    +jComboBox.getName(), "InfoBox: " 
                            + "titleBar",JOptionPane.ERROR_MESSAGE);
            return false;
            }
        }
        
         //Type check if it's a letter
        else if(Character.isAlphabetic(TypeCheck1)){
             boolean l=false;
            String tem=jComboBox.getSelectedText().toString();
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
            JOptionPane.showMessageDialog(null, "type error- only alphabetic= textbox "+jComboBox.getName(), "InfoBox: " + "titleBar",JOptionPane.ERROR_MESSAGE);
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
    

