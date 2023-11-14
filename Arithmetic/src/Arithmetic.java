public class Arithmetic {
    private int firstNumber;
    private  int secondNumber;

    public Arithmetic(int firstNumber, int secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int sumNumber(){
        int sum = firstNumber + secondNumber; return sum;
    }

    public int multiplicationNumber(){
        int multi = firstNumber * secondNumber; return multi;
    }

    public int maxNumber(){
        int max;
        if (firstNumber > secondNumber){ max = firstNumber;
        } else { max = secondNumber;}
        return max;
    }

    public int minNumber(){
        int min;
        if (firstNumber < secondNumber){ min = firstNumber;
        } else { min = secondNumber; }
        return  min;
    }

    public void printResult(){
        System.out.println("Сумма чисел: " + sumNumber());
        System.out.println("Произведение чисел: " + multiplicationNumber());
        System.out.println("Максимальное число: " + maxNumber());
        System.out.println("Минимальное число: " + minNumber());
        System.out.println();
    }
}
