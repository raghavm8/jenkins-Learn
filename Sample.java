public class Sample {
    public static void main(String[] args) {
        System.out.println("This is main class.....");
        System.out.println("Sample for learning jenkins.....");

        SampleObjectClass objectClass1 = new SampleObjectClass(1, "abc");
        SampleObjectClass objectClass2 = new SampleObjectClass(2, "def");
        SampleObjectClass objectClass3 = new SampleObjectClass(3, "ijk");
        SampleObjectClass objectClass4 = new SampleObjectClass(4, "xyz");

        System.out.println(objectClass1.toString());
        System.out.println(objectClass2.toString());
        System.out.println(objectClass3.toString());
        System.out.println(objectClass4.toString());
    }
} 