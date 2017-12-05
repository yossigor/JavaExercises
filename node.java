
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

public class Main{
  public static void main(String[] args){
   	System.out.println("Linked list:");
    IntNode myNode = new IntNode(60);
    myNode.print();
    IntNode myNode2 = new IntNode(5);
    myNode2.print();
    myNode.setNext(myNode2);
    myNode.print();
  }
}
