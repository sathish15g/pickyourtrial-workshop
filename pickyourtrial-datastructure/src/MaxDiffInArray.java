import java.util.Scanner;

public class MaxDiffInArray {

		public static void main(String args[]) {
			int[] arr1 = {7,2,3,10,2,4,8,1};
			Scanner sc  = new Scanner(System.in);
			System.out.println("Enter no of elements : ");
			int n = sc.nextInt();
			System.out.println("Eneter the elements : ");
			int[] arr = new int[n];
			
			for(int i=-0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			
			if(arr.length == 0) {
				System.out.println("empty array");
				return;
			}
	
			 int maxdiff = findMaxDiffinArray(arr);
			 if(maxdiff == -1) {
				 System.out.println("no min value found in lower index");
			 }else {
				 System.out.println("Max diff is: "+maxdiff);
			 }
		}
		
		public static int findMaxDiffinArray(int arr[]) {
			int min = arr[0]; 
			int diff = -1;
			for(int i=1; i<arr.length;i++) {
				diff = Math.max(diff, arr[i]-min);
				min = Math.min(min, arr[i]);
			}
			int result =diff > 0 ? diff : -1;
			return result;
			
		}
}
