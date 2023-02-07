--CALL NEXT VALUE FOR hibernate_sequence;
INSERT INTO USER(`id`, `name`, `email`, `created_at`, `updated_at`) VALUES(1, 'martin', 'martin@fastcampus.com', now(), now());

--CALL NEXT VALUE FOR hibernate_sequence;
INSERT INTO USER(`id`, `name`, `email`, `created_at`, `updated_at`) VALUES(2, 'dennis', 'dennis@fastcampus.com', now(), now());

--CALL NEXT VALUE FOR hibernate_sequence;
INSERT INTO USER(`id`, `name`, `email`, `created_at`, `updated_at`) VALUES(3, 'sophia', 'sophia@slowcampus.com', now(), now());

--CALL NEXT VALUE FOR hibernate_sequence;
INSERT INTO USER(`id`, `name`, `email`, `created_at`, `updated_at`) VALUES(4, 'james', 'james@slowcampus.com', now(), now());

--CALL NEXT VALUE FOR hibernate_sequence;
INSERT INTO USER(`id`, `name`, `email`, `created_at`, `updated_at`) VALUES(5, 'martin', 'martin@another.com', now(), now());

INSERT INTO PUBLISHER(`id`, `name`) values(1,'패스트캠퍼스');

INSERT INTO BOOK(`id`, `name`, `publisher_id`, `deleted`, `status`) values(1,'JPA 초격차 패키지', 1, false, 100);
INSERT INTO BOOK(`id`, `name`, `publisher_id`, `deleted`, `status`) values(2,'Spring Security 초격차 패키지', 1, false, 200);
INSERT INTO BOOK(`id`, `name`, `publisher_id`, `deleted`, `status`) values(3,'SpringBoot 올인원 패키지', 1, true, 100);
