package sn.samba.repository;

import sn.samba.domain.Note;
import sn.samba.domain.Note;

public interface NoteRepository {
    Note[] getAll();
    Note getById(int id);
}
