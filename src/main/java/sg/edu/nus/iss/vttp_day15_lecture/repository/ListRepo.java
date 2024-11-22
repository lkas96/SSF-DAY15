package sg.edu.nus.iss.vttp_day15_lecture.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import sg.edu.nus.iss.vttp_day15_lecture.utils.Util;

@Repository
public class ListRepo {
    @Autowired
    @Qualifier(Util.template02) //Since its using template02 in the redisconfig and it is set to string object
    RedisTemplate<String, Object> template;

    //Slide 30
    public void leftPush(String key, String value){
        template.opsForList().leftPush(key, value);
    }

    public void rightPush(String key, String value){
        template.opsForList().rightPush(key, value);
    }

    //Slide 31
    public void leftPop(String key){
        template.opsForList().leftPop(key, 1);
    }

    public void rightPop(String key){
        template.opsForList().rightPop(key);
    }

    //Slide 32
    public String get(String key, Integer index){
        return template.opsForList().index(key, index).toString();
    }

    //Slide 33
    public Long size(String key){
        return template.opsForList().size(key);
    }
    
    //List the items
    public List<Object> getList(String key){
        List<Object> list = template.opsForList().range(key, 0, -1);
        return list;
    }

    //Delete particular item
    public Boolean deleteItem(String key, String valueToBeDelete){
        Boolean isDeleted = false;

        Long isFound = template.opsForList().indexOf(key, valueToBeDelete);

        if (isFound >= 0){
            template.opsForList().remove(key, isFound, valueToBeDelete);
            isDeleted = true;
        }

        return isDeleted;
    }
}
