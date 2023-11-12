package TugasTE;

import java.util.ArrayList;
import java.util.List;

public class Family {
    List<Uncle> uncles;
    List<Niece> nieces;

    public Family() {
        uncles = new ArrayList<>();
        nieces = new ArrayList<>();
    }

    public boolean addNiece(String name, int day, int month) {
        Niece existingNiece = findNiece(name);
        if (existingNiece != null) {
            return false;
        }

        Niece newNiece = new Niece(name, day, month);
        nieces.add(newNiece);
        return true;
    }

    public boolean addUncle(String name) {
        Uncle existingUncle = findUncle(name);
        if (existingUncle != null) {
            return false;
        }

        Uncle newUncle = new Uncle(name);
        uncles.add(newUncle);
        return true;
    }

    public Niece findNiece(String name) {
        for (Niece niece : nieces) {
            if (niece.getName().equals(name)) {
                return niece;
            }
        }
        return null;
    }

    public Uncle findUncle(String name) {
        for (Uncle uncle : uncles) {
            if (uncle.getName().equals(name)) {
                return uncle;
            }
        }
        return null;
    }

    public void listNieces() {
        for (Niece niece : nieces) {
            System.out.println("Niece: " + niece.getName() + ", Birthday: " + niece.getBirthday());
        }
    }

    public void listUncles() {
        for (Uncle uncle : uncles) {
            System.out.println("Uncle: " + uncle.getName());
        }
    }
}
