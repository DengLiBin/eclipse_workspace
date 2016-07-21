package test;

import java.util.List;

/**
 * 文件节点抽象(文件和目录的父类)
 * @author Administrator
 *
 */
public interface IFile {
	//显示文件或者文件夹的名称
	public void  display();
	//添加
	public boolean add(IFile file);
	//移除
	public boolean remove(IFile file);
	
	//获得子节点
	public List<IFile> getChild();
}
