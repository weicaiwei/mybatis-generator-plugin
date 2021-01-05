package org.caiwei.mybatis.generator.plugin;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.JavaElement;

import java.time.LocalDate;

/**
 * 注释添加器
 *
 * @auther caiwei
 * @date 2021-01-05
 */
public class JavaElementCommentHandler {

    /**
     * 添加类注释
     *
     * @param javaElement java元素
     * @param introspectedTable 表元素
     * @param suffix 后缀
     */
    static void addTopComment(JavaElement javaElement, IntrospectedTable introspectedTable, String suffix) {
        javaElement.addJavaDocLine("/**");
        javaElement.addJavaDocLine(" * " + introspectedTable.getRemarks() + suffix);
        javaElement.addJavaDocLine(" * ");
        javaElement.addJavaDocLine(" * @date " + LocalDate.now().toString());
        javaElement.addJavaDocLine(" */");
    }

    /**
     * 添加属性注释
     * @param field 属性
     * @param introspectedColumn 列元素
     */
    static void addFieldComment(Field field, IntrospectedColumn introspectedColumn) {
        field.addJavaDocLine("/**");
        field.addJavaDocLine(" * " + introspectedColumn.getRemarks());
        field.addJavaDocLine(" */");
    }

}
