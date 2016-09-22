import java.util.HashMap;

public class Array_Integer_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,3,7,4,8,5,10,12,11,6,10,12,9};
		int k=15;
		HashMap<Integer, Integer>map=new HashMap<>();
		for(int i=0;i<arr.length;i++){
			map.put(i,arr[i]);
		}
		for(int i=0;i<arr.length;i++){
			if(map.containsValue(k-arr[i])){
				System.out.println(k-arr[i]+" "+arr[i]);
			}
		}
	}	

}
