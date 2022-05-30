public class Banco {

	public void realizarOperacao() {

		ContaBancaria c1 = new ContaBancaria();

		try {
			c1.sacar(100);
			c1.sacar(1000);
			System.out.println("Sacou");
		} catch (ValorNegativoException e) {
			System.out.println("valor negativo ");

		} catch (SaldoInsuficienteException e) {
			System.out.println(" Saldo insfulficiente: " + e.getMessage());

		} finally {
			System.out.println(" Fim do saque");
		}

		double saldo = c1.getSaldo();
		System.out.println(saldo);
	}
}
