public class Main {
    public static void main(String[] args) {
        int value = 1200; 
        int fillingSpeed = 30;
        int devastationSpeed = 10;
        int time = 0;
        int valueDefault = 0;

        while (valueDefault != value) {
            valueDefault = valueDefault + fillingSpeed - devastationSpeed;
            time = time + 1;

            if (valueDefault >= value){break;}
        }
        System.out.println("Бассейн объемом " + value + " литров заполнен за " + time + " минут");
    }
}