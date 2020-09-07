/**
 * Laboratorio 2 de Estructuras de Datos 1
 * 
 * @author Mauricio Toro 
 * @author Andrea Sanchez cortes
 * @version 1
 */

import java.util.Arrays;

public class mergeSort
{

  
      // Sorts an array using Merge Sort
      // www.cs.cmu.edu/
public static void mergeSort(int [ ] a)
	{
		int[] tmp = new int[a.length];
		mergeSort(a, tmp,  0,  a.length - 1);
	}

        // Sorts an array using Merge Sort
private static void mergeSort(int [ ] a, int [ ] tmp, int left, int right)
	{
if (left < right)
{
    int center = (left +right) /2;
    mergeSort(a,tmp,left,center);
    mergeSort(a,tmp,center+1,right);
    merge(a, tmp,left,center+1,right);
}
}
	

    // Merges two sorted arrays
private static void merge(int[ ] a, int[ ] tmp, int left, int right, int rightEnd )
    {
       int leftEnd = right -1;
       int k = left;
       int num = rightEnd - left +1;
       while(left <= leftEnd && right <=rightEnd)
       if(a[left] <= a [right])
       tmp[k++] = a[left++];
       else 
       tmp [k++] = a[right++];
       while (left <= leftEnd)
       tmp[k++] = a [left++];
       while(right <= rightEnd) 
       tmp[k++] = a[right++];
       
       for(int i = 0; i < num; i++, rightEnd--)
       a[rightEnd] = tmp[rightEnd];
       
    }
  
 public static int[] crearArray(int n){
     //int n = (int) (Math.random()*30000)+1000;
        int [] numeros = new int [n];
        for (int i =0; i<numeros.length; i++){
             for (int j = numeros.length; j>=0; j--){
                 numeros[i] = j;
                }
            }
            return numeros;
        }
        
   
    public static void tiempos(){
       
        for(int i = 1000000; i <= 20000000; i+=1000000){

        long startTime = System.currentTimeMillis();
        mergeSort(crearArray(i));
        long tiempo = System.currentTimeMillis() - startTime;
        System.out.println(crearArray(i).length + " " + tiempo);
        }


  
}
}
