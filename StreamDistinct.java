import java.util.ArrayList;
import java.util.List;

public class StreamDistinct {

	public static void main(String[] args) {

		List<String> colors = new ArrayList<>();

		colors.add("white");
		colors.add("black");
		colors.add("red");
		colors.add("pink");
		colors.add("orange");
		colors.add("blue");
		colors.add("blue");
		colors.add("blue");
		colors.add("blue");
		colors.add("blue");
		colors.add("yellow");
		colors.add("green");
		colors.add("purple");
		colors.add("gray");
		colors.add("brown");
		colors.add("gold");
		colors.add("silver");
		colors.add("silver");
		colors.add("silver");
		colors.add("silver");
		colors.add("silver");

		// Remove duplicate values
		colors.stream().distinct().forEach(b -> System.out.println(b));

	}
}

//============================================
//               Output Sample
//============================================

// $ javac StreamDistinct.java 
// $ java StreamDistinct
// white
// black
// red
// pink
// orange
// blue
// yellow
// green
// purple
// gray
// brown
// gold
// silver

//============================================

