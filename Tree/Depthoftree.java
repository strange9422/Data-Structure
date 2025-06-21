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
class Depthoftree{
    int maxDepth(Tree root){
        if(root==null){
            return 0;
        }
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        return Math.max(l,r)+1;
    }
    public static void main(String[] args) {
        Depthoftree obj = new Depthoftree();
        Tree root = new Tree(5);
        int ans =obj.maxDepth(root);
        System.out.println(ans);
    }
}