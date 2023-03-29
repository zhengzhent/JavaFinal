package people;
import animals.Animal;
public class Enemy5 extends Enemy{
	public Enemy5() throws InterruptedException{
		number=5;
		degree=100;
		place="琉璃市-水系道馆";		//道馆
		name="米可利";					//姓名
		sex="男";					//性别
		face="脾气暴躁的";				//样貌
		
		System.out.println("米可利：请容我正式介绍我自己。我是米可利，琉璃道馆的道馆馆主。");
		Thread.sleep(1000);
		System.out.println("米可利：接下来让我们谈谈你吧……你的气质变了，我能感觉到这一点。");
		Thread.sleep(1000);
		System.out.println("米可利：现在，把你和你的宝可梦的力量展现给我看吧。");
		Thread.sleep(1000);
		System.out.println("米可利：作为回礼，就由我和我的宝可梦演出一场水之幻影吧！");
		Thread.sleep(1000);
		animal[0]=new Animal();//携带的神奇宝贝
		animal[1]=new Animal();
		animal[2]=new Animal();
		animal[0].name="爱心鱼";
		animal[0].skill[1]="浸水";
		animal[0].skill[2]="爱心印章";
		animal[0].skill[3]="神秘守护";
		animal[0].skill[4]="水炮";

		animal[1].name="鲶鱼王";
		animal[1].skill[1]="水流尾";
		animal[1].skill[2]="掷泥";
		animal[1].skill[3]="水之波动";
		animal[1].skill[4]="大闹一番";
		
		animal[2].name="金鱼王";
		animal[2].skill[1]="幻象光线";
		animal[2].skill[2]="剧毒";
		animal[2].skill[3]="冲浪";
		animal[2].skill[4]="冰冻光束";
	}
}
