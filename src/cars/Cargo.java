package cars;

import interfaces.TypeCar;

public class Cargo extends Vehicle implements TypeCar{
    public Cargo(String type){
        super("diesel", type, 10, 20, 120, 3);
        
    }

    @Override
    public String infVehicle() {
        // TODO Auto-generated method stub
        return "I'm a cargo vehicle ";
    }

    @Override
    public String typeVehicle() {
        // TODO Auto-generated method stub
        return "I can transport material "  + infVehicle() + turnVehicle();
    }

    @Override
    public String turnVehicle() {
        // TODO Auto-generated method stub
        return "I can turn left ";
    }


}
