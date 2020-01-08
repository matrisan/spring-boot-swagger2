package com.github.springbootswagger2.controller;


import com.github.springbootswagger2.pojo.UserDO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ResponseHeader;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 创建时间为 19:42-2019-04-17
 * 项目名称 SpringBootSwagger2
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */

@Api(value = "用户Swagger2Controller")
@RestController
public class Swagger2Controller {

    @GetMapping("user/{id}")
    @ApiOperation(value = "获取单个用户value", httpMethod = "GET", notes = "获取单个用户notes")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "String", paramType = "path")
    public UserDO getOne(@ApiParam(value = "用户的 ID", required = true) @PathVariable String id) {
        UserDO user = new UserDO();
        user.setId(id);
        user.setName("name");
        return user;
    }


    @GetMapping("user")
    @ResponseHeader(name = "head1", description = "response head conf")
    @ApiResponses({
            @ApiResponse(code = 403, message = "禁止访问"),
            @ApiResponse(code = 404, message = "获取为空")
    })
    @ApiOperation(value = "获取所有用户", httpMethod = "GET", notes = "获取所有用户notes")
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


    @PostMapping("user")
    @ApiOperation(value = "新增单个用户", notes = "新增单个用户notes")
    public UserDO postUser(@RequestBody @Valid UserDO userDO) {
        return userDO;
    }


}
