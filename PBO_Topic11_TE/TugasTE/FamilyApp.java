package TugasTE;

import java.util.Scanner;

public class FamilyApp {
    public static Family family;

    public static void main(String[] args) {
        family = new Family();
        Scanner scanner = new Scanner(System.in);

        // Input uncles
        System.out.print("Masukan jumlah uncle: ");
        int numUncles = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numUncles; i++) {
            System.out.print("Masukan nama uncle: ");
            String uncleName = scanner.nextLine();
            family.addUncle(uncleName);
        }

        // Input nieces
        System.out.print("Masukan jumlah Niece: ");
        int numNieces = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numNieces; i++) {
            System.out.print("Masukan nama Niece: ");
            String nieceName = scanner.nextLine();
            System.out.print("Masukan ulang tahu Niece (Hari Bulan): ");
            int day = scanner.nextInt();
            int month = scanner.nextInt();
            family.addNiece(nieceName, day, month);
            scanner.nextLine();
        }

        // Input presents
        for (Uncle uncle : family.uncles) {
            for (Niece niece : family.nieces) {
                System.out.print("Masukan hadiah dari Uncle " + uncle.getName() +
                        " untuk Niece " + niece.getName() + ": ");
                String description = scanner.nextLine();
                uncle.addPresent(niece, description);
            }
        }

        System.out.println("\nList of Niece:");
        family.listNieces();

        System.out.println("\nList of Uncles:");
        family.listUncles();

        for (Uncle uncle : family.uncles) {
            System.out.println("\nList Hadiah dari Uncle " + uncle.getName() + ":");
            uncle.listPresents();
        }

        for (Niece niece : family.nieces) {
            System.out.println("\nList hadiah untuk Niece " + niece.getName() + ":");
            niece.listPresents();
        }

        scanner.close();
    }
}


