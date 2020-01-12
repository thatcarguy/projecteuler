package prob21to30;

import java.util.ArrayList;

/**
 * Problem 21
 * Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
 * If d(a) = b and d(b) = a, where a != b, then a and b are an amicable pair and each of a and b are called amicable numbers.
 * For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284
 * The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
 * Evaluate the sum of all the amicable numbers under 10000.
 * @author Duke
 *
 */
public class AmicableNumbers {

	public static void main(String[] args){
		amicableNumbers(10000);
	}
	
	private static void amicableNumbers(int n){
		int sum =0;
		int arr[] = new int[n+1];
		int firstNumber,secondNumber;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i =1; i<arr.length; i++){
			firstNumber = fastSum(i);
			if(!list.contains(i)&& !list.contains(firstNumber)){
				secondNumber = fastSum(firstNumber);
				if(secondNumber == i && firstNumber != secondNumber ){
					sum+=firstNumber;
					sum+=secondNumber;
					list.add(firstNumber);
					list.add(i);
				}
			}
		}
		System.out.println(sum);
	}
	private static int fastSum(int n){
		int sum = 0;
		for(int i =1; i<Math.sqrt(n); i++){
			if(n%i==0){
				if(n/i==i){
					sum+=i;
				}else{
					sum+=i;
					sum+=n/i;
				}
			}
		}
		return sum -n;
	}
}
