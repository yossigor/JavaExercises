import java.lang.*;
public class IntBinNode{
    private int value;
    private IntBinNode left;
    private IntBinNode right;
    public IntBinNode(int value){
        this.value = value;
        this.left = null;
        this.right = null;
    }
    public IntBinNode(int value,IntBinNode left, IntBinNode right){
        this.value = value;
        this.left = left;
        this.right = right;
    }
    public void ToString(){
        System.out.println(value);
    }
    public void SetValue(int value){
        this.value = value;
    }
    public int GetValue(int value){
        return this.value;
    }
    public void SetLeft(IntBinNode left){
        this.left = left;
    }
    public IntBinNode GetLeft(){
        return this.left;
    }
    public void SetRight(IntBinNode right){
        this.right = right;
    }
    public IntBinNode GetRight(){
        return this.right;
    }
    public void inorder(){
        if(this.left == null && this.right == null){//leaf
            ToString();
            return;
        }
        if(this.left!=null){
            this.left.inorder();
        }
        ToString();
        if(this.right!=null){
            this.right.inorder();
        }
    }
    public void preorder(){
        if(this.left == null && this.right == null){//leaf
            ToString();
            return;
        }
        ToString();
        if(this.left!=null){
            this.left.inorder();
        }
        if(this.right!=null){
            this.right.inorder();
        }
    }
    public void postorder(){
        if(this.left == null && this.right == null){//leaf
            ToString();
            return;
        }
        if(this.left!=null){
            this.left.inorder();
        }
        if(this.right!=null){
            this.right.inorder();
        }
        ToString();
    }
}