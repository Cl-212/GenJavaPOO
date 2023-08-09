package POO;

public class ClienteTeste {

	public static void main(String[] args) {

		// instanciando um objeto de classe Cliente

		Cliente cliente1 = new Cliente("Clésio", 23, 42, 3, 75992771);
		Cliente cliente2 = new Cliente("LilRito", 22, 71, 4, 40028922);

		cliente1.imprimirInfoCliente();
		cliente2.imprimirInfoCliente();

	}

}
