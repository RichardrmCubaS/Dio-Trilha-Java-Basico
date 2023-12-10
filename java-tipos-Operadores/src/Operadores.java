public class Operadores {

	public static void main(String[] args) {
		
		String nomeCompleto = "LINGUAGEM" + "  " + "JAVA";

		System.out.println(nomeCompleto);
		
		String concatenacao = "?";
		
		concatenacao = 1 + 1 + 1 + "1";
		
		System.out.println(concatenacao);
		
		concatenacao = 1 + "1" + 1 + 1;
		
		System.out.println(concatenacao);
		
		concatenacao = "1" + 1 + 1 + 1;
		
		System.out.println(concatenacao);
		
		concatenacao = "1" + ( 1 + 1 + 1);
		
		System.out.println(concatenacao);
		
		int numero = 5;
		
	    System.out.println(numero);
	    
	    System.out.println(- numero);
	    
	    numero = numero * -1;
	    
	    System.out.println(numero);
	    
	    numero = numero * -1;
	    
	    System.out.println(numero);
	    
	    numero = 5;
	    
	    numero = numero + 2;
	    
	    System.out.println(numero);
	    
	    numero++;
	    
	    System.out.println(numero);
	    
	    System.out.println(++numero);
	    
	    System.out.println(--numero);
	    
	    boolean variavel = true;
	    
	    System.out.println(variavel);
	    
	    System.out.println(!variavel);
	    
	    variavel = !variavel;
	    
	    System.out.println(variavel);
	   
	    int a, b;
	    
	    a = 5;
	    b = 6;
	    
	    String resultado = "";
	    if(a==b)
	    	resultado = "Verdadeiro";
	    else
	    	resultado = "Falso";
	    
	    System.out.println(resultado);
	    
	    String resultado1 = a==b ?"verdadeiro" : "falso";
	    
	    System.out.println(resultado1);
	    
	    int resultado2 = a == b ? 1 : 0;
	    
	    System.out.println(resultado2);
	    
	    int numero1 = 1;
	    int numero2 = 2;
	    
	    boolean simNao = numero1 == numero2;
	    
	    if(numero1 < numero2) {
	    	System.out.println("a nossa condição é Verdadeira");
	     }
	    
	    System.out.println("numeroUm é igual a numeroDois? " + simNao);
	    
        simNao = numero1 != numero2;
	    
	    System.out.println("numeroUm é diferente a numeroDois? " + simNao);
	    
        simNao = numero1 > numero2;
	    
	    System.out.println("numeroUm é maior numeroDois? " + simNao);
	    
        simNao = numero1 < numero2;
	    
	    System.out.println("numeroUm é menor numeroDois? " + simNao);
	    
	    String nomeUm = "Ricardo";
	    String nomeDois = "Ricardo";
	    
	    System.out.println(nomeUm == nomeDois);
	    
	    nomeUm = "Ricardo";
	    nomeDois = new String("Ricardo");
	    
	    System.out.println(nomeUm == nomeDois);
	    
	    System.out.println(nomeUm.equals(nomeDois));
	    
	    boolean condicao1=true;
	    boolean condicao2=false;
	    
	    if(condicao1 && condicao2){
	    	System.out.println("as duas condições são verdadeiras");
	    } else {
	    	System.out.println("as duas condições não são verdadeiras");	
	    }
	    
	    
	    if(condicao1 && (7 > 4)){
	    	System.out.println("as duas condições são Autenticas");	    
	    }
	       
	    if(condicao1 || condicao2){
	    	System.out.println("as duas condições são verdadeiras");	    
	    }
	    
	    System.out.println("fim");
	}

}           
