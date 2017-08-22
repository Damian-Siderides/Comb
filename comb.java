
public class comb {

	public static void main(String[] args) {

		StringBuilder word = new StringBuilder("aaaaa");

		int length = 5;

		char c = 'a';
		for (int i = 0; i < length; c += 1) {

			if (c == '{') {
				c = 'a';

				if (i == 0) {
					word.setCharAt(0, 'a');
					i++;
				}

				for (int j = i - 1; j > -1;) {

					char f = word.charAt(j);
					f++;
					word.setCharAt(j, f);

					if (word.charAt(j) == '{') {
						word.setCharAt(j, 'a');
						j--;
					} else {
						break;
					}
					if (j == -1) {
						i++;

					}

				}
			}

			word.setCharAt(i, c);

			System.out.println(word.toString());

			if (word.toString().equals("zzzzz")) {
				System.out.println(
						"YOU DID IT YOU DID IT YOU DID IT YOU DID IT YOU DID IT YOU DID IT YOU DID IT YOU DID IT");
				break;
			}

		}

	}

}
