import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour, minute;
        hour = sc.nextInt();
        minute= sc.nextInt();
        //분이 45분 미만인 경우
        if(minute < 45){
            //자정 12시인 경우
            if(hour == 0){
                hour = 23;
            }
            else hour --;

            minute +=15;

        }
        //분이 45분 이상인 경우
        else minute -=45;

        System.out.println(hour + " "+ minute);
    }
}

