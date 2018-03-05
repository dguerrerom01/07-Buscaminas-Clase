package control;

import javax.print.attribute.standard.NumberOfDocuments;

public class Inciador implements Iniciable {
	private byte minas;
	private Densidad densidad;
	private byte filas,columnas;
	private Tablero tablero;
	
	@Override
	public void establecerNumeroMinas() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void establecerDensidad() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void establecerDimensionTablero() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void crearTablero() {
		assert this.filas>0&&this.columnas>0:"numero no valido de filas/columnas";
		// TODO Auto-generated method stub
	}
	@Override
	public void colocarMinas() {
		assert this.tablero!=null&&minas>0:"fallo al definir el tablero y/o el numero de minas";
		// TODO Auto-generated method stub
		//hay que hacer un sorteo y pedirle al tablero que la coloque
	}
	
	
}
