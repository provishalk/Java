
public class FindMedianSortedArrays {
	 public double findMedianSortedArrays(int[] nums1, int[] nums2){
		 	int i=0,j=0,k=0;
		 	double median;
		 	int[] arr = new int[nums1.length+nums2.length];
		 		
			for(;i<nums1.length && j<nums2.length;k++) {
				if(nums1[i]<nums2[j]) {
					arr[k] =  nums1[i];
					i++;
				}
				else {
					arr[k] =  nums2[j];
					j++;
				}
			}
			while(i<nums1.length) {
				arr[k] =nums1[i];
				k++;
				i++;
			}
			while(j<nums2.length) {
				arr[k] =nums2[j];
				k++;
				j++;
			}
			if(arr.length%2==0){
				median = (arr[(arr.length/2)]+arr[(arr.length/2)-1])/2.0;
			}
			else {
				median = arr[(arr.length/2)];
			}
			
		 return median;
		
	 }
	
	 public static void main(String args[]) {
		 FindMedianSortedArrays obj = new FindMedianSortedArrays();
		 int a[] = {1,2,3};
		 int b[] = {4,5};
		 System.out.println(obj.findMedianSortedArrays(a,b));
	 }
}
