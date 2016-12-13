package com.vuforia.samples.SampleApplication.utils;

public enum Directory {
    /**
     * 产品名称.
     */
    PRODUCT_NAME("ar"),

    SDCARD_PATH(android.os.Environment.getExternalStorageDirectory()
                                      .getAbsolutePath() + "/"),

    /**
     * 系统运行所需资源根目录.
     */
    ROOT_PATH(SDCARD_PATH.toString() + PRODUCT_NAME + "/"),

    /**
     * 数据库文件路径.
     */
    FILE_DB(ROOT_PATH + "database.db"),

    /**
     * 日志目录.
     */
    DIR_LOG(ROOT_PATH + "log/"),

    /**
     * 日志配置文件路径.
     */
    FILE_LOG_PROPERTY(ROOT_PATH + "logging.properties"),
    CACHE_VIEWSIMAGE(ROOT_PATH + "mediaTemp/"),
    //网络请求的缓存
    REQUITE_CATCH(ROOT_PATH+"netCatch/"),

    /**
     * 更新下载的apk路径
     */
    DOWN_LODE_APF_PATH(ROOT_PATH + "apk/");

    private String dirStr = "";


    Directory(String dirStr) {
        this.dirStr = dirStr;
    }


    @Override public String toString() {
        return dirStr;
    }


    private void setDir(String dir) {
        this.dirStr = dir;
    }
}
