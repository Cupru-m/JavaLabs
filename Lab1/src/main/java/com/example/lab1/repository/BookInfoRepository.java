package com.example.lab1.repository;

import com.example.lab1.entity.BookInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookInfoRepository extends JpaRepository<BookInfo,Long>
{
    List<BookInfo> findByTitle(String title);
}