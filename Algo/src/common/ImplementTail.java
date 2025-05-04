package common;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author avinash.a.mishra
 */
public class ImplementTail {


    public static void main(String[] args) throws IOException {
       List<String> list= new ArrayList<>();
        String path = "C:/SERVER_FILES/KMM/log.txt";
        File file = new File(path);
          if (file.exists() && file.isFile()) {
                    try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                        if (br != null) {
                            String line;
                            while (true) {
                                line = br.readLine();
                                if(line!=null) {
                                    list.add(line);
                                }
                            }

                        }
                    }
                }

            }




}



