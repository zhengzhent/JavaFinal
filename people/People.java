package people;
import animals.Animal;
public class People {
	public String name;						//����
	public String sex;						//�Ա�
	public String face;						//��ò
	public String xingge;                   //�Ը�
	public int degree;						//�ȼ�
	public Animal[] animal=new Animal[3];//Я�������汦��
	public int selectanimal=0;
	

	public void fight(People enemy,int x) {

		System.out.println("*"+name+"*  ��  "+"*"+animal[selectanimal].name+"*  ʹ����  *"+animal[selectanimal].skill[x]+"* ����");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(x==1) {
			int temp=(int )animal[selectanimal].defencenumber;
			animal[selectanimal].defencenumber+=degree*0.1;
			System.out.println("*"+animal[selectanimal].name+"*  �ķ�������**"+temp+"*����-->*"+animal[selectanimal].defencenumber+"*");
		}
		if(x==2) {
			int temp=(int )enemy.animal[enemy.selectanimal].defencenumber;
			enemy.animal[enemy.selectanimal].defencenumber-=degree*0.1;
			System.out.println("*"+enemy.animal[enemy.selectanimal].name+"*  �ķ�������*"+temp+"*��������-->**"+enemy.animal[enemy.selectanimal].defencenumber+"*");
		}
		if(x==3) {
			int temp=(int )animal[selectanimal].HP;
			animal[selectanimal].HP+=degree/4;
			System.out.println("*"+animal[selectanimal].name+"*  ��Ѫ����*"+temp+"*�ָ���-->*"+animal[selectanimal].HP+"*");
		}
		if(x==4) {
			int temp=(int )enemy.animal[enemy.selectanimal].HP;
			int a=(int)animal[selectanimal].power;
			a*=(100-enemy.animal[enemy.selectanimal].defencenumber)/100;
			enemy.animal[enemy.selectanimal].HP-=a;
			System.out.println("�����*"+a+"*���˺���\n*"+enemy.animal[enemy.selectanimal].name+"*��Ѫ����*"+temp+"*������-->**"+enemy.animal[enemy.selectanimal].HP+"*");
		}
		
	}
	
}