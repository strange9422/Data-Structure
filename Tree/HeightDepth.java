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

public class HeightDepth {
    int height(Tree root){
        if(root==null){
            return 0;
        }
        int l=height(root.left);
        int r = height(root.right);
        return 1+Math.max(l, r);
    }
    public static void main(String[] args) {
        HeightDepth obj = new HeightDepth();
        Tree root = new Tree(5);
        root.left= new Tree(15);
        root.right= new Tree(30);
        root.right.right= new Tree(45);
        System.out.print(obj.height(root));
    }
}
