/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author Vico Triansyah
 */

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner pengecekan = new Scanner(System.in);
        
       
        String A = pengecekan.nextLine();
        String B = pengecekan.nextLine();
        
        
        int totalLength = A.length() + B.length();
        System.out.println(totalLength);
        
        
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capitalizedA + " " + capitalizedB);
        
        pengecekan.close();
    }
}