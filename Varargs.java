public class Varargs {
    void add(int... num) {
        int sum = 0;

        for (int i : num) {
            sum += i;
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        Varargs ob = new Varargs();
        ob.add(10, 20);
        ob.add(10, 20, 30);
        ob.add(10, 20, 30, 40);
        ob.add(10, 20, 30, 40, 50);
        ob.add(10, 20, 30, 40, 50, 60);

    }
}