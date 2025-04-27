package com.example;

import com.example.mapper.UserMapper;
import com.example.model.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {
    private final UserMapper userMapper;

    public DataInitializer(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public void run(String... args) throws Exception {
        // 初始化测试数据
        userMapper.insert(new User(null, "张三", "zhangsan@example.com", "管理员", "活跃"));
        userMapper.insert(new User(null, "李四", "lisi@example.com", "用户", "活跃"));
        userMapper.insert(new User(null, "王五", "wangwu@example.com", "用户", "禁用"));
        userMapper.insert(new User(null, "赵六", "zhaoliu@example.com", "编辑", "活跃"));
        userMapper.insert(new User(null, "钱七", "qianqi@example.com", "审核员", "活跃"));
    }
}
