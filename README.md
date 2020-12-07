# mybatis-generator-plugin
使用指南：

​	1.将generator-jdbc.properties及mybatis-generator-config.xml复制至项目resources目录下，并修 	   改相关配置

​	2.在pom文件，plugins节点下添加mybatis-generator-maven-plugin插件，并将本项目添加进依	     	   赖，如下：

```
<plugin>
    <groupId>org.mybatis.generator</groupId>
    <artifactId>mybatis-generator-maven-plugin</artifactId>
    <version>1.3.7</version>
    <configuration>
        <!--配置文件的位置-->
        <configurationFile>src/main/resources/mybatis-generator-config.xml</configurationFile>
        <verbose>true</verbose>
        <overwrite>true</overwrite>
    </configuration>
    <dependencies>
        <!--由于是仓库依赖，需要将本项目安装到本地仓库-->
        <dependency>
            <groupId>org.caiwei</groupId>
            <artifactId>mybatis-generator</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
    </dependencies>
</plugin>
```

3.执行mvn mybaits-generator:generate,完成代码生成