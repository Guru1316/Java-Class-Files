public class Vehicle {
    Integer noOfTyres;
    Integer noOfGears;

    public Vehicle(Integer noOfGears, Integer noOfTyres) {
        System.out.println("Vehicle Constructor is called");
        this.noOfGears = noOfGears;
        this.noOfTyres = noOfTyres;
    }

    public void start()
    {
        System.out.println("Vehicle Started");
    }
    public void stop()
    {
        System.out.println("Vehicle Stopped");
    }

    public void displayVehicle(){
        System.out.println("No Of Gears: "+noOfGears);
        System.out.println("No Of Tyres: "+noOfTyres);
    }
}
