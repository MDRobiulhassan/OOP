public class InheritanceSuperCons {
    public class A {
        A() {
            System.out.println("Constructor A");
        }
    }

    public class B extends A {
        B() {
            super();
            System.out.println("Constructor B");
        }

        void display() {
            System.out.println("For No Error");
        }
    }

    public static void main(String[] args) {
        InheritanceSuperCons i = new InheritanceSuperCons();
        B ob = i.new B();
        ob.display();
    }
}
