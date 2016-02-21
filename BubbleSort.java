import java.util.Arrays;

//Runtime of this function is (n^2)

public class BubbleSort { public static void main (String [] args) {

    int [] array = {5,67,4,2,6,8};
    int [] array1 = {9,8,6,1};

    bubble(array1);
    //System.out.println(result);

    for (int i = 0; i < array.length;i++)
    {

        for (int j = 0; j < array.length - 1; j++)
        {

            if (array[j] > array[j + 1])
            {

                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1]= temp;

            }
        }

    }

    //System.out.println(Arrays.toString(array));

}

 static void bubble (int [] array){

      for (int i = 0; i < array.length; i++)
    {

        for (int j = 0; j < array.length - 1; j++)
        {

            if (array[j] > array[j + 1])
            {

                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1]= temp;

            }
        }

    }
    System.out.println(Arrays.toString(array));

}
}