package BankSys.bancos;

import BankSys.contas.Conta;

public interface IBanco {
    public void welcome();

    public void bye();

    public void cadastrar(Conta conta);

    public void creditar(String id, double valor);

    public void debitar(String id, double valor);

    public double saldo(String id);

    public void transferir(String idOrigem, String idDestino, double valor);
}