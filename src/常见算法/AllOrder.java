package 常见算法;

import java.util.TreeSet;

/**
 * 全排列代码
 */

public class AllOrder {

   static String [] s = {"0","1","2","3","4","5"};
   static boolean[] flag =new boolean[s.length];//判定该数字是否已经进去out中
   static TreeSet<String> set = new TreeSet<>();//TreeSet保证去重和排序
   static String out = "";
   public static void main(String[] args){

      for(int i = 0;i<s.length;i++){
         sort(i);
      }
      System.out.println(set);
   }

   private static void sort(int index) {

      flag[index]=true;
      out+=s[index];
      for (int i = 0; i < s.length; i++) {
         if(!flag[i]){  //这里可以添加一个二维数组判定相邻的数值是否满足条件
            sort(i);
         }
      }
      if (out.length()==s.length){
         set.add(out);
      }
      out=out.substring(0,out.length()-1);
      flag[index]=false;
   }


}
