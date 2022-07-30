package com.Bridgelabz.Day14;

import static java.lang.System.exit;

class StackUsingLinkedlist {
    private class Node {
        int data;
        Node link; 
    }
  
    Node top;
    
   StackUsingLinkedlist(){
       this.top = null;
    }
  
  public void push(int x) {
        
        Node temp = new Node();
 
       if (temp == null) {
            System.out.print("\n Heap Overflow");
            return;
        }
        temp.data = x;
        temp.link = top;
        top = temp;
    }
    public void display() {
        if (top == null) {
            System.out.printf("\nStack Underflow");
            exit(1);
        }
        else {
            Node temp = top;
            while (temp != null) {
                System.out.printf("%d->", temp.data);
  
            temp = temp.link;
            }
        }
    }
}

public class StackNew {
    public static void main(String[] args){
        
        StackUsingLinkedlist obj = new StackUsingLinkedlist();
        obj.push(70);
        obj.push(30);
        obj.push(56);
        
        obj.display();
    }
}