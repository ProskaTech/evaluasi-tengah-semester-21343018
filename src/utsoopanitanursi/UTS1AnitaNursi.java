/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utsoopanitanursi;

/**
 *
 * Created by 21343018_Anita Nursi
 */

public class UTS1AnitaNursi {
    public static void main(String[] args) {
        for (int i = 0; i <= 1; i += 2)
        {
            System.out.print(" ");
            
            for (int j = 2; j <= 3; j++)
            {
                System.out.print(j + "");
            }
            System.out.print("   ");
            
            for (int j = 4; j <= 5; j++)
            {
                System.out.print(j + "");
            }
            System.out.println();
            
            for (int j = 1; j <= 4; j++)
            {
                System.out.print(j + "");
            }
            System.out.print(" ");
            
            for (int j = 5; j <= 8; j++)
            {
                System.out.print(j + "");
            }
            System.out.println();
        }
        
        for (int i = 1; i <= 5; i++)
        {
            for (int k = 1; k <= i - 1; k++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (5 - i + 1) - 1; j++)
            {
                System.out.print(j + "");
            }
            System.out.println("");
        }
    }
}
