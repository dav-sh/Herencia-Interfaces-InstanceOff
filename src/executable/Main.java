package executable;

import cars.*;


public class Main{
    public static void main(String[] args){
        System.out.println("Creando vehiculos aleatoriamente");
        ArrayVehicles vehicles = new ArrayVehicles();
        System.out.println("************ prueba************");
        Vehicle vehicle = new Cargo("Cargo vehicle");
        Vehicle vehicle2 = new Race("Race vehicle");
        Vehicle vehicle3 = new PickUp("PickUp vehicle");
        vehicles.seeType(vehicle);
        vehicles.seeType(vehicle2);
        vehicles.seeType(vehicle3);

    }
}