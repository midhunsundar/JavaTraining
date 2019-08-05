package asignment4;

import java.util.Scanner;

public class Frequecy {

	public static void main(String[] args) {
		System.out.println("Please enter input to check the frequency");
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		
		String charOne = N.substring(0,1);
		int initialFreq=0;
		boolean flag=true;
		
		for (int i = 0;i< N.length(); i++) {
			String firstChar = N.substring(i, i+1);	
			int freqTrac=0;
			for (int j = 0;j<N.length();j++) {
				String secondChar = N.substring(j,j+1);
				
				if((i==0)&& (charOne.equalsIgnoreCase(secondChar))) {
							initialFreq++;
				}		
				if (firstChar.equalsIgnoreCase(secondChar)) {
					freqTrac++;
				}
			}
			if (initialFreq != freqTrac) {
				flag = false;
				break;
			}


		}
		 String out = (flag) ?  "YES" : "NO";
		 System.out.print(out);
			
		
	}

}
