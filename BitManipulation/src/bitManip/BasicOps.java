package bitManip;

//This class will include basic operations regarding Bits Manipulations


/*
 * Set union A | B
 * Set intersection A & B
 * Set subtraction A & ~B
 * Set negation ALL_BITS ^ A or ~A
 * Set bit A |= 1 << bit
 * Clear bit A &= ~(1 << bit)
 * Test bit (A & 1 << bit) != 0
 * Extract last bit A&-A or A&~(A-1) or x^(x&(x-1))
 * clear last bit A&(A-1)
 * Get all 1-bits ~0
*/



public class BasicOps {

	
	//Subtract two numbers without using mathematical operator
	//Still Doubt full
	public static int getsubtraction(int a, int b) {
		
		return getSum(a, -b);
	}
	
	//Sum of two Integers
	public static int getSum(int a, int b) {
		
		/*
		 * The logical explanation for the logic below is that XOR is able to give addition 
		 * when there is no need to deal with carry but when to deal with carry part we have to 
		 * do the AND operation, as carry will be generated when both the bits are 1
		 * Example 3+2 =5
		 	011^010 = 001 (but there is a carry at second bit)
		 	011&010 = 010 << 1 = 100
		 	Adding both will give the final result => 101 = 5
		*/
		return b==0? a : getSum(a^b,(a&b)<<1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getsubtraction(10, 5));
		System.out.println(getSum(10, 5));
	}

}
