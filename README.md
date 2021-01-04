# mybatis-generator-plugin
注意事项：
    1.mybatis-generator-config.xml节点的顺序不能改变，否则会报错
    2.若未获取到表注释，则在数据库url连接中添加&useInformationSchema=true
使用指南：

​1.将generator-jdbc.properties及mybatis-generator-config.xml复制至目标项目resources目录下，并修改相关配置:
        1.1.修改generator-jdbc.properties中的驱动jar包路径、数据库路径及账号密码
        1.2.修改javaModelGenerator、javaClientGenerator的包路径

​2.在目标项目pom文件中，plugins节点下添加mybatis-generator-maven-plugin插件，并将本脚本项目添加进依赖，如下：

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
            <version>1.0.0</version>
        </dependency>
    </dependencies>
</plugin>
```
3.在脚本项目中，执行mvn clean install将本脚本jar安装到maven仓库中

4.在目标项目中，执行mvn mybaits-generator:generate,完成代码生成
