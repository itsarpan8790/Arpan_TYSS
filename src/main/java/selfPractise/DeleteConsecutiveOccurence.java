package selfPractise;

public class DeleteConsecutiveOccurence {
	public static void main(String[] args) {
		String s = "caabbc"; // op--""

		StringBuilder sb = new StringBuilder(s);

		int count = 1;
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == sb.charAt(i + 1)) {
				count++;
			} else {
				if (count > 1) {
					for (int j = 0; j < count; j++) {
						sb.delete(j, count);
					}
					count = 1;
				}
			}
		}
		System.out.println(sb);

	}

}
