package test;

import java.util.List;

/**
 * 组合模式：通过递归手段来构造树形结构，并可以通过一个对象来访问整个对象树
 * @author Administrator
 *
 */
public class MainClass {

	public static void main(String[] args) {
		//C盘
		Folder rootFolder = new Folder("c:");
		//目录
		Folder muluFolder = new Folder("mulu");
		Folder mulu = new Folder("mulu2");
		//文件
		File wenjianFile = new File("wenjian.txt");
		File beifengFile = new File("beifeng.txt");
		//将文件添加到目录下
		muluFolder.add(wenjianFile);
		muluFolder.add(beifengFile);
		//将目录添加到C:盘下
		rootFolder.add(muluFolder);
		rootFolder.add(mulu);
		
		displayTree(rootFolder,0);
	}
	//显示树结构
	public static void displayTree(IFile rootFolder,int deep){
		for(int i = 0;i < deep;i++){
			System.out.print("--");
		}
		rootFolder.display();//展示文件夹名称
		//获得子树
		List <IFile>children = rootFolder.getChild();
		//遍历子树
		for(IFile file : children){
			if(file instanceof File){
				for(int i = 0;i<=deep;i++){
					System.out.print("--");
				}
				file.display();//展示该文件夹的文件名
			}else{
				displayTree(file,deep+1);//递归
			}
		}
	}
}
