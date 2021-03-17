package sn.samba.repository;

import sn.samba.domain.Matiere;
import sn.samba.domain.Matiere;

public interface MatiereRepository {
    Matiere[] getAll();
    Matiere getById(int id);
}
