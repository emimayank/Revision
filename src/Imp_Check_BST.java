class trees_8{
	public static int array[]=new int[1000];
	public int val;
	public trees_8 left;
	public trees_8 right;
	public trees_8(int val, trees_8 left, trees_8 right){
		this.val=val;
		this.right=right;
		this.left=left;
	}
	public boolean checkVal(trees_8 root){
		if(root==null){
			return true;
		}
		if(root.val<root.right.val && root.val>root.left.val){
			return true;
		}
		else{
			return false;
		}
	}
	public void checkBST(trees_8 root){
		if(root==null){
			return;
		}
		if(checkVal(root.left)==false || checkVal(root.right)==false){
			System.out.println("Not Balanced");
		}
		
	}
}

public class Imp_Check_BST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
/*		trees_8 t1=new trees_8(1,null, null);
		trees_8 t2=new trees_8(2,null,null);
		trees_8 t3=new trees_8(3,null, null);
		trees_8 t4=new trees_8(4,null,null);
		trees_8 t5=new trees_8(5,null, null);
		trees_8 t6=new trees_8(6,null,null);
		trees_8 t7=new trees_8(7,null, null);
		trees_8 t8=new trees_8(8,null,null);
		trees_8 t9=new trees_8(9,null, null);
		trees_8 t10=new trees_8(10,null,null);
		t1.left=t2;
		t1.right=t3;
		t2.left=t4;
		t2.right=t5;
		t3.left=t6;
		t3.right=t7;
		t4.left=t8;
		t4.right=t9;
		t5.left=t10;*/
		trees_8 t1=new trees_8(6,null, null);
		trees_8 t2=new trees_8(2,null,null);
		trees_8 t3=new trees_8(8,null, null);
		trees_8 t4=new trees_8(1,null,null);
		trees_8 t5=new trees_8(3,null, null);
		trees_8 t6=new trees_8(7,null,null);
		trees_8 t7=new trees_8(9,null, null);
		t1.left=t2;
		t1.right=t3;
		t2.left=t4;
		t2.right=t5;
		t3.left=t6;
		t3.right=t7;
		t1.checkBST(t1);
	}

}
