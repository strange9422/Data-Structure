package Tree;
import java.util.LinkedList;
import java.util.Queue;
class Tree{
    int data;
    Tree right;
    Tree left;
    public Tree(int data){
        this.data=data;
        this.right=null;
        this.left=null;
    }
}
public class FindMaxWithoutRecursion {
    int MaxWithoutRecursion (Tree root){
        int max=0;
        if(root==null){
            return 0;
        }
        Queue <Tree> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Tree curr = q.remove();
            if(curr.data>max){
                max=curr.data;
            }
            if(curr.left!=null)
            {
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        FindMaxWithoutRecursion obj = new FindMaxWithoutRecursion();
        Tree root = new Tree(5);
        root.left= new Tree(15);
        root.right= new Tree(30);
        root.right.right= new Tree(45);
        System.out.println(obj.MaxWithoutRecursion(root));
    }
}
    
    

