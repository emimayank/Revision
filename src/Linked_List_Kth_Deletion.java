class List_1{
	public int val;
	public List_1 next;
	public List_1(int val, List_1 next){
		this.val=val;
		this.next=next;
	}
	public List_1 delKth(List_1 l7,int k) {
		// TODO Auto-generated method stub
		int size=findSize(l7);
		int pos=size-k;
		List_1 start=l7;
		while(pos!=1){
			l7=l7.next;
			pos--;
		}
		l7.next=l7.next.next;
		return start;
	}
	private int findSize(List_1 l7) {
		// TODO Auto-generated method stub
		int size=0;
		while(l7!=null){
			l7=l7.next;
			size++;
		}
		return size;
	}
	
}
public class Linked_List_Kth_Deletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List_1 l1=new List_1(1,null);
		List_1 l2=new List_1(2,l1);
		List_1 l3=new List_1(7,l2);
		List_1 l4=new List_1(4,l3);
		List_1 l5=new List_1(5,l4);
		List_1 l6=new List_1(6,l5);
		List_1 l7=new List_1(7,l6);
		
		List_1 newList=l7.delKth(l7,3);
		while(newList!=null){
			System.out.print(newList.val+" ");
			newList=newList.next;
		}
	}

}
