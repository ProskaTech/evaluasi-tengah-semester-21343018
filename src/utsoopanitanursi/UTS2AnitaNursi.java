/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsoopanitanursi;
import java.util.Scanner;

/**
 *
 * Created by 21343018_Anita Nursi
 */

public class UTS2AnitaNursi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah baris: ");
        int n = in.nextInt();
        
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
            for (int k = i; k <= n; k++)
            {
                System.out.print("# ");
            }
            System.out.println("");
        }
        
        for (int i = n; i >= 1; i--)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
            for (int k = i; k <= n; k++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
