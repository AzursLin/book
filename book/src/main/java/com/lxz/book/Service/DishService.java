package com.lxz.book.Service;

import com.lxz.book.Dao.DishRepository;
import com.lxz.book.Dao.ShopInfoRepository;
import com.lxz.book.model.Dish;
import com.lxz.book.model.ShopInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/6/2 0002.
 */
@Service
public class DishService {
    @Autowired
    DishRepository repository;

    public Page<Dish> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Dish save(Dish dish) {
        return repository.save(dish);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

}
