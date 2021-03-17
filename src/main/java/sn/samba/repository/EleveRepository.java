package sn.samba.repository;

import sn.samba.domain.Eleve;

public interface EleveRepository {
    Eleve[] getAll();

    static Eleve getById(int id) {
        return null;
    }
}
