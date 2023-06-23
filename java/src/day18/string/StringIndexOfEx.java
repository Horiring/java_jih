package day18.string;

public class StringIndexOfEx {

	public static void main(String[] args) {
		String str = "Hello World";
		int index;
		int count =0;
		for(int i = 0 ; i<str.length();i++) {
			index=str.indexOf("l",i);
			if(i==index) {
				count++;
			}				
		}
		System.out.println(count);
		
		int replace = str.length()-str.replace("l", "").length();
		System.out.println(replace);
		
		
		index=-1;
		count=0;
		String search="l";
		
		do {
			index =str.indexOf(search,++index);
			if(index!=-1) {
				count++;
			}
		}while(index !=-1);
		System.out.println(count);
	}

}
