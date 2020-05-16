import java.util.ArrayList;
import java.util.List;

public class StreamAllMatch {

	public static void main(String[] args) {

		List<Integer> num = new ArrayList<>();

		num.add(123);
		num.add(456);
		num.add(789);
		num.add(987);
		num.add(654);
		num.add(321);

		// All elements check than 100
		boolean flg1 = num.stream().allMatch(b -> b > 100);
		System.out.println(flg1);

		// All elements check than 200
		boolean flg2 = num.stream().allMatch(b -> b > 200);
		System.out.println(flg2);

	}
}

//============================================
//               Output Sample
//============================================

// $ javac StreamAllMatch.java 
// $ java StreamAllMatch
// true
// false

//============================================



