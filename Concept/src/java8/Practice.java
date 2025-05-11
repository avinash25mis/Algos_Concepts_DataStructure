package java8;

import java8.common.DataForStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
* this place is to see the question and try writing
*  the code without looking at the solution
*
* */

public class Practice {

    static List<DataForStream> dataForStreamList = new ArrayList<>();


    public static void main(String[] args) {
        dataForStreamList = DataForStream.getEmployeeList();
        Stream<Integer> numberStream = DataForStream.getNumberStream();

        System.out.println("practice size :"+ dataForStreamList.size());
       /* Map<Integer, List<DataForStream>> collect = dataForStreamList.stream().collect(Collectors.groupingBy(DataForStream::getId));
        numberStream.forEach(e->collect.entrySet().ke);
*/
        DataForStream.getNumberStream().filter(e->e<5).forEach(e->System.out.println(e));

    }
}
