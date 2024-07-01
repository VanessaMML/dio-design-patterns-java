package one.digitalinovation.gof.singleton;

/**
 * Singleton "apressado" - atribui a instancia no momento em que a variavel estática
 * é definida.
 * @author vmach
 *
 */

public class SingletonEager {

private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}
