package sn.samba.service;

import sn.samba.domain.Eleve;

public interface DisplayService {
    void afficherBienvenu();

    void afficherMenuPrincipal();

    void afficherListeServices(Eleve[] prestations);

    void afficherPrestataires(Prestation prestation, Prestataire[] prestataires);

    void afficherDetailsPrestation();

    void afficherDetailsContrat();

    void afficherDemandeHeure();

    void afficherConfirmation(String heure);

    void afficherOptionInconnue();
}
