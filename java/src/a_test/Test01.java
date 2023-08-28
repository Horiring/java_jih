package a_test;

public class Test01 {

	public static void main(String[] args) {
	    int answer = 0;
	    int n=10;
        for(int i=2; i>=n;i++){
            if(n%i==1){
                answer = answer+i;
                return;
            }
        }
        System.out.println(answer);
	}

}
