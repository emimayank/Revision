class trees_c{
	public static int array[]=new int[1000];
	public int val;
	public trees_c left;
	public trees_c right;
	public trees_c(int val, trees_c left, trees_c right){
		this.val=val;
		this.right=right;
		this.left=left;
	}
	public boolean checkSubtree(trees_c root, trees_c sub){
		if(sub==null){
			return true;
		}
		if(root==null){
			return false;
		}
		boolean b=compareTree(root, sub);
		if(b==false && root.right!=null){
			b= checkSubtree(root.right,sub);
		}
		if(b==false && root.left!=null){
			b= checkSubtree(root.left,sub);
		}
		return b;
	}
	private boolean compareTree(trees_c root, trees_c sub) {
		// TODO Auto-generated method stub
		if(root==null && sub==null){
			return true;
		}
		if(root.val==sub.val && compareTree(root.left,sub.left) && compareTree(root.right,sub.right)){
			return true;
		}
		return false;
	}
}
public class Imp_check_Subtree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		trees_c t1=new trees_c(1,null, null);
		trees_c t2=new trees_c(2,null,null);
		trees_c t3=new trees_c(3,null, null);
		trees_c t4=new trees_c(4,null,null);
		trees_c t5=new trees_c(5,null, null);
		trees_c t6=new trees_c(6,null,null);
		trees_c t7=new trees_c(7,null, null);
		trees_c t8=new trees_c(8,null,null);
		trees_c t9=new trees_c(9,null, null);
		trees_c t10=new trees_c(10,null,null);
		t1.left=t2;
		t1.right=t3;
		t2.left=t4;
		t2.right=t5;
		t3.left=t6;
		t3.right=t7;
		t4.left=t8;
		t4.right=t9;
		t5.left=t10;
		
		trees_c ta=new trees_c(4,null,null);
		trees_c tb=new trees_c(8,null,null);
		trees_c tc=new trees_c(9,null,null);
		ta.left=tb;
		ta.right=tc;
		System.out.println(t1.checkSubtree(t1,ta));
	}

}
