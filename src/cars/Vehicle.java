package cars;


public abstract class Vehicle{
    String gasoline, type;
    int gallons,passengers,maxSpeed;
    double acceleration;
    public Vehicle(String gasoline, String type, int gallons, int passengers, int maxSpeed, double acceleration) {
        this.gasoline = gasoline;
        this.type = type;
        this.gallons = gallons;
        this.passengers = passengers;
        this.maxSpeed = maxSpeed;
        this.acceleration = acceleration;
    }

    public String getGasoline() {
        return gasoline;
    }
    public void setGasoline(String gasoline){
        this.gasoline = gasoline;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getGallons() {
        return gallons;
    }
    public void setGallons(int gallons) {
        this.gallons = gallons;
    }
    public int getPassengers() {
        return passengers;
    }
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public double getAcceleration(){
        return acceleration;
    }
    public void setAcceleration(double acceleration){
        this.acceleration = acceleration;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "gasoline "+gasoline+ " gallons "+ gallons + " passengers "+passengers+" maxSpeed "+maxSpeed+" acceleration "+acceleration;
    }

    public abstract String typeVehicle();



}
