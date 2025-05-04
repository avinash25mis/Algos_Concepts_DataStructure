import java.io.*;
import java.util.*;
import java.util.stream.*;
        import static java.util.stream.Collectors.joining;
        import static java.util.stream.Collectors.toList;

 class Solution {



    // Complete the maxTickets function below.
    static int maxTickets(List<Integer> tickets) {


        int subsequences = 1;
        int maxSequence = 0;
        for (int i = 0; i < tickets.size() - 1; i++)
        {
            if (tickets.get(i) == tickets.get(i + 1)||tickets.get(i)+1 == tickets.get(i + 1))
            {
                subsequences++;
            }
            else
            {
                maxSequence = maxSequence < subsequences ? subsequences : maxSequence;
                subsequences = 1;
            }

        }

        return maxSequence;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int ticketsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> ticketsTemp = new ArrayList<>();

        IntStream.range(0, ticketsCount).forEach(i -> {
            try {
                ticketsTemp.add(bufferedReader.readLine().replaceAll("\\s+$", ""));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> tickets = ticketsTemp.stream()
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int res = maxTickets(tickets);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
