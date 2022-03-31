import java.util.Scanner;

public class Zipcode {
    int zipcode;

    public Zipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public void check_zipcode(int zipcode) throws ZipException {
        if (String.valueOf(zipcode).length() < 6) {
            throw new ZipException("This code is not deliverable");
        } else {
            System.out.println("Delivery is available in your area");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the zipcode");
        int input_pc = sc.nextInt();
        Zipcode pc = new Zipcode(input_pc);
        try {
            pc.check_zipcode(input_pc);
        } catch (ZipException e) {
            System.out.println("An error occured");
            System.out.println("Exception occured: " + e);
        }

        System.out.println("Please visit again!!");
        System.out.println("Have a great day :)");


    }
}
