public class Assignment4 {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Items in Array: ");
		for(Integer i : arr) {
			System.out.print(i+" ");
		}
		System.out.println("\nItems in reverse Order: ");
		String s="";
		for(Integer i :arr) {
			s=i+" "+s;
		}
		System.out.print(s);
	}
	

}
