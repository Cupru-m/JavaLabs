package com.example.booklibrary.repository;


import com.example.booklibrary.entity.BookInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookInfoRepository extends JpaRepository<BookInfo,Long>
{
    List<BookInfo> findByTitle(String title);
}