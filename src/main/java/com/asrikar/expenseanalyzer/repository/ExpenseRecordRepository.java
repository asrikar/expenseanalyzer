package com.asrikar.expenseanalyzer.repository;

import com.asrikar.expenseanalyzer.object.ExpenseRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

public class ExpenseRecordRepository {

    @Autowired
    private RedisTemplate<Long, ExpenseRecord> redisTemplate;

    public void save(ExpenseRecord book) {
        redisTemplate.opsForValue().set(book.getId(), book);
    }

    public ExpenseRecord findById(Long id) {
        return redisTemplate.opsForValue().get(id);
    }
}
