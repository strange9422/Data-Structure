package Tree;

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

public class SizeTree {
    int size(Tree root){
        if(root==null){
            return 0;
        }

        return 1+size(root.left)+size(root.right);
    }
    public static void main(String[] args) {
        SizeTree obj = new SizeTree();
        Tree root = new Tree(5);
        root.left= new Tree(15);
        root.right= new Tree(30);
        root.right.right= new Tree(45);
        System.out.print(obj.size(root));
    }
    
}
