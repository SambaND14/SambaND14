package sn.samba.repository.ram;

import sn.samba.domain.Classe;
import sn.samba.domain.Matiere;
import sn.samba.repository.ClasseRepository;
import sn.samba.repository.MatiereRepository;

public class ArrayBasedMatiereRepository implements MatiereRepository {

        public static final Matiere[] MATIERES = {
                new Matiere(1, "LC","Maths",),
                new Matiere(2, "Python",),
                new Matiere(3, "PHP",),
                new Matiere(4, "JAVA",),
                new Matiere(5, "HTML",),
        };


    @Override
    public Matiere[] getAll() {
        return new Matiere[0];
    }

    @Override
    public Matiere getById(int id) {
        return null;
    }
}

