public class SmartTv {
	boolean ligada = false;
	int canal = 1;
	int volume = 25;
		
	public void ligar() {
		ligada = true;
	}
	
	public void desligar() {
		ligada = false;
	}
	
	public void aumentarVolume() {
		volume++;
		System.out.println("Aumentando o Volume para : " + volume);	
	}
	
	public void diminuirVolume() {
		volume--;
		System.out.println("Diminuindo o Volume para : " + volume);
	}

	public void aumentarCanal() {
		canal++;
		System.out.println("Aumentando o Canal para : " + canal);		
	}
	
	public void diminuirCanal() {
		canal--;
		System.out.println("Diminuindo o Canal para : " + canal);		
	}
	
	public void mudarCanal(int novoCanal) {
		System.out.println("Canal Velho : " + canal);
		canal = novoCanal;
		System.out.println("Canal Novo  : " + canal);
	}
		
}
