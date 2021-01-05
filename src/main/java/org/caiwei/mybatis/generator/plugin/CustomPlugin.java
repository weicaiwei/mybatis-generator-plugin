package org.caiwei.mybatis.generator.plugin;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.Plugin;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.api.dom.xml.XmlElement;

import java.time.LocalDate;
import java.util.List;

/**
 * 自定意插件，可以控制相关文件的生成规则，给文件头部加引入jar包、注解、注释等
 *
 * @auther caiwei
 * @date 2020-11-24
 */
public class CustomPlugin extends PluginAdapter {

    //每个插件必须实现，具体的就是插件执行中的警告信息，该插件的配置信息是否完备等
    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }

    @Override
    public boolean clientGenerated(Interface interfaze, TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        //为mapper文件添加注释
        JavaElementCommentHandler.addTopComment(interfaze,introspectedTable," Mapper");
        //添加import包
        interfaze.addImportedType(new FullyQualifiedJavaType("org.apache.ibatis.annotations.Mapper"));
        interfaze.addImportedType(new FullyQualifiedJavaType("org.springframework.stereotype.Repository"));
        //添加注解
        interfaze.addAnnotation("@Mapper");
        interfaze.addAnnotation("@Repository");
        return true;
    }

    @Override
    public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        //添加lombok @Data注解
        topLevelClass.addImportedType(new FullyQualifiedJavaType("lombok.Data"));
        topLevelClass.addAnnotation("@Data");
        //添加实现序列化
        topLevelClass.addImportedType(new FullyQualifiedJavaType("java.io.Serializable"));
        topLevelClass.addSuperInterface(new FullyQualifiedJavaType("java.io.Serializable"));

        return true;
    }

    @Override
    public boolean clientUpdateByPrimaryKeySelectiveMethodGenerated(Method method, Interface interfaze, IntrospectedTable introspectedTable) {
        //不生成mapper.java选择性更新方法（selectiveUpdate选择性更新，则为null的字段不更新，字段还为旧值）
        return false;
    }

    @Override
    public boolean sqlMapUpdateByPrimaryKeySelectiveElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        //不生成mapper.xml选择性更新方法（selectiveUpdate选择性更新，则为null的字段不更新，字段还为旧值）
        return false;
    }

    @Override
    public boolean clientInsertSelectiveMethodGenerated(Method method, Interface interfaze, IntrospectedTable introspectedTable) {
        //不生成mapper.java选择性插入方法（selectiveInsert选择性插入，则为null的字段不插入，会使用数据库的默认值）
        return false;
    }

    @Override
    public boolean sqlMapInsertSelectiveElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        //不生成mapper.xml选择性插入方法（selectiveInsert选择性插入，则为null的字段不插入，会使用数据库的默认值）
        return false;
    }

    @Override
    public boolean modelGetterMethodGenerated(Method method, TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn, IntrospectedTable introspectedTable, Plugin.ModelClassType modelClassType) {
        //不生成do的get方法
        return false;
    }

    @Override
    public boolean modelSetterMethodGenerated(Method method, TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn, IntrospectedTable introspectedTable, Plugin.ModelClassType modelClassType) {
        //不生成do的set方法
        return false;
    }

}
