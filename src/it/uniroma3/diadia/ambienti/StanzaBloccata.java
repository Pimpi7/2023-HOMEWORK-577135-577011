package it.uniroma3.diadia.ambienti;

public class StanzaBloccata extends Stanza{

	private String direzioneBloccata;
	private String attrezzoRichiesto;

	public StanzaBloccata(String nome) {
		super(nome);
		this.attrezzoRichiesto = "osso";
		this.direzioneBloccata = "nord";
	}

	@Override
	public Stanza getStanzaAdiacente(String direzione) {
		if(direzione.equals(this.direzioneBloccata) && this.hasAttrezzo(attrezzoRichiesto)==false) 
			return this;
		else
			return super.getStanzaAdiacente(direzione);
	}
}
