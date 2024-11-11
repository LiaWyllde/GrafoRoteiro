package controller;

import model.estrutura.grafo.GrafoMatriz;

public class GrafoMatrizController {

	public GrafoMatrizController(){
		super();
	}
	
	public void roteriza() throws Exception {
		
		String[] fabrica = new String[] {"Belo Horizonte", "Juiz de Fora", "Manhuacu", "Governador Valadares", "Colatina", "Vitoria", "Rio de Janeiro", "Campos dos Goytacazes", "Uberaba", "Uberlandia", "Patos de Minas", "Sao Jose do Rio Preto", "Ribeirao Preto", "Franca", "Sao Carlos", "Campinas", "Sao Paulo", "Sao Jose dos Campos"};
		String[] centroUm = new String[] {"Ribeirao Preto", "Franca", "Sao Carlos", "Campinas", "Sao Paulo", "Sao Jose dos Campos", "Sao Jose do Rio Preto", "Uberlandia", "Uberaba", "Patos de Minas"};
		String[] centroDois = new String[] {"Belo Horizonte", "Governador Valadares", "Colatina", "Manhuacu", "Juiz de Fora", "Vitoria", "Rio de Janeiro", "Campos dos Goytacazes"};
		
		GrafoMatriz gFabrica = new GrafoMatriz(fabrica);
		GrafoMatriz gCentroUm = new GrafoMatriz(centroUm);
		GrafoMatriz gCentroDois = new GrafoMatriz(centroDois);
		
		//fabrica
		gFabrica.link("Belo Horizonte","Uberaba", 476);
		gFabrica.link("Belo Horizonte","Juiz de Fora", 260);
		gFabrica.link("Belo Horizonte","Manhuacu", 279);
		gFabrica.link("Belo Horizonte","Governador Valadares", 313);
		gFabrica.link("Governador Valadares","Colatina", 216);
		gFabrica.link("Manhuacu","Governador Valadares", 198);
		gFabrica.link("Manhuacu","Juiz de Fora", 290);
		gFabrica.link("Manhuacu","Vitoria", 233);
		gFabrica.link("Vitoria","Campo dos Goytacazes", 240);
		gFabrica.link("Juiz de Fora","Rio de Janeiro", 181);
		gFabrica.link("Rio de Janeiro","Campos dos Goytacazes", 277);
		gFabrica.link("Rio de Janeiro","Sao Jose dos Campos", 341);
		gFabrica.link("Sao Jose dos Campos", "Sao Paulo", 79);
		gFabrica.link("Sao Paulo", "Campinas", 111);
		gFabrica.link("Campinas", "Sao Carlos", 142);
		gFabrica.link("Sao Carlos", "Ribeirao Preto", 99);
		gFabrica.link("Sao Carlos", "Sao Jose do Rio Preto", 206);
		gFabrica.link("Sao Jose do Rio Preto", "Uberlandia", 285);
		gFabrica.link("Ribeirao Preto", "Uberlandia", 278);
		gFabrica.link("Ribeirao Preto", "Franca", 89);
		gFabrica.link("Uberlandia", "Patos de Minas", 222);
		gFabrica.link("Uberaba", "Uberlandia", 105);
		
		//centro um
		gCentroUm.link("Ribeirao Preto","Franca",89); 
		gCentroUm.link("Ribeirao Preto","Sao Carlos",99); 
		gCentroUm.link("Sao Carlos","Sao Jose do Rio Preto",206); 
		gCentroUm.link("Sao Carlos","Campinas",142);
		gCentroUm.link("Campinas","Sao Paulo",111);
		gCentroUm.link("Sao Paulo","Sao Jose dos Campos",79);
		gCentroUm.link("Ribeirao Preto","Uberlandia",278);
		gCentroUm.link("Uberlandia","Patos de Minas",222);
		gCentroUm.link("Uberlandia","Uberaba",105);
		
		//centro dois
		gCentroDois.link("Manhuacu", "Belo Horizonte", 279);
		gCentroDois.link("Manhuacu", "Governador Valadares", 198);		
		gCentroDois.link("Governador Valadares", "Colatina", 216);		
		gCentroDois.link("Manhuacu", "Juiz de Fora", 290);
		gCentroDois.link("Juiz de Fora", "Rio de Janeiro", 181);
		gCentroDois.link("Manhuacu", "Vitoria", 233);
		gCentroDois.link("Vitoria", "Campos dos Goytacazes", 240);
		
		
		
	}
}
