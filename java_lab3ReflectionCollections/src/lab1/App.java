package lab1;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class App implements Serializable{
	public static void main(String[] args)  {
		//������� 1 (������ � ����������� java) 
		collect col = new collect();
		col.createMAP();
		col.createSET();
		col.createLIST();
		
		//������� (����� ���������� � ������)
		//��������� ����������
		String str = "Test1";
		//�������� �����
		Class cls = str.getClass();
		//�������� ���������� � ������
		info infoClass = new info();
		infoClass.getInfoClass(cls);
		//�������� ������
		infoClass.methodClassToString(str);
		infoClass.methodClassCompareTo(str, "Test2");
		
		
	}
}
