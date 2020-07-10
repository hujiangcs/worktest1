package httpdemo;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.testng.*;
public class MyhttpClient {

    @Test
    public   void  test1(){
        //用来存放结果
        String  result;
        HttpGet  get =new HttpGet("http://www.baidu.com");
        HttpClient  client =new DefaultHttpClient();


    }
}
