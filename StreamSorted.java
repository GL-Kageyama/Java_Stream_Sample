import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamSorted {

	public static void main(String[] args) {

		List<String> colors = new ArrayList<>();

		colors.add("white");
		colors.add("black");
		colors.add("red");
		colors.add("pink");
		colors.add("orange");
		colors.add("blue");
		colors.add("yellow");
		colors.add("green");
		colors.add("purple");
		colors.add("gray");
		colors.add("brown");
		colors.add("gold");
		colors.add("silver");

		// Sorted in Ascending Order
		colors.stream().sorted().forEach(b -> System.out.println(b));

		System.out.println("- - - - - -");

		// Sorted in Descending Order
		colors.stream().sorted(Comparator.reverseOrder()).forEach(b -> System.out.println(b));

	}
}

//============================================
//               Output Sample
//============================================

// $ javac StreamSorted.java 
// $ java StreamSorted
// black
// blue
// brown
// gold
// gray
// green
// orange
// pink
// purple
// red
// silver
// white
// yellow
// - - - - - -
// yellow
// white
// silver
// red
// purple
// pink
// orange
// green
// gray
// gold
// brown
// blue
// black

//============================================
