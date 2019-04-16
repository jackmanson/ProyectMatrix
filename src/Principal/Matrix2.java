package Principal;

public class Matrix2 {

	public static void main(String[] args) {
		// ARRAYS DE DOS DIMENSIONES
		/*
		 * EXISTEM:
		 * Matrix normal
		 * Matrix dimensional
		 * Matrix multidimensional
		 * */
		
		String [][] arreglo = new String[3][4]; // aqui se pone 3 y 4 no cuenta al cero 
		// la matrix inicia desde el 0 hasta 2 -> 3 columnas -> aqui si lo cuenta al cero
		// la matrix inicia desde el 0 hasta 3 -> 4 filas
		arreglo[0][0]="Jasson";
		arreglo[0][1]="Julio";
		arreglo[0][2]="Javier";
		arreglo[0][3]="James";
		
		arreglo[1][0]="habil";
		arreglo[1][1]="lento";
		arreglo[1][2]="fuerte";
		arreglo[1][3]="inteligente";
		
		arreglo[2][0]="15";
		arreglo[2][1]="10";
		arreglo[2][2]="20";
		arreglo[2][3]="1000";
		
		for(int i=0;i<3;i++){
			for(int j=0;j<4;j++){
				System.out.println(arreglo[i][j]);
			}
		}
		

	}

}
