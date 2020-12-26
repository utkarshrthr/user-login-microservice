package app.utk.ms.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
//@Conditional()
public class UserConfig {

    @Autowired
    private DatabaseConfig databaseConfig;

    @Primary
    @Bean(name = "dataSource")
    public DataSource dataSource(){
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName(databaseConfig.getDriver());
        dataSourceBuilder.url(databaseConfig.getUrl());
        dataSourceBuilder.username(databaseConfig.getUsername());
        dataSourceBuilder.password(databaseConfig.getPassword());
        return dataSourceBuilder.build();
    }
}
