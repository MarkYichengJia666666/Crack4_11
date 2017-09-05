import java.util.Random;

import static com.sun.tools.doclint.Entity.le;

/**
 * Created by jiayicheng on 17/8/13.
 */
public class TreeNode {
    private int data;
    public TreeNode left;
    public TreeNode right;
    private int size=0;

    public TreeNode(int d)
    {
        data=d;
        size=1;
    }

    public TreeNode getRandom()
    {
        int leftSize= left==null? 0:left.size();
        Random random=new Random();
        int index=random.nextInt(size);
        if(index<leftSize)
            return left.getRandom();
          else if(index==leftSize)
              return this;
             else
                 return right.getRandom();
    }

    public void insertInorder(int d)
    {
        if(d<=data)
            if(left==null)
                left=new TreeNode(d);
            else
                left.insertInorder(d);
        else
            if(right==null)
                right=new TreeNode(d);
            else
                right.insertInorder(d);
        size++;
    }

    public int size(){
        return size;
    }
    public int data(){
        return data;
    }

    public TreeNode find(int d)
    {if(this==null)
        return null;

        if(d==data)
        { return this;}
        else
        { if(d>=data)
        { return right==null? null:right.find(d);}
            else
        { return left==null? null:left.find(d);}}

    }

}
