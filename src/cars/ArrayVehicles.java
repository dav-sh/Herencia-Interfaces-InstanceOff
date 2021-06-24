package cars;

import java.util.ArrayList;
import java.util.*;

public class ArrayVehicles {
    private ArrayList <Vehicle> vehicles = new ArrayList<Vehicle>();
    private Random random = new Random();
    public ArrayVehicles() {
        addVehicle();
        seeVehicles();
        //seeType();
    }
    
    public void addVehicle() {
        Vehicle vehicle;
        for(int i = 0; i < 8; i++){
            int rnd = random.nextInt(3);
            if(rnd ==1){
                vehicle = new Cargo("Cargo "+i);

            }else if(rnd ==2){
                vehicle = new Race("Race "+i);

            }else{
                vehicle = new PickUp("PickUp "+i);

            }
            vehicles.add(vehicle);
        }

    }
    public void seeVehicles() {
        for(int i = 0; i < vehicles.size(); i++){
            System.out.println(vehicles.get(i).getType());
        }
    }
    public void seeType(Vehicle vehicle) {
        if(vehicle instanceof Cargo){
            System.out.println(vehicle.typeVehicle());
        }else if(vehicle instanceof Race){
            System.out.println(vehicle.typeVehicle());
        }else if(vehicle instanceof PickUp){
            System.out.println(vehicle.typeVehicle());
        }else{
            System.out.println("Something wrong");
        }
    }

}
