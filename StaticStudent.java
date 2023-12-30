public class StaticStudent {
    String name;
    int id;
    static String university = "Premier University";

    StaticStudent(String n, int i) {
        name = n;
        id = i;
    }

    void dispaly() {
        System.out.println("Name       : " + name);
        System.out.println("ID         : " + id);
        System.out.println("University : " + university);
    }
}