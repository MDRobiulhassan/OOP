import java.util.Scanner;

public class ClassandObject {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        Teacher teacher1 = new Teacher();
        teacher1.name = "Robiul Hassan";
        teacher1.gender = "Male";
        teacher1.phone = 1636114935;

        Teacher teacher2=new Teacher();
        System.out.print("Enter Name : ");
        teacher2.name=input.nextLine();
        System.out.print("Enter Gender : ");
        teacher2.gender=input.nextLine();
        System.out.print("Enter Phone Number : ");
        teacher2.phone=input.nextInt();

        input.close();

        System.out.println("Teacher 1 Information : ");
        System.out.println("Name   : " + teacher1.name);
        System.out.println("Gender : " + teacher1.gender);
        System.out.println("Phone  : " + teacher1.phone);

        System.out.println("Teacher 2 Information : ");
        System.out.println("Name   : " + teacher2.name);
        System.out.println("Gender : " + teacher2.gender);
        System.out.println("Phone  : " + teacher2.phone);
    }
}