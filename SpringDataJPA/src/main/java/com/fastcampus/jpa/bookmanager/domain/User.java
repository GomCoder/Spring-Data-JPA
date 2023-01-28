package com.fastcampus.jpa.bookmanager.domain;


import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Builder
public class User {
    @NonNull
    private String name; //이름
    @NonNull
    private String email; //이메일
    private String address; //주소
    private LocalDateTime createdAt; //생성 시간
    private LocalDateTime updatedAt; //수정 시간
}
