import java.util.HashMap;

public class Duplicate_inList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]={2,4,6,8,10,12};
		int arr2[]={6,2,4,12,13,2};
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<arr1.length;i++){
			map.put(i,arr1[i]);
		}
		for(int i=0;i<arr2.length;i++){
			if(map.containsValue(arr2[i])){
				System.out.println(arr2[i]);
			}
		}
	}

}
