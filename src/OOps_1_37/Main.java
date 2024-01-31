package OOps_1_37;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] rno = new int[5];
        // store 5 names
        String[] name = new String[5];
        //store 5 data stuedents (roll ,name ,marks)
        int[] rnos = new int[5];
        String[] names = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];
        students[0] = new Student();
        students[0].name = "roht";
        students[0].rno = 20;
//        System.out.println(students[0].name);



        Student student1 = new Student();
        student1.name = "rahul";
        student1.rno =12;
        student1.marks = 98.5f;
//        System.out.println(Arrays.toString(students));
//        System.out.println(student1.marks);
//        System.out.println(student1.name);
//        System.out.println(student1.rno);
//        System.out.println(student1);
        student1.changeName("hi");
        student1.greetiong();
        Student student2  = new Student(13,"rohan",45);
        System.out.println(student2.name);

        Student random = new Student(student1);
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;
        one.name= "something";
        System.out.println(two.name);



    }

}
//create a class
//for every single student
class  Student {
    int rno;
    String name;
    float marks = 90.0f;

    void greetiong(){
        System.out.println("hello my name is" + this.name);

    }
    void changeName(String newName){
       this.name = newName;
    }
// we need a way to add the values of the above properties object by objct

    //we need one word to access every object

    Student(){
//        this.rno =13;
//        this.name = "ro";
//        this.marks = 96;
        // this is how you call a constructor from another constructor
        // internally : new Student(13,"default person",100.0f)
        this(13,"default person",100.0f);
    }
   // Student arpit = new Student(17,"Arpit",89.7f);
    //here this will be replaed with arpit
    Student(int rno,String name,float marks){
        this.rno = rno;
        this.name=name;
        this.marks = marks;
    }
    Student (Student other){
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }


}

// primitives are stored in the stack memory
// objects are stored in heap memory


