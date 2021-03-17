package sn.samba.controller;

import sn.samba.repository.PrestationRepository;
import sn.samba.repository.ram.ArrayBasedDetailPrestationRepository;
import sn.samba.service.DisplayService;
import sn.samba.service.MenuService;


/**
 * End point destiné aux clients
 * Deux fonctionnalités (services)
 * 1 - Afficher le menu au client : ConsoleDisplayService
 * 2 - Lire les choix du client et afficher le sous-menu correspondant : ScannerMenuService
 */
public class EleveController {
    private final DisplayService displayService ;
    private final MenuService scannerMenuService ;

    public EleveController(DisplayService displayService, MenuService scannerMenuService) {
        this.displayService = displayService;
        this.scannerMenuService = scannerMenuService;
    }

    public EleveController(Object consoleDisplayService, Object scannerMenuService, DisplayService displayService, MenuService scannerMenuService1) {
        this.displayService = displayService;
        this.scannerMenuService = scannerMenuService1;
    }


    public void process(){

        displayService.afficherBienvenu();
        displayService.afficherMenuPrincipal();
        scannerMenuService.afficherMenu();
    }


}
