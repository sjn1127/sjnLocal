###目标
>将原先的SSM整合通过springboot的方式进行搭建

####1. 导入依赖
1. springmvc的依赖
2. mybatis的依赖
3. 数据库的依赖
4. 连接池的依赖

####2 配置
>按照我们的理解,springboot会帮我们配置很多固定的配置,比如用什么对象,用什么事务的管理对象
但是对于数据库来说,链接地址 springboot肯定不知道,然后我们自己写的mapper的位置,springboot也不会知道,这些东西我们需要告诉springboot