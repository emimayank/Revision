
public class Array_Reversal_NoExtra_Memory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,4,5,6,7,8,9};
		for(int i=0;i<(arr.length/2)+1;i++){
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-i-1]=temp;
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

}
