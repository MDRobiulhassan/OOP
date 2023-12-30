public class FinalVariable {
    public class University {
        final String Dean = "Asif Iqbal"; // final variable
        final int fees; // blank final variable
        static final String University_Name; // static blank final variable

        // initialising final blank variable
        University() {
            fees = 41400;
        }

        // initialising static final variable
        static {
            University_Name = "PUC";
        }

        void display() {
            System.out.println("Univesity Name : " + University_Name);
            System.out.println("DEAN           : " + Dean);
            System.out.println("Fees           : " + fees + " BDT");
        }

    }

    public static void main(String[] args) {
        FinalVariable f = new FinalVariable();
        University u = f.new University();
        u.display();
    }
}
