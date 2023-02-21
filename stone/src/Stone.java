import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.min;

public class Stone
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int h= sc.nextInt();
        int c= sc.nextInt();

        List<Integer> aList = new ArrayList<>();
        List<Integer> dList = new ArrayList<>();
        for (int i=1;i<=c;i++) {
            int a = sc.nextInt();
            int d = sc.nextInt();
            aList.add(a);
            dList.add(d);
        }

        for (int i=0;i<h;i++) {
            int ans = -1, index = -1;
            for(int j=0;j< c;j++) {
                int u = aList.get(j) + dList.get(j);
                if (ans == -1) {
                    ans = u;
                    index = j;
                } else {
                    if (u < ans) {
                        index = j;
                    }
                    ans = min(ans, u);
                }
            }
            aList.set(index, ans);
        }

        Integer finalAns = aList.stream().max(Integer::compare).get();

        System.out.println(finalAns);
    }

}