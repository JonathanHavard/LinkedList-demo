package com.linkedlist;

class FoodNode{
    FoodNode nextFood;
    String foodName;
    public FoodNode(String foodName) {
        this.foodName = foodName;
        }
    }

public void GroceryLinkedList(){
    FoodNode head;
    

    public void append(String food){
        if (head == null){
            head = new FoodNode(food);
            return;
        }
        FoodNode current = head;
        while (current.next != null){
            current = current.next();
        }
        current.getNextFood() = new FoodNode(food);
    }

    public void prepend(String name){
        FoodNode newHead = new FoodNode(name);
        newHead.next = head;
        head = newHead;
    }

    public void deleteWithValue(String name){
        if(head == null) return;
        if(head.foodName = foodName){
            head = head.next;
            return;
        }

        FoodNode current = head;
        while (current.next != null) {
            if(current.next.FoodName == name){
                current.next(current.next.next);
                return;
            }
            current = current.next;
        }
    }
}
    // FoodNode current = head;
    // while (current.next != null){
    //     if (current.next.name == name){
    //         current.next = current.next.next;
    //         return;
    //     }
    //     current = current.next;
    // }
    
    //     String getFoodName(){
    //         return foodName;
    //     }
    //     public void setFoodName(String name){
    //         foodName = name;
    //     }
    // FoodNode getNextFood(){
    //     return nextFood;
    // }
    // public void setNextFood(FoodNode nxt){
    //     nextFood = nxt;
    // }
//         FoodNode current = head;

//         current.next = new FoodNode(nxt);
//     }
// }



//     }
//     //Goes through the linked list printing everything
// void print(){
//     curFoodNode = this.FoodNode;
//     system.out.println(curFoodNode.getFoodName());
//     if (curFoodNode.getNextFood != null){
//         this.FoodNode = curFoodNode.getNextFood();
//     }
// }
// //---------------------------------------------------------------------------------------
// //Inserts a node. I'll come back to this
//     void insert(int index, FoodNode node){
        
//     }
// //---------------------------------------------------------------------------------------
//     //Also see inset at start and end.
//     boolean isEmpty(){
//         if (getFoodName == null){
//         return true;
//     }
//         else{
//             return false;
//         }

//     }
// //---------------------------------------------------------------------------------------
// //Search function needs work
//     int Find(string food){
//         if (food == getFoodName()){
//             return index;
//         }\
//     }
// //---------------------------------------------------------------------------------------
//     void remove (String food){
//         //idk
//     }
// //---------------------------------------------------------------------------------------
//     public class LinkedList{
//         Node head;
//     }

// }


// public class LinkedListAssig {
//     public static void main(String[] args) {
        
//     }

// }
 