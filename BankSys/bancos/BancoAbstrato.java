package BankSys.bancos;

import BankSys.contas.ContaAbstrata;

public interface BancoAbstrato {
    public void welcome();

    public void bye();

    public void cadastrar(ContaAbstrata conta);

    public void creditar(String id, double valor);

    public void debitar(String id, double valor);

    public double saldo(String id);

    public void transferir(String idOrigem, String idDestino, double valor);
}