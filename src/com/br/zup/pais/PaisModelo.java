package com.br.zup.pais;

import java.util.ArrayList;
import java.util.List;

public class PaisModelo {
		private String iso;
		private String nome;
		private int populacao;
		private double dimensaoKm2;
		private List<String> vizinhos = new ArrayList<String>();
		
		public PaisModelo(String iso, String nome, int populacao, double dimensaoKm2, List<String> vizinhos) {
			this.iso = iso;
			this.nome = nome;
			this.populacao = populacao;
			this.dimensaoKm2 = dimensaoKm2;
			this.vizinhos = vizinhos;
		}

		public String getIso() {
			return iso;
		}

		public void setIso(String iso) {
			this.iso = iso;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getPopulacao() {
			return populacao;
		}

		public void setPopulacao(int populacao) {
			this.populacao = populacao;
		}

		public double getDimensaoKm2() {
			return dimensaoKm2;
		}

		public void setDimensaoKm2(double dimensaoKm2) {
			this.dimensaoKm2 = dimensaoKm2;
		}

		public List<String> getVizinhos() {
			return vizinhos;
		}

		public void setVizinhos(List<String> vizinhos) {
			this.vizinhos = vizinhos;
		}
		public String toString() {

			String modelo = "";
			modelo += "O Iso é: " + this.getIso() + "\n";
			modelo += "O nome do País é: " + this.getNome() + "\n";
			modelo += "A quantidade de população" + this.getPopulacao() + "\n";
			modelo += "Os países vizinhos" + this.getVizinhos() + "\n";
			modelo += "Dimensão em km2 " + this.getDimensaoKm2() + "\n";

			return modelo;
		}

		public double getDensidadePopulacional() {
			return this.getPopulacao() / this.getDimensaoKm2();
		}

		public boolean verificar(String outroIso) {
			
	if(outroIso == this.getIso()) {
			System.out.println("Os Paises são semelhantes");
			return true;
		}else {
			System.out.println("Paises não são semelhantes");
			return false;		
		}


}
		
}
