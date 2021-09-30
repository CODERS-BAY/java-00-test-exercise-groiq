package exercise;

public class Application {

	public static int calculation(int x, int y) {
		return x + y;
	}

	public static boolean evalExpression(boolean x, boolean y) {
		return x && y;
	}

	public static void printArray(int[] numbers) {
		for (int i = 0; i < numbers.length + 1; i++) {
			System.out.println(numbers[i]);
		}
	}
}
