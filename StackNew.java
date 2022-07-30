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
		  public boolean isEmpty()
		    {
		        return top == null;
		    }
		   public int peek()
		   {
		     
		       if (!isEmpty()) {
		           return top.data;
		       }
		       else {
		           System.out.println("Stack is empty");
		           return -1;
		       }
		   }
		  public void pop() {
		        if (top == null) {
		            System.out.print("\nStack is Empty");
		            return;
		        }
		  
		        top = (top).link;
		    }
		    public void display() {
		        if (top == null) {
		            System.out.printf("\nStack is Empty");
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
		        System.out.printf("\nTop element is %d\n", obj.peek());
		       
		        obj.pop();
		        obj.pop();
		        obj.pop();
		        obj.display();
		        System.out.printf("\nTop element is %d\n", obj.peek());
		    }
		}