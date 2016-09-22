import java.util.HashMap;

public class Array_Odd_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,1,2,1,4,5,4,7,2,8,9,8,0,0};
		HashMap<Integer, Integer>map=new HashMap<>();
		for(int i=0;i<arr.length;i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i],map.get(arr[i])+1);
			}
			else{
				map.put(arr[i],1);
			}
		}
		for(Integer key:map.keySet()){
			int freq=map.get(key);
			if(freq%2!=0){
				System.out.println(key);
			}
		}
	}

}
