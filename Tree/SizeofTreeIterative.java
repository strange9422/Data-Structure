package Tree;

import  java.util.LinkedList;
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

public class SizeofTreeIterative {

    int sizeIteratively(Tree root){
        if(root==null){
            return 0;
        }
        int ans=0;
        Queue <Tree> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Tree curr = q.poll();
            ans++;
            if(curr.left!=null){
                q.add(curr.left);

            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        SizeofTreeIterative obj =new SizeofTreeIterative();
         Tree root = new Tree(5);
        root.left= new Tree(15);
        root.right= new Tree(30);
        root.right.right= new Tree(45);
        System.out.print(obj.sizeIteratively(root));
    }
}
