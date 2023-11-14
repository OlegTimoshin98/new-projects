
public class Main {
    public static void main(String[] args) {
        int milkAmount = 200; // ml
        int powderAmount = 5; // g
        int eggsCount = 3; // items
        int sugarAmount = 5; // g
        int oilAmount = 30; // ml
        int appleCount = 8; // items

        // Example
        // apples - 5
        if (appleCount >= 5) {
            System.out.println("Apple juice");
        } else {
            System.out.println("Not enough ingredients for apple juice!");
        }

        // Example count ingredients
        /*powderAmount = 500;
        sugarAmount = 50;
        milkAmount = 1200;
        oilAmount = 50;*/
        // powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
        if (powderAmount >= 400 && sugarAmount >= 10 && milkAmount >= 1000 && oilAmount >= 30) {
            System.out.println("Pancakes");
        } else {
            System.out.println("Not enough ingredients for pancakes!");
            System.out.println("Not enough: ");
            if (powderAmount < 400){
                System.out.println("Powder;");
            }
            if (sugarAmount < 10){
                System.out.println("Sugar;");
            }
            if (milkAmount < 1000){
                System.out.println("Milk;");
            }
            if (oilAmount < 30){
                System.out.println("Oil.");
            }
        }

        // Example count ingredients
        /*milkAmount = 500;
        powderAmount = 20;
        eggsCount = 10;*/
        // milk - 300 ml, powder - 5 g, eggs - 5
        if (milkAmount >= 300 && powderAmount >= 5 && eggsCount >= 5) {
            System.out.println("Omelette");
        } else {
            System.out.println("Not enough ingredients for omelette!");
            System.out.println("Not enough: ");
            if (milkAmount < 300){
                System.out.println("Milk;");
            }
            if (powderAmount < 5){
                System.out.println("Powder;");
            }
            if (eggsCount < 5){
                System.out.println("Eggs.");
            }
        }

        // Example count ingredients
        /*appleCount = 5;
        milkAmount = 200;
        powderAmount = 300;
        eggsCount = 4;*/
        // apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
        if (appleCount >= 3 && milkAmount >= 100 && powderAmount >= 300 && eggsCount >= 4) {
            System.out.println("Apple pie");
        } else {
            System.out.println("Not enough ingredients for apple pie!");
            System.out.println("Not enough: ");
            if (appleCount < 3){
                System.out.println("Apple;");
            }
            if (milkAmount < 100){
                System.out.println("Milk;");
            }
            if (powderAmount < 300){
                System.out.println("Powder;");
            }
            if (eggsCount < 4){
                System.out.println("Eggs.");
            }
        }
    }
}