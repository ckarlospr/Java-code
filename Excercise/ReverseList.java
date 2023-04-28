package Excercise;

import java.lang.reflect.Constructor;

import javax.management.ConstructorParameters;

public class ReverseList {
    
    public static void reverse(Node head){
        Node currentNode, tempNode, previus;
        currentNode = head; 
        
        while(true){
            tempNode =  head.next;      // 2            | 3                 | NULL
            currentNode.next = previus; // -> NULL      | -> 1 -> NULL      | -> 2 -> 1 -> NULL
            previus = currentNode;      // 1 -> NULL    | 2 -> 1 -> NULL    | 3 -> 2 -> 1 -> NULL
            if(tempNode == null) break;
            currentNode = tempNode;     // 2            | 3                 | 
        }
        //return previus
    }
    
}
