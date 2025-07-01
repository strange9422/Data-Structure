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

public class InsertElementIteratively extends SearchElement

{
    Tree inserting(Tree root, int data){
        if(root == null){
            return new Tree(data);
        }
        Queue<Tree> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Tree curr = q.poll();
            if(curr.left!=null){
                q.add(curr.left);
            }else{
                curr.left = new Tree(data);
                return root;
            }
            if(curr.right!=null){
                q.add(curr.right);
            }else{
                curr.right=new Tree(data);
                return root;

            }
        }
        return root;
    }
    public static void main(String[] args) {
        InsertElementIteratively obj = new InsertElementIteratively();
         Tree root = new Tree(5);
        root.left= new Tree(15);
        root.right= new Tree(30);
        root.right.right= new Tree(45);
        obj.inserting(root, 50);
       System.out.println(obj.findNode(root,50));
    }
}
