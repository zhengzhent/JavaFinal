package people;
public class Enemy extends People{
	public String place;
	public int number;
	
	
	public void Regin() {	//���õ��˵����汦��Ѫ����
		for(int i=0;i<=2;i++) {
			animal[i].HP=50+degree;
			animal[i].life=1;
			animal[i].power=degree*0.5+20;
			animal[i].defencenumber=degree*0.5;
		}
	}
	
	public boolean Select() {//�Զ�ѡ��������汦��
		int choice;
		for(choice=0;choice<=2;choice++) {
			if(animal[choice].HP>0) {
				selectanimal=choice;
				return true;}
		}
	return false;
	}
}
	
