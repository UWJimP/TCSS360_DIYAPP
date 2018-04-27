package main;

import java.awt.EventQueue;

import view.GUI;

/**
 * The main method that runs the program.
 *
 * @author Jim Phan phanjim2@hotmail.com
 * @version Apr 26, 2018
 */
public final class Main {

	/**
	 * The main method that runs.
	 * 
	 * @param args Command line arguments.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				new GUI().start();
			}
		});
	}
}
