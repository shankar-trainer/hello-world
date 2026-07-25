package com.coforge.web;

import com.coforge.dao.LibraryDaoImpl;
import com.coforge.model.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
//@ComponentScan("com.cofoge.dao")
public class LibraryController {
    @Autowired
    private LibraryDaoImpl dao;

    @GetMapping("/all")
    public List<Library> getAll() {
        return dao.showAll();
    }
}
