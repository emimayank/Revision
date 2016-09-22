class LList{
	public int val;
	public LList next;
	public LList(int val, LList next){
		this.val=val;
		this.next=next;
	}
}
public class Imp_Linked_List_Node_Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LList l1=new LList(1,null);
		LList l2=new LList(2,l1);
		LList l3=new LList(3,l2);
		LList l4=new LList(4,l3);
		LList l5=new LList(5,l4);
		LList l6=new LList(6,l5);
		LList l7=new LList(7,l6);
		int val=14; //to be added after 4
		int aftr=4;
		LList start=l7;
		LList temp=l7;
		while(temp!=null){
			if(temp.val==aftr){
				LList fresh=new LList(val,null);//Create an independent LinkedList
				LList intr=temp.next; //Store the next part of the Linked List where new element has to be 
									  //entered in a separate LinkedList Variable "intr" 
				fresh.next=intr;	  //Link the newly created List element to the breaking point of the list
				temp.next=fresh;	//Now add the first part of the list to the new element chain
				break;
			}
			temp=temp.next;
		}
		while(start!=null){
			System.out.println(start.val);
			start=start.next;
		}
	}

}
