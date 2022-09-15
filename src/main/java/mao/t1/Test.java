package mao.t1;

import java.util.Collections;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Project name(项目名称)：java并发编程_ConcurrentLinkedQueue
 * Package(包名): mao.t1
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/9/15
 * Time(创建时间)： 20:17
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    public static void main(String[] args)
    {
        Queue<Integer> queue = new ConcurrentLinkedQueue<>();

        for (int i = 0; i < 10; i++)
        {
            System.out.println("入队：" + i + "，结果：" + queue.offer(i));
        }

        for (int i = 0; i < 10; i++)
        {
            System.out.println("出队："+ queue.poll());
        }

    }
}
