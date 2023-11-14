import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int firstNumber;
        int secondNumber;
        boolean cycle = true;
        int answer = 1;
        //String answer;

        while (cycle != false) {
            System.out.println("\nВведите два числа");
            System.out.println("Перове число: ");
            firstNumber = new Scanner(System.in).nextInt();
            System.out.println("Второе число: ");
            secondNumber = new Scanner(System.in).nextInt();
            System.out.println("\nРезультаты");

            Arithmetic result = new Arithmetic(firstNumber, secondNumber);
            result.printResult();

            System.out.println("Хотите ввести новые числа? (да - 1/нет - 2)");
            answer = new Scanner(System.in).nextInt();
            if (answer == 1){
                cycle = true;
            } else { cycle = false;}

            //Подскажите пожалуйста почему такой вариант не работает
            //после ввода буквы условие все равно ложное
            /*System.out.println("Хотите ввести новые числа? (y/n)");
            answer = new Scanner(System.in).nextLine();
            if (answer == "y"){
                cycle = true;
            } else { cycle = false;}*/
        }
    }
}