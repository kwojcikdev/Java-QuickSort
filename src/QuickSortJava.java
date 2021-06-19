public class QuickSortJava {



    public static void main (String [] args) {

        System.out.println("QuickSortJava");


        int [] arr = {10, 80, 30, 90, 40, 50, 70};
        printArr(arr);

        quickSort(arr, 0, arr.length-1);

        printArr(arr);
    }


    static void  printArr(int [] arr ){
        System.out.println();
        for ( int a : arr){
            System.out.print(a + ", ");
        }
        System.out.println();

    }


   static void quickSort (int[] arr, int start, int end)
    {
        if(start < end)
        {

            int pi = partition(arr, start, end);

            quickSort(arr, start, pi-1);
            quickSort(arr, pi+1, end);

        }

    }

   static  int partition(int[] arr, int start, int end)
    {
        int pivot = arr[end];
        int i = start - 1;

        for(int j=start; j<=end-1; j++)
        {
            if(arr[j] < pivot)
            {
                i++;
                swapArr(arr, i, j);
            }
        }

        swapArr(arr, i+1, end);

        return (i+1);
    }


    static void swapArr(int [] arr, int i1, int i2)
    {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}

