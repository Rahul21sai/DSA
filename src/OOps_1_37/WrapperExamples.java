package OOps_1_37;

public class WrapperExamples {
    public static void main(String[] args) {
//        int a = 10;// primitive
//        int b = 20;
        Integer a = 10;
        Integer b = 20;

        Integer num = 45; //object it is a wrapper class

        swap1(a,b);
        System.out.println(a + " " + b);

        final A rahul = new A("rahul");
        rahul.name= "othername";
        // when non primitive is fina; you cannot re assign it
       //  rahul = new A("new object"); // we cannot do

        // in primitive there is no pass by referenece it pass by value so no swap
//    final int bonus = 2;
//    bonus =3;// we cant modify as we used final keyword

        A obj;
        for (int i = 0; i < 10000000; i++) {
            obj = new A("Random name");
        }
    }
    static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
    }
    static void swap1(Integer a , Integer b) {// it s  a final class so Integer a b will n ot swap
        Integer temp = a;
        a = b;
        b = temp;
    }
}
class A{
    final int num = 10;
    String name;

    public A(String name) {
        System.out.println("object is created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destoryed");
    }
}
