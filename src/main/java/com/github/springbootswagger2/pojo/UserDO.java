package com.github.springbootswagger2.pojo;

import com.alibaba.fastjson.JSON;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.concurrent.TimeUnit;

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


@Getter
@Setter
@ApiModel(value = "User", description = "用户实体类")
public class UserDO {

    @NotBlank
    @ApiModelProperty(value = "用户的ID", required = true)
    private String id;

    @NotBlank
    @ApiModelProperty(value = "用户名", required = true)
    private String name;

    @NotNull
    @ApiModelProperty(value = "用户名", required = true)
    private TimeUnit timeUnit;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

}
