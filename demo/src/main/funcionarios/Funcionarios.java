package com.example.demo.funcionarios;

public class Funcionarios{

  static int salario;
  String cargo;


//definir e retornar cargo
public String getCargo(){return cargo;}

public void setCargo(String cargo){this.cargo = cargo;}


//definir e retornar salario
public int getSalario(){return salario;}

public void setSalario(int salario){Funcionarios.salario = salario;}

}