package it.lucal.app.models;

import java.util.List;

public class Proxy implements ProcessoDiControllo {

	private CentroControllo c;

	public Proxy() {
		c = new CentroControllo();
	}

	@Override
	public void comunicazioneAllarme(List<Sonda> sonde) {
		for (int i = 0; i < sonde.size(); i++) {
			Sonda sonda = sonde.get(i);
			if (sonda.getLivelloFumo() > 5) {
				c.comunicazione(sonda);
			}

		}

	}
	
	public CentroControllo getCentroControllo() {
		return c;
	}

}
