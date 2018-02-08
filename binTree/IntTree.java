import java.lang.*;
public class IntTree{
    private int size;
    private IntBinNode root;
    public IntTree(){
        this.size = 0;
        this.root = null;
    }
    public void Insert(int value){
        if(root == null){//tree is empty
            this.root = new IntBinNode(value);
            return;
        }
        //complete this class
    }
}