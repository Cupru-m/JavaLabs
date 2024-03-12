package com.example.booklibrary.service;


import com.example.booklibrary.dtos.BookInfoDTO;
import com.example.booklibrary.entity.BookInfo;
import com.example.booklibrary.exceptions.BookListEmptyException;
import com.example.booklibrary.repository.BookInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookInfoService
{
    private final BookInfoRepository bookInfoRepository;

    @Autowired
    public BookInfoService(BookInfoRepository bookInfoRepository) {
        this.bookInfoRepository = bookInfoRepository;
    }

    public List<BookInfoDTO> findAllBooks() {

        List<BookInfo> books = bookInfoRepository.findAll();
        if(books.isEmpty())
        {
            throw new BookListEmptyException("List is Empty");
        }
        return books.stream()
                .map(book -> new BookInfoDTO(book.getTitle(), book.getGenre(), book.getYear()))
                .collect(Collectors.toList());
    }

    public List<BookInfoDTO> findBooksByTitle(String title) {
        List<BookInfo> books = bookInfoRepository.findByTitle(title);
        if (books.isEmpty()) {
            throw new BookListEmptyException("No books found with the title: " + title);
        }
        return books.stream()
                .map(book -> new BookInfoDTO(book.getTitle(), book.getGenre(), book.getYear()))
                .collect(Collectors.toList());
    }
}
