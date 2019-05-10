import java.util.*;

public class Problem1071 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int total = 0;
		int n = 0;
		if (a > b) {
			n += b;
			while (n >= b && n < a - 1) {
				++n;
				if (n % 2 != 0) {
					total += n;
				}
			}
		} else if (b > a) {
			n += a;
			while (n >= a && n < b - 1) {
				++n;
				if (n % 2 != 0) {
					total += n;
				}
			}
		}
		System.out.println(total);
	}
}