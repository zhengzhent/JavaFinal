package people;
import animals.Animal;
public class Enemy2 extends Enemy{
	public Enemy2() throws InterruptedException{
		number=2;
		degree=40;
		place="�䶷�� ��ϵ����";		//����
		name="����";					//����
		sex="��";					//�Ա�
		face="�պ�������";				//��ò

		System.out.println("�����������������䶷���ݵĵ��ݹ�����");
		Thread.sleep(1000);
		System.out.println("�����������⸽���������з��ڡ���");
		Thread.sleep(1000);
		System.out.println("����������ڵĶ��������У�");
		Thread.sleep(1000);
		System.out.println("����������ս���ǾͰ����ʵ������ȫ��չ�ֳ����ɣ�");
		Thread.sleep(1000);
		animal[0]=new Animal();//Я�������汦��
		animal[0].name="����";	
		animal[0].skill[1]="����";
		animal[0].skill[2]="����";
		animal[0].skill[3]="ʮ����";
		animal[0].skill[4]="����ȭ";
		
		animal[1]=new Animal();
		animal[1].name="Ļ����ʿ";	
		animal[1].skill[1]="�ٶ���*  ";
		animal[1].skill[2]="����*  ";
		animal[1].skill[3]="��ɳ��*  ";
		animal[1].skill[4]="������Ͷ*  ";
		
		animal[2]=new Animal();	
		animal[2].name="��ɯ��";	
		animal[2].skill[1]="�����Ӧ";
		animal[2].skill[2]="˫���";
		animal[2].skill[3]="ڤ��";
		animal[2].skill[4]="��ϥ��";
	}
}