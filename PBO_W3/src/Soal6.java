import java.util.*;
import java.math.*;

public class Soal6 {
    public static void main(String[] args) {
        BigInteger A, B;

        Scanner input = new Scanner(System.in);

        A = input.nextBigInteger();
        B = input.nextBigInteger();

        //A + B = 2380
        System.out.println(A.add(B));
        //A x B = 82075
        System.out.println(A.multiply(B));
        input.close();
    }
}