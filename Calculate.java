public class Calculate{
	public static void main(String[] args){
		System.out.println("Calculate...");
		int first = Integer.valueOf(args[0]);
		int second = Integer.valueOf(args[1]);
		int summ = first + second;
		int razn = first - second;
		int proizv = first * second;
		float chast = Float.valueOf(first) / Float.valueOf(second);
		int step = (int)Math.pow(first, second);
		System.out.println("Summ = " + summ);
		System.out.println("Razn = " + razn);
		System.out.println("Proizv = " + proizv);
		System.out.println("Chast = " + chast);
		System.out.println("Step = " + step);
	}
}