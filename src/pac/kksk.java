//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner cin = new Scanner(System.in);
//        int m = cin.nextInt();
//        int n = cin.nextInt();
//        for(int i = m; i <= n; i ++){
//            String s = Integer.toString(i);
//            if(check(s)){
//                System.out.print(s + " ");
//            }
//        }
//
//    }
//
//    private static boolean check(String s){
//        int i = 0, j = s.length() - 1;
//        char[] c = s.toCharArray();
//        while(i < j){
//            if(c[i] != c[j]) return false;
//            i ++; j --;
//        }
//        return true;
//    }
//
//}