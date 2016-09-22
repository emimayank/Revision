class tree{
	public int val;
	public tree left;
	public tree right;
	public tree(int val, tree left, tree right){
		this.val=val;
		this.right=right;
		this.left=left;
	}
	public tree createBST(int[] arr, int start,int end) {
		// TODO Auto-generated method stub
		if(start>end){
			return null;
		}
		int mid=(start+end)/2;
		tree t=new tree(0,null,null);
		t.val=arr[mid];
		t.left=createBST(arr,start,mid-1);
		t.right=createBST(arr,mid+1,end);
		return t;
	}
}
public class Imp_Tree_Population_from_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={0,1,2,3,4,5,6,7,8,9};
		tree t1=new tree(0,null,null);
		t1=t1.createBST(arr,0,arr.length-1);
		}
	}


