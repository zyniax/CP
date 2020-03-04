import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("write the number of points");
		int numberOfPoints = sc.nextInt();
		MonteCarloPI monte = new MonteCarloPI(numberOfPoints);
		double result = monte.computeProblem();
		
		System.out.printf("Total Number of points " + numberOfPoints +
				"\n" + "Points within circle: " +
				monte.returnPointsWithinCircle() +
				"\n" + "Pi estimation: " + "%f", + result);
		

	}

}
