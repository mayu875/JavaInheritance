
import com.div.Divclass;

public class JavaClass extends Divclass{
	
	public void callParentMethod() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JavaClass obj = new JavaClass();
		obj.callParentMethod();
		
		int add = new JavaClass().addition(10,10);
		int sub = new JavaClass().substraction(10,10);
		int mul = new JavaClass().multiplicaion(10,10);
		int div = new JavaClass().division(10,10);
		
		System.out.println("Additin "+add);
		System.out.println("Substraction "+sub);
		System.out.println("Multiplicationis "+mul);
		System.out.println("Division "+div);

        //System.out.println(add+"\n" +sub+"\n"+mul+"\n"+div);
	}

}
........................................................................................................................................
public class Addclass {

	public int addition(int a,int b) {
		return a+b;

	}

}
........................................................................................................................................

import com.add.Addclass;

public class Subclass extends Addclass{
	
	public int substraction(int a,int b) {
		return a-b;

	}

}

........................................................................................................................................
import com.sub.Subclass;

public class Mulclass extends Subclass{
	
	public int multiplicaion(int a,int b) {
		return a*b;
	}
}

........................................................................................................................................
import com.mul.Mulclass;

public class Divclass extends Mulclass {

	public int division(int a,int b) {
		return a/b;

	}

}
