package sn.samba.repository;

import sn.samba.domain.Prestation;

public interface restationRepository {
    Prestation[] getAll();
    Prestation getById(int id);
}
