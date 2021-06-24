package cars;

import interfaces.TypeCar;

public class Race extends Vehicle implements TypeCar{
    public Race(String type){
        super("diesel", type, 4, 1, 200, 10);
    }

    @Override
    public String infVehicle() {
        // TODO Auto-generated method stub
        return "I'm  a racing vehicle ";
    }

    @Override
    public String typeVehicle() {
        // TODO Auto-generated method stub
        return  "I have turbo and I can triple my speed " + infVehicle() + turnVehicle();
    }

    @Override
    public String turnVehicle() {
        // TODO Auto-generated method stub
        return "I can turn right ";
    }
    
}
