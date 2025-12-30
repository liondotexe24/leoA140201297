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
        String[] months = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int[] temp1 = new int[12];
        int[] temp2 = new int[12];

        for (int i = 0; i < 12; i++) //entering user data
        {
            System.out.println(i);

            System.out.println("enter the temperature " + months[i] + " for the first year");
            temp1[i] = scanner.nextInt();

            System.out.println("enter the temperature " + months[i] + " for the second year");
            temp2[i] = scanner.nextInt();
        }

        System.out.println(""); //making space between actions for clarity
        System.out.println("");
        System.out.println("");

        for (int i = 0; i < 12; i++)//displays the info the user entered, ive done 3 so it gets printed nicely 
        {
            System.out.printf("%-12s" , months[i]);
        }
        System.out.println("");
        
        for (int i = 0; i < 12; i++) {
            System.out.printf("%-12s" , temp1[i]);
        }
        System.out.println("");
       
        for (int i = 0; i < 12; i++) {
            System.out.printf("%-12s" , temp2[i]);
        }
        System.out.println("");

        
        
        
    }
}
