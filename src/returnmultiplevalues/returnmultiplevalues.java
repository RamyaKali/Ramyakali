package returnmultiplevalues;

public class returnmultiplevalues {
	public static int[]PerformBasicArithOp(int a,int b){
		int add = a+b;
		int subtract = a-b;
		int multiply = a*b;
		int divide = a/b;
		int ans[] = new int[4];
		ans[0] =add;
		ans[1]= subtract;
		ans[2]=multiply;
		ans[3]=divide;
		return ans;
		
	}
	public static void main(String args[]) {
	returnmultiplevalues obj = new returnmultiplevalues();
	int n1 = 9;
	int n2 = 3;
	int ans[]= obj.PerformBasicArithOp(n1,n2);
	System.out.println("The sum of numbers "    +n1+"and"+n2+"is:  "+ans[0]);
	System.out.println("The subtraction of numbers "+n1+"and"+n2+"is:  "+ans[1]);
	System.out.println("The multiply of numbers "+n1+"and"+n2+"is:  "+ans[2]);
	System.out.println("The divide of numbers "+n1+"and"+n2+"is:  "+ans[3]);
	}
	
	
}