package com.lxz.book.Control;

import com.lxz.book.Dao.UserRepository;
import com.lxz.book.Service.DishService;
import com.lxz.book.Service.OrderService;
import com.lxz.book.Service.ShopService;
import com.lxz.book.model.Dish;
import com.lxz.book.model.ShopInfo;
import com.lxz.book.model.UserInfo;
import com.lxz.book.model.WebResult;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/dish/")
@CrossOrigin
public class DishControl {
    @Autowired
    DishService service;

    @RequestMapping(value = "/getList", method = RequestMethod.GET)
    @ResponseBody
    public WebResult getList(@ApiParam(name = "pageNum", value = "第N页", required = true) String pageNum) {
        Pageable pageable = PageRequest.of(Integer.parseInt(pageNum) - 1, 10);
        return new WebResult(service.findAll(pageable));
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public WebResult save(@RequestBody Dish entity) {
        return new WebResult(service.save(entity));
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    @ResponseBody
    public WebResult delete(@ApiParam(name = "id", required = true) Long id) {
        service.delete(id);
        return new WebResult(null);
    }
}

