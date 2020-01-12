package prob21to30;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Problem 22
 * Using names.txt begin by sorting it into alphabetical order. 
 *Then working out the alphabetical value for each name, 
 *multiply this value by its alphabetical position in the list to obtain a name score.
 *For example, when the list is sorted into alphabetical order, 
 *COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. 
 *So, COLIN would obtain a score of 938 × 53 = 49714.
 *What is the total of all the name scores in the file?
 * @author Duke
 *
 */
public class NamesScores {
	public static void main(String[] args)throws Exception{
		File f = new File("Prob22.txt");
		score(f);
	}
	
	private static void score(File f) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader(f));
		String temp = null, line = null;
		while((temp=br.readLine())!=null){
			if(temp!=null){
				line=temp;
				line = line.replace("\"","");
			}
		}
		ArrayList<String> list = toList(line);
		Collections.sort(list);
		int totalScore =0;
		int nameScore = 0;
		for(int i =0; i<list.size(); i++){
			nameScore = nameScore(list.get(i));
			nameScore = nameScore*(i+1);
			totalScore +=nameScore;
		}
		System.out.println(totalScore);
		
	}
	
	private static ArrayList<String> toList(String file){
		List<String> list;
		list = (List<String>)Arrays.asList(file.split(","));
		ArrayList<String> finalList = new ArrayList<String>(list);
		return finalList;
	}
	private static int nameScore(String name){
		char[] arr = name.toCharArray();
		int score = 0;
		int temp;
		for(char a: arr){
			temp = (int)a;
			score += (temp-64);
		}
		return score;
	}
}
