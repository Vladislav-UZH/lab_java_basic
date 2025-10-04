
class Transport {
    protected String name;
    protected double speed;    
    protected double distance;  

    public Transport(String name, double speed, double distance) {
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

class Car extends Transport {
    public Car(double speed, double distance) {
        super("Car", speed, distance);
    }
}

class Bicycle extends Transport {
    public Bicycle(double speed, double distance) {
        super("Bicycle", speed, distance);
    }
}

class Train extends Transport {
    public Train(double speed, double distance) {
        super("Train", speed, distance);
    }
}

public class Lab1 {
    public static void main(String[] args) {
        Transport car = new Car(100, 250);        
        Transport bicycle = new Bicycle(20, 50); 
        Transport train = new Train(200, 600);   

        Transport[] transports = {car, bicycle, train};

        for (Transport t : transports) {
            t.printInfo();
        }
    }
}
