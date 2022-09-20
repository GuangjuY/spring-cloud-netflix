package com.mochen.datasource.utils;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;

import java.io.File;
import java.util.Collections;
import java.util.Scanner;

public class CodeGeneratorUtil {

    /**
     * 全局配置
     */
    public static GlobalConfig globalConfig() {
        String outputDir = new File(System.getProperty("user.dir")) + "/monolith-complex/monolith-complex-swagger/src/main/java";
        return new GlobalConfig.Builder()
                .author("姚广举")
                .dateType(DateType.TIME_PACK)
                .commentDate("yyyy-MM-dd")
                .fileOverride()
                .outputDir(outputDir)
                .disableOpenDir()
                .build();
    }

    /**
     * 模板配置
     */
    public static TemplateConfig templateConfig() {
        return new TemplateConfig.Builder()
                .disable(TemplateType.ENTITY)
                .entity("/templates/entity.java")
                .controller("/templates/controller.java")
                .build();
    }

    /**
     * 数据库连接
     */
    public static DataSourceConfig dataSourceConfig() {
        return new DataSourceConfig.Builder("jdbc:mysql://120.27.63.0:3306/monolith?serverTimezone=Asia/Shanghai&characterEncoding=UTF-8", "root", "35f3eac33f6f79db")
                .typeConvert(new MySqlTypeConvert(){
                    @Override
                    public DbColumnType processTypeConvert(GlobalConfig globalConfig, String fieldType){
                        if(fieldType.toLowerCase().contains("tinyint")){
                            return DbColumnType.INTEGER;
                        }
                        if(fieldType.toLowerCase().contains("int")){
                            return DbColumnType.LONG;
                        }

                        return (DbColumnType) super.processTypeConvert(globalConfig,fieldType);
                    }
                })
                .build();
    }

    /**
     * 包名配置
     */
    public static PackageConfig packageConfig() {
        return new PackageConfig.Builder()
                .parent("com.mochen")
                .moduleName("swagger")
                .entity("entity.xdo")
                .pathInfo(Collections.singletonMap(OutputFile.mapperXml, new File(System.getProperty("user.dir")) + "/monolith-complex/monolith-complex-transaction/src/main/resources/mapper"))
                .build();

    }

    /**
     * 策略配置
     */
    public static StrategyConfig strategyConfig() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入表名，多个请用英文逗号隔开");
        String ipt = scanner.next();
        return new StrategyConfig.Builder()
                .addInclude(ipt.split(",")).mapperBuilder()
                .mapperBuilder()
                .superClass(BaseMapper.class)
                .enableMapperAnnotation()
                .enableMapperAnnotation()
                .entityBuilder()
                .enableTableFieldAnnotation()
                .formatFileName("%sDO")
                .enableLombok()
                .enableChainModel()
                .controllerBuilder()
                .enableRestStyle()
                .build();
    }

    public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator(dataSourceConfig())
                .strategy(strategyConfig())
                .global(globalConfig())
                .template(templateConfig())
                .packageInfo(packageConfig());
        mpg.execute();
    }
}
