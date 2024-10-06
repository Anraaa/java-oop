package praktikum.sesi1;

import java.util.Scanner;

// Aqla Harun Ramadhani Johananda - 20230801388
// Praktikum Sesi 1

public class program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueCalculation = "y";
        
        while (continueCalculation.equalsIgnoreCase("y")) {
            clearScreen();
            
            System.out.println("Kalkulator 2 Angka Sederhana");
            System.out.println("Operator yang valid: +, -, *, /");
            System.out.println("Contoh : 3 * 5");
            System.out.print("\nInput Angka: ");
            
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            
            if (parts.length != 3) {
                System.out.println("Input tidak valid. Format yang benar: angka operator angka (contoh: 1 + 2)");
                continue;
            }
            
            double num1 = Double.parseDouble(parts[0]);
            String operator = parts[1];
            double num2 = Double.parseDouble(parts[2]);
            
            double result = 0;
            
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Operator tidak valid. Gunakan +, -, *, atau /.");
                    continue;
            }
            
            System.out.println("Hasil: " + result);
            System.out.print("\nLanjut Menghitung? (y/n): ");
            continueCalculation = scanner.nextLine();
        }
        
        System.out.println("Program selesai.");
    }
    
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}