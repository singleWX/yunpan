package cc.wxyun.yunpan;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 */
@EnableAutoConfiguration
@MapperScan("cc.wxyun.yunpan.entity.mapper")
@ComponentScan("cc.wxyun.yunpan")
@SpringBootApplication
public class App {


    public static void main(String[] args){
        SpringApplication.run(App.class, args);
    }

}
