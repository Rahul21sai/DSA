package Oops_42_5.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArraylist {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;


    public CustomArraylist() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];
        //copy the current items in the new array
        for (int i = 0; i <data.length ; i++) {
            temp[i] = data[i];

        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index, int value){
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
        CustomArraylist list = new CustomArraylist();
//        list.add(5);
//        list.add(5);
//        list.add(5);
//        list.add(5);
        for (int i = 0; i <15 ; i++) {
            list.add(2 * i);

        }
        System.out.println(list);

    }
}
