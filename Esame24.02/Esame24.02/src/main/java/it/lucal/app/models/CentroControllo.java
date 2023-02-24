package it.lucal.app.models;

public class CentroControllo {

		int numComunicazioni = 0;
	
	public void comunicazione(Sonda sonda) {
		
			String url = String.format("http://host/alarm?=idsonda=%d&lat=%d&lon=%d&smokelevel=%d", sonda.getId(), sonda.getLatitudine(), sonda.getLongitudine(), sonda.getLivelloFumo());
			System.out.println("Allarme scattato alla sonda " + url);
			System.out.println("Identificativo sonda: " + sonda.getId());
			System.out.println("--------------------------------------------------");
			numComunicazioni++;
			
	
	}

	public int getNumComunicazioni() {
		return numComunicazioni;
	}

	
	
}
