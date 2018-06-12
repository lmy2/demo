/*
 * 文件名：LockSplitting.java
 * 版权：Copyright by citycloud.com.cn
 * 描述：
 * 修改人：liumy
 * 修改时间：2017年3月17日
 * 跟踪问题号：
 * 修改问题号：
 * 修改内容：
 */

package demo.design.thread;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class LockSplitting implements Runnable
{
    private static final int NUMBER_OF_THREADS = 5;
    private static final Map<String, Integer> map = new HashMap<String, Integer>();
    @Override
    public void run() {
        for (int i = 0; i <10000; i++) {
            synchronized (map) {
                UUID randomUUID = UUID.randomUUID();
                Integer value = Integer.valueOf(42);
                String key = randomUUID.toString();
                map.put(key, value);
            }
            Thread.yield();
        }
    }

}
