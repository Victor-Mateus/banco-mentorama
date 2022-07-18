package com.company;
public class Cliente extends Conta{
    @Override
    public double getSaldo() {
        return 0;
    }
    public Cliente(int numero, int agencia, String banco, double saldo) {
        super(numero, agencia, banco, saldo);
    }
    @Override
    public boolean sacar(double quantia) {
        return false;
    }
}
