package ocp.streams.flatmap;
import java.util.Optional;

public class StreamMain {

	/**
     * executa métodos em sequência
	 */
	static void flatMap(){
		Optional<Double> result =
				Optional.of(3.0)
						.flatMap(StreamMain::inverse)
						.flatMap(StreamMain::squareRoot);

		if(result.isPresent()){
			System.out.println("flatMap = " + result.get());
		}
	}

	public static Optional<Double> inverse(Double x) {
		return x == 0 ? Optional.empty() : Optional.of(12 / x);
	}

	public static Optional<Double> squareRoot(Double x) {
		return x < 0 ? Optional.empty() : Optional.of(Math.sqrt(x));
	}


	public static void main(String args[]) {
		flatMap();

	}

}
