package modelo;

import java.util.ArrayList;

public class Participante {
	 	private String nome;
	    private ArrayList<Mensagem> recebidas;
	    private ArrayList<Mensagem> enviadas;

	    public Participante(String nome) {
	        this.nome = nome;
	        this.recebidas = new ArrayList<>();
	        this.enviadas = new ArrayList<>();
	    }

	    public String getNome() {
	        return nome;
	    }

	    public ArrayList<Mensagem> getRecebidas() {
	        return recebidas;
	    }

	    public ArrayList<Mensagem> getEnviadas() {
	        return enviadas;
	    }
    

	    public void removerEnviada(Mensagem ID) {
	        
	        enviadas.remove(ID);
	    }


	    public void removerRecebida(Mensagem m) {
			recebidas.remove(m);
		}

		public void adicionarEnviada(Mensagem m) {
			// TODO Auto-generated method stub
		enviadas.add(m);
		}
		
		public void adicionarRecebida(Mensagem mensag) {
			recebidas.add(mensag);
		}
		
		public Mensagem localizarEnviada(int ID) {
			for (Mensagem m : enviadas) {
				if(m.getId() == ID)
					return m;
			}
			return null;
		}
		
		public Mensagem localizarRecebida(int ID) {
			for (Mensagem m : recebidas) {
				if(m.getId() == ID)
					return m;
			}
			return null;
		}
}
