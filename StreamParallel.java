import java.util.ArrayList;
import java.util.List;

public class StreamParallel {

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

		// Parallel processing (not in order of order)
		colors.parallelStream().forEach(b -> System.out.println(b));

		System.out.println("- - - - - -");

		// Parallel processing (not in order of order)
		colors.stream().parallel().forEach(b -> System.out.println(b));

	}
}

//============================================
//               Output Sample
//============================================

// $ javac StreamParallel.java 
// $ java StreamParallel
// green
// brown
// purple
// yellow
// pink
// orange
// gray
// silver
// black
// blue
// gold
// red
// white
// - - - - - -
// green
// blue
// black
// red
// silver
// yellow
// pink
// orange
// white
// purple
// brown
// gold
// gray

//============================================
