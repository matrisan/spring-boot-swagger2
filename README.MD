
# 一.什么是

编写和维护接口文档是每个程序员的职责.
根据 Swagger2 可以快速帮助我们编写最新的API接口文档，
再也不用担心开会前仍忙于整理各种资料了，间接提升了团队开发的沟通效率。
常用注解swagger通过注解表明该接口会生成文档，包括接口名、请求方法、参数、返回信息的等等。
(自动生成文档和测试接口的ui)

# 二.为什么

##1.优点

简单, 实时, 可测试, 容易管理

##2.解决的痛点

###a.接口参数更改,文档更新不实时;
###b.调用方与被调用方减少沟通成本;
###c.代码写完即可立刻测试

# 三.怎么做

##1.加入官方依赖
```
<swagger.version>2.9.2</swagger.version>

<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger2</artifactId>
    <version>${swagger.version}</version>
</dependency>

<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger-ui</artifactId>
    <version>${swagger.version}</version>
</dependency>
```
##2.加入spring中间件

```
<dependency>
    <groupId>com.spring4all</groupId>
    <artifactId>swagger-spring-boot-starter</artifactId>
    <version>1.9.0.RELEASE</version>
</dependency>

```


浏览器访问地址
http://127.0.0.1:8080/swagger-ui.html





# 四.流程图

```mermaid
graph TD;
    A-->B;
    A-->C;
    B-->D;
    C-->D;
```






