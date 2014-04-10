import java.util.Scanner;


public class Hola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int tabla=0;
	Scanner s= new Scanner(System.in);
	System.out.println("Ingrese un Numero");
	tabla=s.nextInt();
	
	for(int x=1; x<=10;x++)
	{
		
		System.out.println(tabla*x);
	}
	
	
		
	}

}
