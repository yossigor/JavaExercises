
import java.util.*;


public class IntNode{
 	//fields:
  	private int value;
	private IntNode next=null;
	//methods:
  	public IntNode(int valueFromOutside){
      this.value=valueFromOutside;
  	}
  	public void print(){
      System.out.println("Node={val="+this.value+" next="+this.next+"}");
  	}
  	public int getValue(){
    	return this.value;
    }
  	public IntNode getNext(){
  		return this.next;
    }
  	public void setNext(IntNode node){
    	this.next = node;  
    }
}

public class IntList{
	//fields:
  	private int size;//number of elemts.
  	private IntNode head;
  	//methods:
  	public IntList(){
      	System.out.println("Making list");
    	this.size=0;
      	this.head=null;
    }
  	public int getSize(){
    	return this.size;
    }
  	public void insert(int value){
  	//making new node
    //changing the head to point on the new node
    //new node next pointing to old head
    //change size
    IntNode newNode = new IntNode(value);
	newNode.setNext(this.head);
     if(this.size==0){
        head = newNode;
     }else{
        head.setNext(newNode);
     }
      this.size = this.size +1;
    }
}

public class Main{
  public static void main(String[] args){
    IntList list = new IntList(); 
    System.out.println(list.getSize());
    list.insert(10);
    System.out.println(list.getSize());
	}
}
