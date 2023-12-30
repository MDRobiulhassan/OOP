public class InterfaceProgram {
    public interface Animal {
        public abstract void eat();
    }

    class Dog implements Animal {

        public void eat() {
            System.out.println("Dog can eat egg");
        }
    }

    class Cat implements Animal {
        public void eat() {
            System.out.println("Cat can eat meat");
        }
    }

    public static void main(String[] args) {
        InterfaceProgram i = new InterfaceProgram();
        Animal d = i.new Dog();
        d.eat();

        d = i.new Cat();
        d.eat();
    }
}