package 常见算法;

/**
 * 画家小Q又开始他的艺术创作。小Q拿出了一块有NxM像素格的画板, 画板初始状态是空白的,用'X'表示。
 * 小Q有他独特的绘画技巧,每次小Q会选择一条斜线, 如果斜线的方向形如'/',即斜率为1,小Q会选择这条斜线中的一段格子,都涂画为蓝色,用'B'表示;如果对角线的方向形如'\',即斜率为-1,小Q会选择这条斜线中的一段格子,都涂画为黄色,用'Y'表示。
 * 如果一个格子既被蓝色涂画过又被黄色涂画过,那么这个格子就会变成绿色,用'G'表示。
 * 小Q已经有想画出的作品的样子, 请你帮他计算一下他最少需要多少次操作完成这幅画。
 * <p>
 * 每个输入包含一个测试用例。
 * 每个测试用例的第一行包含两个正整数N和M(1 <= N, M <= 50), 表示画板的长宽。
 * 接下来的N行包含N个长度为M的字符串, 其中包含字符'B','Y','G','X',分别表示蓝色,黄色,绿色,空白。整个表示小Q要完成的作品。
 * <p>
 * 输出一个正整数, 表示小Q最少需要多少次操作完成绘画。
 * <p>
 * 输入例子
 * 4 4
 * YXXB
 * XYGX
 * XBYY
 * BXXY
 * <p>
 * 输出例子
 * 3
 */

import java.util.Scanner;

public class PaintTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        char color[][] = new char[n][m];
        for (int i = 0; i < n; i++) {
            String tem = sc.next();
            color[i] = tem.toCharArray();
        }

        // 获取最小步数
        getminstep(n, m, color);

    }

    private static void getminstep(int n, int m, char[][] color) {
        int cont = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (color[i][j] == 'Y') {
                    //画y 斜对角一笔下去
                    paint_Y(n, m, i, j, color);
                    cont++;
                } else if (color[i][j] == 'B') {
                    //画b 斜对角一笔下去
                    paint_B(n, m, i, j, color);
                    cont++;
                } else if (color[i][j] == 'G') {
                    //如果是G,那么肯定是两次得到的,先B后Y或者先Y后B都可以
                    paint_B(n, m, i, j, color);
                    cont++;
                    paint_Y(n, m, i, j, color);
                    cont++;
                }
            }
        }
        System.out.println(cont);

    }

    private static void paint_Y(int n, int m, int x, int y, char[][] color) {
        if (x < n && y < m && x >= 0 && y >= 0 && (color[x][y] == 'Y' || color[x][y] == 'G')) {
            if (color[x][y] == 'Y') {
                color[x][y] = 'X';
            } else {
                color[x][y] = 'B';
            }
            paint_Y(n, m, x - 1, y - 1, color);
            paint_Y(n, m, x + 1, y + 1, color);
        }
    }

    private static void paint_B(int n, int m, int x, int y, char[][] color) {
        if (x < n && y < m && x >= 0 && y >= 0 && (color[x][y] == 'B' || color[x][y] == 'G')) {
            if (color[x][y] == 'B') {
                color[x][y] = 'X';
            } else {
                color[x][y] = 'Y';
            }
            paint_B(n, m, x + 1, y - 1, color);
            paint_B(n, m, x - 1, y + 1, color);
        }
    }


}
