package leetcode_05;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class mmmm {
        public static void main(String[] args) throws IOException {
            //        StringBuilder sb = new StringBuilder();
//        sb.append("[User(carnum=6222021 carname=张三， carpw=123456， money=123) User(carnum=6222022 carname=李四，carpw=123456，money=123)]");
//        sb.append("[user(carnum=6222021，carname=张三，carpw=123456,money=123),User(carnum=6222022,carname=李四，carpw=123456,money=123)]]");
//
//        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("C:\\Users\\JMM\\Desktop\\user.dat"));
//        System.out.println(sb.toString().getBytes());
//        outputStream.write(sb.toString().getBytes());

            BufferedInputStream bufferedInput = null;
            byte[] buffer = new byte[1024];
            //创建BufferedInputStream 对象
            bufferedInput = new BufferedInputStream(new FileInputStream("C:\\Users\\JMM\\Desktop\\user.dat"));
            int bytesRead = 0;
            //从文件中按字节读取内容，到文件尾部时read方法将返回-1
            while ((bytesRead = bufferedInput.read(buffer)) != -1) {
                //将读取的字节转为字符串对象
                String chunk = new String(buffer, 0, bytesRead);
                System.out.print(chunk);
            }
        }
}
