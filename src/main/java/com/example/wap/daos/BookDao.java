package com.example.wap.daos;

import com.example.wap.models.Book;
import com.example.wap.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookDao {
  @Autowired
  BookRepository bookRepository;
  @GetMapping("/findAllBooks")
  public Iterable<Book> findAllBooks() {
    return bookRepository.findAll();
  }
  @GetMapping("/findBookByISBN/{ISBN}")
  public Book findBookByISBN(
          @PathVariable("ISBN") Integer ISBN) {
    return bookRepository.findById(ISBN).get();
  }
  @GetMapping("/deleteBook/{ISBN}")
  public void deleteBook(
          @PathVariable("ISBN") Integer ISBN) {
    bookRepository.deleteById(ISBN);
  }
  @GetMapping("/createBook")
  public Book createBook() {
    Book book = new Book();
    book.setName("New Book");
    return bookRepository.save(book);
  }
  @GetMapping("/renameBook/{ISBN}/{newName}")
  public Book renameBook(
          @PathVariable("ISBN") Integer ISBN,
          @PathVariable("newName") String newName) {
    Book book = bookRepository.findById(ISBN).get();
    book.setName(newName);
    return bookRepository.save(book);
  }
}
