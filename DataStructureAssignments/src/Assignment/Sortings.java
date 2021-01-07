package Assignment;

import java.util.Arrays;
import java.util.*; 
import java.util.Collections;
import java.util.Scanner;

public class Sortings {
	
//	----------------------------------------------------------------
//	----------------------------------------------------------------
//  ----------------------------BubbleSort--------------------------
//	----------------------------------------------------------------
//	----------------------------------------------------------------
    public static void bubbleSort(int []arr){
        
        int i, j , swap;  
            for(i = 0; i < arr.length; i ++){
                
                for(j = 0; j < arr.length - 1  ;j++){
                    
                    if(arr[j] > arr[j+1]){ 
                        swap = arr[j];       
                        arr[j] = arr[j+1];    
                        arr[j+1] = swap;      
 
                    }
                }
            }
            
    }
//	----------------------------------------------------------------
//	----------------------------------------------------------------
//  ----------------------------SelectionSort-----------------------
//	----------------------------------------------------------------
//	----------------------------------------------------------------
    public static void selectionSort(int a[])
	{
		for (int i=0;i<a.length-1;i++)
		{
			int imin=i;
			int temp;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[imin])
					imin=j;
			}
					temp=a[i];
					a[i]=a[imin];
					a[imin]=temp;
		}
	}
//	----------------------------------------------------------------
//	----------------------------------------------------------------
//  ----------------------------InsertionSort-----------------------
//	----------------------------------------------------------------
//	----------------------------------------------------------------
    public static void insertionSort(int a[])
	{
		for(int i=1;i<a.length;i++)
		{
			int val=a[i];
			int hole=i;
			while(hole>0&&a[hole-1]>val)
			{
				a[hole]=a[hole-1];
				hole=hole-1;
			}
			a[hole]=val;
		}
	}
//	----------------------------------------------------------------
//	----------------------------------------------------------------
//  ----------------------------MergeSort---------------------------
//	----------------------------------------------------------------
//	----------------------------------------------------------------
    public static void mergeSort(int a[],int n)
	{
		if(n<=1)
			return;
		int mid=n/2;
		int left[]=new int[mid];
		int right[]=new int[n-mid];
		for(int i=0;i<mid;i++)
			left[i]=a[i];
		for(int i=mid;i<n;i++)
			right[i-mid]=a[i];
		mergeSort(left,mid);
		mergeSort(right,n-mid);
		Merge(left,right,a);
		
	}
	public static void Merge(int left[],int right[],int a[])
	{
		int nL=left.length;
		int nR=right.length;
		int i,j,k;
		i=j=k=0;
		while(i<nL&&j<nR)
		{
			if(left[i]<=right[j])
			{
				a[k]=left[i];
				i++;
				k++;
			}
			else
			{
				a[k]=right[j];
				j++;
				k++;
			}
		}
		while(i<nL)
		{
			a[k]=left[i];
			i++;
			k++;
		}
		while(j<nR)
		{
			a[k]=right[j];
			j++;
			k++;
		}
	}
//	----------------------------------------------------------------
//	----------------------------------------------------------------
//  ----------------------------Quicksort--------------------------
//	----------------------------------------------------------------
//	----------------------------------------------------------------
	public static void quickSort(int a[],int start,int end)
	{
		if(start<end)
		{
		int pIndex=QuickPartition(a,start,end);
		quickSort(a,start,pIndex-1);
		quickSort(a,pIndex+1,end);
		}
		else
			return;
		
	}
	public static int QuickPartition(int a[],int start,int end)
	{
		int temp;
		int pivot=a[end];
		int pIndex=start;
		for(int i=start;i<end;i++)
		{
			if(a[i]<=pivot)
			{
				//swap a[i],apindex
					temp=a[i];
					a[i]=a[pIndex];
					a[pIndex]=temp;
					pIndex++;
			}
		}
					temp=a[pIndex];
					a[pIndex]=a[end];
					a[end]=temp;
					return pIndex;
	}
//	----------------------------------------------------------------
//	----------------------------------------------------------------
//  ----------------------------HeapSort--------------------------
//	----------------------------------------------------------------
//	----------------------------------------------------------------
	public static class HeapSort 
	{
	    private static int[] a;
	    private static int n;
	    private static int left;
	    private static int right;
	    private static int largest;

	    // Build-Heap Function
	    public static void buildheap(int []a){
	    	n=a.length-1;
	    	for(int i=n/2;i>=0;i--){
	    		System.out.println(i);
	    		maxheap(a,i);
	    	}
	    }
	    
	    // Max-Heap Function
	    public static void maxheap(int[] a, int i){
	    	left=2*i;
	    	right=2*i+1;
	    	System.out.println(i + " " + left + " " + right);
	    	if(left <= n && a[left] > a[i]){
	    		largest=left;
	    	}
	    	else{
	    		largest=i;
	    	}
	    	
	    	if(right <= n && a[right] > a[largest]){
	    		largest=right;
	    	}
	    	if(largest!=i){
	    		exchange(i,largest);
	    		maxheap(a, largest);
	    	}
	    }
	    
	    // Exchange Function
	    public static void exchange(int i, int j){
	    	int t=a[i];
	    	a[i]=a[j];
	    	a[j]=t; 
	    	}
	    
	    // Sort Function
	    public static void heapsort(int []a0){
	    	a=a0;
	    	buildheap(a);
	    	
	    	for(int i=n;i>0;i--){
	    		exchange(0, i);
	    		n=n-1;
	    		maxheap(a, 0);
	    	}
	    }
	}
//	----------------------------------------------------------------
//	----------------------------------------------------------------
//  ----------------------------BucketSort--------------------------
//	----------------------------------------------------------------
//	----------------------------------------------------------------
	static void bucketSort(float arr[], int n) 
    { 
        if (n <= 0) 
            return; 

        @SuppressWarnings("unchecked") 
        Vector<Float>[] buckets = new Vector[n]; 
  
        for (int i = 0; i < n; i++) { 
            buckets[i] = new Vector<Float>(); 
        } 

        for (int i = 0; i < n; i++) { 
            float idx = arr[i] * n; 
            buckets[(int)idx].add(arr[i]); 
        } 
  
        for (int i = 0; i < n; i++) { 
            Collections.sort(buckets[i]); 
        } 

        int index = 0; 
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < buckets[i].size(); j++) { 
                arr[index++] = buckets[i].get(j); 
            } 
        } 
    } 
	
//	----------------------------------------------------------------
//	----------------------------------------------------------------
//  ----------------------------Radix Sort--------------------------
//	----------------------------------------------------------------
//	----------------------------------------------------------------
    static int getMax(int arr[], int n) 
    { 
        int mx = arr[0]; 
        for (int i = 1; i < n; i++) 
            if (arr[i] > mx) 
                mx = arr[i]; 
        return mx; 
    } 
  

    static void countSort(int arr[], int n, int exp) 
    { 
        int output[] = new int[n];
        int i; 
        int count[] = new int[10]; 
        Arrays.fill(count, 0); 
  
    
        for (i = 0; i < n; i++) 
            count[(arr[i] / exp) % 10]++; 
  
        for (i = 1; i < 10; i++) 
            count[i] += count[i - 1]; 
  

        for (i = n - 1; i >= 0; i--) { 
            output[count[(arr[i] / exp) % 10] - 1] = arr[i]; 
            count[(arr[i] / exp) % 10]--; 
        } 
  
        for (i = 0; i < n; i++) 
            arr[i] = output[i]; 
    } 
  
    static void radixsort(int arr[], int n) 
    { 
        int m = getMax(arr, n);
        for (int exp = 1; m / exp > 0; exp *= 10) 
            countSort(arr, n, exp); 
    }
	public static void main(String args[])  {
		int [] arr = {3,2,1,5,1,2,6,6,8,4,9,12 ,0 ,34, 34,6,1,100};
		float arr1[] = { (float)0.897, (float)0.565, (float)0.656, (float)0.1234,(float)0.665, (float)0.3434 };
		int bucket = 0;
		int temp =1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Select Sorting method from given option:");
		System.out.println("1. Bubble Sort");
		System.out.println("2. Selection Sort");
		System.out.println("3. Insertion Sort");
		System.out.println("4. Merge Sort");
		System.out.println("5. Quick Sort");
		System.out.println("6. Heap Sort");
		System.out.println("7. Bucket Sort");
		System.out.println("8. Radix Sort");
		System.out.println("0. Print Sorted Array And Exit");
		while(temp != 0){
			switch(scan.nextInt()) {
			case 1:
				bubbleSort(arr);
				System.out.println("Sorted Successfully.");
				break;
			case 2:
				selectionSort(arr);
				System.out.println("Sorted Successfully.");
				break;
			case 3:
				insertionSort(arr);
				System.out.println("Sorted Successfully.");
				break;
			case 4:
				mergeSort(arr, arr.length);
				System.out.println("Sorted Successfully.");
				break;
			case 5:
				quickSort(arr, 0, arr.length-1);
				System.out.println("Sorted Successfully.");
				break;
			case 6:
				HeapSort.heapsort(arr);
				System.out.println("Sorted Succesfully.");
				break;
			case 7:
				bucketSort(arr1,arr1.length);
				bucket = 1;
				System.out.println("Sorted Succesfully.");
				break;
			case 8:
				radixsort(arr, arr.length);
				System.out.println("Sorted Succesfully.");
				break;
			case 0:
				temp = 0;
				if(bucket==1) {
					System.out.print("Sorted Array:");
					for(int x = 0 ; x < arr1.length ; x ++)
			            System.out.print(arr1[x] + ", ");
					break;
				}
				System.out.print("Sorted Array:");
				for(int x = 0 ; x < arr.length ; x ++)
		            System.out.print(arr[x] + ", ");
				break;
											
			}
		}
		scan.close();
	}                      
}