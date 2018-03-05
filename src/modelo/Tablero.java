package modelo;

import control.AccionesTablero;

public class Tablero implements AccionesTablero {
	private Casilla[][] casillas;

	public Tablero(byte filas,byte columnas) {
		super();
		assert filas>0&&columnas>0:"parametros incorrectos";
		// TODO Auto-generated constructor stub
		//crear el tablero con tamaño filasxcolumnas
	}

	
	@Override
	public void calcularMinasAlrededor() {
		// TODO recorrer el panel donde hay mina y colocar un incremento
		//de una mina alrededor de ella
		
	}


	public boolean colocarMina(int x, int y) {
		//no se debe acceder directamente a las propiedades de otra clase
//		casilla[x][y].mina=true;
		
		return casillas[x][y].colocaMina();
	}
	
	
	
	
	
}
