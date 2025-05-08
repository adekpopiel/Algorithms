package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CheckEqualArrays {
    public static boolean checkEqual(int[] a, int[] b) {
        boolean result = true;
        if (a.length != b.length) {
            result = false;
        }

        Map<Integer, Long> aMap = Arrays.stream(a).boxed().collect(Collectors.groupingBy(
                element -> element,
                Collectors.counting())
        );
        Map<Integer, Long> bMap = Arrays.stream(b).boxed().collect(Collectors.groupingBy(
                element -> element,
                Collectors.counting())
        );

        for (Map.Entry<Integer, Long> entry : aMap.entrySet()) {
            if (!bMap.containsKey(entry.getKey())) {
                result = false;
            } else {
                if (entry.getValue() != bMap.get(entry.getKey())) {
                    result = false;
                }
            }
        }

        return result;
    }
}
