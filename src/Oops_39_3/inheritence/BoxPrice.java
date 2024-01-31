package Oops_39_3;

public class BoxPrice extends BoxWeight{
    double cost;

    public BoxPrice(double l, double h, double w, double wieght, double cost) {
        super(l, h, w, wieght);
        this.cost = cost;
    }

    BoxPrice(){
        super();
        this.cost= -1;
    }
    BoxPrice(BoxPrice other){
        super(other);
        this.cost = other.cost;
    }

    public BoxPrice(double side, double wieght, double cost) {
        super(side, wieght);
        this.cost = cost;
    }
}
