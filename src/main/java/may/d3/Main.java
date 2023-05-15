package may.d3;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] nums1 = new int[]{1,2,3,3};
        int[] nums2 = new int[]{1,1,2,2};
        System.out.println(findDifference(nums1, nums2));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>(Arrays.stream(nums1).boxed().collect(Collectors.toCollection(HashSet::new)));
        List<Integer> list2 = new ArrayList<>(Arrays.stream(nums2).boxed().collect(Collectors.toCollection(HashSet::new)));
        int size = list1.size();
        for (int i = 0; i < size; i++) {
            if (list2.contains(list1.get(i))) {
                list2.removeAll(Collections.singleton(list1.get(i)));
                list1.removeAll(Collections.singleton(list1.get(i)));
                size = list1.size();
                i--;
            }
        }
        return List.of(list1, list2);
    }
}