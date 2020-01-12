package prob11to20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.math.BigInteger;

/**
 * Problem 13
 * Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.
 * @author Duke
 *
 */
public class LargeSum {
	public static void main(String[] args) throws Exception{
		File file = new File("Prob13.txt");
		sumBigInt(file);
		byHand(file);
	}
	
	private static void sumBigInt(File f) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader(f));
		String temp;
		BigInteger number;
		BigInteger sum = new BigInteger("0");
		
		while((temp= br.readLine())!=null){
			number = new BigInteger(temp);
			sum = sum.add(number);
		}
		System.out.println(sum.toString().substring(0,10));
	}
	
	//By Hand
	private static void byHand(File f)throws Exception{
		BufferedReader br = new BufferedReader(new FileReader(f));
		String temp = null;
		char[][] charArr = new char[100][50];
		int i =0;
		while((temp = br.readLine())!=null){
			charArr[i] = temp.toCharArray();
			i++;
		}
		StringBuilder sb = new StringBuilder();
		int sum = 0;
		for(int j = 49; j>=0; j--){
			for(int k=0; k<100;k++){
				sum+= Character.getNumericValue(charArr[k][j]);
			}
			sb.append(sum%10);
			sum = sum/10;
		}
		sb.append(sum);
		String value = sb.reverse().toString().substring(0,10);
		System.out.println(value);
	}
}
