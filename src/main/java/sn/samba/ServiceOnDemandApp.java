package sn.samba;

import sn.samba.controller.EleveController;

public class ServiceOnDemandApp {
    private static Object ScannerMenuService;
    private static Object ConsoleDisplayService;

    public static void main(String[] args) {
        System.out.println("Initialisation application");
        EleveController clientController = new EleveController(ConsoleDisplayService, ScannerMenuService,);
        clientController.process();
    }
}
