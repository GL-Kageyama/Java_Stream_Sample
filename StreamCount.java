import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamCount {

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

		// Count the number of elements
		long colorCount = colors.stream().count();
		System.out.println("Color Count : " + colorCount);

		// Count the number of elements
		Stream<String> colorStream = colors.stream();
		System.out.println("Color Count : " + colorStream.count());

	}
}

//============================================
//               Output Sample
//============================================

// $ javac StreamCount.java 
// $ java StreamCount
// Color Count : 13
// Color Count : 13

//============================================
