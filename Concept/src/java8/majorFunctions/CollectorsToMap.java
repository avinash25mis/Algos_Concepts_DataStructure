package java8.majorFunctions;

import java8.common.DataForStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsToMap {

    public static void main(String[] args) {

        switch (1){
            case 1 :
            {
                toMapOperation();
                break;
            }


        }
    }

    private static void toMapOperation() {
        List<DataForStream> list= new ArrayList<>();
       list = DataForStream.getEmployeeList();

        Map<Integer, DataForStream> collect = list.stream().collect(Collectors.toMap(e -> e.getId(), Function.identity()));
        System.out.println(collect);

        Map<Integer, String> collect1 = list.stream().collect(Collectors.toMap(e -> e.getId(), e -> e.getName()));
        System.out.println(collect1);

        Map<DataForStream, String> collect2 = list.stream().collect(Collectors.toMap(e -> e, e -> e.getName()));
        System.out.println(collect2);   //e->e is similar to Function.Identity

        Map<Integer, String> collect3 = list.stream().collect(Collectors.toMap(DataForStream::getId, DataForStream::getName));
        System.out.println(collect3);
    }
}
