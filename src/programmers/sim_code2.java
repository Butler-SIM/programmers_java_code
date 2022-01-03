package programmers;

import java.lang.reflect.Array;
import java.util.*;

public class sim_code2 {
    public static void main(String[] args) {

        // 1     1/8
        // 222   3/7
        // 33    2/4
        // 4     1/2
        // 5     0/1   == 6
        // result = [3,4,2,1,5]
        int n = 5;
        Integer[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] answer = {};


        //오름 차순
        ArrayList my_list = new ArrayList();
        ArrayList my_fail_list = new ArrayList();
        Arrays.sort(stages);
        for (int i = 0; i < stages.length; i++) {
            System.out.println("1// ##sort## : " + stages[i]);
            if (stages[i] != n + 1) {
                my_list.add(stages[i]);
            } else {
                my_list.add(stages[i] - 1);
            }
        }
        System.out.println("my_list : " + my_list);

        Map<Integer, Double> mapList = new HashMap<Integer, Double>();
        //실패율
        for (int i = 0; i < n; i++) {
            double stages_count = 0;
            double clear_count = 0;
            double fail_percent = 0.0;
            for (int k = 0; k < my_list.size(); k++) {
                if (i + 1 == Integer.parseInt(my_list.get(k).toString())) {
                    stages_count += 1;
                }
                if (i + 1 <= Integer.parseInt(my_list.get(k).toString())) {
                    clear_count += 1;
                }
            }
            if (clear_count != 0) {
                fail_percent = clear_count / stages_count;
                System.out.println(stages_count + "/" + clear_count + " : " + fail_percent);
                System.out.println("fail_percent : " + fail_percent);
                System.out.println("stages_count : " + stages_count);
                System.out.println("CLEAR_COUNT : " + clear_count);
                mapList.put(i + 1, fail_percent);
            }
        }
        System.out.println("map : " + mapList);

        Collections.sort(my_list, (value1, value2) -> (mapList.get(value2).compareTo(mapList.get(value1))));
        for (int i =1; i<mapList.size()+1; i++) {
            System.out.println("key : " + i + " , " + "value : " + mapList.get(i));
        }


        for (int i = 0; i < stages.length; i++) {
            System.out.println("1// ##sort## : " + stages[i]);
            if (stages[i] != n + 1) {
                my_list.add(stages[i]);
            } else {
                my_list.add(stages[i] - 1);
            }
        }
        System.out.println("my_list : " + my_list);

        // ArrayList 원소 빈도수 출력
//        Set<Integer> set = new HashSet<Integer>(my_list);
//        for (Integer i : set) {
//            System.out.println(i + " : " + Collections.frequency(my_list, i));
//            set.add(Collections.frequency(my_list, i));
//        }
//        System.out.println(set);


        System.out.println(answer);
    }
}
