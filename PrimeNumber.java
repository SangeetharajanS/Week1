package project.sangeeth.AssignmetsWeek1;

public class PrimeNumber {

	public static void main(String[] args) {
		int prime=13;
		boolean test=false;
		for (int i = 2; i <=prime/2; i++) {
			if(prime%i == 0) {
				test=true;
				break;
				}
		}
			if(test=true)
			System.out.println(13 +" Is a prime number");
			else
				System.out.println(13 +" Is not a prime number");
		
		}

	}
