package prob11to20;

public class LatticePaths {
	public static void main(String[] args){
		routes(2);
	}
	private static void routes(int gridSize){
		int[][]grid = new int[gridSize+1][gridSize+1];
		for(int i =0; i<gridSize; i++){
			grid[i][gridSize]=1;
			grid[gridSize][i]=1;
		}
		
		for(int i = gridSize-1; i>=0; i--){
			for(int j =gridSize-1; j>=0; j--){
				grid[i][j] = grid[i+1][j]+grid[i][j+1];
			}
		}
		//00 Since we started at the end point
		System.out.println(grid[0][0]);
		
	}
}
