public class Usuario {

	public static void main(String[] args) throws Exception {
		SmartTv smartTv = new SmartTv();
		
		System.out.println("      Estatus Inicial     " );
		System.out.println("--------------------------" );
		System.out.println("TV Ligada : " + smartTv.ligada);
		System.out.println("Canal Atual N° : " + smartTv.canal);
		System.out.println("Volume Atual % : " + smartTv.volume);
		System.out.println("--------------------------" );
		
		smartTv.ligar();
		System.out.println("                          " );
		System.out.println("--------------------------" );
		System.out.println("Novo Estatus - TV Ligada : " + smartTv.ligada);
		System.out.println("--------------------------" );
				
		smartTv.desligar();
		System.out.println("                          " );
		System.out.println("--------------------------" );
		System.out.println("Novo Estatus - TV Ligada : " + smartTv.ligada);
		System.out.println("--------------------------" );
		
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.aumentarVolume();
		System.out.println("                          " );
		System.out.println("--------------------------" );
		System.out.println("Novo Estatus - Volume Atual % : " + smartTv.volume);
		System.out.println("--------------------------" );
		
		smartTv.aumentarCanal();
		smartTv.aumentarCanal();
		smartTv.diminuirCanal();
		smartTv.aumentarCanal();
		System.out.println("                          " );
		System.out.println("--------------------------" );
		System.out.println("Novo Estatus - Canal Atual N° : " + smartTv.canal);
		System.out.println("--------------------------" );
		
		smartTv.mudarCanal(101);
		System.out.println("                          " );
		System.out.println("--------------------------" );
		System.out.println("Novo Estatus - Canal Atual N° : " + smartTv.canal);
		System.out.println("--------------------------" );
		
	}

}
