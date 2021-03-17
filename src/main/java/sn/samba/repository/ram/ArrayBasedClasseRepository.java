package sn.samba.repository.ram;

import sn.samba.domain.Classe;
import sn.samba.repository.ClasseRepository;

public class ArrayBasedClasseRepository implements ClasseRepository {

        public static final Classe[] CLASSES = {
                new Classe(1, "M1GLISI","LC"),
                new Classe(2, "M2GLISI","LC"),
        };

    public Classe[] getAll() {
        return new Classe[0];
    }

    public Classe findById(int id) {
        return null;
    }
}

