package application.services;

import application.repositories.UtilisateurRepository;

public class UtilisateurService {

	private final UtilisateurRepository utilisateurRepository;

	public UtilisateurService() {
		utilisateurRepository = new UtilisateurRepository();
	}

	public void afficherTous() {
    IO.println(utilisateurRepository.getUtilisateurs());
	}
}
