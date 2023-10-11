package BinarySearch;

import java.util.Arrays;

/*
    Problem 2251: Number of flowers in Full Bloom
    separate start and end time
    Sort the start and ned time arrays
    Binary search to find bloomed and dead flowers

    Time Complexity - O((N+M) log(N));
    Space Complexity - O(N)
 */
public class Solution2251 {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {

        int n = flowers.length;
        int m = people.length;

        int[] start = new int[n];
        int[] end = new int[n];

        for(int i = 0; i < n; i++) {

            start[i] = flowers[i][0]; //No of flowers bloomed
            end[i] = flowers[i][1]+1; //No of flowers dead at the end of day
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int[] ans = new int[m];

        for(int i = 0; i < m; i++) {

            int t = people[i];
            int started = binarySearch(start, t); // find total number of flowers bloomed at time t
            int ended = binarySearch(end, t); // find total number of flowers dead at time t

            ans[i] = started - ended; //bloomed - dead flowers at time t
        }

        return ans;
    }

    public int binarySearch(int[] time, int target) {

        int n = time.length;

        int low = 0;
        int high = n;

        while(low < high) {

            int mid = (low + high)/2;

            if(target < time[mid]) {

                high = mid;
            }else {

                low = mid+1;
            }
        }

        return low;
    }
}
