import java.util.Random;

public class MonteCarloPI {
	
	private double insideCircle = 0;
	private double outsideCircle = 0;
	private int numberOfPoints;
	
	
	public MonteCarloPI(int numberOfPoints){
		
		this.numberOfPoints = numberOfPoints;
		
		
		
	}
	
	public double computeProblem(){
		
		
		
		
		for(int i = 0; i < numberOfPoints; i++){
			double x = Math.random();
			double y = Math.random();
			
			if((Math.pow(x, 2) + Math.pow(y, 2)) <= 1)
				insideCircle++;
			else
				outsideCircle++;
			
			}
		return 4* (insideCircle / numberOfPoints);
	}
	public double returnPointsWithinCircle(){
		return insideCircle;
	}
	
	public double returnPointsoutsideCircle(){
		return outsideCircle;
	}
	

}
