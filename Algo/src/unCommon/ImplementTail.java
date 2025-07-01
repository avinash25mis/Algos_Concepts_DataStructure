package unCommon;

import java.io.*;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Implement tail linux command , using java
 * Implementing the tail command  involves reading the last few lines of a file.
 */
public class ImplementTail {


    public static void main(String[] args) throws IOException {
        Deque<String> deque = new LinkedList<>();
        String path = "C:/SERVER_FILES/KMM/log.txt";
        File file = new File(path);
          if (file.exists() && file.isFile()) {
           try (BufferedReader br = new BufferedReader(new FileReader(file))) {
               if (br != null) {
                   String line;
                   while ((line = br.readLine())!=null) {
                       deque.add(line);
                   }

                   String s = deque.pollFirst();// Remove the oldest line

               }
           }
       }

    }




}



