package com.lxz.book.Dao;


import com.lxz.book.model.ShopInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2018/5/26 0026.
 */
@Repository
public interface ShopInfoRepository extends JpaRepository<ShopInfo,Long> {
    @Query(value = "select * from user_info where shop_name=:shopName", nativeQuery = true)
    ShopInfo getOneByName(@Param("shopName") String shopName);
}
