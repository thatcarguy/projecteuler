package prob21to30;

import java.math.BigInteger;

public class FindLargeFib {
	public static void main(String[] args){
		findFib(1000);
	}
	private static void findFib(int n){
		BigInteger a = new BigInteger("0");
		BigInteger b = new BigInteger("1");
		BigInteger c = new BigInteger("0");
		
		long index = 2;
		boolean isFound = false;
		while(!isFound){
			c = a.add(b);
			a=b;
			b=c;
			if(c.toString().length()>=n){
				isFound = true;
			}
			index++;
		}
		System.out.println("Index: "+index + "\nFib= \n"+c.toString());
	}
	
}
