package br.senai.sp.model;

public class Triangulo {
	
	// Propriedades/Atributos da classe
	public double base;
	public double ladoB;
	public double ladoC;
	public double altura;
	public String nome;
	
	// Método da clase
	public void mostrarDimensoes() {
		
		System.out.println("----------------------");
		System.out.println("Nome---->"+ nome);
		System.out.println("----------------------");
		System.out.println("Base------>" + altura);
		System.out.println("Lado B---->" + ladoC);
		System.out.println("Lado C---->" + ladoB);
		System.out.println("Altura---->" + altura);
		calcularArea();
		  
	}
	
	 public void calcularArea() {
		
		 double area = (base * altura ) / 2;
		 System.out.println("Área = " + area);
		 
	 }
	  
	

}
