/*
 * 文件名：Singleton.java
 * 版权：Copyright by citycloud.com.cn
 * 描述：
 * 修改人：liumy
 * 修改时间：2017年3月16日
 * 跟踪问题号：
 * 修改问题号：
 * 修改内容：
 */

package demo.design.patterns.singleton;

public class Singleton
{
    private static Singleton instance = null;  
    /* 私有构造方法，防止被实例化 */  
    private Singleton() {  
    }  
  /*多线程下，加同步锁，防止同时创建多个实例*/
    private static synchronized void syncInit() {  
        if (instance == null) {  
            instance = new Singleton();  
        }  
    }  
  
    public static Singleton getInstance() {  
        //第一次时候创建实例
        if (instance == null) {  
            syncInit();  
        }  
        return instance;  
    }
}
