package com.zoo.homeport;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Bear.
 * User: RAU
 * Date: 2020-06-11
 * Github: https://github.com/rauohon
 * 설명:
 */
@RequiredArgsConstructor
@SpringBootApplication
public class HomeportApplication implements CommandLineRunner {

    private final ShopRepository shopRepository;
    private final ItemRepository itemRepository;

    @Override
    public void run(String... args) throws Exception {
        shopRepository.save(new Shop("jojoldu", "jojoldu.tistory.com"));
        itemRepository.save(new Item("jojoldu's Github", 1000));
    }

    public static void main(String[] args) {
        SpringApplication.run(HomeportApplication.class, args);
    }

}
