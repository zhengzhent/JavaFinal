package people;
import animals.Animal;
public class Enemy2 extends Enemy{
	public Enemy2() throws InterruptedException{
		number=2;
		degree=40;
		place="武斗镇 格斗系道馆";		//道馆
		name="藤树";					//姓名
		sex="男";					//性别
		face="赫赫有名的";				//样貌

		System.out.println("藤树：我是藤树，武斗道馆的道馆馆主！");
		Thread.sleep(1000);
		System.out.println("藤树：我在这附近的险浪中翻腾……");
		Thread.sleep(1000);
		System.out.println("藤树：在漆黑的洞窟中修行！");
		Thread.sleep(1000);
		System.out.println("藤树：想挑战我那就把你的实力……全部展现出来吧！");
		Thread.sleep(1000);
		animal[0]=new Animal();//携带的神奇宝贝
		animal[0].name="腕力";	
		animal[0].skill[1]="嘲讽";
		animal[0].skill[2]="借力";
		animal[0].skill[3]="十字劈";
		animal[0].skill[4]="爆裂拳";
		
		animal[1]=new Animal();
		animal[1].name="幕下力士";	
		animal[1].skill[1]="假动作*  ";
		animal[1].skill[2]="忍耐*  ";
		animal[1].skill[3]="飞沙脚*  ";
		animal[1].skill[4]="地球上投*  ";
		
		animal[2]=new Animal();	
		animal[2].name="玛莎娜";	
		animal[2].skill[1]="心灵感应";
		animal[2].skill[2]="双倍奉还";
		animal[2].skill[3]="冥想";
		animal[2].skill[4]="飞膝踢";
	}
}