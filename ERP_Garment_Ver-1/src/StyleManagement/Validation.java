/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StyleManagement;

import javax.swing.JOptionPane;
import javax.swing.text.JTextComponent;

/**
 *
 * @author Little_Lux
 */
public class Validation {
    
    boolean idValidation(){
    
        
    
    return true;
    }
    
    boolean radioButton(){
        
        return true;
    }
    public  boolean ValidationCheck(JTextComponent Textbox,boolean IsEmptyCheck,int LenghtCheck,char TypeCheck){
        JTextComponent Textbox1 = Textbox;
        char TypeChecker = 0;
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
    boolean typecheck(){
        char TypeChecker = 0;
        JTextComponent Textbox = null;
         JTextComponent Textbox1 = Textbox;
        
        //Type check if it's a number
        if(Character.isDigit(TypeChecker)){
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
        else if(Character.isAlphabetic(TypeChecker)){
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
    

