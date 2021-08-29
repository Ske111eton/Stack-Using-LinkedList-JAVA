package practice;

class Node{                                      // Node Class
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}

class MyLinkedList{                              // Linked List Implementation
    Node head;

    public void add(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
            node.next = null;
        }
    }
    public int remove() throws Exception{
        Node temp = head;
        if(head==null){
            throw new Exception("Empty LinkedList");
        }

            if(temp.next == null){
                Node toRemove = head;
                head = null;
                return toRemove.data;
            }
            while(temp.next.next != null){
                temp = temp.next;
            }
            Node toRemove = temp.next;
            temp.next = null;
            return toRemove.data;
    }

    public int getLast() throws Exception{
        if(head == null){
            throw new Exception("Empty linked list");
        }
        Node temp = head;
        while(temp.next!= null){
            temp =temp.next;
        }
        return temp.data;
    }
    public boolean isEmpty(){
        return head == null;
    }

    public void show(){
        if(isEmpty()){
            System.out.println("Empty");
        }
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.data + " ");
            temp =temp.next;
        }
        System.out.println(temp.data);
    }
}

class MyStack{                                                   //Stack implementaion
    MyLinkedList stack = new MyLinkedList();

    public void push(int data){
        stack.add(data);
    }
    public int pop() throws Exception{
        if(stack.isEmpty()){
            throw new Exception("Empty stack");
        }
        return stack.remove();
    }
    public int peek() throws Exception{
        if(stack.isEmpty()){
            throw new Exception("Empty stack");
        }
        return stack.getLast();
    }
public void display(){
        stack.show();
}

}

public class Practice {                                          //Main Class
    public static void main(String[] args) throws Exception{
        MyStack s = new MyStack();

    }
}
