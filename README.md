# RestEasy 使用例子


目录结构：


1. 在SpringBoot工程中导入Maven依赖：
```
<dependency>
	<groupId>javax.ws.rs</groupId>
	<artifactId>javax.ws.rs-api</artifactId>
	<version>2.0</version>
</dependency>

<dependency>
	<groupId>com.paypal.springboot</groupId>
	<artifactId>resteasy-spring-boot-starter</artifactId>
	<version>2.3.4-RELEASE</version>
	<scope>runtime</scope>
</dependency>
```

2. 注册JAX-RS应用类
```
@Component
@ApplicationPath("/sample-app/")
public class JaxrsApplication extends Application {
}
```
**注意：被继承的Application类属于`javax.ws.rs.core`包**

3. 在SpringBoot配置文件中配置JAX-RS应用类（application.properties）:
```
server.port=8081
resteasy.jaxrs.app.registration=property
resteasy.jaxrs.app.classes=com.example.demo.JaxrsApplication
```

4. Controller例子
```
@Path("/item")
@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    @POST
    @Consumes({MediaType.TEXT_PLAIN})
    @Produces({MediaType.APPLICATION_JSON})
    public Item findByName(String data) {
        System.out.println("data->>>>>" + data);
        return itemService.findByName(data);
    }

    @Path("/{id}")
    @GET
    @Consumes({MediaType.TEXT_PLAIN})
    @Produces({MediaType.APPLICATION_JSON})
    public Item findById(@PathParam("id") String data) {
        System.out.println("data->>>>>" + data);
        return itemService.findById(data);
    }
}
```
类前需要使用`@Path`注解作为RestEasy的标识；
`@POST` 和 `@GET` 注解分别代表请求的类型为 post 和 get ；
`@Consumes` 代表请求的数据格式；
`@Produces` 代表响应的数据格式。
使用 `@PathParam` 获取GET请求当中的内容，`@PathParam` 中的value需要和 `@Path` 的value相同。

