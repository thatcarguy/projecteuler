package prob1to10;

import java.util.Arrays;

/**
 * Problem 10
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 * @author Duke
 *
 */
public class SumOfPrimes {
	public static void main(String[] args){
		sieveErathonos(2000000);
	}
	
	//O(nlog(logn) O(n) space
	private static void sieveErathonos(int n){
		boolean arr[] = new boolean[n+1];
		Arrays.fill(arr, true);
		for(int i =2; i*i<=n; i++){
			if(arr[i]==true){
				for(int k=i*i; k<=n;k+=i){
					arr[k]= false;
				}
			}
		}
		long sum = 0;
		for(int i =2; i<=n; i++){
			if(arr[i]==true){
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}
