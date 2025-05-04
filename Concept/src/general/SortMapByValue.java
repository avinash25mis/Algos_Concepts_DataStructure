package general;

import java.util.*;

public class SortMapByValue {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("avinash", 10);
        map.put("vishal", 5);
        map.put("raj ", 15);
        sortUsingJava7(map);
    }

    private static void sortUsingJava7(Map<String, Integer> map) {

        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
        list.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

       // Collections.sort(list, Comparator.comparing(Map.Entry::getValue));


        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }

        System.out.println(temp);

    }


}
