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
		case 1 :                               //打印大世界地图
			System.out.println("        宝可梦世界~");
			MP.Bigworld();break;    
		case 2 :                                //橙华道馆
			System.out.println("        橙华道馆！！");
			MP.ChengHua();break;          
		case 3 :                                //釜炎道馆
			System.out.println("        釜炎道馆！！");
			MP.FuYan();break;
		case 4 :                                //卡兹那道馆
			System.out.println("       卡兹那道馆！！");
			MP.KaZiNa();break;
		case 5 :                               //武斗道馆
			System.out.println("       武斗道馆！！");
			MP.WuDou();break; 
		case 6 :                                  //琉璃道馆
			System.out.println("       琉璃道馆！！");
			MP.LiuLi();break;
		case 7 :                              //训练师小屋
			System.out.println("        亲爱的训练师，这是您的小屋！");
			MP.Home();break;
		case 8 :                              //宝可梦医院
			System.out.println("                 这里是宝可梦医院");
			MP.Hospital();break;
		case 9 :                                  //野外
			System.out.println("野外！口袋妖怪出没！！请注意安全！！！");
			break;
		case 10:
			System.out.println("        宠物商店！");
			MP.Store();break;
		}
	}
	public void position(int num) {       //position定位方法
		switch(num) {
		case 2 :                                //橙华道馆
			System.out.println("您现在的位置是：橙华道馆");          
		case 3 :                                //釜炎道馆
			System.out.println("您现在的位置是：釜炎道馆");
		case 4 :                                //卡兹那道馆
			System.out.println("您现在的位置是：卡兹那道馆");
		case 5 :                               //武斗道馆
			System.out.println("您现在的位置是：武斗道馆");
		case 6 :                                  //琉璃道馆
			System.out.println("您现在的位置是：琉璃橙华道馆");
		case 7 :                              //训练师小屋
			System.out.println("您现在的位置是：训练师小屋");
		case 8 :                              //宝可梦医院
			System.out.println("您现在的位置是：宝可梦医院");
		case 9 :                                  //野外
			System.out.println("您现在身处野外"); 
		case 10:
			System.out.println("您现在的位置是宠物商店");
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
