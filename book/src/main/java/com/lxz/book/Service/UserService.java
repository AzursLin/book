package com.lxz.book.Service;

import com.lxz.book.Dao.ShopInfoRepository;
import com.lxz.book.Dao.UserRepository;
import com.lxz.book.model.ShopInfo;
import com.lxz.book.model.UserInfo;
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
public class UserService {
    @Autowired
    UserRepository userRepository;

    public Page<UserInfo> findAllUserInfo(Pageable pageable, UserInfo userInfo) {
        ExampleMatcher matcher = ExampleMatcher.matching();
        Example<UserInfo> example = Example.of(userInfo ,matcher);
        return userRepository.findAll(pageable);
    }
}
