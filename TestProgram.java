/**
 * 
 */

/**
 * @author Andrei-PC
 *
 */
public class TestProgram {
	
	private static int NumberOfDigits(int number) {
		int nr=0;
		long newSeedCopy=number;
		while(newSeedCopy!=0) {
			newSeedCopy/=10;
			nr++;
		}
		return nr;
	}
	
	public static void main(String[] args) {
		int seed=6541,nraleatoare = 15,n=0;
		int numberofseed = NumberOfDigits(seed);
		MidSqr test=new MidSqr(seed);
		float x=test.Random();
		System.out.println((int)x);
		while(n!=nraleatoare - 1) {
			MidSqr test1=new MidSqr((int)x);
			x=test1.Random();
			if(NumberOfDigits((int)x)==numberofseed)
			{
				System.out.println((int)x);
			}
			else {
				int z = n+2;
				System.out.println("Al"+z+ "-lea numar are seedul mai mic de "+numberofseed+" cifre");
			}
			n++;
		}
		
	}


}
