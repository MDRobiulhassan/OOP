public class StaticStudent2 {
    int count = 0;
    static int cnt = 0;

    StaticStudent2() {
        count++;
        cnt++;
    }

    void display() {
        System.out.println("Total Student in Non-Static : " + count);
        System.out.println("Total Student in Static     : " + cnt);
    }

}
