
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class trees_d{
	public int val;
	public trees_d left;
	public trees_d right;
	public static List<Integer>list=new ArrayList<Integer>();
	public trees_d(int val, trees_d left, trees_d right){
		this.val=val;
		this.left=left;
		this.right=right;
	}
	public int getRandom(trees_d root){
		populateArray(root);
		Integer [] array = list.toArray( new Integer[ list.size() ] );
		int rnd = new Random().nextInt(array.length);
	    return array[rnd];
		
	}
	private void populateArray(trees_d root) {
		// TODO Auto-generated method stub
		if(root!=null){
			populateArray(root.left);
			list.add(root.val);
			populateArray(root.right);
		}
		
		
	}
}
public class Random_Node_Selection_BTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		trees_d t1=new trees_d(1,null, null);
		trees_d t2=new trees_d(2,null,null);
		trees_d t3=new trees_d(3,null, null);
		trees_d t4=new trees_d(4,null,null);
		trees_d t5=new trees_d(5,null, null);
		trees_d t6=new trees_d(6,null,null);
		trees_d t7=new trees_d(7,null, null);
		trees_d t8=new trees_d(8,null,null);
		trees_d t9=new trees_d(9,null, null);
		trees_d t10=new trees_d(10,null,null);
		t1.left=t2;
		t1.right=t3;
		t2.left=t4;
		t2.right=t5;
		t3.left=t6;
		t3.right=t7;
		t4.left=t8;
		t4.right=t9;
		t5.left=t10;
		System.out.println(t1.getRandom(t1));
	}

}
