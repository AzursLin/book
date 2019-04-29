package com.lxz.book.Control;

import com.lxz.book.Dao.UserRepository;
import com.lxz.book.Service.ShopService;
import com.lxz.book.Service.UserService;
import com.lxz.book.model.ShopInfo;
import com.lxz.book.model.UserInfo;
import com.lxz.book.model.WebResult;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2018/5/26 0026.
 */
@RestController
@RequestMapping("/api/")
@CrossOrigin
public class UserControl {
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserService userService;

/*    @ApiOperation(value="登录",tags={"登录"},notes="登录")
    @RequestMapping(value="/login", method= RequestMethod.POST)
    @ResponseBody
    public WebResult saveNewContact(@ApiParam(name="userName",value="用户id",required=true) String userName, @ApiParam(name="pass",value="密码") String pass) {
        UserInfo userInfo =  userRepository.getOneByName(userName);
        if (userInfo != null) {
            if ((DigestUtils.md5DigestAsHex(pass.getBytes())).equals(userInfo.getPsw())) {
                return new WebResult<>(WebResult.succCode,"登录成功");
            }
        }
        return new WebResult<>(WebResult.errCode,"用户名不存在或密码错误");
    }*/

    @ApiOperation(value="用户信息获取")
    @RequestMapping(value="/getUserList", method= RequestMethod.GET)
    @ResponseBody
    public WebResult getShopList(@ApiParam(name="pageNum",value="第N页",required=true) String pageNum) {
        Pageable pageable = PageRequest.of(Integer.parseInt(pageNum)-1,10);
        UserInfo userInfo = new UserInfo();
        Page<UserInfo> userInfoPage =  userService.findAllUserInfo(pageable,userInfo);
        return new WebResult(userInfoPage);
    }











}
