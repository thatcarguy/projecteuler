package prob1;

/** 
 * Problem 1
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * @author Duke
 *
 */
public class Multiples3and5 {

	
	public static void main(String[] args){
		naiveApproach(1000);
	}
	//O(n) runtime O(1) space
	public static void naiveApproach(int max){
		int sum = 0;
		for(int i =0; i<max;i++){
			if(i%5 == 0 || i%3 ==0){
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
