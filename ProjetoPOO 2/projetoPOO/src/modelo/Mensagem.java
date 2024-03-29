package modelo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Mensagem {
	   	private int id;
	    private String texto;
	    private Participante emitente;
	    private Participante destinatario;
	    private LocalDateTime dataHora;

	    private static int proximoId = 1;

	    public Mensagem(int id,  Participante emissor, Participante destinatario,String msg) {
			this.id = id;
			texto = msg;
			emitente = emissor;
			this.destinatario = destinatario;
			dataHora = LocalDateTime.now();
		}

	    public int getId() {
	        return id;
	    }

	    public String getTexto() {
	        return texto;
	    }

	    public Participante getEmitente() {
	        return emitente;
	    }

	    public Participante getDestinatario() {
	        return destinatario;
	    }

	    public LocalDateTime getDataHora() {
	        return dataHora;
	    }

	    public void setRemetente(Participante part) {
			emitente = part;
		}
		
		public void setDestinatario(Participante part) {
			destinatario = part;
		}
		
		public String toString() {
			return "ID : " + id + ", Emitente: " + this.emitente.getNome() + ", Destinatario =  " + this.destinatario.getNome() + " Data Hora: " + dataHora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) + " Texto : " + this.texto; 
		}
	}

