public class CallbyValue {
    void change(int i) { // primitive datatype
        i = 20;
    }

    public static void main(String[] args) {
        CallbyValue ob = new CallbyValue();
        int x = 10;
        System.out.println("Before Call " + x);

        ob.change(x);
        System.out.println("After Call " + x);
    }
}