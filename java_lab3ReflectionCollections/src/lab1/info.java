package lab1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class info {
	public void getInfoClass(Class c) {
		System.out.println("\n==CLASS==\n" + c.getName());
		//вывести все поля
		getFields(c);
		//вывести все конструкторы
		getConstructors(c);
		//вывести все методы
		getMethods(c);
		//вывести все аннотации
		getAnnotations(c);
		//вывести все интерфейсы
		getInterfaces(c);
		//вывести родителя
		Class s = c.getSuperclass();
		if (s != null) {
			System.out.println("==EXTENDS==\n" + s.getName());
			getInfoClass(c.getSuperclass());
		}
	}

	public void methodClassToString(Object o) {
		Method method;
		Class cls = o.getClass();
		try {
			method = cls.getMethod("toString");
			System.out.println("toString: " + method.invoke(o));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void methodClassCompareTo(Object o1, Object o2) {
		Method method;
		Class cls = o1.getClass();
		try {
			Class[] paramTypes = new Class[] {o2.getClass()}; 
			method = cls.getMethod("compareTo", paramTypes);
			Object[] args = new Object[] {o2}; 
			System.out.println("compareTo: " + method.invoke(o1, args));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void getFields(Class c) {
		Field[] fields = c.getDeclaredFields();
		if (fields.length != 0) {
			System.out.println("==FIELDS==");
			for (Field field : fields)
				System.out.println(field.toString());
		}
	}
	
	void getConstructors(Class c) {
		Constructor[] constructors = c.getConstructors();
		if (constructors.length != 0) {
			System.out.println("==CONSTRUCTORS==");
			for (Constructor constructor : constructors) 
	            System.out.println(constructor.toString());
        }
	}
	
	void getMethods(Class c) {
		Method[] methods = c.getDeclaredMethods();
		if (methods.length != 0) {
			System.out.println("==METHODS==");
			for (Method method : methods) 
	            System.out.println(method.toString());
        }
	}
	
	void getInterfaces(Class c) {
		Class[] interfaces = c.getInterfaces();
		if (interfaces.length != 0) {
			System.out.println("==INTERFACES==");
			for (Class inter : interfaces) 
	            System.out.println(inter.toString());
        }
	}
	void getAnnotations(Class c) {
		
		Method[] methods = c.getDeclaredMethods();
		if (methods.length != 0) {
			System.out.println("==ANNOTATIONS==");
			for (Method method : methods) { 
	            System.out.println(method.toString());
	            System.out.println(method.getDeclaredAnnotations().toString());
			}
        }
	}

}

