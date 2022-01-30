package sum;

public class SumCalculator {
	int num1,num2,sum;
	public SumCalculator(int num1,int num2) 
	{
	this.num1=num1;
	this.num2=num2;
	}
	public int sum() {
		sum=num1+num2;
		return sum;
	}
}
