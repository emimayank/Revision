class trees_g{
	//public static int array[];
	//arra=new int[1000];
	public int val;
	public trees_g left;
	public trees_g right;
	public trees_g(int val, trees_g left, trees_g right){
		this.val=val;
		this.left=left;
		this.right=right;
	}
	public int[] treeWidth(int[]arr, int level, trees_g root){
		if(root!=null){
			arr[level]++;
			treeWidth(arr,level+1,root.left);
			treeWidth(arr,level+1,root.right);
		}
		return arr;
	}
	
}
public class Imp_Tree_Width {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		trees_g t1=new trees_g(1,null, null);
		trees_g t2=new trees_g(2,null,null);
		trees_g t3=new trees_g(3,null, null);
		trees_g t4=new trees_g(4,null,null);
		trees_g t5=new trees_g(5,null, null);
		trees_g t6=new trees_g(6,null,null);
		trees_g t7=new trees_g(7,null, null);
		trees_g t8=new trees_g(8,null,null);
		trees_g t9=new trees_g(9,null, null);
		trees_g t10=new trees_g(10,null,null);
		t1.left=t2;
		t1.right=t3;
		t2.left=t4;
		t2.right=t5;
		t3.left=t6;
		t3.right=t7;
		t4.left=t8;
		t4.right=t9;
		t5.left=t10;
		int array[]=new int[6];
		int arr[]=t1.treeWidth(array,0,t1);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

}
