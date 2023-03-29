package people;
import animals.Animal;
public class People {
	public String name;						//姓名
	public String sex;						//性别
	public String face;						//样貌
	public String xingge;                   //性格
	public int degree;						//等级
	public Animal[] animal=new Animal[3];//携带的神奇宝贝
	public int selectanimal=0;
	

	public void fight(People enemy,int x) {

		System.out.println("*"+name+"*  的  "+"*"+animal[selectanimal].name+"*  使用了  *"+animal[selectanimal].skill[x]+"* 技能");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(x==1) {
			int temp=(int )animal[selectanimal].defencenumber;
			animal[selectanimal].defencenumber+=degree*0.1;
			System.out.println("*"+animal[selectanimal].name+"*  的防御力从**"+temp+"*提升-->*"+animal[selectanimal].defencenumber+"*");
		}
		if(x==2) {
			int temp=(int )enemy.animal[enemy.selectanimal].defencenumber;
			enemy.animal[enemy.selectanimal].defencenumber-=degree*0.1;
			System.out.println("*"+enemy.animal[enemy.selectanimal].name+"*  的防御力从*"+temp+"*被削弱至-->**"+enemy.animal[enemy.selectanimal].defencenumber+"*");
		}
		if(x==3) {
			int temp=(int )animal[selectanimal].HP;
			animal[selectanimal].HP+=degree/4;
			System.out.println("*"+animal[selectanimal].name+"*  的血量从*"+temp+"*恢复至-->*"+animal[selectanimal].HP+"*");
		}
		if(x==4) {
			int temp=(int )enemy.animal[enemy.selectanimal].HP;
			int a=(int)animal[selectanimal].power;
			a*=(100-enemy.animal[enemy.selectanimal].defencenumber)/100;
			enemy.animal[enemy.selectanimal].HP-=a;
			System.out.println("造成了*"+a+"*的伤害。\n*"+enemy.animal[enemy.selectanimal].name+"*的血量从*"+temp+"*减少至-->**"+enemy.animal[enemy.selectanimal].HP+"*");
		}
		
	}
	
}