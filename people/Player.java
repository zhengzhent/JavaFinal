package people;
import java.util.*;
import animals.Jienigui;
import animals.Pikaqiu;
import animals.Xiaohuolong;
public class Player extends People {
	public int goal[]= {0,0,0,0,0,0};		//goal��ʾ��ҵ�ǰ��ܵĵ���
	Scanner s=new Scanner(System.in);
	public Player() throws Exception{
		degree=10;
		animal[0]=new Pikaqiu();
		animal[1]=new Jienigui();
		animal[2]=new Xiaohuolong();
		//��Ϸ����
		System.out.println("��Pokemon World����������������汦����");
		Thread.sleep(1000);
		System.out.println("���汦����ƽʱ���Ա���С����һ����������������ڣ���ѵ��ʦ�������ϻ���ڿڴ��У����Ҳ����Ϊ���ڴ����֡���");
		Thread.sleep(1500);
		System.out.println("���������汦����г�ദ������Ҳ�������������汦���йص�ְҵ��������ʦ��ѵ��ʦ�ȡ�");
		Thread.sleep(1200);
		System.out.println("�������Ϸ�У�����Ϊһ�����汦����ѵ��ʦ���Գ�Ϊһ�������ѵ��ʦΪĿ�̤꣬����������ѵ��ʦ�д�ս���ķܶ�֮·��");
		Thread.sleep(1500);
		System.out.println("·;�г����˻�������ս��ѵ��ʦҲ�ڳ����Լ����е�Ŀ�겻��ǰ������");
		Thread.sleep(2000);
		System.out.println("Loading...");
		Thread.sleep(2000);
		System.out.println("Loading...");
		Thread.sleep(2000);
		System.out.println("��ľ��ʿ���װ���ѵ��ʦ��ã���ӭ����Pokemon���磬���������Ա��ǣ����������֣���");
		System.out.println("1����		2��Ů");
		int a =s.nextInt();
		if(a==1) {
			this.sex="��";
			System.out.println("��ľ��ʿ��ԭ����һλ�¸ҵ��к�ѽ������Լ�ȡһ�����������ְɣ�");
		}
		else if(a==2){
			this.sex="Ů";
			System.out.println("��ľ��ʿ��ԭ����һλ������Ů��ѽ������Լ�ȡһ�����������ְ�!");}
		name=s.next();		
		
		if(a==1) {
			System.out.println("��ľ��ʿ��"+name+"   ���Ǹ��������أ�������һ����һλ˧����ѵ��ʦ��");
		}else {
			System.out.println("��ľ��ʿ��"+name+"   ���Ǹ��������أ�������һ����һλ������ѵ��ʦ��");
		}
		Thread.sleep(1500);
		System.out.println("��ľ��ʿ���ÿ��������Pokemon������ǻ�����������汦����Ӵ������������Լ��Ľ�ɫ������ò�ɣ������������֣�");
		System.out.println("1-�����ٷ�	2-��òƽƽ	3-ü��Ŀ��	4-��������");
		int x=s.nextInt();
		if (x==1)face="�����ٷ�";
			else if (x==2)face="��òƽƽ";
			else if (x==3)face="ü��Ŀ��";
			else if (x==4)face="��������";
		Thread.sleep(500);
		System.out.println("��ľ��ʿ���õ���****"+face+"��"+name+"****");
		System.out.println("��ľ��ʿ���ڱ���������,��������ѵ��ʦ��õĻ�飬�˽����˵��Ը�Ҳ���������汦�����õغ�ѵ��ʦһ��׷Ѱ���롣"
				+ "�����������˽�����Ը�ɣ������������֣�");
		System.out.println("1-������	2-���ʱ��	3-��Ĭ����	4-��Ĭ��Ȥ");
		int xg=s.nextInt();
		if (xg==1)xingge="������";
		else if (xg==2)xingge="���ʱ��";
		else if (xg==3)xingge="��Ĭ����";
		else if (xg==4)xingge="��Ĭ��Ȥ";
		
		Thread.sleep(1000);
		System.out.println(face+"��"+xingge+"��"+name+"   ��ϲ���Ѿ�����˶��Լ���Ϣ��¼�룡\n"
				+"\n��ľ��ʿ����������ѡ��һ��ϲ���ĳ�ʼ���汦���ɡ�\n����������õĻ�飬��������һ��׷�����룡����");
		Thread.sleep(500);
		System.out.println("0-Ƥ����	1-�����	2-С����");
		while(true) {
			selectanimal =s.nextInt();
			if(selectanimal<=2&&selectanimal>=0)break;
		System.out.println("�����ѡ���أ��������������");	
		}		
		animal[selectanimal].life=1;
		Regin();
		Thread.sleep(1000);
		if(selectanimal==0) {
			System.out.println("PiKa!PiKa!(Ƥ���𷢳�������������ŵ�)");
			Thread.sleep(1000);
			System.out.println("��ľ��ʿ�����µ��۹���ã������¸ҵ�**"+animal[selectanimal].name+"**һ���ܰ�����˳�������ε�����̽�գ�����");
		}else if(selectanimal==1) {
			System.out.println("JieNi!JieNi!������귢����������������ˮ��");
			Thread.sleep(1000);
			System.out.println("��ľ��ʿ�����µ��۹���ã������¸ҵ�**"+animal[selectanimal].name+"**һ���ܰ�����˳�������ε�����̽�գ�����");
		}else {
			System.out.println("Hooooooh!!��С���������������ҵ�ȼһ�����磩");
			Thread.sleep(1000);
			System.out.println("��ľ��ʿ�����µ��۹���ã������¸ҵ�**"+animal[selectanimal].name+"**һ���ܰ�����˳�������ε�����̽�գ�����");
		}
		Thread.sleep(1000);
		System.out.println("��ľ��ʿ��Ŷ�ȵ�~������У��Уѵ�����Ի�ö���ĳ�ʼ�ȼ���");
		String key = s.next();
		if(key.equals("����")) {
			this.degree+=10;
			System.out.println("��ľ��ʿ����ϲ���ش���ȷ��");
		}else {
			System.out.println("��ľ��ʿ���ܱ�Ǹ����УУѵ������Ŷ~��ʧȥ�����ӵȼ��Ļ���");
		}
		System.out.println("��ľ��ʿ���Ͽ�̤����Ƭ����Ĵ�½����ʼ���̽��֮�ðɣ�");
		Thread.sleep(2000);
	}
	
	public boolean Select() {//ѡ��Ҫ��ս�����汦��

	if(animal[selectanimal].life==1&&animal[selectanimal].HP>0) {
		System.out.println("��ǰ׼����ս�����汦��Ϊ**"+animal[selectanimal].name+"**  ��ǰѪ��Ϊ��"+animal[selectanimal].HP);
	}
		int flag=0;					//��־λ�����Ϊ0�����û�д��ľ���
		for(int i=0;i<=2;i++) { 
			if(animal[i].life==0)continue;
			if((animal[i].HP)>0){
				animal[i].life=1;
				flag=1;
				System.out.print(i+"--"+animal[i].name+"	Ѫ��Ϊ��"+animal[i].HP+"\n");	
			}
			if((animal[i].HP)<=0){
				animal[i].HP=0;
				animal[i].life=2;
				System.out.print(animal[i].name+"�Ѿ��������޷���ս");	
			}
		}
		
		if(flag==0) {
			System.out.println("�Ѿ�û�п��Լ���ս�������汦��,�뾡��ǰ�����汦��ҽԺ�������ƣ�");
			return false;
		}
		System.out.println("��ȷ����Ҫ��ս�����汦������������ţ�");
		while(true) {
			selectanimal=s.nextInt();
			if(selectanimal<=2&&selectanimal>=0) break;
		System.out.println("��������汦����ţ������������룩");	
		}
		while(animal[selectanimal].HP<0||animal[selectanimal].life!=1) {
			animal[selectanimal].HP=0;
			if(animal[selectanimal].life==2)System.out.println(animal[selectanimal].name+"�Ѿ�������������ѡ����Ҫ��ս�����汦����");
			if(animal[selectanimal].life==0)System.out.println(animal[selectanimal].name+"��δ����������ѡ����Ҫ��ս�����汦����");
			selectanimal=s.nextInt();
		};
		System.out.println("��ǰ��ս�����汦��Ϊ**"+animal[selectanimal].name+"**  ��ǰѪ��Ϊ��"+animal[selectanimal].HP);
		return true;
	}
	public void Regin() {				//��ʼ������ֵ
		int i;
		for(i=0;i<=2;i++) {
			if(animal[i].life!=0) {
				animal[i].HP=50+degree;
				animal[i].power=10+degree*0.5;
				//animal[i].power=1000;
				animal[i].defencenumber=degree*0.5;
			}
		}
	}
	
	public void Fight(Enemy enemy) {				//ս��ϵͳ
		System.out.println("_____________________________");
		System.out.println("��ӭ��ս"+enemy.place+"--"+enemy.face+enemy.name);   //	
		System.out.println("_____________________________\n");
		enemy.Regin();
		if(!Select())return ;
		int count=1;
		int x=5;
		while(enemy.Select()) {	
			System.out.println("_______________________________\n��*"+count+++"*�غ�  ��ѡ��*"+animal[selectanimal].name+"*�ļ���");
			for(int i=1;i<=4;i++) {
				System.out.print(i+"--"+animal[selectanimal].skill[i]+"   ");}
			System.out.print("5--�˳���ǰս��\n");
			while(true) {
				x=s.nextInt();
				if(x>=1&&x<=5)break;
			System.out.print("������ж�ָ�������������");	
			}
			 
			 
			if(x==5)break;
			fight(enemy,x);				//�ҷ�����
			
			if(enemy.animal[enemy.selectanimal].HP<=0){
				enemy.animal[enemy.selectanimal].life=2;
				System.out.println("���Ѿ��ɹ���ɱ��"+enemy.animal[enemy.selectanimal].name);
				System.out.println("---------------------------");
				if(enemy.Select())System.out.println("�������ֵ�"+enemy.animal[enemy.selectanimal].name +"�ϳ��ˣ������С��Ӧ��");
				continue;
			}
			System.out.println("_____________________________�������ֵ�"+enemy.name+"������");
			if(x==4) {
			x=(int)(Math.random() * 4)+1;
			if(x%2==0)enemy.fight(this,4);
			else enemy.fight(this,x);
			}else {
			x=(int)(Math.random() * 4)+1;
			enemy.fight(this,x);		//�з�����
			}
			if(animal[selectanimal].HP<=0){	
				animal[selectanimal].life=2;
				System.out.println(animal[selectanimal].name+"�Ѿ��ɹ�������");
				if(!Select())return;
				continue;
			}
		}
		if(x==5)return;
		switch(enemy.number) {
		case 1:{
			System.out.println("�ž飺�����кܶ�ܶ�Ķ���Ҫѧ�������һ���μӽ���������ʱ�����������ҵĶ�����");
			break;
		}
		case 2:{
			System.out.println("��������Ĳ�������һ���ɾ��˳����ڱ�����ѵ�����о����˵ķ籩�ɣ�");
			break;
		}
		case 3:{
			System.out.println("��ɯ�������ˣ������Һ����㡣���������ҵ�ս���ɲ���ÿ�춼�еġ��пյĻ�����һ���ɣ�");
			break;
		}
		case 4:{
			System.out.println("ǧ�������ô���ܡ����Ҿ�Ȼ�ᡭ������㡭��");
			break;
		}
		case 5:{
			System.out.println("�׿�����̫���ˣ��������̫���ˣ�����һ�������ı�����ѵ���ҡ���Ϊ�����������ı����ζ�ϲ�á�");
			break;
		}
		}
		System.out.println("��ϲ���Ѿ��ɹ�սʤ*"+enemy.number+enemy.place+"*����");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		degree+=(int)(20*(1+enemy.number/10)+enemy.number);
		System.out.println("**��ĵȼ�����˴����������ǰ�ȼ�Ϊ--"+degree+"--**\n");
		goal[enemy.number]=1;
		
		if(enemy.number==1) {
			System.out.println("��������������һ�β������汦���Ļ��ᣡ����");
		
			while(true){
			System.out.println("0-Ƥ����	1-�����	2-С����");	
			selectanimal =s.nextInt();	
			if(selectanimal>2||selectanimal<0) {
				System.out.println("Ŷ������һ������ѡ��������ѡ��");
				continue;
			}
			if(animal[selectanimal].life!=0) {
				System.out.println("�����汦���Ѿ���ѱ������������ѡ��");
				continue;
			}
			break;
			}
			System.out.println("��ɹ������� *"+animal[selectanimal].name+"* ������");
			animal[selectanimal].life=1;
			Regin();
		}
		
		else if(enemy.number==2) {
			System.out.println("��ϲ����������һֻ���汦�������Ⱥ���ܾ���������");
			int i;
			for(i=0;i<=2;i++)if(animal[i].life==0)break;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("������--"+animal[i].name+"--��");
			animal[i].life=1;
			Regin();
		}	else return;
		
	}
	public void Home() throws InterruptedException{//�ؼ���������
		System.out.println("�����˹ܼң��װ�������,��ӭ��ؼҡ����ⱼ��һ��һ�����˰ɣ��ؼҺú���Ϣ��");
		System.out.println("��ѡ����Ҫ���еĻ��!");
		int x=0;
		while(true) {
			System.out.println("1--ϴ�� 2--˯�� 3--�Է� 4--���� 5--�뿪");
			 x=s.nextInt();
			 if(x==5)return;
			if(x>=1&&x<=4) break;
			System.out.println("δ��ʶ�𵽸ö�����������ѡ��");	
		}
		String temp=null;
		switch(x) {
		case 1:temp="ϴ��";break;
		case 2:temp="˯��";break;
		case 3:temp="�Է�";break;
		case 4:temp="����";break;
		}
		for(int i=1;i<=5;i++) {
			System.out.println("--"+temp+"��-- ("+i+"/5)");
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(x==4) {
			System.out.println("��֪ʶ�ĺ��������Σ���ĵȼ������ˣ�");
			int last = degree;
			degree++;
			System.out.println("��ĵȼ��ӣ� "+last+" ������ " + degree);
		}
		Thread.sleep(700);
		System.out.println(temp+"�Ѿ�˳����ɣ������ǰ���ɣ� ");
	}
	public void Hospital() {//ȥҽԺ��Ѫ
		System.out.println("ĵ��Ժ������ӭ���٣��װ���"+name+",���������汦�����ġ�");
		System.out.println("���ǵ���Ҫ�����Ǹ������汦�������ƣ�����Ҳ��Ϣ�źܶ����˵����汦������ѡ����Ҫ���е��ж��ɣ�");
		int x=0;
		while(true) {
			System.out.println("1--���� 2--�ι� 3--�뿪");
			 x=s.nextInt();
			 if(x==3)return;
			if(x>=1&&x<=2) break;
			System.out.println("δ��ʶ�𵽸ö�����������ѡ��");	
		}
		if(x==1) {	
		Regin();
		System.out.println("_____________________________");
		for(int i=0;i<=2;i++) {
			if(animal[i].life==0)continue;
			System.out.println("--���ڸ�**"+animal[i].name+"**��������");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("ĵ��Ժ����*"+face+"��"+name+"�����е����汦�����Ѿ�������ϣ������ս����\n");}
		if(x==2) {	

			for(int i=0;i<=2;i++) {
				System.out.println("--���ڲι���--(**"+(i+1)+"/3)");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("���Ѿ��ι���ϣ������ս����");}
		
		
	}
	public void Outside() {//ȥ�����ȼ�
		System.out.println("*"+face+name+"*������ʮ��Σ�յ�Ұ�⣬����������������Լ��ȼ������������սʤ���֡�\n");
		
		while(true) {
			System.out.println("���ѡ�����ǰ���밴1");
			if(s.nextInt()!=1)return;
			System.out.println("\n�����ǿ�����εĶ�����˭�ɣ�");	
			for(int i=0;i<=2;i++) {
				System.out.println("--����������--(**"+(i+1)+"/3)");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
			}
		int x=(int)(Math.random() * 4)+1;
		
		switch(x) {
		case 1:System.out.println("����һֻ**����**����������ˡ�");break;
		case 2:System.out.println("Ŷ��һֻϡ�е�**����**�����صķ�����һ����");break;
		case 3:System.out.println("��Ӧ����**������**��С��������ĳ����");break;
		case 4:System.out.println("�ǽ����**���˱�**������ĳһ���Ⱥ�");break;
		}
		String m=null;
		String n=null;
		int choice;
		while(true) {
		System.out.println("\n��ѡ����Ĺ�������");
		System.out.println("1--���� 2--���� 3--���� 4--���� 5--�뿪");

		choice=s.nextInt();
		if(choice==5) {
			System.out.println("�´�������");
			return;}
		if(x>=1&&x<=4)break;
		System.out.println("Ŷ����Ӧ����һ�������ѡ��");
		}
		
		switch(choice){
			case 1:m="����";break;
			case 2:m="����";break;
			case 3:m="����";break;
			case 4:m="����";break;
		}
		x=(int)(Math.random() * 4)+1;
		switch(x){
			case 1:n="����";break;
			case 2:n="����";break;
			case 3:n="����";break;
			case 4:n="����";break;
	}
		System.out.println("�㹥���ķ�����--"+m+"  �������--"+n+"\n");
		if(x==choice) {
			degree++;
			System.out.println("��ϲ�㣬����������ȷ�ķ�����ĵȼ�+1����ǰ�ȼ�Ϊ--"+degree+"--");
		}else {
			System.out.println("���ź���û�����жԷ���");
		}
		
		}
	}
	public boolean Goal(int x) {//�ж��Ƿ��Լ���ս�����е���		
		for(int i=1;i<=5;i++)
		if(goal[i]==0)return true;
		return false;
	}
	public boolean Goal() {//����Ѿ�սʤ�ĵ���
		System.out.println("��ѯ�С������� ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		int flag=0;
		for(int i=1;i<=5;i++) {
		if(goal[i]==1)	{
			if(flag==0)flag=1;
			switch (i){
			case 1:System.out.println("*������     ��ʯϵ���ݡ��ž꡿����ʯ����* ");break;
			case 2:System.out.println("*�䶷��     ��ϵ���ݡ���������ȭ������* ");break;
			case 3:System.out.println("*������     ��    ϵ���ݡ���ɯ�����������* ");break;
			case 4:System.out.println("*�Ȼ���     ��ͨϵ���ݡ�ǧ�����ӻ��� * ");break;
			case 5:System.out.println("*������     ˮ    ϵ���ݡ��׿���������λ��� * ");break;
			}
		}
		}
		if(flag==0) {
			System.out.println("\n��Ŀǰ��û�гɹ���ս�κε���Ŷ����ѵ��ʦ����Ŭ����");
			return false;
		}
		return true;
	}
	public void Go(int choice) throws InterruptedException {//ѡ���Լ����ж�
		if(choice==1) {
			System.out.println("��ѡ����׼����ս�ĵ��ݣ�");
			do{
				System.out.println("1-��ʯϵ���� 2-��ϵ���� 3-��ϵ���� 4-��ͨϵ���� 5-ˮϵ����");  //�ı� �õ����Ƽ��ȼ�  +  �����ڵĵȼ�  
				choice=s.nextInt();
				if(choice<1||choice>5) {
					System.out.println("���ѡ�񲻺���Ŷ����ѡ��������ѡ��ɣ�");
					choice=s.nextInt();
					continue;
				}
				if(goal[choice]==1) {
					System.out.println("���Ѿ��ɹ���øõ��ݵĻ������������ѡ��������׼����ս�ĵ��ݣ�");
					choice=s.nextInt();
					continue;
				}
			}while(goal[choice]!=0);
				
			System.out.println("�õ����Ƽ��ȼ�:"+choice*15+"	�����ڵĵȼ�:"+degree+"\n�Ƿ����ѡ����ս:  1--�¸���ս	2--��ʱ����");
			if(s.nextInt()==2)return;
			Enemy enemy=null;
			switch(choice) {
			case 1:enemy=new Enemy1();break;
			case 2:enemy=new Enemy2();break;
			case 3:enemy=new Enemy3();break;
			case 4:enemy=new Enemy4();break;
			case 5:enemy=new Enemy5();break;
			}
			Fight(enemy);
		}
		else if(choice==2)Home();
		else if(choice==3)Hospital();
		else if(choice==4)Outside();
		else if(choice==5)Goal();
	}
	public void End() {//ͨ��ף��
		System.out.println("�װ��� *"+name+"* ���Ѿ�ͨ�����ǵ����е�����ս������һ·����ն����ʵ���ף���ϲ��ﵽ���Լ�������");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("�ǳ���л�����������ǵ���Ϸ������");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print("ϣ�����ǡ���");
		try {
			Thread.sleep(700);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("��Ե�ٻᣡ����");
		try {
			Thread.sleep(700);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("������������ ֣����");
	}
	
}
	


