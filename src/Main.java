class Car {
    int mileage;

    public Car(int mileage) {
        this.mileage = mileage;
    }

    String getType() {
        return "Car";
    }

    int getMileage() {
        return mileage;
    }
}

class WagonR extends Car {
    public WagonR(int mileage) {
        super(mileage);
    }

    @Override
    String getType() {
        return "WagonR";
    }

    @Override
    int getMileage() {
        return mileage;
    }
}

class HondaCity extends Car {
    public HondaCity(int mileage) {
        super(mileage);
    }

    @Override
    String getType() {
        return "HondaCity";
    }

    @Override
    int getMileage() {
        return mileage;
    }
}

class InnovaCrysta extends Car {
    public InnovaCrysta(int mileage) {
        super(mileage);
    }

    @Override
    String getType() {
        return "InnovaCrysta";
    }

    @Override
    int getMileage() {
        return mileage;
    }
}

public class Main {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int carType = scan.nextInt();
        int mileage = scan.nextInt();

        Car car;

        switch (carType) {
            case 0:
                car = new WagonR(mileage);
                break;
            case 1:
                car = new HondaCity(mileage);
                break;
            case 2:
                car = new InnovaCrysta(mileage);
                break;
            default:
                throw new IllegalArgumentException("Invalid car type");
        }

        String sedan = (car instanceof HondaCity) ? "Sedan" : "not Sedan";
        String seats = (car instanceof InnovaCrysta) ? "6-seater" : "4-seater";

        System.out.println("A " + car.getType() + " is " + sedan + ", is " + seats +
                ", and has a mileage of around " + car.getMileage() + " kmpl.");
    }
}
