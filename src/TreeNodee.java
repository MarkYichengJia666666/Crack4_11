import java.util.Random;

/**
 * Created by jiayicheng on 17/8/13.
 */
public class TreeNodee {
class Tree{
    TreeNode root=null;
    public int size(){return root==null? 0:root.size;}
    public TreeNode getRandomNode()
    {
        if(root==null) return null;
        Random random=new Random();
        int i=random.nextInt(size());
        return root.getIthNode(i);
    }

    public void insertInOrder(int value)
    {
        if(root==null)
            root=new TreeNode(value);
        else
            //root.insertInorder(value);
    }
}

class TreeNode{
    private int data;
    public TreeNode left;
    public TreeNode right;
    private int size=0;

    public TreeNode(int d)
    {
        data=d;
        size=1;
    }
    public TreeNode getIthNode(int d){
        int leftsize= left==null?0:left.size;
        if(d<leftsize)
            return left.getIthNode(d);
        else if(d==leftsize)
            return this;
        else
            return right.getIthNode(d-leftsize-1);
    }
}
}
