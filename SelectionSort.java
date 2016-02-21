import java.util.Arrays;

public class SelectionSort
{
    public static void main (String [] args)
    {

        int [] array = {5,6,78,9,3,1};
        System.out.println("The array before Selection sort is " +(Arrays.toString(array)));
        selectionSort(array);
    }

    public static void selectionSort(int [ ]arr)
    {

        for (int i = 0; i <arr.length - 1; i++)
        {

            int min = i;

            for (int j = i + 1; j < arr.length; j++)
            {

                if (arr[j] < arr[min])
                {
                    min = j; 
                    int smallest = arr[min];
                    arr[min] = arr[i];
                    arr[i] = smallest;
                }


            }

        }
        System.out.println("The array after Selection sort is " +(Arrays.toString(arr)));

    }
}