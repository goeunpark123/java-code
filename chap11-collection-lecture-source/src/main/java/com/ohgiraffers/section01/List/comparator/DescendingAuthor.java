package com.ohgiraffers.section01.List.comparator;

import com.ohgiraffers.section01.List.dto.BookDTO;

import java.util.Comparator;

public class DescendingAuthor implements Comparator<BookDTO> {
    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        return -o1.getAuthor().compareTo(o2.getAuthor());
    }
}
