/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsoopanitanursi;
import javax.swing.JOptionPane;

/**
 *
 * Created by 21343018_Anita Nursi
 */

public class UTS3AnitaNursi {
    public static void main(String[] args) {
        String a;
        int angka;
        
        a = JOptionPane.showInputDialog("Masukkan angka: ");
        
        angka = Integer.parseInt(a);
        
        if (angka > 0){
            JOptionPane.showMessageDialog(null, "Bilangan " + angka + " adalah bilangan positif.");
        }
        else if (angka == 0){
            JOptionPane.showMessageDialog(null, "Bilangan " + angka + " adalah bilangan netral.");
        }
        else
            JOptionPane.showMessageDialog(null, "Bilangan " + angka + " adalah bilangan negatif.");
    }
}
