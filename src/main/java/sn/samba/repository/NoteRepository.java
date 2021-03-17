package sn.samba.repository;

import sn.samba.domain.Classe;
import sn.samba.domain.Note;

public interface NoteRepository {
    Classe[] getAll();
    Note getById(int id);
}
