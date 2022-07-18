package com.company;
import java.util.Scanner;
public class Main {
        public static void main (String[] args){
            Gerente gerente = new Gerente();
            int opcao = 0;
            do{
                System.out.println("--------------------------------------");
                System.out.println("       *** Banco Digital ***          ");
                System.out.println("   |1.|  Criar Conta                 |");
                System.out.println("   |2.|  Sacar                       |");
                System.out.println("   |3.|  Depositar                   |");
                System.out.println("   |4.|  Transferir valores          |");
                System.out.println("   |5.|  Mostrar montante nas contas |");
                System.out.println("   |6.|  Contas Cadastradas          |");
                System.out.println("   |7.|  Sair                        |");
                System.out.println("--------------------------------------");
                Scanner menu=new Scanner(System.in);
                System.out.print("Digite uma Opção: ");
                opcao= menu.nextInt();
                switch (opcao) {
                    case 1 -> Menu.CriarConta(gerente);
                    case 2 -> Menu.Sacar(gerente);
                    case 3 -> Menu.Depositar(gerente);
                    case 4 -> Menu.transferencia(gerente);
                    case 5 -> gerente.Saldo();
                    case 6 -> gerente.ContasCadastradas();
                    case 7 -> System.out.println("Você saiu do nosso programa");
                    default -> System.out.println("Opção inválida");
                }
                }while(opcao<7);
                }
                }


