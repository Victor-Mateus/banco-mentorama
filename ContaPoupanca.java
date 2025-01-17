package com.company;
import com.company.Conta;
public class ContaPoupanca extends Conta {
    private int diaAniversario;
    private double taxaDeJuros;
    public ContaPoupanca(int numero, int agencia, String banco, double saldo,  int diaAniversario, double taxaDeJuros) {
        super(numero, agencia, banco, saldo);
        this.diaAniversario = diaAniversario;
        this.taxaDeJuros = taxaDeJuros;
    }
    public double getSaldo() {
        return this.saldo + this.taxaDeJuros * this.saldo;
    }
    @Override
    public boolean sacar(double quantia){
        this.saldo -= quantia;
        return true;
    }
    }






