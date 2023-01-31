package com.fastcampus.jpa.bookmanager.domain;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Builder
@Entity
@Table(name="user", indexes={@Index(columnList = "name")}, uniqueConstraints ={ @UniqueConstraint(columnNames = {"email"})})
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String name; //이름

    @NonNull
    private String email; //이메일

    @Enumerated(value=EnumType.STRING)
    private Gender gender;

    @Column(updatable = false)
    private LocalDateTime createdAt; //생성 시간

    private LocalDateTime updatedAt; //수정 시간

//    @Transient
//    private String testData;

    //@OneToMany(fetch = FetchType.EAGER)
    //private List<Address> addresses; //주소
}
