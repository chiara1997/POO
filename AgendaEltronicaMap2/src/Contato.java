

public class Contato {
	private int numero;
	private String email;
	
	
	public Contato (int  numero,String email){
		this.numero=numero;
		this.email=email;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean equals(Object obj){
		if( obj == null){
			return false;
		}else if( obj instanceof  Contato){
			Contato cont = (Contato ) obj;
			if( this.numero ==cont.getNumero() && this.email == cont.getEmail())
				return true ;
		}
		return false;
		}


}
