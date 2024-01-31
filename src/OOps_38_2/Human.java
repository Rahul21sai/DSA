package OOps_38_2;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;

    static long population;// it is same for all so itis static wee declared it wecant change through out

    public Human() {
        System.out.println("hello world");
    }

    static void message(){
        System.out.println("hello world");
       // System.out.println(this.age);// cant use this over here as the object cannot be accesed in static
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population +=1;//static so we use Human instead of this
        Human.message();
    }

    public static void main(String[] args) {
        Main obj = new Main();
        Human clas = new Human();
        int age1 = clas.age;
        System.out.println(age1);

    }
}
