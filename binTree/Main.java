import java.lang.*;
public class Main{
    public static void main(String[] args){
        IntBinNode node1 = new IntBinNode(1);
        IntBinNode node2 = new IntBinNode(2,node1,null);
        IntBinNode node3 = new IntBinNode(3);
        IntBinNode node4 = new IntBinNode(10,node2,node3);
        node4.inorder();
    }
}