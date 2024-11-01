import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=0;i<n;i++) {
			int y= sc.nextInt();
			int m = sc.nextInt();
			int d = sc.nextInt();
			if (largerThan18(y,m,d)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		
		

	}

	private static boolean largerThan18(int y, int m, int d) {
		int dy = 2007-y;
		if (dy>18) {
			return true;
		} else if (dy<18) {
			return false;
		}
		// will be here if dy==18
		int dm = 2-m;
		
		if (dm>0) 
		{
			return true;
		} else if (dm<0) {
			return false;
		}
		
		// will be here if dm==0;
		
		int dd = 27-d;
		if (dd>=0) {
			return true;
		}
		
		return false;
		
	}

}
