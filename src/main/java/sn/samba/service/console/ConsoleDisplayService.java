package sn.samba.service.console;

import sn.samba.domain.Classe;
import sn.samba.domain.Eleve;
import sn.samba.service.DisplayService;

public class ConsoleDisplayService implements DisplayService {

    private final DetailPrestationRepository detailPrestationRepository;

    public ConsoleDisplayService(DetailPrestationRepository detailPrestationRepository) {
        this.detailPrestationRepository = detailPrestationRepository;
    }

    public void afficherBienvenu() {
        System.out.println("Bienvenu sur la plateforme des Notes de ISI!");
    }

    public void afficherMenuPrincipal() {
        System.out.println("> l pour lister les Eleve ");
    }

    @Override
    public void afficherListeServices(Eleve[] prestations) {

    }

    @Override
    public void afficherClasse(Classe classe, Classe[] classes) {

    }


    public void afficherELeve(Eleve[] eleves) {
        System.out.println("Les eleves sont:");
        for (int i = 0; i < eleves.length; i++) {
            Eleve eleve = eleves[i];
            System.out.println(String.format("> %s %s", eleve.getId(), eleve.getNomComplet()));
        }
    }

    @Override
    public void afficherDetailsPrestation() {

    }


    public void afficherDetailsContrat() {
        System.out.println("Prestation Alassane Sene: Course Dakar 2500 ");
    }

    public void afficherDemandeHeure() {
        System.out.println("Quelle heure voulez-vous (hh:mm) ?");
    }

    public void afficherConfirmation(String heure) {
        System.out.println(String.format("OK pour %s", heure));
    }

    public void afficherOptionInconnue() {
        System.out.println("Choix inconnu");
    }
}
