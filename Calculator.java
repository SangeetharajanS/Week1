package project.sangeeth.AssignmetsWeek1;
public class Calculator {
		public int addNumbers(int num1, int num2, int num3) {
			return num1+num2+num3;
		}
		public int subNumbers(int num1, int num2) {
			return num1-num2;
		}
		public double mulNumbers(double num1, double num2) {
			return num1*num2;
		}
		public float divNumbers(float num1, float num2) {
			return num1/num2;
		}
		
	public static void main(String[] args) {
	Calculator obj = new Calculator();
	int sum = obj.addNumbers(10,20,30);
	System.out.println("Sum of values " +sum);
	int sub = obj.subNumbers(20,30);
	System.out.println("Subtracted values " +sub);
	double mul = obj.mulNumbers(10,10);
	System.out.println("Multiplied values " +mul);
	float div = obj.divNumbers(25,3);
	System.out.println("Divided value "+div);
}
}
