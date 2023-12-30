public class MethodOverriding {
    public static void main(String[] args) {
        MethodOverridingPerson p = new MethodOverridingPerson();
        p.name = "Robiul Hassan";
        p.age = 23;
        p.display();

        MethodOverridingTeacher t = new MethodOverridingTeacher();
        t.name = "Aniusl Islam";
        t.age = 35;
        t.qualification = "Bsc in CSE";
        t.display();
    }

}
