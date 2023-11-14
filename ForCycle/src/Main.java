import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число от 1 до 50:");
        int value = new Scanner(System.in).nextInt();

        if (value < 1 || value > 50) {
            System.out.println("Вы ввели число выходящее за рамки условий, введите другое число!");
        } else {
            for (int i = 1; i <= value; i++) {
                for (int j = 1; j <= value; j++){
                    if (i * j == value){
                        System.out.println(i + " * " + j);
                    }
                }
            }
        }
    }
}