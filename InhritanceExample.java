public class InhritanceExample {
    public class Vehicle {
        String color;
        double weight;

        Vehicle(String color, double weight) {
            this.color = color;
            this.weight = weight;
        }

        void display() {
            System.out.println("Colour : " + color);
            System.out.println("Weight : " + weight);
        }
    }

    public class Car extends Vehicle {
        int gear;

        Car(String color, double weight, int gear) {
            super(color, weight);
            this.gear = gear;
        }

        @Override
        void display() {
            super.display();
            System.out.println("Gear : " + gear);
        }
    }

    public static void main(String[] args) {
        InhritanceExample ie = new InhritanceExample();
        Car Tesla = ie.new Car("RED", 350, 5);
        Tesla.display ();
    }
}
