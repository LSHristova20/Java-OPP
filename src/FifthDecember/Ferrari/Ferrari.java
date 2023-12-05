package FifthDecember.Ferrari;

public class Ferrari implements Car{
    private String driverName;
    private String model;

    public Ferrari(String driverName) {
        this.driverName = driverName;
        this.model = "448-Spider";
    }


    @Override
    public String brakes() {
        return "Brakes!";
    }

    @Override
    public String gas() {
        return "brum-brum";
    }

    public String toSring(){
        return this.model+"/"+brakes()+"/"+gas()+"/"+this.driverName;
    }
}
