package prob1;

/**
 * Problem 3
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 * @author Duke
 *
 */
public class LargestPrimeFactor {

	public static void main(String[] args){
		long a = 13195;
		System.out.println(lpf(a));
		long b = 600851475143L;
		System.out.println(lpf(b));
	}
	
	private static long lpf(long n){
		long maxPrime = -1;
		//divide number by two til you can't anymore
		while(n%2==0){
			maxPrime =2;
			n>>=1;
		}
		//skip all even numbers iterate only odds
		//use sqrt since we know factor won't be greater than the sqrt
		for(int i =3; i<=Math.sqrt(n);i+=2){
			while(n%i == 0){
				maxPrime = i;
				n=n/i;
			}
		}
		if(n>2){
			maxPrime = n;
		}
		return maxPrime;
	}
}
