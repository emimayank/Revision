//Remember Queue definition-> Queue<trees>queue=new LinkedList<trees>();
import java.util.LinkedList;
import java.util.Queue;

class trees{
	public int val;
	public trees left;
	public trees right;
	public trees(int val, trees left, trees right){
		this.val=val;
		this.right=right;
		this.left=left;
	}
}
public class Imp_Level_Order_Traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		trees t1=new trees(1,null, null);
		trees t2=new trees(2,null,null);
		trees t3=new trees(3,null, null);
		trees t4=new trees(4,null,null);
		trees t5=new trees(5,null, null);
		trees t6=new trees(6,null,null);
		trees t7=new trees(7,null, null);
		trees t8=new trees(8,null,null);
		trees t9=new trees(9,null, null);
		trees t10=new trees(10,null,null);
		t1.left=t2;
		t1.right=t3;
		t2.left=t4;
		t2.right=t5;
		t3.left=t6;
		t3.right=t7;
		t4.left=t8;
		t4.right=t9;
		t5.left=t10;
		Queue<trees>queue=new LinkedList<trees>();
		queue.add(t1);
		while(!queue.isEmpty()){
			trees temp=queue.poll();
			System.out.println(temp.val);
			if(temp.left!=null){
				queue.add(temp.left);
			}
			if(temp.right!=null){
				queue.add(temp.right);
			}
		}
	}

}
