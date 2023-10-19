import java.lang.*;

class DataSize{
	
public static void main(String args[]){
	
	System.out.println("Minium Value " + Integer.MIN_VALUE);
	System.out.println("Maximum Value " + Integer.MAX_VALUE);
	System.out.println("Value in Bytes  " + Integer.BYTES);
	
	System.out.println("Minium Value " + Byte.MIN_VALUE);
	System.out.println("Maximum Value " + Byte.MAX_VALUE);
	System.out.println("Value in Bytes  " + Byte.BYTES);
	
	
	//converting integer to BinaryRefAddr
	
	int a = -5;
	
	System.out.println(Integer.toBinaryString(a));
}

}
