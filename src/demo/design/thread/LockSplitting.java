/*
 * �ļ�����LockSplitting.java
 * ��Ȩ��Copyright by citycloud.com.cn
 * ������
 * �޸��ˣ�liumy
 * �޸�ʱ�䣺2017��3��17��
 * ��������ţ�
 * �޸�����ţ�
 * �޸����ݣ�
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
