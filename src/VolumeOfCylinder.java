import java.util.Scanner;

public class VolumeOfCylinder {
        public static void main(String args[])
        {

            Scanner s= new Scanner(System.in);

            System.out.println("Enter the radius:");
            double r=s.nextDouble();
            System.out.println("Enter the height:");
            double h=s.nextDouble();

            double volume=(r*r*3.1415*h);

            System.out.println("volume of Cylinder is: " +volume);

    }
}
