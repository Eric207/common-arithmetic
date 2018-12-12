package 常见算法;

/**
 * 计算组合 C[2][1]
 * 这种相当于杨辉三角,因此需要的是构建杨辉三角
 */
public class Conmination {

    public static void main(String[] args) {
        int max = 41;
        long[][] arr = new long[max][max];
        for (int i = 0; i < max; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    arr[i][j] = 1;
                    continue;
                }
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }
        //例如输出C[40][33];
        System.out.println(arr[40][33]);
    }
}
