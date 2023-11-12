package TugasTE;

import java.util.HashMap;
import java.util.Map;

import static TugasTE.FamilyApp.family;

public class Uncle {
    private String name;
    private Map<Niece, String> presents;

    Uncle(String name) {
        this.name = name;
        this.presents = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public boolean addPresent(Niece recipient, String description) {
        if (presents.containsKey(recipient)) {
            return false;
        }

        presents.put(recipient, description);
        return true;
    }

    public void listPresents() {
        for (String description : presents.values()) {
            System.out.println("Present for Niece " + name + ": " + description);
        }

    }

}

