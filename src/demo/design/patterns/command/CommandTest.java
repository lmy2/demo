/*
 * �ļ�����CommandTest.java
 * ��Ȩ��Copyright by citycloud.com.cn
 * ������
 * �޸��ˣ�liumy
 * �޸�ʱ�䣺2017��3��16��
 * ��������ţ�
 * �޸�����ţ�
 * �޸����ݣ�
 */

package demo.design.patterns.command;
//����ģʽ��Ŀ�ľ��Ǵﵽ����ķ����ߺ�ִ����֮����
//ʵ�������ִ�зֿ�����ϤStruts��ͬѧӦ��֪����
//Struts��ʵ����һ�ֽ�����ͳ��ַ���ļ��������б�Ȼ�漰����ģʽ��˼�룡
public class CommandTest
{

        
        public static void main(String[] args) { 
            //��������
            Receiver receiver = new Receiver();  
            //�������
            Command cmd = new MyCommand(receiver);  
            //��������
            Invoker invoker = new Invoker(cmd);  
            invoker.action();  
        }  
     
}
