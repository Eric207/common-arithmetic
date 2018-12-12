package 常见算法;


/**
 * 快速排序
 */
public class FastSort {
    public static void main(String[] args) {
        int[] aim = {2, 1, 5, 3, 7, 9};
        q_sort(aim, 0, aim.length-1);
        System.out.println(aim);
    }
    private static void q_sort(int[] aim, int start, int end) {
        if (start >= end) {
            return;
        }
        int i = start;
        int j = end;
        int x = aim[i];
        while (i < j) {
            //保证右边的都比他大
            while (aim[j] > x && i < j) {
                j--;
            }
            if (i < j) {
                aim[i] = aim[j];
                i++;
            }
            //保证左边的都比他小
            while (aim[i] < x && i < j) {
                i++;
            }
            if (i < j) {
                aim[j] = aim[i];
                j--;
            }
        }
        //走到这里说明ij相同,此时的位置也就是x最合适的位置
        aim[i]=x;
        //左边都比x小,右边都比x大
        q_sort(aim, start, i - 1);
        q_sort(aim, i + 1, end);
    }


}
