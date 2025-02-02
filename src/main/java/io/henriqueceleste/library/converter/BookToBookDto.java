package io.henriqueceleste.library.converter;

import io.henriqueceleste.library.dto.BookDto;
import io.henriqueceleste.library.model.Book;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BookToBookDto implements Converter<BookDto, Book>{

    @Override
    public List<BookDto> convertList(List<Book> bookList) {
        return bookList.stream().map(this::convert)
                .collect(Collectors.toList());
    }

    @Override
    public BookDto convert(Book book) {
        BookDto bookDto = new BookDto();

        bookDto.setTitle(book.getTitle());
        bookDto.setAuthor(book.getAuthor());
        bookDto.setIsbn(book.getIsbn());
        bookDto.setPublished_date(book.getPublished_date());
        bookDto.setPrice(book.getPrice());
        bookDto.setId(book.getId());

        return bookDto;
    }

}
