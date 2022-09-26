package basic4;

public class CalculatorExpr {

	private int num1;
	private int num2;

	int getAddition() {
		this.num1 = num1;
		this.num2 = num2;
		return num1 + num2;
		
	}

	int getSubtraction() {
		this.num1 = num1;
		this.num2 = num2;
		return num1 - num2;
	}

	int getMultplication() {
		this.num1 = num1;
		this.num2 = num2;
		return num1 * num2;

	}

	double getDivision() {
		this.num1 = num1;
		this.num2 = num2;
		return (double)num1 / num2;

	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

}
