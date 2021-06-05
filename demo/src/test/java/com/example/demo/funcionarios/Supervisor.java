package com.example.demo.funcionarios;


public class Supervisor extends Funcionarios{

    //calcular imposto sobre o salario
    public static double calculaImpostoSalarioSupervisor(){

        return Supervisor.salario * 0.05;
}  
   
}