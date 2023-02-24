package it.lucal.app.models;

public class Sonda {
	
	private int id;
	
	private long latitudine;
	private long longitudine;
	private int livelloFumo;
	
	
	public Sonda(int id, long latitudine, long longitudine, int livelloFumo) {
		super();
		this.id = id;
	
		this.latitudine = latitudine;
		this.longitudine = longitudine;
		this.livelloFumo = livelloFumo;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getLatitudine() {
		return latitudine;
	}
	public void setLatitudine(long latitudine) {
		this.latitudine = latitudine;
	}
	public long getLongitudine() {
		return longitudine;
	}
	public void setLongitudine(long longitudine) {
		this.longitudine = longitudine;
	}
	public int getLivelloFumo() {
		return livelloFumo;
	}
	public void setLivelloFumo(int livelloFumo) {
		this.livelloFumo = livelloFumo;
	}
	
	@Override
	public String toString() {
		return "- SONDA: " + this.id + " | Latitudine: " + this.latitudine + " | Longitudine: " + this.longitudine + " | Livello Fumo: " + this.livelloFumo;
	}

}
