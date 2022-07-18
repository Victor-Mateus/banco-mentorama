package com.company;
public class ContaSalario extends Conta implements Tributavel {
    private double limitedesaque;
    public ContaSalario(int numero, int agencia, String banco, double saldo, double limitedesaque) {
        super(numero, agencia, banco, saldo);
        this.limitedesaque = limitedesaque;
    }
    @Override
    public String toString() {
        return "com.company.ContaSalario{" +
                "limitedesaque=" + limitedesaque +
                '}';
    }
    @Override
    public double getSaldo() {
        return this.saldo;
    }
    @Override
    public double valorImposto() {
        return this.saldo * 00.4;
    }
    @Override
    public boolean sacar(double quantia) {
        if (quantia > saldo){
            return false;
            } else {
            if (this.limitedesaque > 0) {
                this.limitedesaque--;
                this.saldo -= quantia;
                return true;
            } else {
                System.out.println("Limite de saques excedido");
                return false;
            }
            }
            }
            }





