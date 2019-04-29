package com.lxz.book.Service;

import com.lxz.book.Dao.ShopInfoRepository;
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
public class ShopService {
    @Autowired
    ShopInfoRepository shopInfoRepository;

    public Page<ShopInfo> findAllShopInfo(Pageable pageable,ShopInfo shopInfo) {
        ExampleMatcher matcher = ExampleMatcher.matching();
        Example<ShopInfo> example = Example.of(shopInfo ,matcher);
        return shopInfoRepository.findAll(example,pageable);
    }
}
