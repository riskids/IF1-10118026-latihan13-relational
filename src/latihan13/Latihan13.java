/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan13;

/**
 *
 * @author dwisr
 * NAMA      : RISKI DWI SABARIYANTO
 * KELAS     : IF -1 
 * NIM       : 10118026
 * Deskripsi : Program untuk belajar relational
 * 
 */
public class Latihan13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    int bill = 10;
    int bil2 =  20;
	System.out.println("a = b = "+ (bill = bil2));
	System.out.println("a '=b = " + (bill = bil2));
	System.out.println("a > b = " + (bill > bil2));
	System.out.println("a < b = " + (bill < bil2));
	System.out.println("b >= a " + (bil2 >= bill));
	System.out.println("b <= a " + (bil2 <= bill));
    }
    
}
