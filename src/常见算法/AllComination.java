package 常见算法;

import java.util.TreeSet;

/**
 * 全组合 set去重复
 */
public class AllComination {

    static TreeSet<String> set = new TreeSet<>();
    public static void main(String[] args) {
        String[] s = {"A", "B", "C", "D", "E"};
        comination(s);
        System.out.println(set);
    }

    private static void comination(String[] s) {

        int len = s.length;
        int max = 1 << len;
        //有多少个相当于一共有2的多少次方种
        for (int i = 0; i < max; i++) {
            StringBuffer sb = new StringBuffer();
            //例如外层是00110,那么应该去除的是第二位和第三位(左边是高位所以反着看),
            // 这里的相当于进行移位与比较,看这一位是不是我们要选的2 3 位
            for (int j = 0; j < len; j++) {
                if ((i & (1 << j)) != 0) {
                    sb.append(s[j]);
                }
            }
            set.add(sb.toString());
        }
    }
}
