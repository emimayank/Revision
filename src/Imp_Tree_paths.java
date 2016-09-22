//The variable Index is not a global variable hence it resets to the original leaf value everytime a leaf is encountered.
class trees_f{
	public static int arr[]=new int[1000];
	public int val;
	public trees_f right;
	public trees_f left;
	public trees_f(int val, trees_f left, trees_f right){
		this.val=val;
		this.left=left;
		this.right=right;
	}
	public void findPath(trees_f root, int index){
		if(root==null){
			return;
		}
		arr[index++]=root.val;
		if(root.left==null && root.right==null){
			for(int i=0;i<index;i++){
				System.out.print(arr[i]+" ");
			}
			System.out.println("");
		}
		findPath(root.left,index);
		findPath(root.right,index);
	}
}
public class Imp_Tree_paths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		trees_f t1=new trees_f(1,null, null);
		trees_f t2=new trees_f(2,null,null);
		trees_f t3=new trees_f(3,null, null);
		trees_f t4=new trees_f(4,null,null);
		trees_f t5=new trees_f(5,null, null);
		trees_f t6=new trees_f(6,null,null);
		trees_f t7=new trees_f(7,null, null);
		trees_f t8=new trees_f(8,null,null);
		trees_f t9=new trees_f(9,null, null);
		trees_f t10=new trees_f(10,null,null);
		t1.left=t2;
		t1.right=t3;
		t2.left=t4;
		t2.right=t5;
		t3.left=t6;
		t3.right=t7;
		t4.left=t8;
		t4.right=t9;
		t5.left=t10;
		t1.findPath(t1,0);
	}

}
