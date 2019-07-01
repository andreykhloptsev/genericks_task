package ru.interview.generics.FruitBoxTask;

import java.util.ArrayList;

/**
 * Created by DIO
 */
public class Box<T extends Fruit> {
    private ArrayList<Fruit> arrayList = new ArrayList();
    private float weight = 0f;

    public float getWeight() {
        return weight;
    }
    //put fruit in the box
    //you couldnt put orange into apple box
    public  void put(Fruit item){
            if (this.weight==0) {
                weight += item.getWeight();
                this.arrayList.add(item);
                System.out.println("You put fruit in the box");
            }
          else if (item.getWeight()==arrayList.get(0).getWeight()){
              if (!arrayList.contains(item)){
              weight+=item.getWeight();
            this.arrayList.add(item);
          System.out.println("You put fruit in the box");
          } else System.out.println("Fruit is already in the box");
          }else System.out.println("wrong box");
    }
    //compare weights of two boxes
    public boolean compare(Box<?> box){
        return this.weight==box.getWeight();
    }

    public void shift(Box<?> box){
        if (this.weight==0 || box.getWeight()==0){
            System.out.println("One of the boxes is empty");
        } else if (this.arrayList.get(0).getWeight()==box.arrayList.get(0).getWeight()){
            box.arrayList.addAll(this.arrayList);
            box.weight+=this.getWeight();
            this.arrayList.clear();
            this.weight=0;
            System.out.println("Boxes have been shifted");
        } else System.out.println("boxes have different type");
    }


}
