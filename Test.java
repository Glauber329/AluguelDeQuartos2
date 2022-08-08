package test;

import java.util.Iterator;

import javax.swing.JOptionPane;

import entities.Aluguel;
import entities.Pessoa;

public class Test {

	public static void main(String[] args) {

		int quartos = 10; // quantidade de quartos
		
		Aluguel[] arrayAluguel = new Aluguel[quartos];
		int op = Integer.valueOf(JOptionPane.showInputDialog("quantos quartos ser�o alugados ?"));

		if (op > quartos) {
			JOptionPane.showMessageDialog(null, "Vo�e Possui Apenas " + quartos + " Quartos");
		} else {
			for (int i = 0; i < op; i++) {
				int numeroQuarto = Integer.valueOf(JOptionPane.showInputDialog("Numero do quarto " + (i + 1)));
				String nome = JOptionPane.showInputDialog("ALUGUEL " + (i + 1), "Nome");
				String email = JOptionPane.showInputDialog("ALUGUEL " + (i + 1), "Email");

				Pessoa pessoa = new Pessoa(nome, email);
				Aluguel aluguel = new Aluguel(numeroQuarto, pessoa);
				arrayAluguel[numeroQuarto] = aluguel;
			}

			                                       // ATUANDO POR BAIXO DOS PANOS 
			for (Aluguel aluguel : arrayAluguel) {
				if (aluguel != null) {
					System.out.println(aluguel);
				}
			}

			System.out.println("__________________");
			System.out.println("Quartos Ocupados");
			for (Aluguel aluguel : arrayAluguel) {
				if (aluguel != null) {
					System.out.println("Numero Do Quarto: " + aluguel.getNumeroQuarto() + ", Nome Do Locador: "
							+ aluguel.getPessoa().getNome());
				}
			}
			System.out.println("__________________");
			int resta = quartos - op ;
			System.out.println("Restam " + resta + " Quartos");
		}

	}

}
