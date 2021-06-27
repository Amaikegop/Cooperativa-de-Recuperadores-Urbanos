
public class Email {
	
	private String destinatario;
	private String emisor;
	private String cuerpo;
	
	public Email(String destinatario, String emisor, String cuerpo) {
		this.destinatario = destinatario;
		this.emisor = emisor;
		this.cuerpo = cuerpo;
	}
	
	public String getDestinatario() {
		return destinatario;
	}
	
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	
	public String getEmisor() {
		return emisor;
	}
	
	public void setEmisor(String emisor) {
		this.emisor = emisor;
	}
	
	public String getCuerpo() {
		return cuerpo;
	}
	
	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}
	
	
}
