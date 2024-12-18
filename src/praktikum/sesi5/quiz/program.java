package praktikum.sesi5.quiz;

import java.util.Scanner;

public class program {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int angka;

        System.out.print("Masukkan angka: ");
        angka = scan.nextInt();

        if (angka > 0){
            System.out.print("Angka tersebut adalah positif");
        } else if (angka == 0){
            System.out.print("Angka tersebut adalah nol");
        } else {
            System.out.print("Angka tersebut adalah negatif");
        }
    }    
}
