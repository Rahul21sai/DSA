package Oops_39_3;

public class Main {
    public static void main(String[] args) {
        Box box =  new Box();
        System.out.println(box.l+" "+box.h+" "+box.w);

        BoxWeight box3 = new BoxWeight();
        BoxWeight box4 = new BoxWeight(2,3,4,5);

        Box box5 = new BoxWeight(2,3,4,5);
        System.out.println(box5.w);

        // there are many variabvles in both parent and child classes
        // you are given access to variables that are in the ref type i.e boxWeight
        // hence you should have access to weight variable
        //this also means that the ones you are trying to access should be intialised
        // but here when the obj itself is of type parent class how will you call the constructor of child class
        //this wjy error
//        BoxWeight box6 = new Box(2,3,4);
//        System.out.println(box6);
    }
}
