package com.fastcampus.jpa.bookmanager.repository;

import com.fastcampus.jpa.bookmanager.domain.User;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.*;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.contains;
import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.endsWith;

@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void crud() { //create, read, update, delete
        //List<User> users = userRepository.findAll(Sort.by(Direction.DESC, "name"));
        //List<User> users = userRepository.findAllById(Lists.newArrayList(1L, 3L, 5L));
        //users.forEach(System.out::println);

        //USer user1 = new User("jack", "jack@fastcampus.com");
        //User user2 = new User("steve", "steve@fastcampus.com");

        //userRepository.saveAll(Lists.newArrayList(user1, user2));
        // userRepository.save(user1);

        //List<User> users = userRepository.findAll();

        // users.forEach(System.out::println);

        //User user = userRepository.findById(1L).orElse(null);
        //System.out.println(user);

         //userRepository.saveAndFlush(new User("new martin", "newmartin@fastcampus.com"));
         //userRepository.findAll().forEach(System.out::println);

        //long count = userRepository.count();

        //System.out.println(count);

        //boolean exists = userRepository.existsById(1L);

        //System.out.println(exists);

        //userRepository.delete(userRepository.findById(1L).orElseThrow(RuntimeException::new));
        //userRepository.deleteById(1L);

        //userRepository.findAll().forEach(System.out::println);

        //userRepository.deleteAll(userRepository.findAllById(Lists.newArrayList(1L, 3L)));
        //userRepository.findAll().forEach(System.out::println);

        //userRepository.deleteAllInBatch();
        //userRepository.findAll().forEach(System.out::println);

        //Page<User> users = userRepository.findAll(PageRequest.of(1, 3));

//        System.out.println("page : " + users) ;
//        System.out.println("totalElements : " + users.getTotalElements());
//        System.out.println("totalPages : " + users.getTotalPages());
//        System.out.println("numberOfElements : " + users.getNumberOfElements());
//        System.out.println("sort : " + users.getSort());
//        System.out.println("size : " + users.getSize());
//
//        users.getContent().forEach(System.out::println);

//        ExampleMatcher matcher = ExampleMatcher.matching()
//                //.withIgnorePaths("name")
//                .withMatcher("email", endsWith());
//
//        Example<User> example = Example.of(new User("ma", "fastcampus.com"), matcher);
//
//        userRepository.findAll(example).forEach(System.out::println);


//        Example<User> example = Example.of(new User("martin", "martin@fastcampus.com"));
//
//        userRepository.findAll(example).forEach(System.out::println);

        User user = new User();
        user.setEmail("slow");

        ExampleMatcher matcher = ExampleMatcher.matching().withMatcher("email", contains());

        Example<User> example = Example.of(user, matcher);

        userRepository.findAll(example).forEach(System.out::println);



    }
}