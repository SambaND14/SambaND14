package sn.samba.service.console;

import sn.samba.domain.DetailPrestation;
import sn.samba.domain.Eleve;
import sn.samba.domain.Prestataire;
import sn.samba.domain.Prestation;
import sn.samba.repository.DetailPrestationRepository;
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

    public void afficherELeve(Eleve[] eleves) {
        System.out.println("Les eleves sont:");
        for (int i = 0; i < eleves.length; i++) {
            Eleve eleve = eleves[i];
            System.out.println(String.format("> %s %s", eleve.getId(), eleve.getNomComplet()));
        }
    }

    public void afficherPrestataires(Prestation prestation, Prestataire[] prestataires) {
        System.out.println(String.format("La liste des prestataires %s :", prestation.getNom()));
        for (int i = 0; i < prestataires.length; i++) {
            Prestataire prestataire = prestataires[i];
            System.out.println(String.format("> %s %s %s", prestataire.getId(), prestataire.getPrenom(), prestataire.getNom()));
        }
    }

    public void afficherDetailsPrestation() {
        System.out.println("Les détails des prestations de Alassane Sene : ");
        DetailPrestation[] detailPrestations = detailPrestationRepository.getAll();
        for (int i = 0; i <detailPrestations.length; i++) {
            DetailPrestation detailPrestation = detailPrestations[i];
            System.out.println(
                    String.format(
                            "> %s %s : %s",
                            detailPrestation.getId(),
                            detailPrestation.getDetails(),
                            detailPrestation.getPrix()
                    )
            );
        }
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
