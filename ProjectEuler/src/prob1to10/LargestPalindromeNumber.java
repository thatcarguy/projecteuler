package prob1to10;
/**
 * Problem 4
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * @author Duke
 *
 */
public class LargestPalindromeNumber {
	public static void main(String[] args){
		findPalindrome(9999);
	}
	
	private static void findPalindrome(int k){
		int a = k, b = k, c=0;
		boolean flag = false;
		while(!flag){
			c = a*b;
			if((a-b)>9){
				a--;
				b=b+8;
			}else{
				b--;
			}
			flag = isPalindrome(c);
		}
		System.out.println(c);
		System.out.println("a: " + a+ " b: "+ b);
	}
	private static boolean isPalindrome(int n){
		int reverse = 0;
		int original = n;
		while(n!=0){
			int digit = n%10;
			reverse = reverse*10+digit;
			n/=10;
		}
		return original == reverse;
	}
}
