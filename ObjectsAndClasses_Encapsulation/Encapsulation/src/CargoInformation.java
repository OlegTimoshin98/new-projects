public class CargoInformation {
    private final int mass;
    private final String address;
    private final boolean turnOver;
    private final String registrationNumber;
    private final boolean fragile;
    private final Dimensions cargoDimensions;

    public CargoInformation(){
        mass = 0;
        address = "N/A";
        turnOver = false;
        registrationNumber = "N/A";
        fragile = false;
        cargoDimensions = new Dimensions();
    }

    public CargoInformation(int mass, String address, boolean turnOver, String registrationNumber,
                            boolean fragile, Dimensions cargoDimensions) {
        this.mass = mass;
        this.address = address;
        this.registrationNumber = registrationNumber;
        this.fragile = fragile;
        this.turnOver = turnOver;
        this.cargoDimensions = cargoDimensions;
    }

    public int getMass() {return mass;}

    public String getAddress() {return address;}

    public boolean isTurnOver() {return turnOver;}

    public String getRegistrationNumber() {return registrationNumber;}

    public boolean isFragile() {return fragile;}

    public Dimensions getCargoDimensions() {return cargoDimensions;}

    public CargoInformation setMass(int mass){
        return new CargoInformation(mass, address,turnOver,registrationNumber,fragile, cargoDimensions);    }

    public CargoInformation setAddress(String address){
        return new CargoInformation(mass, address,turnOver,registrationNumber,fragile, cargoDimensions);    }

    public CargoInformation setTurnOver(boolean turnOver){
        return new CargoInformation(mass, address,turnOver,registrationNumber,fragile, cargoDimensions);    }

    public CargoInformation setRegistrationNumber(String registrationNumber){
        return new CargoInformation(mass, address,turnOver,registrationNumber,fragile, cargoDimensions);    }

    public CargoInformation setFragile(boolean fragile){
        return new CargoInformation(mass, address,turnOver,registrationNumber,fragile, cargoDimensions);    }

    public CargoInformation setCargoDimensions(Dimensions cargoDimensions){
        return new CargoInformation(mass, address,turnOver,registrationNumber,fragile, cargoDimensions);    }

    public String toString(){
        return "\nГабариты: " + cargoDimensions + " см3\n" +
                "Масса: " + mass + " г.\n" +
                "Адрес доставки: " + address + "\n" +
                "Переворачивать: " + (turnOver == true ? "можно" : "нельзя") + "\n" +
                "Регистрационный номер: " + registrationNumber + "\n" +
                "Хрупкое: " + (fragile == true ? "да" : "нет") + "\n";    }
}
