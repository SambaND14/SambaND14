package sn.samba.repository.ram;


import sn.samba.domain.Eleve;
import sn.samba.repository.EleveRepository;

public class ArrayBasedEleveRepository implements EleveRepository {

        public static final Eleve[] ELEVES = {
                new Eleve(1, "00001","Samba Ndiaye","M","samba123@gmail.com","samba@isi.sn","123456","M1GLISI",),
                new Eleve(1, "00002","Bintou Fall","F","bintou123@gmail.com","bintou@isi.sn","123456","M2GLISI",),
        };

    public Eleve[] getAll() {
        return new Eleve[][];
    }

    public Eleve findById(int id) {
        return null;
    }
}

