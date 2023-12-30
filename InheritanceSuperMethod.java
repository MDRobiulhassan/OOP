public class InheritanceSuperMethod {
    public class A {
        void display() {
            System.out.println("This is Class A");
        }
    }

    public class B extends A {
        @Override
        void display() {
            super.display();
            System.out.println("This is Class B");
        }
    }

    public static void main(String[] args) {
        InheritanceSuperMethod i = new InheritanceSuperMethod();
        B ob = i.new B();
        ob.display();
    }
}
