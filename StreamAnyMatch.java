import java.util.ArrayList;
import java.util.List;

public class StreamAnyMatch {

	public static void main(String[] args) {

		List<Integer> num = new ArrayList<>();

		num.add(123);
		num.add(456);
		num.add(789);
		num.add(987);
		num.add(654);
		num.add(321);

		// Check of elements greater than 100
		boolean flg1 = num.stream().anyMatch(b -> b > 100);
		System.out.println(flg1);

		// Check of elements greater than 1000
		boolean flg2 = num.stream().anyMatch(b -> b > 1000);
		System.out.println(flg2);

	}
}

//============================================
//               Output Sample
//============================================

// $ javac StreamAnyMatch.java 
// $ java StreamAnyMatch
// true
// false

//============================================
