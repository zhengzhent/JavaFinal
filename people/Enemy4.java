package people;
import animals.Animal;
public class Enemy4 extends Enemy{
	public Enemy4() throws InterruptedException{
		number=4;
		degree=80;
		place="�Ȼ���-��ͨϵ����";		//����
		name="ǧ��";					//����
		sex="��";					//�Ա�
		face="�Ͱ����Ƶ�";				//��ò
		
		System.out.println("ǧ��š������������Ѿ�Ӯ�úö�����ˡ��ܺã��ǾͰ�������ŵ����������������ս���ɡ�");
		Thread.sleep(1000);
		System.out.println("ǧ���������ܺ��Լ��ĺ�����һ������������ս�������ǣ�ս������ս����");
		Thread.sleep(1000);
		System.out.println("ǧ���Ϊ���ݹ������һᾡ������Ӯȡʤ������ҲҪ�þ�ȫ������");
		Thread.sleep(1000);
		animal[0]=new Animal();//Я�������汦��
		animal[1]=new Animal();
		animal[2]=new Animal();
		animal[0].name="��β��";
		animal[0].skill[1]="����";
		animal[0].skill[2]="ҡβ��";
		animal[0].skill[3]="����";
		animal[0].skill[4]="��������";

		animal[1].name="����̡";
		animal[1].skill[1]="����";
		animal[1].skill[2]="��Ƿ";
		animal[1].skill[3]="�෵";
		animal[1].skill[4]="��ʯ����";
		
		animal[2].name="����Գ";
		animal[2].skill[1]="��������";
		animal[2].skill[2]="ˮ֮����";
		animal[2].skill[3]="��������";
		animal[2].skill[4]="��Ӱצ";
	}
}
