package people;
import animals.Animal;
public class Enemy1 extends Enemy{
	public Enemy1() throws InterruptedException{
		number=1;
		degree=20;
		place="卡那兹市-岩石系道馆";		//道馆
		name="杜娟";					//姓名
		sex="女";					//性别
		face="风度翩翩的";				//样貌
		
		System.out.println("杜娟：你好，我是卡那兹道馆的道馆馆主杜娟。");
		Thread.sleep(1000);
		System.out.println("杜娟：我想要把在宝可梦训练家学校中学到的知识应用到实战中去，所以才成为了道馆馆主。");
		Thread.sleep(1000);
		System.out.println("杜娟：我从大木博士那儿听说你已经是个小有名气的训练家了。但是，我认为我不会输给你！");
		Thread.sleep(1000);
		animal[0]=new Animal();//携带的神奇宝贝
		animal[0].name="朝北鼻";
		animal[0].skill[1]="嘲讽";
		animal[0].skill[2]="变硬";
		animal[0].skill[3]="聚沙";
		animal[0].skill[4]="沙暴 ";
		
		animal[1]=new Animal();
		animal[1].name="小拳石";
		animal[1].skill[1]="嘲讽";
		animal[1].skill[2]="岩石打磨";
		animal[1].skill[3]="隐形岩";
		animal[1].skill[4]="舍身冲撞";
		
		animal[2]=new Animal();	
		animal[2].name="摇篮百合";
		animal[2].skill[1]="惊吓";
		animal[2].skill[2]="扎根";
		animal[2].skill[3]="终极吸取";
		animal[2].skill[4]="绞紧";	
	}
}
