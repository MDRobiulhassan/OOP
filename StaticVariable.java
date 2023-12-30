public class StaticVariable {
    public static void main(String[] args) {
        StaticStudent ob1 = new StaticStudent("Robiul Hassan", 1043);
        StaticStudent ob2 = new StaticStudent("Samiha Mehjabin", 1039);

        ob1.dispaly();
        ob2.dispaly();

        System.out.println("University : " + StaticStudent.university);
    }
}
