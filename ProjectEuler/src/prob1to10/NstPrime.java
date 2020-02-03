package prob1to10;

/**
 * Problem 7
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
 * @author Duke
 *
 */
public class NstPrime {
	public static void main(String[] args){
		System.out.println(findPrime(6));
	}
	
	private static int findPrime(int n){
		int primeNumber =2;
		int counter = 1;
		int i =3;
		while(counter<=n){
			if(isPrime(i)){
				counter++;
				primeNumber = i;
			}
			i+=2;
		}
		return primeNumber;
	}
	private static boolean isPrime(int n){
		if(n<=1){
			return false;
		}
		if(n ==2){
			return true;
		}
		for(int i =2; i<Math.sqrt(n); i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
}
