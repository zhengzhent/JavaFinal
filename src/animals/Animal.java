package animals;
import java.util.*;
public class Animal {
	public String name;					//神奇宝贝的名字
	public int HP=50;					//血量	初始为50滴
	public int life=0;					//存活情况	0未拥有	1存活		2阵亡
	public double defencenumber=0;		//防御力，初始为0
	public double power=10;				//攻击力,初始为10
	public String[] skill=new String[5];//技能名称
	Scanner s=new Scanner(System.in);		
}
