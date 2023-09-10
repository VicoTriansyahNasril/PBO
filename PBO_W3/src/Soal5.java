import java.util.*;

public class Soal5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String car1,car2,car3,car4;
        String cat_car = null;
        car1 = s.next();
        car2 = s.next();
        car3 = s.next();
        car4 = s.next();
        cat_car = car1+car2+car3+car4;
        s.close();
        if((Double.parseDouble(cat_car) - 999999) % 5 == 0){
            System.out.println("Jalan");
        } else {
            System.out.println("Berhenti");
        }
    }
}