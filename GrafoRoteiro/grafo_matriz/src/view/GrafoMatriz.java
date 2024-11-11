package view;

import controller.GrafoMatrizController;

public class GrafoMatriz{
	public static void main (String[] args) {
		try {
			GrafoMatrizController obj = new GrafoMatrizController();
			obj.roteriza();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}