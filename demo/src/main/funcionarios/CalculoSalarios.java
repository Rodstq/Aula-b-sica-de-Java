package com.example.demo.funcionarios;

public class CalculoSalarios {

public static void main(String [] args){

Funcionarios gerente = new Funcionarios();
gerente.setCargo("Gerente");
gerente.setSalario(8000);
Gerente.calculaImpostoSalarioGerente();

System.out.println();
System.out.println(gerente.getCargo());
System.out.println(gerente.getSalario());
System.out.println(Gerente.calculaImpostoSalarioGerente());

Funcionarios atendente = new Funcionarios();
atendente.setCargo("Atendente");
atendente.setSalario(1500);
Atendente.calculaImpostoSalarioAtendente();

System.out.println();
System.out.println(atendente.getCargo());
System.out.println(atendente.getSalario());
System.out.println(Atendente.calculaImpostoSalarioAtendente());


Funcionarios supervisor = new Funcionarios();
supervisor.setCargo("Supervisor");
supervisor.setSalario(3000);
Supervisor.calculaImpostoSalarioSupervisor();

System.out.println();
System.out.println(supervisor.getCargo());
System.out.println(supervisor.getSalario());
System.out.println(Supervisor.calculaImpostoSalarioSupervisor());
System.out.println();

}

}