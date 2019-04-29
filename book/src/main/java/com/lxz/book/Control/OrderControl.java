package com.lxz.book.Control;

import com.lxz.book.Service.OrderService;
import com.lxz.book.model.Dish;
import com.lxz.book.model.Order;
import com.lxz.book.model.WebResult;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order/")
@CrossOrigin
public class OrderControl {
    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/getList", method = RequestMethod.GET)
    @ResponseBody
    public WebResult getList(@ApiParam(name = "pageNum", value = "第N页", required = true) String pageNum) {
        Pageable pageable = PageRequest.of(Integer.parseInt(pageNum) - 1, 10);
        return new WebResult(orderService.findAll(pageable));
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public WebResult save(@RequestBody Order entity) {
        return new WebResult(orderService.save(entity));
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    @ResponseBody
    public WebResult delete(@ApiParam(name = "id", required = true) Long id) {
        orderService.delete(id);
        return new WebResult(null);
    }
}

