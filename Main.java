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
			System.out.println("��ѡ������������ж�");
			System.out.println("1-������ս   2-��ѵ��ʦС��  3-ǰ������ҽԺ   4-Ұ������   5-�鿴��ǰ�Ѿ����ѫ�� 6-�鿴��ͼ ");
			int choice=s.nextInt();
			while(choice<=0||choice>6) {
				System.out.println("δʶ����ж���������ѡ������������ж�");	
				choice=s.nextInt();
			}
			if(choice==6) {
				System.out.println("��ѡ����Ҫ�鿴�ĵ�ͼ");
				System.out.println("1-�������ͼ");
				System.out.println("2-�Ȼ�����");
				System.out.println("3-���׵���");
				System.out.println("4-�����ǵ���");
				System.out.println("5-�䶷����");
				System.out.println("6-��������");
				System.out.println("7-ѵ��ʦС��");
				System.out.println("8-������ҽԺ");
				System.out.println("9-Ұ��");
				System.out.println("10-�����̵�");
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

