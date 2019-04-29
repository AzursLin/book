package com.lxz.book.Dao;


import com.lxz.book.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2018/5/26 0026.
 */
@Repository
public interface UserRepository extends JpaRepository<UserInfo,Long> {
    @Query(value = "select * from user_info where user_name=:userName", nativeQuery = true)
    UserInfo getOneByName(@Param("userName") String userName);
}
