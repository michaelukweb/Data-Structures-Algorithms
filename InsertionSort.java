import java.util.Arrays;

public class InsertionSort
{
    //First element of array is considered sorted, all values to the right are unsorted
   public static void main (String [] args)
   {

    int [] array = {4,5,9,3,5};
    System.out.println("The array before insertion sort is " + Arrays.toString(array));
    insertion(array);


   }


   public static void insertion (int [] arr)
   {



       for (int i = 1; i < arr.length; i++)//set to index position 1
       {

          int temp = arr[i];

          for (int j =  i - 1; j >= 0 && temp < arr[j]; j--)
          {

              arr[j + 1] = arr[j];
              arr[j] = temp;

          }


       }

       System.out.println("The array after insertion sort is " + Arrays.toString(arr));

   }

}