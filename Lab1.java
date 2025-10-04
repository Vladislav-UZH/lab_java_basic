
class Vehicle {
    protected String name;
    protected double speed;    
    protected double distance;  

    public Vehicle(String name, double speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public double calculateTime() {
        if (speed <= 0) {
            return Double.POSITIVE_INFINITY; 
        }
        return distance / speed;
    }

    public void printInfo() {
        System.out.println("Vehicle: " + name);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Distance: " + distance + " km");
        System.out.println("Time: " + calculateTime() + " h");
        System.out.println("----------------------------");
    }
}

class Car extends Vehicle {
    public Car(double speed, double distance) {
        super("Car", speed, distance);
    }
}

class Bicycle extends Vehicle {
    public Bicycle(double speed, double distance) {
        super("Bicycle", speed, distance);
    }
}

class Train extends Vehicle {
    public Train(double speed, double distance) {
        super("Train", speed, distance);
    }
}

public class Lab1 {
    public static void main(String[] args) {
        Vehicle car = new Car(100, 250);        
        Vehicle bicycle = new Bicycle(20, 50); 
        Vehicle train = new Train(200, 600);   

        Vehicle[] Vehicles = {car, bicycle, train};

        for (Vehicle t : Vehicles) {
            t.printInfo();
        }
    }
}
