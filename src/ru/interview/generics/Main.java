package ru.interview.generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer[] arr1={1,54,64,234,623,3};
        Double[] arr2={3.23,32.1,32.6,4.0,4.3,3.4};
        People[] arr3={new People("dsfcv"),new People("vsvs"),new People("gfvasvg")};

        exchange(arr1,1,5);
        exchange(arr2,4,5);
        exchange(arr3,2,1);

        print(arr1);
        System.out.println(toArrayList(arr1));

        print(arr2);
        print(arr3);
    }



    public static <T> void exchange(T[] arr,int id1,int id2){
        Object temp= arr[id1];
        arr[id1]=arr[id2];
        arr[id2]=(T)temp;
    }

    public static <T> void print (T[] arr){
        for (T item:arr) {
            System.out.print(item+" ");
        }
        System.out.println();
    }

    public static <T> ArrayList toArrayList(T[] arr){
        ArrayList<T> arrayList= new ArrayList(Arrays.asList(arr));
        return arrayList;
    }
}

class People{
    String name;

    public People(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString()+" "+name;
    }
}