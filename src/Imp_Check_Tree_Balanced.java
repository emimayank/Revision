import java.util.LinkedList;
import java.util.Queue;

class trees_7{
	public static int array[]=new int[1000];
	public int val;
	public trees_7 left;
	public trees_7 right;
	public trees_7(int val, trees_7 left, trees_7 right){
		this.val=val;
		this.right=right;
		this.left=left;
	}
	public int getHeight(trees_7 root){
		if(root==null){
			return -1;
		}
		return Math.max(getHeight(root.left),getHeight(root.right));
	}
	public boolean isBalanced(trees_7 root) {
		// TODO Auto-generated method stub
		if(root == null){
			return true;
		}
		int heightDiff=getHeight(root.left)-getHeight(root.right);
		if(Math.abs(heightDiff)>1){
			return false;
		}
		else{
			return isBalanced(root.left) && isBalanced(root.right);
		}
		
	}
}
public class Imp_Check_Tree_Balanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		trees_7 t1=new trees_7(1,null, null);
		trees_7 t2=new trees_7(2,null,null);
		trees_7 t3=new trees_7(3,null, null);
		trees_7 t4=new trees_7(4,null,null);
		trees_7 t5=new trees_7(5,null, null);
		trees_7 t6=new trees_7(6,null,null);
		trees_7 t7=new trees_7(7,null, null);
		trees_7 t8=new trees_7(8,null,null);
		trees_7 t9=new trees_7(9,null, null);
		trees_7 t10=new trees_7(10,null,null);
		t1.left=t2;
		t1.right=t3;
		t2.left=t4;
		t2.right=t5;
		t3.left=t6;
		t3.right=t7;
		t4.left=t8;
		t4.right=t9;
		t5.left=t10;
		System.out.println(t1.isBalanced(t1));
	}

}
