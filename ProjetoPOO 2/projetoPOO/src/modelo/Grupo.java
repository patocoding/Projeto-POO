package modelo;

import java.util.ArrayList;

import modelo.Individual;
import modelo.Mensagem;
import modelo.Participante;

public class Grupo extends Participante {
	private ArrayList<Individual> individuos;

    public Grupo(String nome) {
        super(nome);
        this.individuos = new ArrayList<>();
    }

    public ArrayList<Individual> getIndividuos() {
        return individuos;
    }

    public void adicionar(Individual individuo) {
        individuos.add(individuo);
    }

    public void remover(Individual individuo) {
        individuos.remove(individuo);
    }

    public Individual localizarIndividuo(String nome) {
		for(Individual ind: individuos) {
			if(nome.equals(ind.getNome())) {
				return ind;
			}
		}
		return null;
	}
    
    public boolean isMembro(String nome) {
	    return localizarIndividuo(nome) != null;
	}

    public String toString() {
		return "Nome do grupo: " + this.getNome() ;

    }
}

   