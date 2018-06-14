package vista;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Casillero extends JPanel {

	public JButton botones[][];
	int anchoPanel = 250, altoPanel = 250, tamañoCasilla = 25;
	int casillasX = 10, casillasY = 10;
	

	/**
	 * Create the panel.
	 */
	public Casillero(int x, int y) {
		setLayout(null);
		this.setBounds(x, y, this.anchoPanel, this.altoPanel);
		iniciarBotonera();
	}

	private void iniciarBotonera() {
		this.botones = new JButton[casillasX][casillasY];
		int x = 0, y = 0;
		for (int i = 0; i < this.botones.length; i++) {
			for (int j = 0; j < this.botones[i].length; j++) {
				this.botones[i][j] = new JButton();
				this.botones[i][j].setName(String.valueOf(i) + String.valueOf(j));
				this.botones[i][j].setBounds(x, y, this.tamañoCasilla, this.tamañoCasilla);
				this.add(this.botones[i][j]);
				x += this.tamañoCasilla;
			}
			x = 0;
			y += this.tamañoCasilla;
		}
	}
}
