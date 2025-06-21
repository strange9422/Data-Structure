package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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

public class Reverselevelorder {
    ArrayList<Integer> reverse(Tree root){
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Queue<Tree> q = new LinkedList<>();
        Stack <Tree> stk = new Stack<>();
        q.add(root);
        while(!q.isEmpty()){
            Tree curr = q.poll();
            stk.push(curr);
            if(curr.right!=null){
                q.add(curr.right);
            }
            if(curr.left!=null){
                q.add(curr.left);
            }

        }
        while(!stk.isEmpty()){
            ans.add(stk.pop().data);
        }
        return ans;
    }
    public static void main(String[] args) {
        Tree root = new Tree(5);
        root.left= new Tree(6);
        root.right = new Tree(8);
        Reverselevelorder obj = new Reverselevelorder();
       ArrayList <Integer> ans = obj.reverse(root);
       System.out.println(ans);
    }
}
