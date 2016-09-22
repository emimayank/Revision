class LinkedList{
	public int val;
	public LinkedList next;
	public LinkedList(int val, LinkedList next){
		this.val=val;
		this.next=next;
	}
}
public class Imp_Circular_Linked_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1=new LinkedList(1,null);
		LinkedList l2=new LinkedList(2,l1);
		LinkedList l3=new LinkedList(3,l2);
		LinkedList l4=new LinkedList(4,l3);
		LinkedList l5=new LinkedList(5,l4);
		LinkedList l6=new LinkedList(6,l5);
		LinkedList l7=new LinkedList(7,l6);
		l1.next=l7;
		LinkedList fast=l7.next.next;
		LinkedList slow=l7;
		while(slow!=null){
			if(fast==slow){
				System.out.println("Circular");
				break;
			}
			if(fast.next==null){
				System.out.println("Not Circular");
				break;
			}
			fast=fast.next.next;
			slow=slow.next;
		}
		if(slow==null){
			System.out.println("Not Circular");
		}
	}

}
