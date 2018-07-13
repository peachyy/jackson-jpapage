

#### jackson-jpapage

场景：
* 当接口返回值`interface`的时候 如`jpa`的`page` `Page<User>`，`feign`调用报错
* 其它类似的错误 也可以利用这种方式 `画葫芦`


使用于`jpa`的`page`直接序列化/反序列化出现异常错误的问题。

当`Jackson`返回如下异常的时候 可以使用这种方式去修复 支持不修改任何代码 只新增
`
 Can not construct instance of org.springframework.data.domain.Page: abstract types either need to be mapped to concrete types, have custom deserializer, or contain additional type information
`

#### 使用方法

  引入依赖

```
    <dependency>
      <groupId>com.peachyy</groupId>
      <artifactId>jackson-jpapage</artifactId>
      <version>0.0.1-SNAPSHOT</version>
    </dependency>
```

 注解启用
 
```
@EnableJacksonJpaPage
```
 

 