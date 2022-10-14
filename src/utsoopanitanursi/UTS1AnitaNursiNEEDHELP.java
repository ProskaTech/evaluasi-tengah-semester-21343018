/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsoopanitanursi;

/**
 *
 * Created by 21343018_Anita Nursi
 * Pada program ini spasi tidak dibuat manual (loop) namun tidak bisa menghasilkan output yang sesuai.
 * Masalahnya jika nilai awal j diatur 2, maka baris 2 juga ikut dimulai dengan 2. Saya sudah berusaha 
 * menemukan solusinya tapi tidak bisa dan sejujurnya saya merasa sangat menyayangkan hal ini karena kode 
 * ini lebih rapi daripada menggunakan spasi manual.
 */

public class UTS1AnitaNursiNEEDHELP {
    public static void main(String[]args) { 
    
        for (int i = 0; i <= 2; i += 2)         //Sesuai clue
        {
            for (int k = 1; k <= 2 - i; k += 2) //Sesuai clue
            {
                System.out.print(" ");
            } 
            for (int j = 1; j <= i + 2; j++)
            {
                System.out.print(j + "");
            } 
            for (int k = 1; k <= 3 - i; k++)
            {
                System.out.print(" ");
            } 
            for (int j = 4; j <= i + 5; j += 1)
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
            for (int j = 1; j <= 2 *( 5 - i + 1) - 1; j++)
            {
                System.out.print(j + "");
            } 
            System.out.println();
        }
    } 
}