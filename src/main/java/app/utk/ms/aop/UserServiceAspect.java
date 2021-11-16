package app.utk.ms.aop;

import app.utk.ms.entity.EntityMetaData;
import app.utk.ms.entity.User;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

/**
 * @author UtkarshRathore on 16-11-2021
 **/
@Aspect
@Configuration
public class UserServiceAspect {

    @Around("execution(* app.utk.ms.service.UserServiceImpl.addUser(..))")
    public void beforeSave(ProceedingJoinPoint joinPoint) throws Throwable {
        User user = ((User)joinPoint.getArgs()[0]);
        user.setEntityMetaData(getEntityMetaData());
        joinPoint.proceed(new Object[]{user});
    }

    private EntityMetaData getEntityMetaData(){
        EntityMetaData metaData = new EntityMetaData();
        metaData.setCreationTimeStamp(LocalDateTime.now());
        metaData.setUpdationTimeStamp(LocalDateTime.now());
        return metaData;
    }
}
