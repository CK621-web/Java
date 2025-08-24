package lesson26;

public class KthPermutation {

    static int fact(int n) {
        if (n <= 1)
            return 1;
        return n * fact(n - 1);
    }

    static String getPermutation(String nums, int k) {
        if (nums.length() == 0) {
            return "";
        }
        int n = nums.length();
        int f = fact(n - 1);
        int i = (k - 1) / f;
        char chosen = nums.CharAt(i);

        String remaining = nums.substring(0, i) + nums.substring(i + 1);

        return chosen + getPermutation(remaining, k - i * f);
    }

    public static void main(String[] args) {
        int n = 4, k = 9;

        String nums = "1234";
        for (int i = 1; i <= n; i++) {
            nums += i;
        }
        System.out.println("The " + k + "th permutation of " + nums + " is: " + getPermutation(1234, k));
    }

}
