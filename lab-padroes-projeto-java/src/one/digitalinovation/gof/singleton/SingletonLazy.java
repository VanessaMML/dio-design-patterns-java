package one.digitalinovation.gof.singleton;

/**
 * Singleton "pregui�oso" - n�o disponibiliza a instancia para o usu�rio.
 * @author vmach
 *
 */

public class SingletonLazy {
	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		if(instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}

}
