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
			InputStreamReader isr = new InputStreamReader(in,"UTF-8");// �ַ���
			BufferedReader br = new BufferedReader(isr);// ������
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
				   bufw.newLine();//����
				   bufw.flush();//дһ�ξ�ˢ�뵽Ӳ���У�����ϵ��ȫ����ʧ
				  
			 }
			    //��ס��ֻҪ�õ�����������Ҫ�ǵ�ˢ�¡�
				bufw.flush();
				//��ʵ�رջ������������ڹرջ������е�������
				bufw.close();
			
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
