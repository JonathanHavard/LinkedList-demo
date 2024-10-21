package com.linkedlist;

class FoodNode{
    FoodNode nextFood;
    String foodName;
    public FoodNode(String foodName) {
        this.foodName = foodName;
        }

class GroceryLinkedList{
    FoodNode head;
    //Functions
    String getFoodName(){ //Returns foodName. Useless.
        return foodName;
    }

    public void setFoodName(String name){ //Sets foodName. Useless.
        foodName = name;
    }

    FoodNode getNextFood(){ //Returns next Food. Useless.
        return nextFood;
    }
    public void setNextFood(FoodNode nxt){ //Sets next Food. Useless.
        nextFood = nxt;
    }
    void print(){ //Goes through and prints the list
        System.out.println(head.foodName);
        if (head.foodName != null){
            head = head.nextFood;
        } 
    }
    
    public void append(String food){ //Inserts a node at the end of the linked list.
        if (head == null){
            head = new FoodNode(food);
            return;
        }
        FoodNode current = head;
        while (current.nextFood != null){
            current = current.nextFood;
        }
        current.nextFood = new FoodNode(food);
    }

    public void prepend(String name){ //Inserts a node at the beginning of the linked list.
        FoodNode newHead = new FoodNode(name);
        newHead.nextFood = head;
        head = newHead;
    }

    void insert(String name, FoodNode node){ //Inserts a node in a desired location in a linked list.
        if (head.foodName == name){
            head = node;
        }
    }

    void remove (String food){ //Removes a node
        head = null;   
    }
        boolean isEmpty(){
        if (getFoodName() == null){
        return true;
    }
        else{
            return false;
        }
    }

    public void deleteWithValue(String name){
        if(head == null) return;
        if(head.foodName == name){
            head = head.nextFood;
            return;
        }
        


        FoodNode current = head;
        while (current.nextFood != null) {
            if(current.nextFood.foodName == name){
                current.nextFood = current.nextFood.nextFood;
                return;
            }
            current = current.nextFood;
        }
    }
}
}
public class Main{
    public static void main(String[] args) {
    }
}

