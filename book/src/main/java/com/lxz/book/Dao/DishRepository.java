package com.lxz.book.Dao;


import com.lxz.book.model.Dish;
import com.lxz.book.model.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2018/5/26 0026.
 */
@Repository
public interface DishRepository extends JpaRepository<Dish,Long> {

}
