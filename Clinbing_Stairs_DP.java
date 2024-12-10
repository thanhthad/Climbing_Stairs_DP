public class Clinbing_Stairs_DP {
    static public int climbStairs(int n) {
        int[] save = new int[n];
        if ( n <=1 ){
            return 1;
        }
        return climbStairs(n-1) + climbStairs(n-2);
    }
    static public int climbStairs1(int n) {
        int[] save = new int[n + 1];
        save[0] = 1;
        save[1] = 1;
        for(int i = 2 ; i <=n ; i ++){
            save[i] = save[i-1] + save[i-2];
        }
        return save[n];
    }
        public static int climbStairs2(int n) {
            if (n <= 1) {
                return 1;
            }
            int first = 1;
            int second = 1;

            for (int i = 2; i <= n; i++) {
                int current = first + second;
                first = second;
                second = current;
            }

            return second;
        }
    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }
}
