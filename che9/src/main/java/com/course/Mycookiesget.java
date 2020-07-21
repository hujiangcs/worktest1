
package com.course;
import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;



public class Mycookiesget {
    private   String url;
    private ResourceBundle   bundle;
    private   CookieStore  store;
    // private         ;
    @BeforeTest
    public   void beforTest(){
        bundle  = ResourceBundle.getBundle("app" , Locale.CANADA);
        url =bundle.getString("test.url");
    }
    @Test
    public   void   testGetCookes() throws IOException {
        String reslut;
//从配置文件中拼接测试url
        String uri;
        String testUrl;
        uri = bundle.getString("getCookies.uri");
        testUrl = this.url + uri;

        //测试代码逻辑
        HttpGet get = new HttpGet(testUrl);
        DefaultHttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        reslut = EntityUtils.toString(response.getEntity(), "UTF-8");
        System.out.println(reslut);
//获取cookies信息
        this.store = client.getCookieStore();

        List<Cookie> cookieList = store.getCookies();
        if (cookieList != null) {
            for (Cookie cookie : cookieList) {
                String name = cookie.getName();
                String value = cookie.getValue();
                System.out.print("cookie name = " + name + ";  cookie value = " + value);
            }
        }
    }
@Test(dependsOnMethods = {"testGetCookes"})

public void  testGetWithCookies() throws IOException {
String  uri;
    String  testUrl;
  uri =bundle.getString("test.get.with.cookies");
testUrl = this.url+uri;
HttpGet  get = new HttpGet(testUrl);
DefaultHttpClient  client =new DefaultHttpClient();
//设置cookies信息
    client.setCookieStore(this.store);
    HttpResponse  response =    client.execute(get);
            //获取状态码
    int  statusCode;
    statusCode   =response.getStatusLine().getStatusCode();
    System.out.println("code:"+statusCode);
if (statusCode==200){
String reslut ;
    reslut = EntityUtils.toString(response.getEntity(), "UTF-8");
    System.out.println(reslut);
                }
    }
}




