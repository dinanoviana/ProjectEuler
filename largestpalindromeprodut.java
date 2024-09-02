public class largestpalindromeprodut {
    public static int findLargestPalindromeThreeDigits() {
        int max = 0;
        for (int i = 999; i > 800; i--) {
            for (int j = i; j > 800; j--) {
                int prod = i * j;
                if (isPalindrome(prod) && prod > max) {
                    System.out.println(String.format("palindrome: %-4d, product of %-4d and %-4d", prod, i, j));
                    max = prod;
                }
            }
        }
        return max;
    }
  
    public static boolean isPalindrome(int product){
        String prod = Integer.toString(product);
        if (prod.equals(new StringBuilder(prod).reverse().toString())){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int maxPal = findLargestPalindromeThreeDigits();
        System.out.println(String.format("Max Product: %-4d", maxPal));
    }
}