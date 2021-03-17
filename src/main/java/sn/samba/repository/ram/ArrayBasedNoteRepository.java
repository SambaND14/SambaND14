package sn.samba.repository.ram;


import sn.samba.domain.Classe;
import sn.samba.domain.Note;
import sn.samba.repository.NoteRepository;

public class ArrayBasedNoteRepository implements NoteRepository {

        public static final Note[] NOTES = {
                new Note(1, "15","12","eleve","matiere"),
                new Note(2, "11","14","eleve","matiere"),
        };


    @Override
    public Classe[] getAll() {
        return new Note[][0];
    }

    @Override
    public Note getById(int id) {
        return null;
    }
}

