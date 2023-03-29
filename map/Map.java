package map;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Map{
	int num;
	public Map(int num){
			this.num = num;
		}
	public void mp(int num) throws IOException{
		MapPrint MP = new MapPrint();
		switch(num) {
		case 1 :                               //��ӡ�������ͼ
			System.out.println("        ����������~");
			MP.Bigworld();break;    
		case 2 :                                //�Ȼ�����
			System.out.println("        �Ȼ����ݣ���");
			MP.ChengHua();break;          
		case 3 :                                //���׵���
			System.out.println("        ���׵��ݣ���");
			MP.FuYan();break;
		case 4 :                                //�����ǵ���
			System.out.println("       �����ǵ��ݣ���");
			MP.KaZiNa();break;
		case 5 :                               //�䶷����
			System.out.println("       �䶷���ݣ���");
			MP.WuDou();break; 
		case 6 :                                  //��������
			System.out.println("       �������ݣ���");
			MP.LiuLi();break;
		case 7 :                              //ѵ��ʦС��
			System.out.println("        �װ���ѵ��ʦ����������С�ݣ�");
			MP.Home();break;
		case 8 :                              //������ҽԺ
			System.out.println("                 �����Ǳ�����ҽԺ");
			MP.Hospital();break;
		case 9 :                                  //Ұ��
			System.out.println("Ұ�⣡�ڴ����ֳ�û������ע�ⰲȫ������");
			break;
		case 10:
			System.out.println("        �����̵꣡");
			MP.Store();break;
		}
	}
	public void position(int num) {       //position��λ����
		switch(num) {
		case 2 :                                //�Ȼ�����
			System.out.println("�����ڵ�λ���ǣ��Ȼ�����");          
		case 3 :                                //���׵���
			System.out.println("�����ڵ�λ���ǣ����׵���");
		case 4 :                                //�����ǵ���
			System.out.println("�����ڵ�λ���ǣ������ǵ���");
		case 5 :                               //�䶷����
			System.out.println("�����ڵ�λ���ǣ��䶷����");
		case 6 :                                  //��������
			System.out.println("�����ڵ�λ���ǣ������Ȼ�����");
		case 7 :                              //ѵ��ʦС��
			System.out.println("�����ڵ�λ���ǣ�ѵ��ʦС��");
		case 8 :                              //������ҽԺ
			System.out.println("�����ڵ�λ���ǣ�������ҽԺ");
		case 9 :                                  //Ұ��
			System.out.println("��������Ұ��"); 
		case 10:
			System.out.println("�����ڵ�λ���ǳ����̵�");
		}
	}
}
class MapPrint{
	public void Bigworld() throws IOException{
		File file = new File("D:\\JDK&eclipae\\eclipse\\JavaGame\\bin\\map\\Bigworld.txt");
		//System.out.println(file.exists());
		Path path = Paths.get("D:\\JDK&eclipae\\eclipse\\JavaGame\\bin\\map\\Bigworld.txt");
		Scanner input = new Scanner(path);		
		while(input.hasNextLine()) {
			String line = input.nextLine();
			System.out.println(line);
		} 	
		input.close();
	}
	public void ChengHua() throws IOException {
		File file = new File("D:\\JDK&eclipae\\eclipse\\JavaGame\\bin\\map\\ChengHua.txt");
		//System.out.println(file.exists());

		Scanner input = new Scanner(file);		
		while(input.hasNextLine()) {
			String line = input.nextLine();
			System.out.println(line);
		} 	
		input.close();
	}
	public void FuYan() throws IOException {
		File file = new File("D:\\JDK&eclipae\\eclipse\\JavaGame\\bin\\map\\FuYan.txt");
		//System.out.println(file.exists());

		Scanner input = new Scanner(file);		
		while(input.hasNextLine()) {
			String line = input.nextLine();
			System.out.println(line);
		} 	
		input.close();
	}
	public void KaZiNa() throws IOException {
		File file = new File("D:\\JDK&eclipae\\eclipse\\JavaGame\\bin\\map\\KaZiNa.txt");
		//System.out.println(file.exists());

		Scanner input = new Scanner(file);		
		while(input.hasNextLine()) {
			String line = input.nextLine();
			System.out.println(line);
		} 	
		input.close();
	}
	public void WuDou() throws IOException {
		File file = new File("D:\\JDK&eclipae\\eclipse\\JavaGame\\bin\\map\\WuDou.txt");
		//System.out.println(file.exists());

		Scanner input = new Scanner(file);		
		while(input.hasNextLine()) {
			String line = input.nextLine();
			System.out.println(line);
		} 	
		input.close();
	}
	public void LiuLi() throws IOException {
		File file = new File("D:\\JDK&eclipae\\eclipse\\JavaGame\\bin\\map\\LiuLi.txt");
		//System.out.println(file.exists());

		Scanner input = new Scanner(file);		
		while(input.hasNextLine()) {
			String line = input.nextLine();
			System.out.println(line);
		} 	
		input.close();
	}
	public void Home() throws IOException {
		File file = new File("D:\\JDK&eclipae\\eclipse\\JavaGame\\bin\\map\\Home.txt");
		//System.out.println(file.exists());

		Scanner input = new Scanner(file);		
		while(input.hasNextLine()) {
			String line = input.nextLine();
			System.out.println(line);
		} 	
		input.close();
	}
	public void Hospital() throws IOException {
		File file = new File("D:\\JDK&eclipae\\eclipse\\JavaGame\\bin\\map\\Hospital.txt");
		//System.out.println(file.exists());

		Scanner input = new Scanner(file);		
		while(input.hasNextLine()) {
			String line = input.nextLine();
			System.out.println(line);
		} 	
		input.close();
	}
	public void Store() throws IOException {
		File file = new File("D:\\JDK&eclipae\\eclipse\\JavaGame\\bin\\map\\Store.txt");
		//System.out.println(file.exists());

		Scanner input = new Scanner(file);		
		while(input.hasNextLine()) {
			String line = input.nextLine();
			System.out.println(line);
		} 	
		input.close();
	}
}
