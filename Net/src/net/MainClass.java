package net;

import java.awt.image.BufferedImageFilter;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class MainClass {

	public static void main(String[] args) {
		try {

			
			URL url=new URL("http://www.baidu.com/");
			System.out.println("getProtocol:"+url.getProtocol());//getProtocol:http
			System.out.println("getHost:"+url.getHost());//getHost:192.168.2.104
			System.out.println("getPort:"+url.getPort());//getPort:8080
			System.out.println("getPath:"+url.getPath());//getPath:/myweb/demo.html
			System.out.println("getFile:"+url.getFile());//
			System.out.println("getQuery:"+url.getQuery());
			URLConnection conn=url.openConnection();
			System.out.println(conn);
			InputStream in=conn.getInputStream();
			InputStreamReader isr = new InputStreamReader(in,"UTF-8");// 字符流
			BufferedReader br = new BufferedReader(isr);// 缓冲流
			 String str = null;
			 
			byte[]buf=new byte[1024];
			int len=in.read(buf);
			System.out.println(new String(buf,"UTF-8"));
			
		  File file = new File("f:/baidu.html");
			if(!file.exists()){
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file);
			BufferedWriter bufw = new BufferedWriter(fw);
			 if ((str = br.readLine()) != null) {
				   System.out.println(str);
				   bufw.write(str);
				   bufw.newLine();//换行
				   bufw.flush();//写一次就刷入到硬盘中，以免断电后全部消失
				  
			 }
			    //记住：只要用到缓冲区，就要记得刷新。
				bufw.flush();
				//其实关闭缓冲区，就是在关闭缓冲区中的流对象。
				bufw.close();
			
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
