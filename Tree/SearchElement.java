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
public class SearchElement {
    boolean findNode(Tree root,int target){
        if(root == null){
            return false;
        }
        if(root.data==target){
            return true;
        }
        return findNode(root.left, target) || findNode(root.right, target);
    }
    public static void main(String[] args) {
        SearchElement obj = new SearchElement();
        Tree root = new Tree(5);
        root.left= new Tree(15);
        root.right= new Tree(30);
        root.right.right= new Tree(45);
        System.out.println(obj.findNode(root, 309));
    }
}
