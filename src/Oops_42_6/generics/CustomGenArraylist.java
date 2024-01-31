package Oops_42_5.generics;

import java.util.Arrays;

public class CustomGenArraylist<T> {

    // we can create by object type
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;


    public CustomGenArraylist() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        //copy the current items in the new array
        for (int i = 0; i <data.length ; i++) {
            temp[i] = data[i];

        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }
    public T get(int index){

        return (T)data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        //ArrayList list = new ArrayList();
//        list.add(12);
//        list.remove(0);
//        list.get(0);
//        list.set(1,2323);
//        list.size();
//        list.isEmpty();
//        CustomGenArraylist list = new CustomGenArraylist();
//        list.add(5);
//        list.add(5);
//        list.add(5);
//        list.add(5);
//        for (int i = 0; i <15 ; i++) {
//            list.add(2 * i);
//
//        }
//        System.out.println(list);


        CustomGenArraylist list = new CustomGenArraylist();
        for (int i = 0; i <15; i++) {
            list.add(i);

        }
        System.out.println(list);
    }
}
