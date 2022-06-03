package LeetCode;

public class RichestCustomerSearch {

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }

    public static int numberOfSteps(int num) {
        int numberOfSteps = 0;

        while (num != 0) {
            if (num % 2 == 0) {
                ++numberOfSteps;
                num = num / 2;
            } else {
                num = num - 1;
                ++numberOfSteps;
            }
        }
        return numberOfSteps;
    }
}
