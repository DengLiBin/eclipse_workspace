package test;

import java.util.List;

/**
 * ���ģʽ��ͨ���ݹ��ֶ����������νṹ��������ͨ��һ����������������������
 * @author Administrator
 *
 */
public class MainClass {

	public static void main(String[] args) {
		//C��
		Folder rootFolder = new Folder("c:");
		//Ŀ¼
		Folder muluFolder = new Folder("mulu");
		Folder mulu = new Folder("mulu2");
		//�ļ�
		File wenjianFile = new File("wenjian.txt");
		File beifengFile = new File("beifeng.txt");
		//���ļ���ӵ�Ŀ¼��
		muluFolder.add(wenjianFile);
		muluFolder.add(beifengFile);
		//��Ŀ¼��ӵ�C:����
		rootFolder.add(muluFolder);
		rootFolder.add(mulu);
		
		displayTree(rootFolder,0);
	}
	//��ʾ���ṹ
	public static void displayTree(IFile rootFolder,int deep){
		for(int i = 0;i < deep;i++){
			System.out.print("--");
		}
		rootFolder.display();//չʾ�ļ�������
		//�������
		List <IFile>children = rootFolder.getChild();
		//��������
		for(IFile file : children){
			if(file instanceof File){
				for(int i = 0;i<=deep;i++){
					System.out.print("--");
				}
				file.display();//չʾ���ļ��е��ļ���
			}else{
				displayTree(file,deep+1);//�ݹ�
			}
		}
	}
}
