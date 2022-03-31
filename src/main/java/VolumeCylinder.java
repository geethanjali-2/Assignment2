import java.util.*;
class VolumeCylinder
{
    public static void main(String args[])
    {
        double Pi=3.14;
        Scanner s= new Scanner(System.in);

        System.out.println("Enter the radius:");
        double r=s.nextDouble();
        System.out.println("Enter the height:");
        double h=s.nextDouble();

        double  volume=(Pi*r*r*h);

        System.out.println("volume of Cylinder is: " +volume);
    }
}