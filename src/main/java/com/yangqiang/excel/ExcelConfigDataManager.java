/**
 * 创建日期:  2017年08月21日 18:08
 * 创建作者:  杨 强  <281455776@qq.com>
 */
package com.yangqiang.excel;

import com.yangqiang.FileConfigDataManagerConfig;
import com.yangqiang.FileConfigDataManager;
import com.yangqiang.IConfigWrapper;
import com.yangqiang.beans.TableDesc;

import java.io.File;

/**
 * excel配置管理器
 *
 * @author YangQiang
 */
public class ExcelConfigDataManager extends FileConfigDataManager {
    public ExcelConfigDataManager() {
    }

    public ExcelConfigDataManager(FileConfigDataManagerConfig config) {
        super(config);
    }

    public IConfigWrapper parseTableDesc(TableDesc tableDesc) {
        String configFile = getConfigFileDir() + File.separatorChar + tableDesc.getName() + getConfigFileSuffix();
        return new ExcelConfigWrapper(configFile, tableDesc).build();
    }
}
