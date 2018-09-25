package com.example.notasfaciles.repository;

import com.example.notasfaciles.model.Note;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}
