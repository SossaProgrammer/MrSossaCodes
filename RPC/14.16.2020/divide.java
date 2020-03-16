
import java.util.Scanner;

public class divide {
    public static void main(String[] args) { 
        Scanner read = new Scanner(System.in); 
        int team[] = new int[read.nextInt()]; 
        int d = read.nextInt(); 
        int sum = 0; 
        for (int i = 0; i < team.length; i++) { 
            team[i] = read.nextInt(); 
            sum += team[i]; 
        }
        for (int i = 0; i < team.length; i++) { 
            System.out.println((d/sum)*team[i]); 
        }
    } 
}
