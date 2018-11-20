import java.util.Scanner;
import java.math.*;

public class CylinderVolume {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Radius? ");
        double InputRadius = scanner.nextDouble();
        System.out.print("Hight? ");
        double InputHight = scanner.nextDouble();
        System.out.print("Answer ");
        System.out.println((Math.pow(InputRadius, 2) * Math.PI) * InputHight);

    }
}
