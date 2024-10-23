package praktikum.sesi2;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            clearScreen();
            System.out.println("====================================");
            System.out.println("         Program Sederhana          ");
            System.out.println("          Aqla Harun R. J.          ");
            System.out.println("            20230801388             ");
            System.out.println("====================================");
            System.out.println("1. Program sederhana dengan operator dan tipe data");
            System.out.println("2. Program sederhana dengan if else dan switch case");
            System.out.println("3. Program sederhana dengan for, while, dan do while");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            int choice = scanner.nextInt();

            clearScreen();
            switch (choice) {
                case 1:
                    exampleOperatorsAndDataTypes(scanner);
                    break;
                case 2:
                    exampleIfElseAndSwitchCase(scanner);
                    break;
                case 3:
                    exampleLoops(scanner);
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
            System.out.println("\nTekan Enter untuk melanjutkan...");
            scanner.nextLine(); // Consume newline
            scanner.nextLine(); // Wait for Enter
        }
    }

    public static void exampleOperatorsAndDataTypes(Scanner scanner) {
        System.out.print("Masukkan nilai integer: ");
        int a = scanner.nextInt();
        System.out.print("Masukkan nilai double: ");
        double b = scanner.nextDouble();
        System.out.print("Masukkan karakter: ");
        char c = scanner.next().charAt(0);
        System.out.print("Masukkan string: ");
        String d = scanner.next();
        
        boolean e = false;
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Masukkan nilai boolean (true/false): ");
            if (scanner.hasNextBoolean()) {
                e = scanner.nextBoolean();
                validInput = true;
            } else {
                System.out.println("Input tidak valid. Silakan masukkan nilai boolean (true/false).");
                scanner.next(); // Consume the invalid input
            }
        }

        int sum = a + 5;
        double product = b * 2;
        System.out.println("\nContoh Tipe Data:");
        System.out.println("Nilai Integer = " + a);
        System.out.println("Nilai DOuble = " + b);
        System.out.println("Nilai Char = " + c);
        System.out.println("Nilai String = " + d);
        System.out.println("Nilai Boolean = " + e);
        System.out.println("\nContoh Operator:");
        System.out.println("a + 5 = " + sum);
        System.out.println("b * 2 = " + product);
    }

    public static void exampleIfElseAndSwitchCase(Scanner scanner) {
        System.out.print("Masukkan nilai integer: ");
        int number = scanner.nextInt();
        System.out.print("Masukkan karakter grade (A/B/C/D): ");
        char grade = scanner.next().charAt(0);

        System.out.println("\nContoh If-Else:");
        if (number > 5) {
            System.out.println("Nilai lebih dari 5");
        } else {
            System.out.println("Number adalah 5 atau kurang dari 5");
        }
        
        System.out.println("\nSwitch-Case:");
        switch (grade) {
            case 'A':
                System.out.println("  -> Hasil: Excellent! 🌟");
                break;
            case 'B':
                System.out.println("  -> Hasil: Good! 👍");
                break;
            case 'C':
                System.out.println("  -> Hasil: Fair 🙂");
                break;
            case 'D':
                System.out.println("  -> Hasil: Poor 😕");
                break;
            default:
                System.out.println("  -> Hasil: Failing 💀");
        }
    }

    public static void exampleLoops(Scanner scanner) {
        System.out.print("Masukkan batas untuk loop: ");
        int limit = scanner.nextInt();

        System.out.println("\nContoh For Loop:");
        for (int i = 0; i < limit; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("\nWhile Loop:");
        int count = 0;
        while (count < limit) {
            System.out.println("count = " + count);
            count++;
        }

        System.out.println("\nContoh Do-While Loop:");
        int doCount = 0;
        do {
            System.out.println("doCount = " + doCount);
            doCount++;
        } while (doCount < limit);
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}