/**
 * 创建日期:  2017年08月12日 11:30
 * 创建作者:  杨 强  <281455776@qq.com>
 */
package com.yangqiang.excel.reader;


import com.yangqiang.BiConverter;
import com.yangqiang.IRowReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

/**
 * excel页list读取器 将行数据读取到list中
 *
 * @author YangQiang
 */
public class ExcelSheetListReader extends ExcelSheetReader<List> {

    public ExcelSheetListReader(Supplier<? extends List> resultSupplier) {
        this(resultSupplier, null);
    }

    public ExcelSheetListReader(Supplier<? extends List> resultSupplier, Map<Integer, IRowReader> rowReaders) {
        this(resultSupplier, new ExcelRowMapReader(HashMap::new), (list, objs) -> {
            Object[] params = (Object[]) objs;
            Object value = params[2];
            list.add(value);
            return list;
        }, rowReaders);
    }

    public ExcelSheetListReader(Supplier<? extends List> resultSupplier, IRowReader defaultRowReader, BiConverter<? super List, Object, ? extends List> rowParser, Map<Integer, IRowReader> rowReaders) {
        super(resultSupplier, defaultRowReader, rowParser, rowReaders);
    }
}
