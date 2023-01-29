package com.fastcampus.jpa.bookmanager.domain;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Builder
@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String name; //이름

    @NonNull
    private String email; //이메일


    private LocalDateTime createdAt; //생성 시간

    private LocalDateTime updatedAt; //수정 시간
}
