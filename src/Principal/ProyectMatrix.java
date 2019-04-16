package Principal;

import javax.swing.JOptionPane;

public class ProyectMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] paises = new String[10];
		
		paises[0]="peru";
		paises[1]="venezuela";
		paises[2]="bolivia";
		paises[3]="brasil";
		paises[4]="ecuador";
		paises[5]="argentina";
		paises[6]="mexico";
		paises[7]="guatemala";
		paises[8]="chile";
		paises[9]="costa rica";
		
		System.out.println(paises.length);
		for(int i=0;i<paises.length;i++){
			System.out.println("pais "+(i+1)+" de amreica: "+paises[i]);
		}
		
		//Aqui la forma mas simple de array
		String paises2[] ={"peru","venezuela","chile","argentina"};
		
		for(String elemento:paises2){// si el array es de tipo String el for each tambien tendria que declarse igual en string
			System.out.println(elemento);
		}
		
		
		System.out.println("-----------------------------------------------------------------------");
		
		// Nueva matrix
		String vacio1=null;
		String vacio2="";
		int contador=0;
		String [] numeroZ = new String[10];
		
		numeroZ[0]= "";
		numeroZ[1]= "2";
		numeroZ[2]= "9";
		
		for(int i=0;i<numeroZ.length;i++){
			if(numeroZ[i]==vacio1 || numeroZ[i]==vacio2){
				contador++;
				System.out.print("El arreglo tiene una posicion vacia en:");
				System.out.println(" numeroZ["+i+"]");
			}
		}
		
		if(contador>0){
			boolean conf=true;
			while(conf){
				String condicion=JOptionPane.showInputDialog("¿Desea ingresar datos en las posiciones vacias?.Responder 'S' si es si y 'N' si es no.");
				if(condicion.equalsIgnoreCase("s")==true){
					conf=false;
					for(int j=0; j<numeroZ.length;j++){
						if(numeroZ[j]==vacio1 || numeroZ[j]==vacio2){
							numeroZ[j]=JOptionPane.showInputDialog("Ingrese un valor para este espacio de la matriz: numeroZ["+j+"]= ");
							System.out.println("Espacio de matris completado: numeroZ["+j+"]= "+numeroZ[j]);
						}
					}
				}else if(condicion.equalsIgnoreCase("n")){// al comparar con equals me devuelve TRUE si es verdadero o FALSE 
					System.out.println("Gracias por su visita.");
					conf=false;
				}
			}
		}else{
			System.out.println("Todos los espacios esta ocupados o completos.");
		}
		
		System.out.println("-----------------------------------------------------------------------");
		
		String [][] arreglo = new String[2][3];
		
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
		
		for(int a=0;a<2;a++){
			for(int j=0;j<3;j++){
				System.out.println(arreglo[a][j]);
			}
		}

	}

}
