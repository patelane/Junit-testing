/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordvalidator;

import java.util.Scanner;

/**
 *
 * @author aneen
 */
public class PasswordValidator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        boolean valid=false;
        System.out.println("Enter password string input:");
        do{
        String password=inp.next();
        //check min 8 char
        if(checkLength(password) && checkUpper(password) &&checkSpecial(password))
        {
            valid=true;
            System.out.println("Valid password");
        }
        else
        {
            System.out.println("Not a valid password");
        }
        }while(!valid);
        
        
        
    }
    public static boolean checkLength(String password)
    {
        if(password.length()>=8)
        {
            return true;
        }
        return false;
    }
    public static boolean checkUpper(String password)
    {
        for(int i=0;i<password.length();i++)
        {
            if(Character.isUpperCase(password.charAt(i)))
            {
                return true;
            }
        }
        return false;
    }
    public static boolean checkSpecial(String password)
    {
        for(int i=0;i<password.length();i++)
        {
            if(!Character.isLetterOrDigit(password.charAt(i)))
            {
                return true;
            }
        }
        return false;
    }
    
}
