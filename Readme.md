## SpringBoot: Dependency Injection

#### What is Inversion Of Control(IOC)?

Technique of transferring control of object or parts of a program to the container/framework.  
Inversion of Control can be achieved through Strategy design pattern, Service Locator pattern, Factory pattern, and Dependency Injection (DI).

#### What is Dependency Injection(DI)?

Dependency Injection in Spring can be done through constructors, setters or fields.

**1. Constructor-Based Dependency Injection:**

The container will invoke a constructor with arguments each representing a dependency we want to set.
Spring resolves each argument primarily by type, followed by name of the attribute and index for disambiguation.

```
@Configuration
public class AppConfig {
 
    @Bean
    public Item item1() {
        return new ItemImpl1();
    }
 
    @Bean
    public Store store() {
        return new Store(item1());
    }
}
```
**Note:** The @Configuration annotation indicates that the class is a source of bean definitions. Also, we can add it to multiple configuration classes.

The @Bean annotation is used on a method to define a bean. If we don't specify a custom name, the bean name will default to the method name.

**2. Setter-Based Dependency Injection:**

For setter-based DI, the container will call setter methods of our class, after invoking a no-argument constructor or no-argument static factory method to instantiate the bean

```
@Bean
public Store store() {
    Store store = new Store();
    store.setItem(item1());
    return store;
}
```

**Note:** Constructor-based and setter-based types of injection can be combined for the same bean. 
The Spring documentation recommends using constructor-based injection for mandatory dependencies, and setter-based injection for optional ones.

**3. Field-Based Dependency Injection:**

In case of Field-Based DI, we can inject the dependencies by marking them with an @Autowired annotation:

```
public class Store {
    @Autowired
    private Item item; 
}
```

While constructing the Store object, if there's no constructor or setter method to inject the Item bean, the container will use reflection to inject Item into Store.


