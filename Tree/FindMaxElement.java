package Tree;
class TreeNode{
    int data;
    TreeNode right;
    TreeNode left;
    public TreeNode(int data){
        this.data=data;
        this.right=null;
        this.left=null;
    }
}
public class FindMaxElement {
    int max=0;
     int maxElement(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=maxElement(root.left);
        int right=maxElement(root.right);
        max=Math.max(left,right);
        return Math.max(root.data,max);
    }
    public static void main(String[] args) {
        FindMaxElement obj = new FindMaxElement();
        TreeNode root = new TreeNode(10);
        root.left= new TreeNode(15);
        root.right= new TreeNode(1);
        System.out.println(obj.maxElement( root));
       
    }
}
