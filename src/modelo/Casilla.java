package modelo;

public class Casilla {
	private boolean mina=false;
	private byte alrededor=0;
	/**
	 * si en la casilla hay una mina retorna false
	 * si en la casilla no hay mina pone la mina true
	 * y retorna true
	 * @return
	 */
	public boolean colocaMina() {
		boolean retorno=false;
		if(!mina){
			mina=true;
			retorno=true;
		}
		return retorno;
	}
	public boolean isMina() {
		return mina;
	}
	public void setMina(boolean mina) {
		this.mina = mina;
	}
	public byte getAlrededor() {
		return alrededor;
	}
	public void setAlrededor(byte alrededor) {
		this.alrededor = alrededor;
	}
	
}
