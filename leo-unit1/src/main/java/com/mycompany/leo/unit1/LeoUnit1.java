/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.leo.unit1;
import java.util.Scanner;

/**
 *
 * @author leohambly
 */
public class LeoUnit1 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
       String[] months = new String[] {"Jan" , "Feb", "Mar", "Apr", "May", "Jun", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int[] temp1 = new int[12];
        int[] temp2 = new int[12];
        
        for (int i=0; i<12; i++)
        {
            System.out.println("enter the temperature " + months[i] + " for the first year");
            temp1[i] = scanner.nextInt();
            
            System.out.println("enter the temperacture " + months[i] + " for the second year");
            temp2[i] = scanner.nextInt();
        }
        
        //for (int i=0; i>)
       // {
        
        
        //}
        
    }
}
