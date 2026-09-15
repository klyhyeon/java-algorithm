package programmers.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingPractice {

    public void prac1() {
        List<String> list = new ArrayList<>(List.of("a", "u", "b", "C", "O", "d", "b", "A"));
        int[] intArr = {1,2,3,5,1000,4,3,67,8,-1};

        Arrays.sort(Arrays.stream(intArr).boxed().toArray(Integer[]::new), Comparator.reverseOrder());

        List<String> newList = List.copyOf(list);
        Collections.sort(list);
        System.out.println(list.iterator().next());
        Collections.reverse(list);
        System.out.println(list.iterator().next());

        System.out.println(Arrays.stream(intArr).iterator().next());

        Integer[] integers = Arrays.stream(intArr)
                .boxed()
                .toArray(Integer[]::new);

        Arrays.stream(integers)
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static void main(String args[]) {

    }
}
