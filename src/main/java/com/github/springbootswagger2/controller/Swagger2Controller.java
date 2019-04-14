package com.github.springbootswagger2.controller;


import com.github.springbootswagger2.pojo.UserDO;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 创建时间为 19:44-2019-02-25
 * 项目名称 SpringBootSwagger2
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */

@RestController
public class Swagger2Controller {

    @GetMapping("user/{id}")
    @ApiOperation(value = "获取单个用户value",notes = "获取单个用户notes")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "String", paramType = "path")
    public UserDO getOne(@ApiParam("用户的 ID") @PathVariable String id) {
        UserDO user = new UserDO();
        user.setId(id);
        user.setName("name");
        return user;
    }

    @GetMapping("user")
    public List<UserDO> getUserList() {
        List<UserDO> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            UserDO user = new UserDO();
            user.setId(i + "");
            user.setName("name" + i);
            list.add(user);
        }
        return list;
    }


}
