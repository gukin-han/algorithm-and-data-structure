import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int[] wifiLocation = new int[N];

        for (int i = 0; i < wifiLocation.length; i++) {
            wifiLocation[i] = Integer.parseInt(bf.readLine());
        }

        Arrays.sort(wifiLocation);
        int lt = getMinDistance(wifiLocation);
        int rt = wifiLocation[wifiLocation.length-1] - wifiLocation[0];

        int maxDistance = Integer.MIN_VALUE;

        while (lt <= rt) {
            int mid = (lt+rt)/2;
            int numWifi = getInstallCount(wifiLocation, mid);
            if (numWifi < C) {
                rt = mid - 1;
            } else {
                lt = mid + 1;
                if (maxDistance < mid) maxDistance = mid;
            }
        }

        System.out.println(maxDistance);


    }

    private static int getInstallCount(int[] wifiLocation, int mid) {
        int numWifi = 1;
        int distance = mid + wifiLocation[0];
        for (int i = 1; i < wifiLocation.length; i++) {
            if (wifiLocation[i] >= distance) {
                numWifi++;
                distance = wifiLocation[i] + mid;
            }
        }
        return numWifi;
    }

    private static int getMinDistance(int[] wifiLocation) {
        int minDistance = Integer.MAX_VALUE;

        for (int i = 1; i < wifiLocation.length; i++) {
            int distance = wifiLocation[i] - wifiLocation[i-1];
            if (minDistance > distance) minDistance = distance;
        }

        return minDistance;
    }
}