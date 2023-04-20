package org.example.dao;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.example.model.Book;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by shankar on 4/19/2023.
 */
//@Repository
class BookRowMapper implements RowMapper<Book> {

    @Nullable
    @Override
    public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
        Book book1 = new Book();
        book1.setIsbn(rs.getInt(1));
        book1.setName(rs.getString(2));
        book1.setAuthor(rs.getString(3));
        book1.setCost(rs.getFloat(4));
        return book1;
    }
}

public class BookDaoImpl implements BookDao {
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public boolean addBook(Book b) {
        if (jdbcTemplate == null)
            System.out.println("jdbcTemplate is null");

        jdbcTemplate.update("insert into book values(" + b.getIsbn() + ",'" + b.getName() + "','" + b.getAuthor() + "'," + b.getCost() + ")");
        return false;
    }

    @Override
    public Book searchBook(int isbn) {
        try {
            b1 = null;

            b1 = jdbcTemplate.queryForObject("select * from book where isbn=?", new Object[]{isbn}, new BookRowMapper());
            return b1;
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    @Override
    public Book removeBook(int isbn) {
        Book book = searchBook(isbn);
        if (book == null)
        return null;
        else {
            int update = jdbcTemplate.update("delete from book where isbn=" + isbn);
            if(update==1)
            return book;
        }
        return null;
    }

    @Override
    public Book updateBook(Book b) {
        if (searchBook(b.getIsbn()) == null)
            return null;
        else {
            jdbcTemplate.update("update book set name='" + b.getName() + "',author='" + b.getAuthor() + "',cost=" + b.getCost() + " where isbn=" + b.getIsbn());

            return b;
        }
    }


    List<Book> bookList;
    Book b1;

    @Override
    public List<Book> getAllBook() {
        bookList = null;
        bookList = new ArrayList<>();

        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from book");
        for (Map<String, Object> map1 : maps) {
            b1 = null;
            b1 = new Book();
            b1.setIsbn(Integer.parseInt(map1.get("isbn").toString()));
            b1.setName(map1.get("name").toString());
            b1.setAuthor(map1.get("author").toString());
            b1.setCost(Float.parseFloat(map1.get("cost").toString()));
            bookList.add(b1);
        }
        return bookList;
    }
}
