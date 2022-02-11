package Prog_Pack_1;

public class prog_pack_1_doubly_linked_list {  
   class Node{  
        int data;  
        Node prev;  
        Node next;  
 
        public Node(int data) {  
            this.data = data;  
        }  
}  
 
     
    Node head, end = null;  
 
 
 public void Insert_Node(int data) {  
     
        Node newNode = new Node(data);  
 
         if(head == null) {  
           
            head = end = newNode;  
            head.prev = null;  
            end.next = null;  
                                   }  
        else {  
           
            end.next = newNode;  
            newNode.prev = end;  
            end = newNode;  
            end.next = null;  
        }  
    }  
 
   
    public void Delete_Beg() {  
       
        if(head == null) {  
            return;  
        }  
        else {  
             
            if(head != end) {  
               head = head.next;  
               head.prev = null;  
            }  
           
            else {  
                head = end = null;  
            }  
        }  
    }  
 
   
 public void Display() {  
       
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        while(current != null) {  
           
 
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }  
 
    public static void main(String[] args) {  
 
    	prog_pack_1_doubly_linked_list DoubList = new prog_pack_1_doubly_linked_list();  
         
    	DoubList.Insert_Node(10);  
    	DoubList.Insert_Node(8);  
    	DoubList.Insert_Node(4);  
    	DoubList.Insert_Node(2);  
       
        System.out.println("Created Doubly Linked List: ");  
        DoubList.Display();  
         
        DoubList.Delete_Beg();  
           
         System.out.println("List after Deletion ");
         DoubList.Display();  
        }  
    }  



