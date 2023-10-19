import java.lang.*;

class Literal{
	
	public static void main(String args[]){
		
		byte b = 10;  // decimal
		byte c = 0b1010;  // BinaryRefAddr
		byte d = 012; // octal
		byte e = 0XA; //xedecimal
		
		long l = 9999999999L;
		
		float f = 12.56f;
		double m = 12.56;
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(l);
		System.out.println(f);
		System.out.println(m);
		
	}
}