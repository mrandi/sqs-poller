package io.github.mrandi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.cloud.aws.autoconfigure.cache.ElastiCacheAutoConfiguration;
import org.springframework.cloud.aws.autoconfigure.context.ContextStackAutoConfiguration;
import org.springframework.cloud.aws.autoconfigure.jdbc.AmazonRdsDatabaseAutoConfiguration;
import org.springframework.cloud.aws.autoconfigure.mail.MailSenderAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableAutoConfiguration(exclude = {
        ElastiCacheAutoConfiguration.class,
        AmazonRdsDatabaseAutoConfiguration.class,
        MailSenderAutoConfiguration.class,
        ContextStackAutoConfiguration.class,
        SecurityAutoConfiguration.class,
})
@ComponentScan
@EnableScheduling
//@SpringBootApplication
public class SqspollerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SqspollerApplication.class, args);
    }
}
