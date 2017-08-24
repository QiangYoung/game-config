package com.yangqiang.beans;

import com.yangqiang.IConfig;
import com.yangqiang.annotation.Column;
import com.yangqiang.annotation.Config;
import com.yangqiang.annotation.Table;
import com.yangqiang.converters.IntegerArrayConverter;
import com.yangqiang.converters.IntegerMapConverter;
import lombok.Data;
import lombok.ToString;

import java.util.Map;

@ToString
@Data
@Config
@Table(name = "cfg_item", primaryKey = {"id", "secondId"}, header = 3, ignoreRow = {0, 1, 2})
public class ItemConfig implements IConfig {
    @Column(notNull = true)
    private int id;

    @Column(name = "id2")
    private String secondId;

    @Column({IntegerArrayConverter.class, IntegerMapConverter.class})
    private Map<Integer, Integer> map;

    @Column(name = "ints", value = IntegerArrayConverter.class)
    private int[] arrays;
}