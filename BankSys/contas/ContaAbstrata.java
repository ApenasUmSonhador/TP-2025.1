package BankSys.contas;

public abstract class ContaAbstrata {
    protected String id;
    protected double saldo;

    public ContaAbstrata(String id, double saldo) {
        this.id = id;
        this.saldo = saldo;
    }

    public String getId() {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void creditar(double valor){
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Valor inválido para crédito.");
        }
    };

    public abstract void debitar(double valor);
}