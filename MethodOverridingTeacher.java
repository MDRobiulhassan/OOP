public class MethodOverridingTeacher extends MethodOverridingPerson {
    String qualification;

    @Override
    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Qualification : " + qualification);
    }
}
