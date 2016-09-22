/*Remember Offer, Size, Poll, Peek OSPP*/
/*For the smallest numbers in line 22 use arr.length-k+1 */
import java.util.PriorityQueue;

public class Imp_Nth_Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int arr[]={300,100,400,200,900,700,800,750,1000};
		
		for(int i=0;i<3;i++){
			findLargest(arr,i+1);
		}
	}

	private static void findLargest(int[] arr, int k) {
		// TODO Auto-generated method stub
		PriorityQueue <Integer>q=new PriorityQueue<>();
		for(int i=0;i<arr.length;i++){
			q.offer(arr[i]);
			if(q.size()>k){ //use arr.length-k+1 for N smallest
				q.poll();
			}
		}
		System.out.println(q.peek());
	}

}
