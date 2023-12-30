public class MethodOverloading {
    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    void add(double a, double b) {
        System.out.println(a + b);
    }

    void add() {
        System.out.println("0");
    }

    public static void main(String[] args) {
        MethodOverloading ob = new MethodOverloading();
        ob.add(10, 20);
        MethodOverloading ob2 = new MethodOverloading();
        ob2.add(10, 20, 30);        
        MethodOverloading ob3 = new MethodOverloading();
        ob3.add(10.3, 20.4);
        MethodOverloading ob4 = new MethodOverloading();
        ob4.add();
    }
}
