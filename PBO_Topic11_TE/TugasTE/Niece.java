package TugasTE;

import java.util.HashMap;
import java.util.Map;

public class Niece {
    private String name;
    private int day;
    private int month;
    private Map<Uncle, String> presents;

    Niece(String name, int day, int month) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.presents = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return day + "/" + month;
    }

    public int clearPresents() {
        int numRemoved = presents.size();
        presents.clear();
        return numRemoved;
    }

    public void listPresents() {
        for (String description : presents.values()) {
            System.out.println("Present from Uncle " + name + ": " + description);
        }
    }

}

