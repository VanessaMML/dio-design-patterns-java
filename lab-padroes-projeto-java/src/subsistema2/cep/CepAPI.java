package subsistema2.cep;

import one.digitalinovation.gof.singleton.SingletonEager;

	public class CepAPI {
	
	private static CepAPI instancia = new CepAPI();
	
	private CepAPI() {
		super();
	}
	
	public static CepAPI getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Araraquara";
	}
	
	public String recuperarEstado(String cep) {
		return "SP";
	}
	
}
