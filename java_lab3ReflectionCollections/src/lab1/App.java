package lab1;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class App implements Serializable{
	public static void main(String[] args)  {
		//задание 1 (работа с коллекци€ми java) 
		collect col = new collect();
		col.createMAP();
		col.createSET();
		col.createLIST();
		
		//задание (вывод информации о классе)
		//объ€вл€ем переменные
		String str = "Test1";
		//получаем класс
		Class cls = str.getClass();
		//получаем информацию о классе
		info infoClass = new info();
		infoClass.getInfoClass(cls);
		//вызываем методы
		infoClass.methodClassToString(str);
		infoClass.methodClassCompareTo(str, "Test2");
		
		
	}
}
