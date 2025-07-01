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
public class InsertElementRecuresively  extends SearchElement
{

    Tree RecuresivelyInsertion(Tree root,int data){
        if(root==null){
            return new Tree(data);

        }
        if(root.left!=null){
            RecuresivelyInsertion(root.left,data);
        }else{
            root.left=new Tree(data);
        }
        if(root.right!=null){
            RecuresivelyInsertion(root.right,data);
        }else{
            root.right=new Tree(data);
        }
        return root;
    }
    public static void main(String[] args) {
        InsertElementRecuresively obj = new InsertElementRecuresively();
        Tree root = new Tree(5);
        root.left= new Tree(15);
        root.right= new Tree(30);
        root.right.right= new Tree(45);
        obj.RecuresivelyInsertion(root,50);
       System.out.println(obj.findNode(root,50));
    }
}
