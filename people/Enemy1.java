package people;
import animals.Animal;
public class Enemy1 extends Enemy{
	public Enemy1() throws InterruptedException{
		number=1;
		degree=20;
		place="��������-��ʯϵ����";		//����
		name="�ž�";					//����
		sex="Ů";					//�Ա�
		face="��������";				//��ò
		
		System.out.println("�ž꣺��ã����ǿ����ȵ��ݵĵ��ݹ����žꡣ");
		Thread.sleep(1000);
		System.out.println("�ž꣺����Ҫ���ڱ�����ѵ����ѧУ��ѧ����֪ʶӦ�õ�ʵս��ȥ�����Բų�Ϊ�˵��ݹ�����");
		Thread.sleep(1000);
		System.out.println("�ž꣺�ҴӴ�ľ��ʿ�Ƕ���˵���Ѿ��Ǹ�С��������ѵ�����ˡ����ǣ�����Ϊ�Ҳ�������㣡");
		Thread.sleep(1000);
		animal[0]=new Animal();//Я�������汦��
		animal[0].name="������";
		animal[0].skill[1]="����";
		animal[0].skill[2]="��Ӳ";
		animal[0].skill[3]="��ɳ";
		animal[0].skill[4]="ɳ�� ";
		
		animal[1]=new Animal();
		animal[1].name="Сȭʯ";
		animal[1].skill[1]="����";
		animal[1].skill[2]="��ʯ��ĥ";
		animal[1].skill[3]="������";
		animal[1].skill[4]="�����ײ";
		
		animal[2]=new Animal();	
		animal[2].name="ҡ���ٺ�";
		animal[2].skill[1]="����";
		animal[2].skill[2]="����";
		animal[2].skill[3]="�ռ���ȡ";
		animal[2].skill[4]="�ʽ�";	
	}
}
