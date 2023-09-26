package co.edu.politecnicointernacional.programacion1.logica;


import java.awt.EventQueue;

import co.edu.politecnicointernacional.programacion1.vista.CrudAPP;

public class Crud_Main {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrudAPP frame = new CrudAPP();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}