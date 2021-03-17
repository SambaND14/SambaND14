package sn.samba.repository.ram;

import sn.samba.domain.Classe;
import sn.samba.domain.Matiere;
import sn.samba.repository.ClasseRepository;

public class ArrayBasedClasseRepository implements ClasseRepository {


    public Classe[] getAll(){
        return new Classe[][]{
                new Classe(1, "L1GLISI",List<Matiere>matiere),
                new Classe(2, "L2GLISI", "Maths","Langage C"),
                new Classe(3, "L3GLISI", "Maths","Langage C"),
                new Classe(4, "M1GLISI", "Maths","Langage C"),
                new Classe(5, "M2GLISI", "Maths","Langage C"),
        };
    }

    public Classe findById(int id) {
        return null;
    }
}
