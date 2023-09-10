import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Inputkan ekspresi contoh ( 1 + 1 ): ");
        String input = s.nextLine();

        // Membagi input menjadi tiga bagian: operand1, operator, dan operand2
        String[] parts = input.split(" ");
        if (parts.length != 3) {
            System.out.println("Penginputan salah, gunakan nilai1 operasi nilai2!");
            s.close();
            return;
        }

        int operand1, operand2, result;
        try {
            operand1 = Integer.parseInt(parts[0]);
            operand2 = Integer.parseInt(parts[2]);
        } catch (NumberFormatException e) {
            System.out.println("Kesalahan penginputan, masukan angka");
            s.close();
            return;
        }

        // Memeriksa batasan nilai operand1 dan operand2
        if (operand1 < 1 || operand1 > 1000 || operand2 < 1 || operand2 > 1000) {
            System.out.println("Inputan nilai tidak boleh kurang dari 1 dan lebih dari 1000!");
            s.close();
            return;
        }

        String operator = parts[1];

        switch (operator) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.println("Pembagian dengan nol tidak diperbolehkan.");
                    s.close();
                    return;
                }
                result = operand1 / operand2;
                break;
            case "%":
                if (operand2 == 0) {
                    System.out.println("Modulus dengan nol tidak diperbolehkan.");
                    s.close();
                    return;
                }
                result = operand1 % operand2;
                break;
            default:
                System.out.println("Operasi salah, masukan salah satu dari '+ - * / %'");
                s.close();
                return;
        }

        System.out.println("Result: " + result);
        s.close();
    }
}