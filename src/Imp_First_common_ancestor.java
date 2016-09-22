class trees_b{
	public static int array[]=new int[1000];
	public int val;
	public trees_b left;
	public trees_b right;
	public trees_b(int val, trees_b left, trees_b right){
		this.val=val;
		this.right=right;
		this.left=left;
	}
	public trees_b commonAncestor(trees_b a, trees_b b, trees_b root){
		if(!covers(root, a) || !covers(root,b)){//checking if both nodes are present in the tree or not
			return null;
		}
		return ancestorHelper(root, a, b);
	}
	private trees_b ancestorHelper(trees_b root, trees_b a, trees_b b) {
		// TODO Auto-generated method stub
		if(root==null || root==a || root==b){
			return root;
		}
		boolean isonleft=covers(root.left,a);
		boolean isonright=covers(root.right,b);
		if(isonleft!=isonright){ //Nodes are on different sides
			return root;
		}
		trees_b childSide=isonleft? root.left : root.right;
		return ancestorHelper(childSide,a,b);
	}
	private boolean covers(trees_b root, trees_b a) {
		// TODO Auto-generated method stub
		if(root==null){
			return false;
		}
		if(root==a){
			return true;
		}
		return covers(root.left,a)||covers(root.right,a);
	}
	
}
public class Imp_First_common_ancestor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		trees_b t1=new trees_b(1,null, null);
		trees_b t2=new trees_b(2,null,null);
		trees_b t3=new trees_b(3,null, null);
		trees_b t4=new trees_b(4,null,null);
		trees_b t5=new trees_b(5,null, null);
		trees_b t6=new trees_b(6,null,null);
		trees_b t7=new trees_b(7,null, null);
		trees_b t8=new trees_b(8,null,null);
		trees_b t9=new trees_b(9,null, null);
		trees_b t10=new trees_b(10,null,null);
		t1.left=t2;
		t1.right=t3;
		t2.left=t4;
		t2.right=t5;
		t3.left=t6;
		t3.right=t7;
		t4.left=t8;
		t4.right=t9;
		t5.left=t10;
		System.out.println(t1.commonAncestor(t8,t10,t1).val);
	}

}
