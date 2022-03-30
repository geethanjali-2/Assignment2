import java.util.*;
class LinearSearch
{
    public static void main(String args[])
    {

        int num;

        int i,j,  keynum, temp,found = 0;

        System.out.println("Enter the number of elements ");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        int array[]=new int[20];
        System.out.println("Enter the elements one by one \n");
        for (i = 0; i < num; i++)
        {
            array[i]=sc.nextInt();
        }
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
        System.out.println("Enter the element to be searched ");
        keynum=sc.nextInt();
        /*  Linear search begins */
        for (i = 0; i < num ; i++)
        {
            if (keynum == array[i] )
            {
                found = 1;
                break;
            }
        }
        if (found == 1)
            System.out.println(keynum + " is present at location " + (i + 1) + ".");
        else
            System.out.println("Element is not present in the array\n");
    }
}