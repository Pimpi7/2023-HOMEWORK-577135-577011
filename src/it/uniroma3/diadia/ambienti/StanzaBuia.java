package it.uniroma3.diadia.ambienti;


public class StanzaBuia extends Stanza{
	
	private String attrezzoRichiesto;
	
	public StanzaBuia(String nome) {
		super(nome);
		this.attrezzoRichiesto = "lanterna";
	}
	
	@Override
	public String getDescrizione() {
		if(hasAttrezzo(attrezzoRichiesto))
			return super.toString();
		else
			return "Qui c'è buio pesto";
	}
}
