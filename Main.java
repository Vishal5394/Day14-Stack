package com.Bridgelabz.Day14;


public class Main { 
    private static int front, rear, capacity; 
    private static int queue[]; 
   
    Main(int size) { 
        front = rear = 0; 
        capacity = size; 
        queue = new int[capacity]; 
    } 
   
    // insert an element into the queue
    static void queueEnqueue(int item)  { 
        // check if the queue is full
        if (capacity == rear) { 
            System.out.printf("\nQueue is full\n"); 
            return; 
        } 
   
        // insert element at the rear 
        else { 
            queue[rear] = item; 
            rear++; 
        } 
        return; 
    }
    
    static void queueDisplay() 
    { 
        int i; 
        if (front == rear) { 
            System.out.printf("Queue is Empty\n"); 
            return; 
        } 
   
        // traverse front to rear and print elements 
        for (i = front; i < rear; i++) { 
            System.out.printf(" %d => ", queue[i]); 
        } 
        return; 
    } 
     
   // public class Queue {
        public static void main(String[] args) {  
            Main q = new Main(4);
            System.out.println("Initial Queue:");
          
            q.queueDisplay(); 
       
            // inserting elements in the queue 
            q.queueEnqueue(56); 
            q.queueEnqueue(30); 
            q.queueEnqueue(70); 
            
       
            // print Queue elements 
            System.out.println("Queue after Enqueue Operation:");
            q.queueDisplay(); 
   
        }
    }