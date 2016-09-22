import java.util.Arrays;

public class Equal_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]={2,4,6,8,10,12};
		int arr2[]={12,10,8,6,4,2};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(Arrays.equals(arr1,arr2)){
			System.out.println("Equal");
		}
	}

}
