package people;
import animals.Animal;
public class Enemy3 extends Enemy{
	public Enemy3() throws InterruptedException{
		number=3;
		degree=60;
		place="������--��ϵ����";		//����
		name="��ɯ";					//����
		sex="Ů";					//�Ա�
		face="��̫ƽ����";				//��ò
		
		System.out.println("��ɯ����ӭ����Ŷ����΢���������ս�߰���������ܿ������ֵ����");
		Thread.sleep(1000);
		System.out.println("��ɯ��үү�и��ҡ�������˵��������ɯ��������ĵ��ݹ�����");
		Thread.sleep(1000);
		System.out.println("��ɯ���Ǹ�������Ȼ�Ҳ���ǰ�Ÿ����Σ�����ɱ�С���ң�");
		Thread.sleep(1000);
		System.out.println("��ɯ������үү���ڸ��ҵļ��ɣ��һᣬ�Ǹ����������ʶһ����������Ƭ������ĥ�¶����Ļ�����ʽ��");
		Thread.sleep(1000);
		animal[0]=new Animal();//Я�������汦��
		animal[1]=new Animal();
		animal[2]=new Animal();
		animal[0].name="���ҳ�";
		animal[0].skill[1]="����";
		animal[0].skill[2]="˲��ʧ��";
		animal[0].skill[3]="��������";
		animal[0].skill[4]="̩ɽѹ��";

		animal[1].name="ú̿��";
		animal[1].skill[1]="����";
		animal[1].skill[2]="����";
		animal[1].skill[3]="���֮��";
		animal[1].skill[4]="����";
		
		animal[2].name="������";
		animal[2].skill[1]="����";
		animal[2].skill[2]="����";
		animal[2].skill[3]="���֮��";
		animal[2].skill[4]="���潦��";
	}
}
