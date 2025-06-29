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
public class SearchingWithoutRecursion {
    boolean search(Tree root,int target){
        if(root == null){
            return false;
        }
        Queue <Tree> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Tree curr = q.remove();
            if(curr.data == target){
                return true;
            }
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }

        return false;
    }
    public static void main(String[] args) {
        SearchingWithoutRecursion obj = new SearchingWithoutRecursion();
        Tree root = new Tree(5);
        root.left= new Tree(15);
        root.right= new Tree(30);
        root.right.right= new Tree(45);
        System.out.println(Boolean.toString(obj.search(root, 45)));
    }
}
