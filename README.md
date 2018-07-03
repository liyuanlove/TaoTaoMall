## 分布式
需要系统之间配合才能完成整个业务逻辑，就是分布式系统。

## Maven除了依赖管理，项目构建功能之外，还能对工程进行聚合、继承、依赖

- 分布式架构，父工程应该是一个`pom`工程，其中定义依赖的Jar包的版本信息、Maven插件的版本信息。（只有版本信息，没有实际的Jar包/插件）

- 创建Common`Jar`工程，存放通用工具类

## 数据库
项目的实际运行如果是**高并发**的，对数据库的查询最好是**单表查询**，提高数据处理效率。
对数据库表进行**冗余存储**，解决表的关联需求。（业务量增大到一定程度后，需要对数据库进行**分库分表**，单表查询就很方便）

## 前端显示EasyUI


## Dubbo管理服务层和表现层的通信


### Dubbo监控中心（war包）
Linux中，放到tomcat的webapps目录下

如果监控中心和注册中心在同一台服务器上，无需任何配置。如果不在同一台服务器，需要修改配置文件：
`tomcat安装目录/webapps/dubbo-admin/WEB-INF/dubbo.properties`





	

