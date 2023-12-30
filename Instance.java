public class Instance{
    public static void main(String[] args) {
        InstanceAnimal a = new InstanceAnimal();
        InstancePerson p = new InstancePerson();
        InstanceTeacher t = new InstanceTeacher();

        System.out.println(a instanceof InstanceAnimal);
        System.out.println(p instanceof InstanceAnimal);
        System.out.println(t instanceof InstancePerson);
        System.out.println(p instanceof InstanceAnimal);
        System.out.println(t instanceof InstanceTeacher);

    }

}
