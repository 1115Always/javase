import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String s = "a";

        System.out.println(lengthOfLongestSubstring(s));


    }

    public static int lengthOfLongestSubstring(String s) {

        if (s.length() == 1) {
            return 1;
        }

        byte[] bytes = s.getBytes(StandardCharsets.UTF_8);

        int maxLen = 0;

        List<Byte> list = new LinkedList<>();

        for (byte b : bytes) {
            if (list.size() > 0) {
                int pos = list.indexOf(b);
                if (pos != -1) {
                    if (list.size() > maxLen) {
                        maxLen = list.size();
                    }
                    list = list.subList(pos + 1, list.size());
                }
            }
            list.add(b);
        }

        return maxLen > list.size() ? maxLen : list.size();
    }

}
