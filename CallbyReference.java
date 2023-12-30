public class CallbyReference {
    String name;

    void change(CallbyReference s) {  //Object type data
        s.name = "Robiul";
    }

    public static void main(String[] args) {
        CallbyReference ob = new CallbyReference();
        ob.name = "Hassan";
        System.out.println("Before Call " + ob.name);

        ob.change(ob);
        System.err.println("After Call " + ob.name);
    }
}
