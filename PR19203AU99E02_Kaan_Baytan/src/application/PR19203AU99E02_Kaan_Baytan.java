package application;
import java.util.Random;

public class PR19203AU99E02_Kaan_Baytan {

	public static double[][][] createThreeDimensional(int a, int b, int c, double nInicial, double nFinal) {
		
		Random random = new Random();
		
	
		double[][][] array= new double[a][b][c];

		for(int i = 0; i <a; i++){
            for(int j = 0; j < b; j++){
            	for (int k = 0; k < c; k++) {
                array[i][j][k] =  nInicial + (nFinal - nInicial) * random.nextDouble();
            	}
            }
        }
        
		return array;
	}
	
	public static void showArray(double[][][] array) {
		
		
		double[][][] aux = array;
		for(int k = 0; k < aux.length; k++){
            for(int l = 0; l < aux[0].length; l++){
            	for (int m = 0; m < aux[0][0].length; m++) {
                String strDouble = String.format("%.2f", array[k][l][m]);
                System.out.print(strDouble + " ");
            	}
            }
            System.out.print("\n");
        }
	}
	
	public static void main (String[] args) {
		
		double[][][] array1 = createThreeDimensional(4, 6, 2, 47.0, 99.0);
		showArray(array1);
		System.out.println("*************");
		double[][][] array2 = createThreeDimensional(2, 2, 2, 47.0, 99.0);
		showArray(array2);
		System.out.println("*************");
		double[][][] array3 = createThreeDimensional(9, 5, 2, 47.0, 99.0);
		showArray(array3); 
	}
	
}
