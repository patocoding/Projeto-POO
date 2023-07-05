package modelo;

import java.util.ArrayList;
import java.util.List;

public class Individual extends Participante {
    private String senha;
    protected boolean administrador;
    private ArrayList<Grupo> grupos ;

    public Individual(String nome, String senha, boolean administrador) {
        super(nome);
        this.senha = senha;
        this.administrador = administrador;
        this.grupos = new ArrayList<>();
    }

    public String getSenha() {
        return senha;
    }

    public boolean getAdministrador() {
        return administrador;
    }

    public ArrayList<Grupo> getGrupos(){
		return grupos;
	}
    
    public void remover(Grupo grup) {
		grupos.remove(grup);
		grup.remover(this);
	}

    public void removerGrupo(Grupo grupo) {
        grupos.remove(grupo);
    }
    
    
    public boolean verificarGrupo(String nome) {
		for (Grupo g : grupos) {
			if(g.getNome().equals(nome))
				return true;
		}
		return false;
	}

    public Mensagem localizarEnviada(int id) {
        for (Mensagem mensagem : getEnviadas()) {
            if (mensagem.getId() == id) {
                return mensagem;
            }
        }
        return null;
    }
    
    public void adicionar(Grupo grupo) {
		grupos.add(grupo);
		
	}
    
    public void setSenha(String senha) {
		this.senha = senha;
	}

    public Grupo localizarGrupo(String nome) {
        for (Grupo grupo : grupos) {
            if (grupo.getNome().equals(nome)) {
                return grupo;
            }
        }
        return null;
    }
}

   
//
//    public void adicionarIndividuo(Grupo grupo) {
//        grupos.add(grupo);
//    }
//}