package com.lxz.book.Dao;


import com.lxz.book.model.OrderDish;
import com.lxz.book.model.ShopInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2018/5/26 0026.
 */
@Repository
public interface OrderDishRepository extends JpaRepository<OrderDish,Long> {

}
