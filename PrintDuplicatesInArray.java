package project.sangeeth.AssignmetsWeek1;

import java.util.Iterator;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int[] values = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int count;
		int L=values.length;
		for (int i = 0; i <L-1; i++) {
			count=0;
			for (int j = i; j <L; j++) {
				if(values[i]==values[j]) {
					count++;
				}
				
			}
			if(count>1) {
			System.out.println(values[i]);
			break;
		}
		

	}
}
}
