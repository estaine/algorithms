
public class Exercise_1_1_9 {

	public static void main(String[] args) {
		int N = StdIn.readInt();		
		String s = "";
		for (int n = N; n > 0; n /= 2)
		s = (n % 2) + s;
		StdOut.print(s);
	}

}
