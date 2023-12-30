public class ConstructorOverloading {
    public static void main(String[] args) {
        Teacherconsoverload teacher1 = new Teacherconsoverload();
        Teacherconsoverload teacher2 = new Teacherconsoverload("Robiul Hassan", "Male");
        Teacherconsoverload teacher3 = new Teacherconsoverload("Samiha Mehjabin", "Female", 1636114935);

        teacher1.display();
        teacher2.display();
        teacher3.display();

    }
}
