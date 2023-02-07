package com.fastcampus.jpa.bookmanager.repository.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public interface BookNameAndCategory {
//    private String name;
//    private String category;
    String getName();
    String getCategory();
}*/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookNameAndCategory {
    private String name;
    private String category;
}