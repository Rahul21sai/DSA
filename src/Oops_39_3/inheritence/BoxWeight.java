package Oops_39_3;

public class BoxWeight extends Box {
    double wieght;

    public BoxWeight(){
        this.wieght = -1;
    }
    BoxWeight(BoxWeight other){
        super(other);
        wieght = other.wieght;
    }
    BoxWeight(double side, double wieght){
        super(side);
        this.wieght = wieght;
    }

    public BoxWeight(double l, double h, double w, double wieght) {
        super(l, h, w);// call the parent class constructor
        // used to initialise values present in parent class
        this.wieght = wieght;
//        System.out.println(super.weight);// if both parent and child class have same variable name we use super class to get object of parent class
        System.out.println(super.h);//we cam use super instead of this
    }

}
