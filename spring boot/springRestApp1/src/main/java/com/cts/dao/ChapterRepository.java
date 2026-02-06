package com.cts.dao;

import com.cts.model.Author;
import com.cts.model.Chapters;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChapterRepository extends JpaRepository
        <Chapters,Integer> {

}
