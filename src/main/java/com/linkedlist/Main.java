package com.linkedlist;


class FoodNode{

    FoodNode nextFood;
    String foodName;
    int index;
    FoodNode(String foodName) {
        this.foodName = foodName;
    }
        
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
}

class GroceryLinkedList{
    int indexPointer = 0;
    FoodNode head;
    //Functions

    void print(){ //Goes through and prints the list
        FoodNode OrigHead = head;
        if (head != null){
            System.out.println(head.foodName);
            head = head.nextFood;
            print();
        } 
        head = OrigHead;
        
    }
    //No clue why, but I have to make it void or else it has weird syntax errors.
    void find(String food){
        FoodNode OrigHead = head;
        for (int i=0; i<1000; i++){
            if (head.foodName != food){
                head = head.nextFood;
            }
            else {
                // return head.index;
                i = 1000;
                System.out.println(head.index);
                
        }
    }
    head = OrigHead;
}

    
    public void append(String food){ //Inserts a node at the end of the linked list.
        if (head == null){
            head = new FoodNode(food);
            indexPointer++;
            head.index = indexPointer;
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
        indexPointer = 1;
        FoodNode OrigHead = newHead;
        newHead.nextFood = head;
        head = newHead;
        //Resets the indeces
        for (int i=0; i<1000; i++){
        if (head != null){
            indexPointer++;
            head.index = indexPointer;
            head = head.nextFood;
        }
        else {

            i = 1000;
            head = OrigHead;
        }
    }
    }

    void insert(String name, FoodNode node){ //Inserts a node in a desired location in a linked list.
        if (head.foodName == name){
            head = node;
        }
    }

    public void remove(String name){
        FoodNode OrigHead = head;
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
        head = OrigHead;
    }
}

public class Main{
    public static void main(String[] args) {

        GroceryLinkedList list = new GroceryLinkedList();
        // Test 1
        System.out.println("");        System.out.println("Test 1");
        list.append("milk");
        list.append("bananas");
        list.append("ice cream");
        list.append("spinach");
        list.append("chicken");
        list.print();
        // Test 2
        System.out.println("");
        System.out.println("Test 2");
        list.remove("ice cream");
        list.print();
        // Test 3
        System.out.println("");
        System.out.println("Test 3");
        list.remove("chicken");
        list.print();
        // Test 4
        System.out.println("");
        System.out.println("Test 4");
        System.out.print("Spinach is at: ");
        list.find("spinach");
        list.print();
        //Test 5
        System.out.println("");
        System.out.println("Test 5");
        list.append("eggs");
        System.out.print("eggs are at: ");
        list.find("eggs");
        list.print();
        // Test 6
        System.out.println("");
        System.out.println("Test 6");
        list.prepend("onions");
        list.print();

    }
}

