package cars;

import interfaces.TypeCar;

public class PickUp extends Vehicle implements TypeCar{
    public PickUp(String type) {
        super("diesel",type, 5, 4, 150, 5);

    }

    @Override
    public String infVehicle() {
        // TODO Auto-generated method stub
        return "I'm a pickup vehicle ";
    }

    @Override
    public String typeVehicle() {
        // TODO Auto-generated method stub
        return "I can transport people " + infVehicle() + turnVehicle();
    }

    @Override
    public String turnVehicle() {
        // TODO Auto-generated method stub
        return "I can turn left ";
    }
    
}
