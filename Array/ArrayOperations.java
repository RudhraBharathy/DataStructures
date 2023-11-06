package com.DataStructures.Array;

public class ArrayOperations{
    private static final int DEFAULT_ARRAY_SIZE = 5;
    int size = DEFAULT_ARRAY_SIZE;
    int index = 0;
    int[] array;

    public ArrayOperations() {
        this.array = new int[DEFAULT_ARRAY_SIZE];
    }

    public void insert(int val){
        if (array.length == index){
            int[] temp = new int[size * 2];
            for (int i = 0; i < array.length; i++) {
                temp[i] = array[i];
            }

            array = temp;
            size = temp.length;
            insert(val);
        }else{
            array[index] = val;
            index++;
        }
    }

    public void remove(int indexPos){
        if (indexPos>index) {
            System.out.println("Array Index Out of Bound Exception");
        }
        else{
            for (int i = indexPos; i < index; i++) {
                array[i] = array[i+1];
            }
            index--;
        }
    }
    public void insert(int val,int indexPos){
        if (indexPos==index){
            array[indexPos] = val;
            index++;
        } else if (indexPos<=index) {
            array[indexPos] = val;

        } else{
            System.out.println("Array Index Out of Bound Exception");
        }
    }

    public void show(){
        System.out.print("[");
        for (int i = 0; i < index; i++) {
            System.out.print(array[i]);
            if(i==index-1){
                System.out.print("]");
                return;
            }
            System.out.print(", ");
        }
        System.out.println();
        System.out.println("Size of Array : "+index);
    }

}
