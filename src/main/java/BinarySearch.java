import java.util.*;
class BinarySearch
{
    public static void main(String args[]){
        //int array[10];
        int i, j, num, temp, keynum;
        int low, mid, high;
        System.out.println("Enter the value of num \n");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        int[] array = new int[10];
        System.out.println("Enter the elements one by one \n");
        for (i = 0; i < num; i++)
        {
            array[i]=sc.nextInt();
        }
        //  printf("Input array elements \n");
        //for (i = 0; i < num; i++)
        //{
        //  printf("%d\n", array[i]);
        //}
        /*  Bubble sorting begins */
        for (i = 0; i < num; i++)
        {
            for (j = 0; j < (num - i - 1); j++)
            {
                if (array[j] > array[j + 1])
                {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array is...\n");
        for (i = 0; i < num; i++)
        {
            System.out.println(array[i]);
        }
        System.out.println("Enter the element to be searched \n");
        keynum=sc.nextInt();
        /*  Binary searching begins */
        low = 1;
        high = num;
        do
        {
            mid = (low + high) / 2;
            if (keynum < array[mid])
                high = mid - 1;
            else if (keynum > array[mid])
                low = mid + 1;
        } while (keynum != array[mid] && low <= high);
        if (keynum == array[mid])
        {
            System.out.println("SEARCH SUCCESSFUL \n");
        }
        else
        {
            System.out.println("SEARCH FAILED \n");
        }
    }
}