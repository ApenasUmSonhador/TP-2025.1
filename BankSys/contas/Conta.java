package BankSys.contas;

public class Conta extends ContaAbstrata {
    
    public Conta(String id, double saldo) {
        super(id, saldo);
    }

    public void debitar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Valor inválido para débito.");
        }
    }

}
