package Training;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QuickSort2 {

    public static List<Integer> quickSort(List<Integer> list) {
        if (list.size() <= 1) return list;
        int pivot = list.get(list.size() / 2);
        System.out.println("pivot : " + pivot);

        List<Integer> lesserArr = new LinkedList<>();
        List<Integer> equalArr = new LinkedList<>();
        List<Integer> greaterArr = new LinkedList<>();

        for (int num : list) {
            if (num < pivot)
                lesserArr.add(num);
            else if (num > pivot)
                greaterArr.add(num);
            else
                equalArr.add(num);
        }

        return Stream.of(quickSort(lesserArr), equalArr, quickSort(greaterArr))
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < 20; i++){
            list.add(100-i);
        }

        list = quickSort(list);
        for(int tmp : list){
            System.out.println(tmp);
        }
    }


}
