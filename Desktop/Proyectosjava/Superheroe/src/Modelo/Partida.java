package Modelo;

public class Partida {
	private int val_resultado;
	private Superheroe Atacante;
	private Superheroe Victima;
	private Escudo escudo;
	private Arma arma;

	  public int getVal_resultado() {
	        return val_resultado;
	    }

	    public void setVal_resultado(int val_resultado) {
	        this.val_resultado = val_resultado;
	    }

	    public Superheroe getAtacante() {
	        return Atacante;
	    }

	    public void setAtacante(Superheroe Atacante) {
	        this.Atacante = Atacante;
	    }

	    public Superheroe getVictima() {
	        return Victima;
	    }

	    public void setVictima(Superheroe Victima) {
	        this.Victima = Victima;
	    }

	    public Escudo getEscudo() {
	        return escudo;
	    }

	    public void setEscudo(Escudo escudo) {
	        this.escudo = escudo;
	    }

	    public Arma getArma() {
	        return arma;
	    }

	    public void setArma(Arma arma) {
	        this.arma = arma;
	    }
	

}


