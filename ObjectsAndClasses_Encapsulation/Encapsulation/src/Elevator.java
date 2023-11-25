public class Elevator {
    public int currentFloor = 1;
    public int minFloor;
    public int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown(){
        currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;
        System.out.println("-> " + currentFloor);
    }
    public void moveUp(){
        currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;
        System.out.println("-> " + currentFloor);
    }

    public void move(int floor){
        if (floor >= minFloor && floor <= maxFloor && floor != currentFloor){
            if (currentFloor < floor){
                while (currentFloor != floor){
                    moveUp();
                }
                System.out.println("Вы прибыли на этаж: " + currentFloor);
            } else {
                while (currentFloor != floor){
                    moveDown();
                }
                System.out.println("Вы прибыли на этаж: " + currentFloor);
            }
        } else if (floor == currentFloor) {
            System.out.println("Это текущий этаж.");
        } else {
            System.out.println("Вы ввели неверный этаж!");
        }
    }
}
