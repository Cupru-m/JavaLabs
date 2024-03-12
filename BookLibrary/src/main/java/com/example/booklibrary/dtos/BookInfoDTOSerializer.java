package com.example.booklibrary.dtos;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class BookInfoDTOSerializer extends JsonSerializer<BookInfoDTO> {

    @Override
    public void serialize(BookInfoDTO value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeRaw("\n" +"Title: " + value.getTitle() + "\n");
        gen.writeRaw("genre: " + value.getGenre() + "\n");
        gen.writeRaw("year: " + value.getYear() + "\n");
    }
}
