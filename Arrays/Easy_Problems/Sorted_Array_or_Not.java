<<<<<<< HEAD
class Sorted_Array{
	public static boolean Sorted_Array(int[] arr){
	for(int i=1;i<arr.length;i++){
		if(arr[i]<arr[i-1]){
			return false;
		}
	}
	return true;
	}
	public static void main(String[] args){
		int[] arr={5,7,6,2,8};
		System.out.println(Sorted_Array(arr));
	}
=======
class Sorted_Array{
	public static boolean Sorted_Array(int[] arr){
	for(int i=1;i<arr.length;i++){
		if(arr[i]<arr[i-1]){
			return false;
		}
	}
	return true;
	}
	public static void main(String[] args){
		int[] arr={5,7,6,2,8};
		System.out.println(Sorted_Array(arr));
	}
>>>>>>> 01932a1bcaf3754455b4e26695ebe2a55cfae90d
}