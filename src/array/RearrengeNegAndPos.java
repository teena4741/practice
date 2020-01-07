package array;

public class RearrengeNegAndPos {
	/*Given an array of positive and negative numbers, arrange them such that all negative integers appear before all the positive integers in the array without using any additional data structure like hash table, arrays, etc. The order of appearance should be maintained.

	Examples:

	Input:  [12 11 -13 -5 6 -7 5 -3 -6]
	Output: [-13 -5 -7 -3 -6 12 11 6 5]*/
	
	public static void main(String[] args) {
      int arr[]= {12, 11, -13, -5, 6, -7, 5, -3, -6};
      int i=0;
      for(int count=0;count<arr.length;count++) {
    	if(arr[count]>0) {
    		continue;
    	}
    	i=count;
    	int j=i-1;
    	while(j>=0 && i>=0 && arr[j]>0) {
    		int temp=arr[j];
    		arr[j]=arr[i];
    		arr[i]=temp;
    		j--;
    		i--;
    	}
      }
	}

}
