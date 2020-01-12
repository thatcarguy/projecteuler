package prob1to10;

public class SumSquareDiff {
	public static void main(String[] args){
		System.out.println(squareDiff(1000));
	}
	
	private static long squareDiff(int n){
		long sum =0L;
		long sumOfNumbs = 0L;
		long squareOfSum = 0L;
		long diff = 0L;
		for(int i =1; i<=n; i++){
			sum += Math.pow(i,2);
			sumOfNumbs +=i;
		}
		System.out.println(sum);
		squareOfSum = (long)Math.pow(sumOfNumbs, 2);
		diff = squareOfSum - sum;
		return diff;
	}
}
