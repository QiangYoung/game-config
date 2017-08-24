/**
 * 创建日期:  2017年08月22日 10:24
 * 创建作者:  杨 强  <281455776@qq.com>
 */
package com.yangqiang;

import java.util.List;

/**
 * 配置容器接口
 *
 * @author YangQiang
 */
public interface IConfigContainer {
    <T> T getConfig(Object key);

    <T> List<T> getList();
}
