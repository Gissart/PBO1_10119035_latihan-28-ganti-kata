package com.tugasPBO;
import java.util.Scanner;
public class ganti {
    static Scanner scan = new Scanner(System.in);
    static String kalimat,gantikata,finall;
    public static void main(String[] args){
        ganti ganti  = new ganti();
        ganti.input();
        String hasil = ganti.ubahkata(kalimat, gantikata, finall);
        ganti.tampil(hasil);
    }

    public static void input(){
        System.out.print("Masukkan kalimat :");
        kalimat = scan.nextLine();
        System.out.print("Ganti kata :");
        gantikata = scan.next();
        System.out.print("Menjadi kata :");
        finall = scan.next();
    }

    private String ubahkata(String kalimat, String kataAwal,String kataAkhir){
        return kalimat.replaceAll(kataAwal,kataAkhir);
    }

    public void tampil(String hasil){
        System.out.println("--------Hasil formatting--------");
        System.out.println("kalimat awal : "+ kalimat);
        System.out.println("kalimat akhir : " + hasil);
    }
}
