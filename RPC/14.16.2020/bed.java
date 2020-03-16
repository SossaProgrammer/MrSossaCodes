//No aceptado error en 42
import java.util.Scanner; 

public class bed { 

    public static void main(String [] Args){ 
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int width = scan.nextInt();
        int height = scan.nextInt();
        int x = scan.nextInt();
        int y = scan.nextInt();
        int angle = scan.nextInt();
        double distancex = Math.abs(Math.cos(Math.toRadians(angle)))*height; 
        double distancey = Math.abs(Math.sin(Math.toRadians(angle))) * height;
        if (angle<=180) {
            distancey += y;
        }else{
            distancey = y-distancey;
        }
        if (angle<=90 || angle>= 260) {
            distancex +=x;
        }else {
            distancex = x-distancex;
        }
        if( (distancex <= width && distancex >= 0)  &&  (distancey <= length && distancey >= 0)){ 
            System.out.println("YES");
        }else{
            System.out.println("NO"); 
        }
    }
}
