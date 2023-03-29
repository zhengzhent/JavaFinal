import java.io.IOException;
import java.util.Scanner;
import people.Player;
import map.Map;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner s=new Scanner(System.in);
		Player player=new Player();
		System.out.println("_____________________________");
	while(player.Goal(1)) {
		System.out.println("_____________________________");
			System.out.println("请选择你接下来的行动");
			System.out.println("1-道馆挑战   2-回训练师小屋  3-前往宠物医院   4-野外试炼   5-查看当前已经获得勋章 6-查看地图 ");
			int choice=s.nextInt();
			while(choice<=0||choice>6) {
				System.out.println("未识别的行动，请重新选择你接下来的行动");	
				choice=s.nextInt();
			}
			if(choice==6) {
				System.out.println("请选择您要查看的地图");
				System.out.println("1-大世界地图");
				System.out.println("2-橙华道馆");
				System.out.println("3-釜炎道馆");
				System.out.println("4-卡兹那道馆");
				System.out.println("5-武斗道馆");
				System.out.println("6-琉璃道馆");
				System.out.println("7-训练师小屋");
				System.out.println("8-宝可梦医院");
				System.out.println("9-野外");
				System.out.println("10-宠物商店");
				int num = s.nextInt();
				Map MAP = new Map(num);
				MAP.mp(num);
			}
			player.Go(choice);
	}
	player.Goal();
	player.End();
	s.close();
	}
}

