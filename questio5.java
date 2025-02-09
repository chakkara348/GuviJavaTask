package javaTask;

public class questio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=7;
		int count = 0;
		
		for(int i=1;i<=number;i++) {
			if (number%i == 0) {
				count = count+1;
			}
		}
		
		if(count == 2) {
			System.out.print("Prime number");
		}else {
			System.out.print("Not a Prime number");
		}

	}

}
