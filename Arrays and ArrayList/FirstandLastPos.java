package ArrayAndArrayList.Codes;

import java.util.Arrays;
import java.util.Scanner;

public class FirstandLastPos {
    public static void main(String[] args) {
        int []arr= {1,2,4,4,4,4,6,6,6,7,8,8,8,9,9,9};
        Scanner sc = new Scanner(System.in);
        int target= sc.nextInt();
        System.out.println(Arrays.toString(Pso(arr,target)));
    }
    static int[] Pso(int[] arr, int target) {
        int[] ans = {-1, -1};
        ans[0] = search(arr, target, true);
        if (arr[0] != -1)
            ans[1] = search(arr, target, false);

        return ans;
    }
    static int search(int []arr, int target,boolean findStartIndex)
    {
        int ans=-1;
        int start = 0;
        int end = arr.length -1;
        while(start<= end)
        {
            int mid = start+(end-start)/2;
            if(target< arr[mid])
                end = mid -1;
            else if(target>arr[mid])
                start=mid+1;
            else {
                ans = mid;
                if(findStartIndex == true)
                    end = mid-1;
                else
                    start = mid+1;
            }

        }
        return ans;
    }
}