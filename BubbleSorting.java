import java.io.*;
class BubbleSorting{
 static void bubbleSort(int arr[],int n){
  int i,j,temp;
  boolean Swapped;
  for(i=0;i<n-1;i++){
   Swapped=false;
   for(j=0;j<n-i-1;j++){
    if(arr[j]>arr[j+1]){
	 temp=arr[j];
	 arr[j]=arr[j+1];
	 arr[j+1]=temp;
	 Swapped=true;}}
	 if(Swapped==false)
	 break;
   }}
   static void printArray(int arr[],int size){
    int i;
	for(i=0;i<size;i++)
   System.out.print(arr[i]+"");
}
	  public static void main(String[] args){
	   int arr[]={64,34,25,12,22,11,90};
	   int n=arr.length;
	   bubbleSort(arr,n);
	   System.out.println("Sorted array:");
	   printArray(arr,n);
	   }}
