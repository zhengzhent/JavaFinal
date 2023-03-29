package people;
import java.util.*;
import animals.Jienigui;
import animals.Pikaqiu;
import animals.Xiaohuolong;
public class Player extends People {
	public int goal[]= {0,0,0,0,0,0};		//goal表示玩家当前打败的道馆
	Scanner s=new Scanner(System.in);
	public Player() throws Exception{
		degree=10;
		animal[0]=new Pikaqiu();
		animal[1]=new Jienigui();
		animal[2]=new Xiaohuolong();
		//游戏背景
		System.out.println("在Pokemon World，并存着人类和神奇宝贝。");
		Thread.sleep(1000);
		System.out.println("神奇宝贝们平时可以被缩小收入一个叫做精灵球的球内，被训练师带在身上或放在口袋中，因此也被称为“口袋妖怪”。");
		Thread.sleep(1500);
		System.out.println("人类与神奇宝贝和谐相处，并且也诞生了许多和神奇宝贝有关的职业，像培育师、训练师等。");
		Thread.sleep(1200);
		System.out.println("在这个游戏中，你作为一名神奇宝贝的训练师，以成为一名优秀的训练师为目标，踏上了与其他训练师切磋战斗的奋斗之路。");
		Thread.sleep(1500);
		System.out.println("路途中充满了机遇与挑战，训练师也在朝着自己心中的目标不断前进……");
		Thread.sleep(2000);
		System.out.println("Loading...");
		Thread.sleep(2000);
		System.out.println("Loading...");
		Thread.sleep(2000);
		System.out.println("大木博士：亲爱的训练师你好，欢迎来到Pokemon世界，请问您的性别是（请输入数字）：");
		System.out.println("1：男		2：女");
		int a =s.nextInt();
		if(a==1) {
			this.sex="男";
			System.out.println("大木博士：原来是一位勇敢的男孩呀，请给自己取一个霸气的名字吧！");
		}
		else if(a==2){
			this.sex="女";
			System.out.println("大木博士：原来是一位善良的女孩呀，请给自己取一个美丽的名字吧!");}
		name=s.next();		
		
		if(a==1) {
			System.out.println("大木博士："+name+"   真是个好名字呢！相信你一定是一位帅气的训练师！");
		}else {
			System.out.println("大木博士："+name+"   真是个好名字呢！相信你一定是一位美丽的训练师！");
		}
		Thread.sleep(1500);
		System.out.println("大木博士：好看的外表在Pokemon世界可是会吸引许多神奇宝贝的哟！接下来请给自己的角色设置样貌吧！（请输入数字）");
		System.out.println("1-玉树临风	2-样貌平平	3-眉清目秀	4-冷艳美丽");
		int x=s.nextInt();
		if (x==1)face="玉树临风";
			else if (x==2)face="样貌平平";
			else if (x==3)face="眉清目秀";
			else if (x==4)face="冷艳美丽";
		Thread.sleep(500);
		System.out.println("大木博士：好的呢****"+face+"的"+name+"****");
		System.out.println("大木博士：在宝可梦世界,宝可梦是训练师最好的伙伴，了解主人的性格也有利于神奇宝贝更好地和训练师一起追寻梦想。"
				+ "现在让我们了解你的性格吧！（请输入数字）");
		System.out.println("1-外向开朗	2-文质彬彬	3-沉默寡言	4-幽默风趣");
		int xg=s.nextInt();
		if (xg==1)xingge="外向开朗";
		else if (xg==2)xingge="文质彬彬";
		else if (xg==3)xingge="沉默寡言";
		else if (xg==4)xingge="幽默风趣";
		
		Thread.sleep(1000);
		System.out.println(face+"且"+xingge+"的"+name+"   恭喜你已经完成了对自己信息的录入！\n"
				+"\n大木博士：接下来请选择一个喜欢的初始神奇宝贝吧。\n它将是你最好的伙伴，并伴随你一起追逐梦想！！！");
		Thread.sleep(500);
		System.out.println("0-皮卡丘	1-杰尼龟	2-小火龙");
		while(true) {
			selectanimal =s.nextInt();
			if(selectanimal<=2&&selectanimal>=0)break;
		System.out.println("错误的选择呢，请重新输入序号");	
		}		
		animal[selectanimal].life=1;
		Regin();
		Thread.sleep(1000);
		if(selectanimal==0) {
			System.out.println("PiKa!PiKa!(皮卡丘发出叫声并且向你放电)");
			Thread.sleep(1000);
			System.out.println("大木博士：阁下的眼光真好，相信勇敢的**"+animal[selectanimal].name+"**一定能帮助你顺利完成这次的奇妙探险！！！");
		}else if(selectanimal==1) {
			System.out.println("JieNi!JieNi!（杰尼龟发出叫声并且向你喷水）");
			Thread.sleep(1000);
			System.out.println("大木博士：阁下的眼光真好，相信勇敢的**"+animal[selectanimal].name+"**一定能帮助你顺利完成这次的奇妙探险！！！");
		}else {
			System.out.println("Hooooooh!!（小火龙发出叫声并且点燃一束火苗）");
			Thread.sleep(1000);
			System.out.println("大木博士：阁下的眼光真好，相信勇敢的**"+animal[selectanimal].name+"**一定能帮助你顺利完成这次的奇妙探险！！！");
		}
		Thread.sleep(1000);
		System.out.println("大木博士：哦等等~输入我校的校训还可以获得额外的初始等级：");
		String key = s.next();
		if(key.equals("求是")) {
			this.degree+=10;
			System.out.println("大木博士：恭喜您回答正确！");
		}else {
			System.out.println("大木博士：很抱歉，我校校训是求是哦~您失去了增加等级的机会");
		}
		System.out.println("大木博士：赶快踏上这片神奇的大陆，开始你的探险之旅吧！");
		Thread.sleep(2000);
	}
	
	public boolean Select() {//选择要出战的神奇宝贝

	if(animal[selectanimal].life==1&&animal[selectanimal].HP>0) {
		System.out.println("当前准备出战的神奇宝贝为**"+animal[selectanimal].name+"**  当前血量为："+animal[selectanimal].HP);
	}
		int flag=0;					//标志位，如果为0则表明没有存活的精灵
		for(int i=0;i<=2;i++) { 
			if(animal[i].life==0)continue;
			if((animal[i].HP)>0){
				animal[i].life=1;
				flag=1;
				System.out.print(i+"--"+animal[i].name+"	血量为："+animal[i].HP+"\n");	
			}
			if((animal[i].HP)<=0){
				animal[i].HP=0;
				animal[i].life=2;
				System.out.print(animal[i].name+"已经阵亡，无法出战");	
			}
		}
		
		if(flag==0) {
			System.out.println("已经没有可以继续战斗的神奇宝贝,请尽快前往神奇宝贝医院进行治疗！");
			return false;
		}
		System.out.println("请确认你要出战的神奇宝贝！（输入序号）");
		while(true) {
			selectanimal=s.nextInt();
			if(selectanimal<=2&&selectanimal>=0) break;
		System.out.println("错误的神奇宝贝序号！（请重新输入）");	
		}
		while(animal[selectanimal].HP<0||animal[selectanimal].life!=1) {
			animal[selectanimal].HP=0;
			if(animal[selectanimal].life==2)System.out.println(animal[selectanimal].name+"已经阵亡，请重新选择你要出战的神奇宝贝！");
			if(animal[selectanimal].life==0)System.out.println(animal[selectanimal].name+"尚未捕获，请重新选择你要出战的神奇宝贝！");
			selectanimal=s.nextInt();
		};
		System.out.println("当前出战的神奇宝贝为**"+animal[selectanimal].name+"**  当前血量为："+animal[selectanimal].HP);
		return true;
	}
	public void Regin() {				//初始化生命值
		int i;
		for(i=0;i<=2;i++) {
			if(animal[i].life!=0) {
				animal[i].HP=50+degree;
				animal[i].power=10+degree*0.5;
				//animal[i].power=1000;
				animal[i].defencenumber=degree*0.5;
			}
		}
	}
	
	public void Fight(Enemy enemy) {				//战斗系统
		System.out.println("_____________________________");
		System.out.println("欢迎挑战"+enemy.place+"--"+enemy.face+enemy.name);   //	
		System.out.println("_____________________________\n");
		enemy.Regin();
		if(!Select())return ;
		int count=1;
		int x=5;
		while(enemy.Select()) {	
			System.out.println("_______________________________\n第*"+count+++"*回合  请选择*"+animal[selectanimal].name+"*的技能");
			for(int i=1;i<=4;i++) {
				System.out.print(i+"--"+animal[selectanimal].skill[i]+"   ");}
			System.out.print("5--退出当前战斗\n");
			while(true) {
				x=s.nextInt();
				if(x>=1&&x<=5)break;
			System.out.print("错误的行动指令！！请重新输入");	
			}
			 
			 
			if(x==5)break;
			fight(enemy,x);				//我方攻击
			
			if(enemy.animal[enemy.selectanimal].HP<=0){
				enemy.animal[enemy.selectanimal].life=2;
				System.out.println("你已经成功击杀了"+enemy.animal[enemy.selectanimal].name);
				System.out.println("---------------------------");
				if(enemy.Select())System.out.println("接下来轮到"+enemy.animal[enemy.selectanimal].name +"上场了，请玩家小心应对");
				continue;
			}
			System.out.println("_____________________________接下来轮到"+enemy.name+"进攻了");
			if(x==4) {
			x=(int)(Math.random() * 4)+1;
			if(x%2==0)enemy.fight(this,4);
			else enemy.fight(this,x);
			}else {
			x=(int)(Math.random() * 4)+1;
			enemy.fight(this,x);		//敌方攻击
			}
			if(animal[selectanimal].HP<=0){	
				animal[selectanimal].life=2;
				System.out.println(animal[selectanimal].name+"已经成功阵亡了");
				if(!Select())return;
				continue;
			}
		}
		if(x==5)return;
		switch(enemy.number) {
		case 1:{
			System.out.println("杜鹃：好像还有很多很多的东西要学啊……我还会参加锦标赛。那时候还能请你做我的对手吗？");
			break;
		}
		case 2:{
			System.out.println("藤树：你的才能终有一天会成就浪潮。在宝可梦训练家中卷起骇人的风暴吧！");
			break;
		}
		case 3:{
			System.out.println("亚莎：我输了，但是我很满足。像这样激烈的战斗可不是每天都有的。有空的话再来一场吧！");
			break;
		}
		case 4:{
			System.out.println("千里：……怎么可能……我居然会……输给你……");
			break;
		}
		case 5:{
			System.out.println("米可利：太棒了！你真的是太棒了！你是一个真正的宝可梦训练家。我为能遇见你和你的宝可梦而喜悦。");
			break;
		}
		}
		System.out.println("恭喜你已经成功战胜*"+enemy.number+enemy.place+"*！！");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		degree+=(int)(20*(1+enemy.number/10)+enemy.number);
		System.out.println("**你的等级获得了大额提升，当前等级为--"+degree+"--**\n");
		goal[enemy.number]=1;
		
		if(enemy.number==1) {
			System.out.println("！！！你获得了再一次捕获神奇宝贝的机会！！！");
		
			while(true){
			System.out.println("0-皮卡丘	1-杰尼龟	2-小火龙");	
			selectanimal =s.nextInt();	
			if(selectanimal>2||selectanimal<0) {
				System.out.println("哦这真是一个糟糕的选择，请重新选择。");
				continue;
			}
			if(animal[selectanimal].life!=0) {
				System.out.println("该神奇宝贝已经被驯服啦，请重新选择");
				continue;
			}
			break;
			}
			System.out.println("你成功捕获了 *"+animal[selectanimal].name+"* ！！！");
			animal[selectanimal].life=1;
			Regin();
		}
		
		else if(enemy.number==2) {
			System.out.println("恭喜你获得了另外一只神奇宝贝，它等候你很久啦！！！");
			int i;
			for(i=0;i<=2;i++)if(animal[i].life==0)break;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("它就是--"+animal[i].name+"--。");
			animal[i].life=1;
			Regin();
		}	else return;
		
	}
	public void Home() throws InterruptedException{//回家做点事情
		System.out.println("机器人管家：亲爱的主人,欢迎你回家。在外奔波一天一定累了吧，回家好好休息！");
		System.out.println("请选择你要进行的活动吧!");
		int x=0;
		while(true) {
			System.out.println("1--洗澡 2--睡觉 3--吃饭 4--看书 5--离开");
			 x=s.nextInt();
			 if(x==5)return;
			if(x>=1&&x<=4) break;
			System.out.println("未能识别到该动作，请重新选择");	
		}
		String temp=null;
		switch(x) {
		case 1:temp="洗澡";break;
		case 2:temp="睡觉";break;
		case 3:temp="吃饭";break;
		case 4:temp="看书";break;
		}
		for(int i=1;i<=5;i++) {
			System.out.println("--"+temp+"中-- ("+i+"/5)");
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(x==4) {
			System.out.println("在知识的海洋里遨游，你的等级提升了！");
			int last = degree;
			degree++;
			System.out.println("你的等级从： "+last+" 提升到 " + degree);
		}
		Thread.sleep(700);
		System.out.println(temp+"已经顺利完成，请继续前进吧！ ");
	}
	public void Hospital() {//去医院加血
		System.out.println("牡丹院长：欢迎光临，亲爱的"+name+",这里是神奇宝贝中心。");
		System.out.println("我们的主要工作是负责神奇宝贝的治疗，这里也休息着很多受伤的神奇宝贝，请选择你要进行的行动吧！");
		int x=0;
		while(true) {
			System.out.println("1--治疗 2--参观 3--离开");
			 x=s.nextInt();
			 if(x==3)return;
			if(x>=1&&x<=2) break;
			System.out.println("未能识别到该动作，请重新选择");	
		}
		if(x==1) {	
		Regin();
		System.out.println("_____________________________");
		for(int i=0;i<=2;i++) {
			if(animal[i].life==0)continue;
			System.out.println("--正在给**"+animal[i].name+"**进行治疗");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("牡丹院长：*"+face+"的"+name+"您所有的神奇宝贝均已经治疗完毕，请继续战斗吧\n");}
		if(x==2) {	

			for(int i=0;i<=2;i++) {
				System.out.println("--正在参观中--(**"+(i+1)+"/3)");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("您已经参观完毕，请继续战斗吧");}
		
		
	}
	public void Outside() {//去提升等级
		System.out.println("*"+face+name+"*这里是十分危险的野外，在这里你可以提升自己等级，帮助你快速战胜对手。\n");
		
		while(true) {
			System.out.println("如果选择继续前进请按1");
			if(s.nextInt()!=1)return;
			System.out.println("\n让我们看看这次的对手是谁吧！");	
			for(int i=0;i<=2;i++) {
				System.out.println("--正在搜索中--(**"+(i+1)+"/3)");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
			}
		int x=(int)(Math.random() * 4)+1;
		
		switch(x) {
		case 1:System.out.println("发现一只**耿鬼**它躲藏起来了。");break;
		case 2:System.out.println("哦，一只稀有的**超梦**它隐秘的飞向了一处。");break;
		case 3:System.out.println("这应该是**喵喵怪**胆小的它掩在某处。");break;
		case 4:System.out.println("是狡黠的**波克比**它就在某一处等候。");break;
		}
		String m=null;
		String n=null;
		int choice;
		while(true) {
		System.out.println("\n请选择你的攻击方向。");
		System.out.println("1--北面 2--南面 3--西面 4--东面 5--离开");

		choice=s.nextInt();
		if(choice==5) {
			System.out.println("下次再来吧");
			return;}
		if(x>=1&&x<=4)break;
		System.out.println("哦，这应该是一个错误的选择。");
		}
		
		switch(choice){
			case 1:m="北面";break;
			case 2:m="南面";break;
			case 3:m="西面";break;
			case 4:m="东面";break;
		}
		x=(int)(Math.random() * 4)+1;
		switch(x){
			case 1:n="北面";break;
			case 2:n="南面";break;
			case 3:n="西面";break;
			case 4:n="东面";break;
	}
		System.out.println("你攻击的方向是--"+m+"  它躲藏在--"+n+"\n");
		if(x==choice) {
			degree++;
			System.out.println("恭喜你，攻击到了正确的方向，你的等级+1，当前等级为--"+degree+"--");
		}else {
			System.out.println("很遗憾，没有命中对方。");
		}
		
		}
	}
	public boolean Goal(int x) {//判断是否以及挑战完所有道馆		
		for(int i=1;i<=5;i++)
		if(goal[i]==0)return true;
		return false;
	}
	public boolean Goal() {//输出已经战胜的道馆
		System.out.println("查询中………… ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		int flag=0;
		for(int i=1;i<=5;i++) {
		if(goal[i]==1)	{
			if(flag==0)flag=1;
			switch (i){
			case 1:System.out.println("*卡那兹     岩石系道馆【杜娟】，岩石徽章* ");break;
			case 2:System.out.println("*武斗镇     格斗系道馆【藤树】，拳击徽章* ");break;
			case 3:System.out.println("*釜炎镇     火    系道馆【亚莎】，烈焰徽章* ");break;
			case 4:System.out.println("*橙华市     普通系道馆【千里】，天秤徽章 * ");break;
			case 5:System.out.println("*琉璃市     水    系道馆【米可利】，雨滴徽章 * ");break;
			}
		}
		}
		if(flag==0) {
			System.out.println("\n你目前还没有成功挑战任何道馆哦，请训练师继续努力！");
			return false;
		}
		return true;
	}
	public void Go(int choice) throws InterruptedException {//选择自己的行动
		if(choice==1) {
			System.out.println("请选择你准备挑战的道馆！");
			do{
				System.out.println("1-岩石系道馆 2-格斗系道馆 3-火系道馆 4-普通系道馆 5-水系道馆");  //文本 该道馆推荐等级  +  您现在的等级  
				choice=s.nextInt();
				if(choice<1||choice>5) {
					System.out.println("这个选择不合适哦，再选择其他的选项吧！");
					choice=s.nextInt();
					continue;
				}
				if(goal[choice]==1) {
					System.out.println("你已经成功获得该道馆的徽章啦，请继续选择其他你准备挑战的道馆！");
					choice=s.nextInt();
					continue;
				}
			}while(goal[choice]!=0);
				
			System.out.println("该道馆推荐等级:"+choice*15+"	您现在的等级:"+degree+"\n是否继续选择挑战:  1--勇敢挑战	2--暂时放弃");
			if(s.nextInt()==2)return;
			Enemy enemy=null;
			switch(choice) {
			case 1:enemy=new Enemy1();break;
			case 2:enemy=new Enemy2();break;
			case 3:enemy=new Enemy3();break;
			case 4:enemy=new Enemy4();break;
			case 5:enemy=new Enemy5();break;
			}
			Fight(enemy);
		}
		else if(choice==2)Home();
		else if(choice==3)Hospital();
		else if(choice==4)Outside();
		else if(choice==5)Goal();
	}
	public void End() {//通关祝语
		System.out.println("亲爱的 *"+name+"* 您已经通关我们的所有道馆挑战！！！一路披荆斩棘属实不易，恭喜你达到了自己的梦想");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("非常感谢你能体验我们的游戏！！！");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print("希望我们……");
		try {
			Thread.sleep(700);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("有缘再会！！！");
		try {
			Thread.sleep(700);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("制作：颜逸腾 郑振涛");
	}
	
}
	


