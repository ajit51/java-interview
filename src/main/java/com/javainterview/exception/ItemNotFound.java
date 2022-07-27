package com.javainterview.exception;

public class ItemNotFound extends Exception{
    ItemNotFound(String s){
        super(s);
    }
}

class Demo1{
    static void find(int arr[], int item) throws ItemNotFound {
        boolean flag = false;
        for(int i = 0; i < arr.length; i++){
            if (item == arr[i])
                flag = true;
        }
        if (!flag)
            throw new ItemNotFound("Item not found"); //calling constructor of user-defined exception class
        else {
            System.out.println("Item found");
        }
    }

    public static void main(String[] args) {
        try {
            find(new int[]{12, 25, 45}, 10);
        } catch (ItemNotFound e) {
            System.out.println(e);
        }
    }
}
