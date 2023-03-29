package people;
import animals.Animal;
public class Enemy3 extends Enemy{
	public Enemy3() throws InterruptedException{
		number=3;
		degree=60;
		place="釜炎镇--火系道馆";		//道馆
		name="亚莎";					//姓名
		sex="女";					//性别
		face="不太平凡的";				//样貌
		
		System.out.println("亚莎：欢迎……哦不，微不足道的挑战者啊，真高兴能看见你坚持到这里！");
		Thread.sleep(1000);
		System.out.println("亚莎：爷爷托付我……我是说，我是亚莎，是这里的道馆馆主！");
		Thread.sleep(1000);
		System.out.println("亚莎：那个……虽然我不久前才刚上任，但你可别小看我！");
		Thread.sleep(1000);
		System.out.println("亚莎：我有爷爷传授给我的技巧，我会，那个……让你见识一下我们在这片土地上磨砺而出的火辣招式！");
		Thread.sleep(1000);
		animal[0]=new Animal();//携带的神奇宝贝
		animal[1]=new Animal();
		animal[2]=new Animal();
		animal[0].name="熔岩虫";
		animal[0].skill[1]="浊雾";
		animal[0].skill[2]="瞬间失忆";
		animal[0].skill[3]="自我再生";
		animal[0].skill[4]="泰山压顶";

		animal[1].name="煤炭龟";
		animal[1].skill[1]="铁壁";
		animal[1].skill[2]="喷烟";
		animal[1].skill[3]="清除之烟";
		animal[1].skill[4]="炼狱";
		
		animal[2].name="呆火驼";
		animal[2].skill[1]="聚气";
		animal[2].skill[2]="叫声";
		animal[2].skill[3]="大地之力";
		animal[2].skill[4]="烈焰溅射";
	}
}
