package sep_internship_code;

public class UnaryOperatorDemo {
	public static void main(String[] args) {
		// -10
		
//		boolean b1 = true;
//		System.out.println(!b1);
		
		// increment operator 
		// pre increment - first increase then assign ++i
		// post increment- first assign then increase i++
		int i = 10;
		int j = i++ + i++ + ++i;
		//      10  + 11  +  13 
		System.out.println("i - " + i);
		System.out.println("j - " + j);
	}
}
