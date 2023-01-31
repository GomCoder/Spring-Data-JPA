package com.fastcampus.jpa.bookmanager.repository;

import com.fastcampus.jpa.bookmanager.domain.Gender;
import com.fastcampus.jpa.bookmanager.domain.User;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.*;
import org.springframework.data.domain.Sort.Order;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
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
//        userRepository.save(new User("david", "david@fastcampus.com"));
//
//        User user = userRepository.findById(1L).orElseThrow(RuntimeException::new);
//        user.setEmail("martin-updated@fastcampus.com");
//
//        userRepository.save(user);
    }

    @Test
    void select() {
        /*System.out.println(userRepository.findByName("dennis"));
        System.out.println("findByEmail : " + userRepository.findByEmail("martin@fastcampus.com"));
        System.out.println("getByEmail : " + userRepository.getByEmail("martin@fastcampus.com"));
        System.out.println("readByEmail : " + userRepository.readByEmail("martin@fastcampus.com"));
        System.out.println("queryByEmail : " + userRepository.queryByEmail("martin@fastcampus.com"));
        System.out.println("searchByEmail : " + userRepository.searchByEmail("martin@fastcampus.com"));
        System.out.println("streamByEmail : " + userRepository.streamByEmail("martin@fastcampus.com"));*/

        /*System.out.println("findUserByEmail : " + userRepository.findUserByEmail("martin@fastcampus.com"));*/

        /*System.out.println("findFirst2ByName : " + userRepository.findFirst2ByName("martin"));
        System.out.println("findTop2ByName : " + userRepository.findTop2ByName("martin"));
        System.out.println("findLast1ByName : " + userRepository.findLast1ByName("martin"));*/

        /*System.out.println("findByEmailAndName : " + userRepository.findByEmailAndName("martin@fastcampus.com", "martin"));
        System.out.println("findByEmailOrName : " + userRepository.findByEmailOrName("martin@fastcampus.com", "dennis"));
        */

        /*System.out.println("findByCreatedAtAfter : " + userRepository.findByCreatedAtAfter(LocalDateTime.now().minusDays(1L)));
        System.out.println("findByIdAfter : " + userRepository.findByIdAfter(4L));*/

        /*System.out.println("findByCreatedAtGreaterThan : " + userRepository.findByCreatedAtGreaterThan(LocalDateTime.now().minusDays(1L)));
        System.out.println("findByCreatedAtGreaterThanEqual : " + userRepository.findByCreatedAtGreaterThanEqual(LocalDateTime.now().minusDays(1L)));*/

        //System.out.println("findByCreatedAtBetween : " + userRepository.findByCreatedAtBetween(LocalDateTime.now().minusDays(1L), LocalDateTime.now().plusDays(1L)));
        //System.out.println("findByIdBetween : " + userRepository.findByIdBetween(1L, 3L));
        //System.out.println("findByIdGreaterThanEqualAndIdLessThanEqual : " + userRepository.findByIdGreaterThanEqualAndIdLessThanEqual(1L, 3L));

        //System.out.println("findByIdIsNotNull : " + userRepository.findByIdIsNotNull());
        //System.out.println("findByIdIsNotEmpty : " + userRepository.findByIdIsNotEmpty()); //Collection 타입의 NotEmpty를 체크함

        //System.out.println("findByAddressesIsNotEmpty : " + userRepository.findByAddressesIsNotEmpty());
        //System.out.println("findByNameIn : " + userRepository.findByNameIn(Lists.newArrayList("martin", "dennis")));

        //System.out.println("findByNameStartingWith : " + userRepository.findByNameStartingWith("mar"));
        //System.out.println("findByNameEndingWith : " + userRepository.findByNameEndingWith("tin"));
        //System.out.println("findByNameContains : " + userRepository.findByNameContains("art"));

        //System.out.println("findByNameLike : " + userRepository.findByNameLike("%"+"art"+"%"));
    }

    @Test
    void pagingAndSortingTest() {
//        System.out.println("findTop1ByName : " + userRepository.findTop1ByName("martin"));
//        System.out.println("findLast1ByName : " + userRepository.findLast1ByName("martin"));
//        System.out.println("findTopByNameOrderByIdDesc : " + userRepository.findTopByNameOrderByIdDesc("martin"));
        //System.out.println("findFirstByNameOrderByIdDescEmailAsc : " + userRepository.findFirstByNameOrderByIdDescEmailAsc("martin"));
        //System.out.println("findFirstByNameWithSortParams : " + userRepository.findFirstByName("martin", Sort.by(Order.desc("id"), Order.asc("email"))));
//        System.out.println("findFirstByNameWithSortParams : " + userRepository.findFirstByName("martin", getSort()));
        //System.out.println("findByNameWithPaging: " + userRepository.findByName("martin", PageRequest.of(1,1,Sort.by(Order.desc("id")))).getTotalElements());


    }

//    private Sort getSort() {
//        return Sort.by(
//                Order.desc("id"),
//                Order.asc("email"),
//                Order.desc("createdAt"),
//                Order.desc("updatedAt")
//        );
//    }

    @Test
    void insertAndUpdateTest() {
        User user = new User();
        user.setName("martin");
        //user.setEmail("martin@fastcampus.com");

        userRepository.save(user);

        User user2 = userRepository.findById(1L).orElseThrow(RuntimeException::new);
        user2.setName("marrrrrtin");

        userRepository.save(user2);
    }

    @Test
    void enumTest() {
        User user = userRepository.findById(1L).orElseThrow(RuntimeException::new);
        user.setGender(Gender.MALE);

        userRepository.save(user);

        userRepository.findAll().forEach(System.out::println);

        System.out.println(userRepository.findRowRecord().get("gender"));
    }

}