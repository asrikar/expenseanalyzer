package com.asrikar.expenseanalyzer.component;

import com.asrikar.expenseanalyzer.object.ExpenseRecord;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisComponents {

    @Bean
    public RedisTemplate<Long, ExpenseRecord> redisTemplate(RedisConnectionFactory connectionFactory) {
        RedisTemplate<Long, ExpenseRecord> template = new RedisTemplate<Long, ExpenseRecord>();
        template.setConnectionFactory(connectionFactory);
        // Add some specific configuration here. Key serializers, etc.
        return template;
    }
}
