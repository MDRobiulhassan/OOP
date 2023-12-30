public class Abstract {
    abstract public class MobileUser {
        void display() {
            System.out.println("This is a mobile user.");
        }

        abstract void sendMessage();
    }

    public class Rahim extends MobileUser {
        @Override
        void sendMessage() {
            System.out.println("Rahim is sending message");
        }
    }

    public class Karim extends MobileUser {
        @Override
        void sendMessage() {
            System.out.println("Karim is sending Message");
        }
    }

    public static void main(String[] args) {
        Abstract a = new Abstract();
        MobileUser m;
        m = a.new Rahim();
        m.sendMessage();
        m.display();

        m = a.new Karim();
        m.sendMessage();
        m.display();
    }

}