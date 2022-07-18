package com.company;
public class ContaCorrente extends Conta implements Tributavel {
    private double chequeEspecial;
    private double limitedosaque;
    public ContaCorrente(int numero, int agencia, String banco, double saldo, double chequeEspecial) {
        super(numero, agencia, banco, saldo);
        this.chequeEspecial = chequeEspecial;
       }
    @Override
    public double getSaldo() {
        return 0;
       }
    @Override
    public String toString() {
        return "com.company.ContaCorrente{" +
                "saldo=" + saldo +
                '}';
       }
    @Override
    public boolean sacar(double quantia) {
        double disponivel = this.chequeEspecial + this.saldo;
        if (quantia > disponivel) {
            System.out.println("Você não tem limite disponivel");
            return false;
        } else {
            this.saldo -= quantia;
            return true;
        }
        }
    public double getChequeEspecial() {
        return this.chequeEspecial + this.saldo;
        }
    @Override
    public double valorImposto() {
        return this.chequeEspecial * 00.3;
    }
        }



