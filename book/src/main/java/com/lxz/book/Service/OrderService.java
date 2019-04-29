package com.lxz.book.Service;

import com.lxz.book.Dao.DishRepository;
import com.lxz.book.Dao.OrderRepository;
import com.lxz.book.model.Dish;
import com.lxz.book.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/6/2 0002.
 */
@Service
public class OrderService {
    @Autowired
    OrderRepository repository;

    public Page<Order> findAll(Pageable pageable) {
        return repository.getListOderByStatus(pageable);
    }

    public Order save(Order order) {
        return repository.save(order);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

}
