package Scaler.Array.IntroductionOfArray;

public class RotatedArrayPart_2 {
	public int[][] solve(int[]A, int[]B){
	int[][] Array=new int[B.length][A.length];
	
	for(int j=0;j<B.length;j++) {
		int[] temp=new int[A.length];
		for(int i=0;i<A.length;i++) {
			temp[i]=A[i];
		}
		Array[j]=newArray(temp, B[j]);
				
	}
	
	}
	
	int[] newArray(myIntArray, int B) {
		int N=myIntArray.length;
		B=B%N;
		int[] temp=myIntArray;
		reverse(myIntArray, 0, N-1);
		reverse(myIntArray, 0, N-1-B);
		reverse(myIntArray, N-B,N-1);
		return myIntArray;
		
	}
	void reverse(int[] arr,int i, int j) {
		while(i<j) {
			swap(arr,i,j){
				i++;
				j--;
			}
		}
	}
	void swap(int []arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] A= {{3,4,5,1,2}, {4,5,1,2,3}};
		int[] B= {2,3};
		
		

	}

}
