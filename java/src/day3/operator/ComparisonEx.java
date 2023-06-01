package day3.operator;

public class ComparisonEx {

	public static void main(String[] args) {
		System.out.println("1 > 2 : "+(1>2));
		System.out.println("1 > 2 : "+(1<2));
		System.out.println("1 > 2 : "+(1>=2));
		System.out.println("1 > 2 : "+(1<=2));
		System.out.println("1 > 2 : "+(1==2));
		System.out.println("1 > 2 : "+(1!=2));
		
		
		/*
		 * 문자열은 == 로 비교하면 안됨 : 문법적으로는 에러가 발생하지 앉지만
		두 문자열이 같은지 다를지를 제대로 비교하진 않음
		-str1 과 str2에 리터럴 문자열 abc가 저장된 경우는 ==로 판별이 됨
		-str1과 str2가 Scanner를 통해 입력받은 문자열 abc인 경우는 ==로 판별이 안됨
		-str1.equals(str2);<비교방법 equals();를 이용한다
		 */
		/* str1과 str2는 리터럴 문자열 abc를 저장하고 있기 떄문에 ==로 비교 가능하지만
		 * str3은 리터럴 문자열이 아니기 떄문에 ==로 비교할 수 없다
		 * 그런데, 일반적으로 문자열 변수가 있는 경우 이 변수에 리터럴이 들어있는지 아닌지는 알 수 없다.
		 * 그래서 문자열을 ==나 !=로 비교하지 않는 것이 좋다
		 */
		String str1 ="abc";
		String str2 ="abc";
		String str3 = new String("abc");
		
		System.out.println("str1 == str2 : "+(str1 == str2));
		System.out.println("str1 == str2 : "+(str1 == str3));
		System.out.println("str1 == str2 : "+(str2 == str3));
		/* 문자열을 포함한 참조 변수들은 주로 equals를 이용하여 같은지 다른지를 판별
		 * 
		 */
		
		
		System.out.println("str1.equals(str) : " + str1.equals(str2));
		System.out.println("str1.equals(str) : " + str1.equals(str3));
		System.out.println("str1.equals(str) : " + str2.equals(str3));
		//참조 변수가 ==나 !=를 쓰는 대표적인 경우는 null과 비교하여 비었는지 안비었는지(객체가 생성됐는지)확인할 떄만 사용
		System.out.println(str1 == null);
	}

}
