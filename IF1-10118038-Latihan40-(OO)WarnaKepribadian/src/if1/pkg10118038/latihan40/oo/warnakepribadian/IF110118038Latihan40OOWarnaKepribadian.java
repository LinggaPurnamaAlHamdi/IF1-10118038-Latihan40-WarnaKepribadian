/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118038.latihan40.oo.warnakepribadian;

import java.util.Scanner;
import static if1.pkg10118038.latihan40.oo.warnakepribadian.Warna.ANSI_BLUE;
import static if1.pkg10118038.latihan40.oo.warnakepribadian.Warna.ANSI_BLUE_BACKGROUND;
import static if1.pkg10118038.latihan40.oo.warnakepribadian.Warna.ANSI_CYAN;
import static if1.pkg10118038.latihan40.oo.warnakepribadian.Warna.ANSI_GREEN;
import static if1.pkg10118038.latihan40.oo.warnakepribadian.Warna.ANSI_GREEN_BACKGROUND;
import static if1.pkg10118038.latihan40.oo.warnakepribadian.Warna.ANSI_PURPLE;
import static if1.pkg10118038.latihan40.oo.warnakepribadian.Warna.ANSI_PURPLE_BACKGROUND;
import static if1.pkg10118038.latihan40.oo.warnakepribadian.Warna.ANSI_RED;
import static if1.pkg10118038.latihan40.oo.warnakepribadian.Warna.ANSI_RED_BACKGROUND;
import static if1.pkg10118038.latihan40.oo.warnakepribadian.Warna.ANSI_RESET;
import static if1.pkg10118038.latihan40.oo.warnakepribadian.Warna.ANSI_WHITE;
import static if1.pkg10118038.latihan40.oo.warnakepribadian.Warna.ANSI_YELLOW;
import static if1.pkg10118038.latihan40.oo.warnakepribadian.Warna.ANSI_YELLOW_BACKGROUND;
/**
 *
 * @author Lingga
 * NAMA : Lingga Purnama Al Hamdi
 * KELAS : IF1
 * NIM : 10118038
 * Deskripsi Program : program ini berisi program yang akan menampilkan Warna Kepribadian
 */
public class IF110118038Latihan40OOWarnaKepribadian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Warna warna1 = new Warna();
        Nama nama1 = new Nama();
        Scanner scn = new Scanner(System.in);
        
//        teksnya
        System.out.print(ANSI_RED+"YUK "+ANSI_RESET);
        System.out.print(ANSI_GREEN+"CEK "+ANSI_RESET);
        System.out.print(ANSI_YELLOW+"KEPRIBADIANMU "+ANSI_RESET);
        System.out.print(ANSI_CYAN+"DARI "+ANSI_RESET);
        System.out.print(ANSI_PURPLE+"WARNA "+ANSI_RESET);
        System.out.print(ANSI_BLUE+"FAVORITMU "+ANSI_RESET+"\n");
        
//        teks + backgroundnya
        System.out.print("\n"+ANSI_RED_BACKGROUND+ANSI_WHITE+"\t MERAH \t\t\n"+ANSI_RESET);
        System.out.print(ANSI_GREEN_BACKGROUND+ANSI_WHITE+"\t HIJAU \t\t\n"+ANSI_RESET);
        System.out.print(ANSI_YELLOW_BACKGROUND+ANSI_WHITE+"\t KUNING \t\n"+ANSI_RESET);
        System.out.print(ANSI_BLUE_BACKGROUND+ANSI_WHITE+"\t BIRU \t\t\n"+ANSI_RESET);
        System.out.print(ANSI_PURPLE_BACKGROUND+ANSI_WHITE+"\t UNGU \t\t\n\n"+ANSI_RESET);
        
//        input
        System.out.print("PILIH WARNA FAVORITMU : ");
        warna1.warnamu = scn.next();
        System.out.print("NAMA KAMU : ");
        nama1.namaMu = scn.next();
        
        
      nama1.tampilNama(nama1.namaMu);
      warna1.hasilTest(warna1.warnamu);
        
    }
    
}
