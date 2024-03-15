import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int H, M;
        st = new StringTokenizer(br.readLine());
        H = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int nH, nM;
        nH = H;
        nM = M - 45;

        if (nM < 0) {
            nH--;
            if (nH < 0) {
                nH += 24;
            }
            nM += 60;
        }

        System.out.println(nH + " " + nM);
    }

}