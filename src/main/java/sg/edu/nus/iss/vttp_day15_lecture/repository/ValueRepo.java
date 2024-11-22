package sg.edu.nus.iss.vttp_day15_lecture.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import sg.edu.nus.iss.vttp_day15_lecture.utils.Util;

@Repository
public class ValueRepo {
    //Slide 20
    @Autowired
    @Qualifier(Util.template01)
    RedisTemplate<String, String> template;

    //Create/update a value
    public void createValue(String key, String value){
        template.opsForValue().set(key, value);
    }

    //retrieve a value
    public String getValue(String key){
        return template.opsForValue().get(key);
    }

    //Slide 27 delete
    public void deleteValue(String key){
        template.delete(key);
    }

    //Slide 28 exists
    public Boolean checkExists(String key){
        return template.hasKey(key);
    }

    //Slide 26
    //increment value only works for key with integer value
    public void incrementValue(String key){
        template.opsForValue().increment(key, 1);
    }

    public void decrementValue(String key){
        template.opsForValue().decrement(key, 1);
    }

    
    
}