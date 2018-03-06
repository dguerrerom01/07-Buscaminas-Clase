package modelo;

import utiles.Utiles;

public class Tablero implements AccionesTablero {
	private Casilla[][] casillas;

	public Tablero(byte filas,byte columnas) {
		super();
		assert filas>0&&columnas>0:"parametros incorrectos";
		// TODO Auto-generated constructor stub
		casillas=new Casilla[filas][columnas];
		for (int i = 0; i < casillas.length; i++) {
			for (int j = 0; j < casillas[i].length; j++) {
				casillas[i][j]=new Casilla();
			}
		}
	}

	
	@Override
	public void calcularMinasAlrededor() {
		// TODO recorrer el panel donde hay mina y colocar un incremento
		//de una mina alrededor de ella
		for (int i = 0; i < casillas.length; i++) {
			for (int j = 0; j < casillas[i].length; j++) {
				if(casillas[i][j].isMina()){
					//VIVA el hardcode
					for (int j2 = 0; j2 < 8; j2++) {
						Coordenada offset=Utiles.damePosicionAlrededor(j2);
						//¿Que nos estamos preguntando?
						int posX = i+offset.getPosX();
						int posY = j+offset.getPosY();
						if(isInToLimits(new Coordenada(posX, posY),casillas.length-1,casillas[i].length-1)){
							//¿que nos preguntamos para incrementar en uno el numero de minas alrededor de esta casilla
							if(!casillas[posX][posY].isMina()){
								casillas[posX][posY].setAlrededor((byte)(casillas[posX][posY].getAlrededor()+1));
							}
						}
					}
				}
			}
		}
	}


	public boolean isInToLimits(Coordenada pos, int upperLimitRow,int upperLimitColumn) {
		return isInside(pos, upperLimitRow)&&isInside(pos, upperLimitColumn);
	}


	public boolean isInside(Coordenada pos, int upperLimitRow) {
		return pos.getPosX()>=0&&pos.getPosX()<=upperLimitRow;
	}


	public boolean colocarMina(int x, int y) {
		//no se debe acceder directamente a las propiedades de otra clase
//		casilla[x][y].mina=true;
		
		return casillas[x][y].colocaMina();
	}


	public boolean desvelarCasilla(Casilla casilla) {
		// TODO metodo reecursivo que a partir de un casilla desvelada (hay que saber
		//cual es dentro del tablero) develada todas las de alrededor y sucesivas que tengan
		//un valor de 0 minas alrededor
		return false;
	}
	
	
	
	
	
}
