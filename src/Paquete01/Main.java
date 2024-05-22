
package Paquete01;

public class Main {
    public static void main (String args []){
        int x[]={5,7,11,13,17};
	  int y[]={150,392,1452,2366,5202};
	  Metodo l=new Metodo(y, x);
	  double res=l.getResultadoP(9);
	  
	  System.out.println("\nEl resultado es "+res);
    }
}
