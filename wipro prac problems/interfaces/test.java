package live;
import music.playable;
import com.wipro.music.string.veena;
import  music.wind.saxophone;;
public class test {
public static void main(String[] args) {
	veena obj1=new veena();
	obj1.play();
	saxophone obj2=new saxophone();
	obj2.play();
	playable obj3=new veena();
	obj3.play();
	playable obj4=new saxophone();
	obj4.play();
}
}
