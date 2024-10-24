package com.linkedlist;


class FoodNode{
    FoodNode nextFood;
    String foodName;
    FoodNode(String foodName) {
        this.foodName = foodName;
    }
        
    String getFoodName(){ //Returns foodName. Useless.
        return foodName;
    }
    
    public void setFoodName(String name){ //Sets foodName. Useless.
        foodName = name;
    }
    
    public static String getNextFood(){ //Returns next Food. Useless.
        return nextFood;
    }
    
    public static void setNextFood(FoodNode nxt){ //Sets next Food. Useless.
        nextFood = nxt;
    }
}

class GroceryLinkedList{
    int index = 0;
    FoodNode head;
    //Functions

    void print(){ //Goes through and prints the list
        System.out.println(head.foodName);
        if (head.foodName != null){
            head = head.nextFood;
        } 
    }
    
    public void append(String food){ //Inserts a node at the end of the linked list.
        if (index>0){
            FoodNode.setNextFood = food;
        }

        if (head == null){
            head = new FoodNode(food);
            index++;
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

    public void remove(String name){
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

public class Main{
    public static void main(String[] args) {

        GroceryLinkedList list = new GroceryLinkedList();
        // Test 1
        System.out.println("Test 1");
        list.append("milk");
        list.append("bananas");
        list.append("ice cream");
        list.append("spinach");
        list.append("chicken");
        list.print();
        // Test 2
        System.out.println("Test 2");
        list.remove("ice cream");
        list.print();
        // Test 3
        System.out.println("Test 3");
        list.remove("chicken");
        list.print();
        // Test 6
        System.out.println("Test 6");
        list.prepend("onions");
        list.print();

    }
}

