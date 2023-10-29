/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ti_regpagi.pkg22205043.latihan25.ejaannama;

/*
 *  Nama      : Danish Fadlan Azam
 *  NIM       : 22205043
 *  Prodi     : Teknik Informatika
 *  Deskripsi : program ini untuk mengeja nama yang diinputkan user
 */

import java.util.Scanner;

public class TI_RegPagi22205043Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inputan = new Scanner(System.in);
        
        boolean ulangi = true;
        while(ulangi){
            System.out.print("Masukan nama depan anda untuk dieja : ");            
            String nama = inputan.nextLine();
            
            System.out.println("Ejaan untuk '"+nama+"' adalah ");            
            int panjangNama = nama.length();
            for(int i = 0; i<panjangNama; i++){
                char huruf = nama.charAt(i);
                System.out.println("Huruf ke-"+(i+1)+" : "+huruf);
            }
            
            System.out.print("Ulangi Aktifitas? (ya/tidak)");
            String ulang = inputan.nextLine().toUpperCase();
            
            if(ulang.equals("YA")){
                System.out.println("Program akan diulangi");
            }else if(ulang.equals("TIDAK")){
                System.out.println("Program berhenti terimakasih");
                ulangi = false;
            }
        }
        
    }
    
}
