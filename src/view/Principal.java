package view;

import java.util.concurrent.Semaphore;


class Principal {

	public static void main(String[] args) {
		
		int permissoesPistaSul = 1;
		Semaphore semaforoPistaSul = new semaforo(permissoesPistaSul);
		
		int permissoesPistaNorte = 1;
		Semaphore semaforoPistaNorte = new semaforo(permissoesPistaNorte);

		for (int idAviao = 1; idAviao <= 12; idAviao++) {
			ThreadAeroporto threadAeroporto = new ThreadAeroporto(idAviao, semaforoPistaSul, semaforoPistaNorte);
			threadAeroporto.start();
		}

	}

}