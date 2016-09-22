import java.util.ArrayList;
import java.util.List;

class trees_e{
	public int val;
	public trees_e left;
	public trees_e right;
	public static List<Integer>list=new ArrayList<Integer>();
	public trees_e(int val, trees_e left, trees_e right){
		this.val=val;
		this.left=left;
		this.right=right;
	}
	public int maxDepth(trees_e root){
		if(root==null){
			return 0;
		}
		return (Math.min(maxDepth(root.left),maxDepth(root.right))+1);
	}
}
public class Depth_of_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		trees_e t1=new trees_e(1,null, null);
		trees_e t2=new trees_e(2,null,null);
		trees_e t3=new trees_e(3,null, null);
		trees_e t4=new trees_e(4,null,null);
		trees_e t5=new trees_e(5,null, null);
		trees_e t6=new trees_e(6,null,null);
		trees_e t7=new trees_e(7,null, null);
		trees_e t8=new trees_e(8,null,null);
		trees_e t9=new trees_e(9,null, null);
		trees_e t10=new trees_e(10,null,null);
		t1.left=t2;
		t1.right=t3;
		t2.left=t4;
		t2.right=t5;
		t3.left=t6;
		//t3.right=t7;
		t4.left=t8;
		t4.right=t9;
		t5.left=t10;
		System.out.println(t1.maxDepth(t1));
	}

}
