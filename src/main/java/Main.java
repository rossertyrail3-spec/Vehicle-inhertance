public class Main extends Vehicle{
    public static void main(String[] args) {
        Moped slowRide = new Moped();
        slowRide.setColor("blue");
        slowRide.setFuelCapacity(8);
        slowRide.setNumberOfPassengers(2);
        slowRide.setCargoCapacity(10);
        System.out.println("==== Moped ==== ");
        System.out.println("Color: " + slowRide.getColor());
        System.out.println("Fuel Capacity :" + slowRide.getFuelCapacity());
        System.out.println("Passengers: " + slowRide.getNumberOfPassengers());
        System.out.println("Cargo Capacity: " + slowRide.getCargoCapacity());

        System.out.println();

        Car miCar = new Car();
        miCar.setColor("Red");
        miCar.setFuelCapacity(15);
        miCar.setNumberOfPassengers(3);
        miCar.setCargoCapacity(15);
        System.out.println("==== Car ==== ");
        System.out.println("Color: " + miCar.getColor());
        System.out.println("Fuel Capacity :" + miCar.getFuelCapacity());
        System.out.println("Passengers: " + miCar.getNumberOfPassengers());
        System.out.println("Cargo Capacity: " + miCar.getCargoCapacity());

        System.out.println();


        Semi_truck miSemiTruck = new Semi_truck();
        miCar.setColor("Red");
        miCar.setFuelCapacity(67);
        miCar.setNumberOfPassengers(2);
        miCar.setCargoCapacity(24000);
        System.out.println("==== Car ==== ");
        System.out.println("Color: " + miSemiTruck.getColor());
        System.out.println("Fuel Capacity :" + miSemiTruck.getFuelCapacity());
        System.out.println("Passengers: " + miSemiTruck.getNumberOfPassengers());
        System.out.println("Cargo Capacity: " + miSemiTruck.getCargoCapacity());

        System.out.println();

        Hovercraft miHoverCraft = new Hovercraft();
        miHoverCraft.setColor("Black");
        miHoverCraft.setFuelCapacity(4);
        miHoverCraft.setNumberOfPassengers(6);
        miHoverCraft.setCargoCapacity(7);
        System.out.println("==== Car ==== ");
        System.out.println("Color: " + miHoverCraft.getColor());
        System.out.println("Fuel Capacity :" + miHoverCraft.getFuelCapacity());
        System.out.println("Passengers: " + miHoverCraft.getNumberOfPassengers());
        System.out.println("Cargo Capacity: " + miHoverCraft.getCargoCapacity());

        System.out.println();

    }
}
