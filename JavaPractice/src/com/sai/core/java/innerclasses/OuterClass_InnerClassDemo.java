package com.sai.core.java.innerclasses;

public class OuterClass_InnerClassDemo implements OuterInterface_InnerClassInInterfaceDemo{

	public String stringVar = "Instance String";
	public static String staticStringVar = "Static String";
	public final String finalStringVar = "Final String";

	public OuterClass_InnerClassDemo(String saml) {

		this.stringVar = saml;

	}

	public OuterClass_InnerClassDemo() {

		super();
	}

	public void concreateMethod() {

		System.out.println("Concreate Method !! " + stringVar);
	}

	public static void staticMethod() {

		System.out.println("Static Method !!");
	}

	public final void finalMethod() {

		System.out.println("Final Method !!");
	}

	{

		System.out.println("Instance Block !!");
		System.out.println("===================================================================");
		System.out.println();
	}

	static {

		System.out.println("Static Block !!");
		System.out.println("===================================================================");
		System.out.println();
	}

	public enum ColourEnum {

		RED, ORANGE, GREEN
	}

	public class InnerConcreateClass implements InnerInterface {

		public String innerClassVar;
		public static String staticInnerClassVar = "Static Concreate Inner String";
		public final String finalInnerClassVar = "Final Concreate Inner String";

		public InnerConcreateClass(String var) {

			this.innerClassVar = var;

		}

		public void innerClassMethod() {

			System.out.println("Concreate Inner Class Method !!     ==> " + innerClassVar);
		}

		public static void innerClassStaticMethod() {

			System.out.println("Concreate Inner Class Static Method !!");
		}

		public final void innerClassFinalMethod() {

			System.out.println("Concreate Inner Class Final Method !!");
		}

		private static void innerClassPrivateMethod() {

			System.out.println("Concreate  Inner Class Private Method !!  ");
		}

		@Override
		public void innerInterfaceAbstractMethod() {
			System.out.println("Concreate Inner Class Implemented Method from InnerInterface!! ");
			
		}
	}

	public final class InnerFinalClass {
		
		public  void innerFinalClassMethod() {

			System.out.println("Inner Final Class Method !!");
		}
	}

	public static class InnerStaticClass {

		public String staticVariable="";
		
		
		public  void innerStaticClassMethod() {
			
			System.out.println("Inner Static Class Method !!");
		}
	}

	public interface InnerInterface {

		String innerInterface = "Inner Interface Variable !!";

		public void innerInterfaceAbstractMethod();

		default void innerInterfaceDefaultMethod() {

			System.out.println("Inner interface Default Method !!" + innerInterface);
		}

		public static void innerInterfaceStaticMethod() {

			System.out.println("Inner interface Static Method !!");
		}

	}

	public abstract class InnerAbstractClass {

		public String innerAbstClassVar = "Inner Class Abst Variable";
		public static String staticInnerAbstClassVar = "Static Inner Abst String";
		public final String finalInnerAbstClassVar = "Final Inner Abst String";

		public InnerAbstractClass(String str) {

			this.innerAbstClassVar = str;

		}

		public abstract void innerAbstractClassAbstractMethod();

		public void innerAbstractClassConcreateMethod() {

			System.out.println("Inner interface Default Method !!" + innerAbstClassVar);
		}
	}

	private class InnerPrivateClass {

		public String innerAbstClassVar;
		public static String staticInnerAbstClassVar = "Static Inner Private String";
		public final String finalInnerAbstClassVar = "Final Inner Private String";

		public InnerPrivateClass(String str) {

			this.innerAbstClassVar = str;

		}

		public void innerPrivateClassMethod() {

			System.out.println("Inner Private class Default Method !!");
		}
	}

	public void innerPrivateClassAccessMethod() {

		InnerPrivateClass ipc = new InnerPrivateClass("Inner Private Class Variable");
		System.out.println(ipc.finalInnerAbstClassVar);
		System.out.println(InnerPrivateClass.staticInnerAbstClassVar);

		ipc.innerPrivateClassMethod();

		System.out.println("Inner Concreate class Private Method from InnerPrivateClassAccessMethod() !!!");
		InnerConcreateClass.innerClassPrivateMethod();
	}

	public void innerAbstractClassAccessMethod() {

		InnerAbstractClass iac = new InnerAbstractClass("Inner Abstract Class Variable !!!") {

			@Override
			public void innerAbstractClassAbstractMethod() {
				System.out.println("Inner Abstract Class Abstract Method anonymous Implementation !!");

			}
		};

		iac.innerAbstractClassAbstractMethod();
		iac.innerAbstractClassConcreateMethod();
		System.out.println(iac.innerAbstClassVar);
		System.out.println(iac.finalInnerAbstClassVar);
		System.out.println(InnerAbstractClass.staticInnerAbstClassVar);
	}

	@Override
	public void interfaceAbstractMethod() {
		System.out.println("This is from OuterInterface_InnerClassInInterfaceDemo interface");
		
	}
}
