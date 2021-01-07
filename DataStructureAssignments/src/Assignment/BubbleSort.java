package Assignment;
class BubbleSort  
{  
    static void bubbleSort(int arr[], int n) 
    { 
        int i, j, temp; 
        for (i = 0; i < n - 1; i++)  
        { 
            for (j = 0; j < n - i - 1; j++)  
            { 
                if (arr[j] > arr[j + 1])  
                { 
                    temp = arr[j]; 
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp; 
                } 
            } 
        } 
    }  
    public static void main(String args[]) 
    { 
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };  
        bubbleSort(arr, arr.length); 
        System.out.println("Result: "); 
        for(int i = 0 ;i<arr.length;i++)
        {
        	System.out.print(arr[i]+",");
        }
    } 
} 
