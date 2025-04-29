package BankSys.contas;

public class ContaEspecial extends Conta {

    private double bonus = 0;

    public ContaEspecial(String id, double saldo) {
        super(id, saldo);
    }

    public void renderBonus() {
        super.creditar(this.bonus);
        this.bonus = 0;
    }

    public void creditar(double valor) {
        if (valor > 0) {
            super.creditar(valor);
            this.bonus += valor * 0.1; // 10% de bônus
        } else {
            System.out.println("Valor inválido para crédito.");
        }
    }
}
