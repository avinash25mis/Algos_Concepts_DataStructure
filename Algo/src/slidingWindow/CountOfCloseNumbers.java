package slidingWindow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountOfCloseNumbers {


    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(List.of(4, 9, 4, 8, 8));
        maxTickets(integers);
    }



    static int maxTickets(List<Integer> tickets) {

        Collections.sort(tickets);
        int subsequences = 1;
        int maxSequence = 0;
        for (int i = 0; i < tickets.size() - 1; i++)
        {
            if (Math.abs(tickets.get(i)-tickets.get(i + 1)) <= 1)
            {
                subsequences++;
            }
            else
            {

                subsequences = 1;
            }
            maxSequence = maxSequence < subsequences ? subsequences : maxSequence;

        }

        System.out.println(maxSequence);
        return maxSequence;

    }
}
