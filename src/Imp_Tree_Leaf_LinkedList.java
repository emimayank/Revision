import java.util.LinkedList;
import java.util.Queue;

class LList3{
	public int val;
	public LList3 next;
	public LList3(int val, LList3 next){
		this.val=val;
		this.next=next;
	}
}
class trees_9{
	public int val;
	public trees_9 left;
	public trees_9 right;
	Queue<Integer>queue=new LinkedList<Integer>();
	public trees_9(int val, trees_9 left, trees_9 right){
		this.val=val;
		this.right=right;
		this.left=left;
	}
	public void findLeaves(trees_9 root){
		if(root==null){
			return;
		}
		if(root.left==null && root.right==null){
			createList(root.val);
		}
		else{
			findLeaves(root.left);
			findLeaves(root.right);
		}
	}
	private void createList(int val) {
		// TODO Auto-generated method stub
		queue.offer(val);
		
	}
	public void printLinkedList() {
		// TODO Auto-generated method stub
		while(!queue.isEmpty()){
			System.out.println(queue.peek());
			queue.poll();
		}
		
	}
}
public class Imp_Tree_Leaf_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		trees_9 t1=new trees_9(1,null, null);
		trees_9 t2=new trees_9(2,null,null);
		trees_9 t3=new trees_9(3,null, null);
		trees_9 t4=new trees_9(4,null,null);
		trees_9 t5=new trees_9(5,null, null);
		trees_9 t6=new trees_9(6,null,null);
		trees_9 t7=new trees_9(7,null, null);
		trees_9 t8=new trees_9(8,null,null);
		trees_9 t9=new trees_9(9,null, null);
		trees_9 t10=new trees_9(10,null,null);
		t1.left=t2;
		t1.right=t3;
		t2.left=t4;
		t2.right=t5;
		t3.left=t6;
		t3.right=t7;
		t4.left=t8;
		t4.right=t9;
		t5.left=t10;
		t1.findLeaves(t1);
		t1.printLinkedList();
	}

}
