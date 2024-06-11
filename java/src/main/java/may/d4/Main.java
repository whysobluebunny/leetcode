package may.d4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(predictPartyVictory("RDD"));
    }

    public static String predictPartyVictory(String senate) {
        int size = senate.length();
        Deque<Integer> radiantQueue = new LinkedList<>();
        Deque<Integer> direQueue = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            if (senate.charAt(i) == 'R')
                radiantQueue.offer(i);
            else
                direQueue.offer(i);
        }
        while (!radiantQueue.isEmpty() && !direQueue.isEmpty()) {
            int radiant = radiantQueue.poll();
            int dire = direQueue.poll();
            if (radiant < dire)
                radiantQueue.offer(radiant + size);
            else
                direQueue.offer(dire + size);
        }
        return radiantQueue.isEmpty() ? "Dire" : "Radiant";
    }

    /**
     * медленно
     */
//    public static String predictPartyVictory(String senate) {
//        List<String> senateList = new ArrayList<>(Arrays.asList(senate.split("")));
//        while (new HashSet<String>(senateList).size() >= 1) {
//            String senator = senateList.get(0);
//            if (senator.equals("R"))
//                if (senateList.contains("D"))
//                    senateList.remove("D");
//                else return "Radiant";
//            if (senator.equals("D"))
//                if (senateList.contains("R"))
//                    senateList.remove("R");
//                else return "Dire";
//            senateList.remove(0);
//            senateList.add(senator);
//        }
//        return "null";
//    }
}
