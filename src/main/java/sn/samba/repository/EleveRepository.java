package sn.samba.repository;

import sn.samba.domain.Eleve;

public interface EleveRepository {
    Eleve[] getAll();
    Eleve getById(int id);
}
