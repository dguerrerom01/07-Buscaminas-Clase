package control;

import modelo.Casilla;

public class Marcador implements Marcable{

	@Override
	public void marcarCasilla(Casilla casilla) {
		assert casilla!=null:"casilla no valida";
		if(casilla.isVelada()){
			casilla.setMarcada(!casilla.isMarcada());
		}
	}

	
}
