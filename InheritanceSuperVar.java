public class InheritanceSuperVar {
    public class A {
        int x = 10;
    }

    public class B extends A {
        int x = 5;

        void display() {
            System.out.println(x);
            System.out.println(super.x);
        }
    }

    public static void main(String[] args) {
        InheritanceSuperVar b = new InheritanceSuperVar();
        B ob = b.new B();
        ob.display();
    }
}
