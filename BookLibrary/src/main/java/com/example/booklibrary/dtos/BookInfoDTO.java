package com.example.booklibrary.dtos;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(using = BookInfoDTOSerializer.class)
public class BookInfoDTO {

    private String title;
    private String genre;
    private int year;

    public BookInfoDTO(String title, String genre, int year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    private BookInfoDTO() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
