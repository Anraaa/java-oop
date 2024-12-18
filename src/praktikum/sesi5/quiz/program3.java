package praktikum.sesi5.quiz;

import java.util.Scanner;

public class program3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int angka;

        do {
            System.out.print("Masukkan angka (0 untuk berhenti): ");
            angka = scan.nextInt();
        } while (angka != 0);

        System.out.println("Program selesai.");
        scan.close();
    }
}