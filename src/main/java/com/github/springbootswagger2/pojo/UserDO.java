package com.github.springbootswagger2.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

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


@Getter
@Setter
@ApiModel(value = "User", description = "用户实体类")
public class UserDO {

    @ApiModelProperty(value = "用户的ID", required = true)
    private String id;

    private String name;

    @Override
    public String toString() {
        return "UserDO{" + "id='" + id + '\'' + ", name='" + name + '\'' + '}';
    }
}
