/***1. Overload the function replace() for an integer array, float array and a sentence (multi-word).
	If a float/integer array is an input with an index value, the function should replace value at that
	index with the largest value in the array.If a string is an input with an index value, the character
	at that index value should be replaced with the number of words in the sentence.***/


public class OverloadReplace {
	static int getMax(int arr[]) {
		int max = arr[0];
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>=max) {
				max = arr[i];
			}
		}
		return max;
	}
	static float getMax(float arr[]) {
		float max = arr[0];
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>=max) {
				max = arr[i];
			}
		}
		return max;
	}
	static void replace(int arr[],int pos) {
		arr[pos] = getMax(arr);
	}
	static void replace(float arr[],int pos) {
		arr[pos] = getMax(arr);
	}
	static void replace(StringBuffer str,int pos) {
		str.replace(pos, pos+1, noOfWords(str)+"");
	}
	static int noOfWords(StringBuffer str) {
		int count = 0;
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i)==' ')
				count++;
		}
		return count+1;
	}
	public static void main(String args[]) {
		int arr[] = {9,5,47,5,8,4,5,5,4,8,6,2,1};
		float arr1[] = {9,5,47,5,8,4,5,5,4,8,6,2,1};
		StringBuffer str;
		str = new StringBuffer("Currently studing in VITBPL ,Thanks.");
//		OverloadReplace obj = new OverloadReplace();
		replace(arr,10);
		replace(arr1, 5);
		replace(str,16);
		System.out.println(str);
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+",");
		}
	}
}
