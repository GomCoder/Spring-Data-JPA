package com.fastcampus.jpa.bookmanager.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

class UserTest {
    @Test
    void test() {

        User user = new User();
        user.setEmail("user@fast.com");
        user.setName("user");
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());

        User user1 = new User("user1", "user@fast.com", "asd", LocalDateTime.now(), LocalDateTime.now());

        User user2 = new User("user1", "user@fast.com");

        User user3 = User.builder().name("user").email("user@fast.com").build();

        System.out.println("@NoArgsConstructor >>>> " + user.toString());
        System.out.println("@AllArgsConstructor >>>> " + user1.toString());
        System.out.println("@RequiredArgsConstructor >>>> " + user2.toString());
        System.out.println("@Builder >>>> " + user3.toString());
    }
}