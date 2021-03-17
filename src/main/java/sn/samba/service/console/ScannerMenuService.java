package sn.samba.service.console;

import sn.samba.domain.Eleve;
import sn.samba.repository.EleveRepository;
import sn.samba.service.DisplayService;
import sn.samba.service.MenuService;

import java.util.Scanner;

public class ScannerMenuService implements MenuService {
    private final DisplayService displayService;
    private final Scanner scanner;
    private final EleveRepository eleveRepository;
    private final PrestataireRepository prestataireRepository;


    public ScannerMenuService(DisplayService displayService, PrestationRepository prestationRepository, EleveRepository eleveRepository, PrestataireRepository prestataireRepository) {
        this.displayService = displayService;
        this.eleveRepository = eleveRepository;
        this.prestataireRepository = prestataireRepository;
        this.scanner = new Scanner(System.in);
        this.prestationRepository = prestationRepository;
    }


    private String lireChoix() {
        return scanner.next();
    }

    private void afficherMenu( String choix) {
        Eleve[] eleves= EleveRepository.getAll();
        if("l".equalsIgnoreCase(choix)){
            displayService.afficherListeServices(eleves);
            int idPrestation = scanner.nextInt();

            //get eleve by id
            Eleve eleve = EleveRepository.getById(int Id);
            //get prestataires by prestation
            Prestataire[] prestataires = prestataireRepository.getAllByPrestation(Eleve);
            //afficher les prestataires qui fournissent ce service
            displayService.afficherPrestataires(Eleve, prestataires);

            int idPrestataire = scanner.nextInt();
            Prestataire prestataire = prestataireRepository.findById(idPrestataire);
            if(2 == idPrestataire){
                displayService.afficherDetailsPrestation();

                int idDetailPrestation = scanner.nextInt();
                if(3 == idDetailPrestation){
                    displayService.afficherDetailsContrat();
                    displayService.afficherDemandeHeure();
                    String heure = scanner.next();
                    displayService.afficherConfirmation(heure);
                }
            }
        }
        //afficher le menu inconnu
        else {
            displayService.afficherOptionInconnue();
        }
    }

    public void afficherMenu() {
        String choix = lireChoix();
        afficherMenu(choix );
    }
}
