/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.datatype;

/**
 *
 * @author Vico Triansyah
 */

import java.util.Scanner;

public class DataType {
    public static void main(String[] args) {
        try (Scanner pengecekan = new Scanner(System.in)) {
            System.out.print("Berapa banyak input? ");
            long t = pengecekan.nextInt();
            
            for (int i = 0; i < t; i++) {
                try {
                    System.out.print("Masukan angka: ");
                    long n = pengecekan.nextLong();
                    System.out.println(n + " can be fitted in:");
                    
                    if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                        System.out.println("* byte");
                    }
                    if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                        System.out.println("* short");
                    }
                    if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                        System.out.println("* int");
                    }
                    System.out.println("* long");
                } catch (Exception e) {
                    System.out.println(pengecekan.next() + " can't be fitted anywhere");
                }
            }
        } 
    }
}