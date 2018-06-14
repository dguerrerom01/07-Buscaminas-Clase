package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.Iniciador;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.util.Set;
import java.awt.event.ActionEvent;

public class BuscaminasUI extends JFrame {

	private JPanel contentPane;
	protected Casillero casillero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuscaminasUI frame = new BuscaminasUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BuscaminasUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 308, 363);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnJuego = new JMenu("Juego");
		menuBar.add(mnJuego);

		JMenuItem mntmNuevoJuego = new JMenuItem("Nuevo juego");
		mntmNuevoJuego.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setBounds(100, 100, 350, 400);
				casillero.setBounds(20, 20, 300, 300);
				casillero.casillasX = 15;
				casillero.casillasY = 15;
				casillero.repaint();
				
				
			}
		});
		mnJuego.add(mntmNuevoJuego);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		contentPane.setLayout(null);
		casillero = new Casillero(100, 0);
		casillero.setBounds(20, 20, 250, 250);
		contentPane.add(casillero);
	}
}
