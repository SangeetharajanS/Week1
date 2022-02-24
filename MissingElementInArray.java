package project.sangeeth.AssignmetsWeek1;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		int[] Values = {1,2,3,4,7,6,8};
		Arrays.sort(Values);
		for (int i = Values[0]; i < Values.length-1; i++){
			if (i!=Values[i-1]) {
				System.out.println(i);
			break;
			}
		}	
		}
	}