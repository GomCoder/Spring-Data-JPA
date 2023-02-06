package com.fastcampus.jpa.bookmanager.service;

import com.fastcampus.jpa.bookmanager.domain.Author;
import com.fastcampus.jpa.bookmanager.domain.Book;
import com.fastcampus.jpa.bookmanager.domain.BookReviewInfo;
import com.fastcampus.jpa.bookmanager.repository.AuthorRepository;
import com.fastcampus.jpa.bookmanager.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    private final EntityManager entityManager;
    private final AuthorService authorService;

    public void put() {
        this.putBookAndAuthor();
    }

    @Transactional(propagation = Propagation.REQUIRED)
    void putBookAndAuthor(){
        Book book = new Book();
        book.setName("JPA 시작하기");

        bookRepository.save(book);
        
        try {
            authorService.putAuthor();
        }catch(RuntimeException e) {

        }
        throw new RuntimeException("오류가 발생하였습니다. Transaction은 어떻게 될까요?");

      /*  Author author = new Author();
        author.setName("martin");

        authorRepository.save(author);
    */

    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public void get(Long id) {
        System.out.println(">>> " +  bookRepository.findById(id));
        System.out.println(">>> " +  bookRepository.findAll());

        entityManager.clear();

        System.out.println(">>> " +  bookRepository.findById(id));
        System.out.println(">>> " +  bookRepository.findAll());

        bookRepository.update();

        entityManager.clear();

/*        Book book = bookRepository.findById(id).get();
        book.setName("바뀔까?");
        bookRepository.save(book);*/
    }
}