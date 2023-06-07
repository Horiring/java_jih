package day6.whileex;

public class Practice {

	public static void main(String[] args) {
		int num1 =10;
		int num2 =2;
		char operator = '+';
		
		if(operator=='+') {
			System.out.println(""+num1+"+"+num2+"="+(num1+num2));
		}
		else if(operator=='-') {
			System.out.println(""+num1+"-"+num2+"="+(num1-num2));
		}
		else if(operator=='*') {
			System.out.println(""+num1+"*"+num2+"="+(num1*num2));
		}
		else if(operator=='/') {
			System.out.println(""+num1+"/"+num2+"="+(double)(num1/num2));
		}
		else {
			System.out.println("잘못 입력했습니다.");
		}
		switch(operator) {
		case '+': System.out.println(""+num1+"+"+num2+"="+(num1+num2));
		break;
		case '-': System.out.println(""+num1+"-"+num2+"="+(num1-num2));
		break;
		case '*': System.out.println(""+num1+"*"+num2+"="+(num1*num2));
		break;
		case '/': System.out.println(""+num1+"/"+num2+"="+((double)num1/num2));
		break;
		default:System.out.println("잘못 입력했습니다.");
		}

	}

}
