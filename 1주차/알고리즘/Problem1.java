import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int H = 0;
        int M = 0;

        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        M = sc.nextInt();

        if(M>=45){
             M -= 45;
        }
        else if(H==0){
             H=23;
             M = M+15;
        }
        else{
             H-=1;
             M = M+15;
        }
        System.out.print(H+" "+M);
	}
}