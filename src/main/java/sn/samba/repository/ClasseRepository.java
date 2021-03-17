package sn.samba.repository;

import sn.samba.domain.Classe;

public interface ClasseRepository {
    Classe[] getAll();
    Classe findById(int id);
}
