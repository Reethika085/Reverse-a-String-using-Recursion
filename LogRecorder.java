import java.util.*;

public class LogReorder {
    public static String[] reorderLogFiles(String[] logs) {
        List<String> letterLogs = new ArrayList<>();
        List<String> digitLogs = new ArrayList<>();

        for (String log : logs) {
            String[] parts = log.split(" ", 2);
            if (Character.isDigit(parts[1].charAt(0))) {
                digitLogs.add(log);
            } else {
                letterLogs.add(log);
            }
        }
        Collections.sort(letterLogs, new Comparator<String>() {
            public int compare(String log1, String log2) {
                String[] split1 = log1.split(" ", 2);
                String[] split2 = log2.split(" ", 2);
                int cmp = split1[1].compareTo(split2[1]);
                if (cmp != 0) {
                    return cmp;
               }
                return split1[0].compareTo(split2[0]);
		}});
        String[] result = new String[logs.length];
        int idx = 0;

        for (String log : letterLogs) {
            result[idx++] = log;
        }
        for (String log : digitLogs) {
            result[idx++] = log;
        }

        return result;
    }
    public static void main(String[] args) {
        String[] logs1 = {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
        String[] result1 = reorderLogFiles(logs1);
        System.out.println(Arrays.toString(result1));
        String[] logs2 = {"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"};
        String[] result2 = reorderLogFiles(logs2);
        System.out.println(Arrays.toString(result2));
    }
}
