package BankSys.contas;

public class Poupanca extends Conta{
    // Atributos específicos da conta poupança
    // Não há atributos adicionais, mas podemos adicionar se necessário
    public Poupanca(String id, double saldo) {
        super(id, saldo);
    }

    // Método para renderizar juros
    public void renderJuros(double taxa) {
        if (taxa > 0) {
            double juros = getSaldo() * taxa / 100;
            creditar(juros);
        } else {
            System.out.println("Taxa inválida para juros.");
        }
    }
}
