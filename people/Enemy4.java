package people;
import animals.Animal;
public class Enemy4 extends Enemy{
	public Enemy4() throws InterruptedException{
		number=4;
		degree=80;
		place="橙华市-普通系道馆";		//道馆
		name="千里";					//姓名
		sex="男";					//性别
		face="和蔼友善的";				//样貌
		
		System.out.println("千里：嗯……看来，你已经赢得好多徽章了。很好，那就按我所承诺的那样，让我们来战斗吧。");
		Thread.sleep(1000);
		System.out.println("千里：我真高兴能和自己的孩子来一场真真正正的战斗。但是，战斗就是战斗！");
		Thread.sleep(1000);
		System.out.println("千里：身为道馆馆主，我会尽我所能赢取胜利。你也要用尽全力啊！");
		Thread.sleep(1000);
		animal[0]=new Animal();//携带的神奇宝贝
		animal[1]=new Animal();
		animal[2]=new Animal();
		animal[0].name="向尾喵";
		animal[0].skill[1]="借助";
		animal[0].skill[2]="摇尾巴";
		animal[0].skill[3]="撒娇";
		animal[0].skill[4]="连环巴掌";

		animal[1].name="懒人獭";
		animal[1].skill[1]="健美";
		animal[1].skill[2]="哈欠";
		animal[1].skill[3]="燕返";
		animal[1].skill[4]="岩石封锁";
		
		animal[2].name="过动猿";
		animal[2].skill[1]="虚张声势";
		animal[2].skill[2]="水之波动";
		animal[2].skill[3]="起死回生";
		animal[2].skill[4]="暗影爪";
	}
}
