package people;
import animals.Animal;
public class Enemy5 extends Enemy{
	public Enemy5() throws InterruptedException{
		number=5;
		degree=100;
		place="������-ˮϵ����";		//����
		name="�׿���";					//����
		sex="��";					//�Ա�
		face="Ƣ�������";				//��ò
		
		System.out.println("�׿�������������ʽ�������Լ��������׿������������ݵĵ��ݹ�����");
		Thread.sleep(1000);
		System.out.println("�׿�����������������̸̸��ɡ���������ʱ��ˣ����ܸо�����һ�㡣");
		Thread.sleep(1000);
		System.out.println("�׿��������ڣ��������ı����ε�����չ�ָ��ҿ��ɡ�");
		Thread.sleep(1000);
		System.out.println("�׿�������Ϊ���񣬾����Һ��ҵı������ݳ�һ��ˮ֮��Ӱ�ɣ�");
		Thread.sleep(1000);
		animal[0]=new Animal();//Я�������汦��
		animal[1]=new Animal();
		animal[2]=new Animal();
		animal[0].name="������";
		animal[0].skill[1]="��ˮ";
		animal[0].skill[2]="����ӡ��";
		animal[0].skill[3]="�����ػ�";
		animal[0].skill[4]="ˮ��";

		animal[1].name="������";
		animal[1].skill[1]="ˮ��β";
		animal[1].skill[2]="����";
		animal[1].skill[3]="ˮ֮����";
		animal[1].skill[4]="����һ��";
		
		animal[2].name="������";
		animal[2].skill[1]="�������";
		animal[2].skill[2]="�綾";
		animal[2].skill[3]="����";
		animal[2].skill[4]="��������";
	}
}
