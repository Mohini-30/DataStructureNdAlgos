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
	
	public static int getDivisionQuotient(int a, int b) {
		if(a== Integer.MAX_VALUE && b==-1) return Integer.MAX_VALUE;
        if(a< Integer.MIN_VALUE) return Integer.MIN_VALUE;
        //if(a < b) return 0;
        int ans =0;
		int neg = a<0 || b<0 ? -1:1;
		neg = a<0 && b<0 ? 1:neg;
		a=Math.abs(a);
		b= Math.abs(b);
		System.out.println(a+"  "+b);
        if(a == b) return neg;
        if(a < b) return 0;
        if(b==1) return neg*a;
        
		for(int i=highestPower(a, b);i>=0;i--) {
			if((b<<i) <= a) {
				a-= b<<i;
				ans+= 1<<i;
			}
		}
		
		return neg*ans;
	}
	
	private static int highestPower(int divisor, int dividend) {
		int hp =0;
		int halfDividend=dividend>>1;
		while(halfDividend<divisor) {
			hp++;
			divisor = divisor<<1;
		}
		return hp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.MAX_VALUE);
		System.out.println(getsubtraction(10, 5));
		System.out.println(getSum(10, 5));
		System.out.println(getDivisionQuotient(-2147483648, -1));
	}

}
