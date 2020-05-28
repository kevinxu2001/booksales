package com.kevin.booksales;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class Swagger2Config {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())//用来创建该Api的基本信息
                .select()//select()函数返回一个ApiSelectorBuilder实例用来控制哪些接口暴露给Swagger来展现
                //为当前包路径,所有Controller所在的包路径
                .apis(RequestHandlerSelectors.basePackage("com.kevin.booksales.controller"))
                .paths(PathSelectors.any())
                .build();
    }
    //构建 api文档的详细信息函数
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //页面标题
                .title("Book Sales API")
                //创建人
                .contact(new Contact("Kevin Xu", "", "79596477@qq.com"))
                //版本号
                .version("1.0")
                //描述
                .description("图书出版商开发一个推广电子出版物的系统，每位上年度累计消费满10万的用户自动成为 VIP 会员，本年度电子图书消费打66折，付费88元的用户可成为付费会员，会员资格有效期内图书消费打88折。用户成功购买电子图书后，系统会为其增加图书最终售价 10%的积分，赞不考虑支付，付费会员下单成功视为支付成功，非付费会员拒绝下单。")
                .build();
    }
}