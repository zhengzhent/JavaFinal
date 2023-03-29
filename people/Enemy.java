package people;
public class Enemy extends People{
	public String place;
	public int number;
	
	
	public void Regin() {	//重置敌人的神奇宝贝血量。
		for(int i=0;i<=2;i++) {
			animal[i].HP=50+degree;
			animal[i].life=1;
			animal[i].power=degree*0.5+20;
			animal[i].defencenumber=degree*0.5;
		}
	}
	
	public boolean Select() {//自动选择存活的神奇宝贝
		int choice;
		for(choice=0;choice<=2;choice++) {
			if(animal[choice].HP>0) {
				selectanimal=choice;
				return true;}
		}
	return false;
	}
}
	
