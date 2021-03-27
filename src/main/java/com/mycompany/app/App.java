package com.mycompany.app;

import com.mycompany.app.controller.EtudiantController;
import com.mycompany.app.repository.jdbc.EtudiantRepository;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {
        EtudiantController etudiantController = new EtudiantController();
        etudiantController.process();
    }
}
