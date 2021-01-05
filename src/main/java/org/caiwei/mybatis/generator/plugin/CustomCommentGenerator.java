package org.caiwei.mybatis.generator.plugin;

import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.api.dom.xml.XmlElement;

import java.time.LocalDate;
import java.util.Properties;
import java.util.Set;

/**
 * 自定义注释生成器
 * </>
 * 此接口的实现用于为各种生成的文件生成注释
 *
 * @auther caiwei
 * @date 2020-11-24
 */
public class CustomCommentGenerator implements CommentGenerator {


    /**
     * 从CommentGenerator配置中配置的任何属性中为此实例添加属性。
     * @param properties 配置
     */
    @Override
    public void addConfigurationProperties(Properties properties) {

    }

    /**
     * 该向指定的字段添加一个Javadoc注释。该字段与指定的表相关，用于保存指定列的值。
     * @param field 字段
     * @param introspectedTable 表
     * @param introspectedColumn 列
     */
    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {

       JavaElementCommentHandler.addFieldComment(field,introspectedColumn);
    }

    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable) {

    }

    @Override
    public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        JavaElementCommentHandler.addTopComment(topLevelClass, introspectedTable, " Do");
    }

    @Override
    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable) {
    }

    @Override
    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable, boolean markAsDoNotDelete) {

    }

    @Override
    public void addEnumComment(InnerEnum innerEnum, IntrospectedTable introspectedTable) {

    }

    @Override
    public void addGetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {

    }

    @Override
    public void addSetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {

    }

    @Override
    public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {

    }

    /**
     * 调用此方法将文件级注释添加到生成的java文件中。此方法可用于添加一般的文件注释(如版权声明)。
     * </>
     * 但是，请注意Eclipse中的Java文件合并函数并不处理此注释。如果重复运行生成器，则只保留初始运行时的注释。
     * @param compilationUnit 这个接口描述了所有Java编译单元(Java类、接口和枚举)共有的方法
     */
    @Override
    public void addJavaFileComment(CompilationUnit compilationUnit) {

    }

    /**
     * 该方法应该添加适当的注释，作为指定的xmlElement的子元素，以警告用户该元素已经生成，并且可能会被重新生成。
     * @param xmlElement xml元素
     */
    @Override
    public void addComment(XmlElement xmlElement) {

    }

    /**
     * 调用此方法以添加注释作为根元素的第一个子元素。此方法可用于添加一般的文件注释(如版权声明)。
     * </>
     * 但是，请注意，XML文件合并函数不处理此注释。如果重复运行生成器，则只保留初始运行时的注释。
     * @param rootElement 根节点
     */
    @Override
    public void addRootComment(XmlElement rootElement) {

    }

    @Override
    public void addGeneralMethodAnnotation(Method method, IntrospectedTable introspectedTable, Set<FullyQualifiedJavaType> imports) {

    }

    @Override
    public void addGeneralMethodAnnotation(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn, Set<FullyQualifiedJavaType> imports) {

    }

    @Override
    public void addFieldAnnotation(Field field, IntrospectedTable introspectedTable, Set<FullyQualifiedJavaType> imports) {

    }

    @Override
    public void addFieldAnnotation(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn, Set<FullyQualifiedJavaType> imports) {

    }

    @Override
    public void addClassAnnotation(InnerClass innerClass, IntrospectedTable introspectedTable, Set<FullyQualifiedJavaType> imports) {

    }

}
