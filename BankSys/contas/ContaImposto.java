package BankSys.contas;

public class ContaImposto extends ContaAbstrata {
    private double taxaImposto;

    public ContaImposto(String id, double saldo, double taxaImposto) {
        super(id, saldo);
        this.taxaImposto = taxaImposto;
    }

    public void debitar(double valor) {
        if (valor > 0 && valor <= getSaldo()) {
            double imposto = valor * taxaImposto / 100;
            setSaldo(getSaldo() - valor - imposto);
        } else {
            System.out.println("Valor inválido para débito.");
        }
    }

    public double getTaxaImposto() {
        return taxaImposto;
    }

    public void setTaxaImposto(double taxaImposto) {
        this.taxaImposto = taxaImposto;
    }

    @Override
    public void creditar(double valor) {
        if (valor > 0) {
            setSaldo(getSaldo() + valor);
        } else {
            System.out.println("Valor inválido para crédito.");
        }
    }
}
