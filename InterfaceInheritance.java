public class InterfaceInheritance {
    interface A {
        void eat();
    }

    interface B {
        void eat();
    }

    public class C implements A, B {
        public void eat() {
            System.out.println("eat something");
        }
    }

    public static void main(String[] args) {
        InterfaceInheritance i = new InterfaceInheritance();
        C c = i.new C();
        c.eat();
    }
}