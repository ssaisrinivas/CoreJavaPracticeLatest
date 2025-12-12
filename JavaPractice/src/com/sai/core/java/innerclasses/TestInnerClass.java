package com.sai.core.java.innerclasses;

import java.math.BigDecimal;

import com.sai.core.java.innerclasses.OuterClass_InnerClassDemo.InnerAbstractClass;

public class TestInnerClass {

	public static void main(String[] args) {

		System.out.println("===================================================================");
		System.out.println();

		OuterClass_InnerClassDemo icd = new OuterClass_InnerClassDemo();

		OuterClass_InnerClassDemo.InnerConcreateClass icc = new OuterClass_InnerClassDemo().new InnerConcreateClass(
				"Inner Concreate Class Variable");

		System.out.println("Inner Concreate class access !!");
		System.out.println("----------------------------------------------------------");
		System.out.println("Before Update ==>" + icc.innerClassVar);

		icc.innerClassVar = "Modified Concreate Inner Class String Variable";
		System.out.println("After Update ==>" + icc.innerClassVar);

		System.out.println(icc.finalInnerClassVar);
		System.out.println(OuterClass_InnerClassDemo.InnerConcreateClass.staticInnerClassVar);

		System.out.println("Inner Concreate class Methods !!");
		System.out.println("----------------------------------------------------------");
		icc.innerClassMethod();
		// icc.innerClassPrivateMethod();
		icc.innerClassFinalMethod();
		icc.innerInterfaceAbstractMethod();
		OuterClass_InnerClassDemo.InnerConcreateClass.innerClassStaticMethod();

		System.out.println("===================================================================");
		System.out.println();

		System.out.println("Inner Concreate class with InnerInterface Methods !!");
		System.out.println("----------------------------------------------------------");

		OuterClass_InnerClassDemo.InnerInterface icci = new OuterClass_InnerClassDemo().new InnerConcreateClass(
				"Inner Concreate Class Variable");

		icci.innerInterfaceAbstractMethod();
		icci.innerInterfaceDefaultMethod();
		System.out.println(icci.innerInterface);

		System.out.println("===================================================================");
		System.out.println();

		System.out.println("Inner Abstract class access !!");
		System.out.println("----------------------------------------------------------");

		OuterClass_InnerClassDemo.InnerAbstractClass ica = new OuterClass_InnerClassDemo().new InnerAbstractClass(
				"Inner Abstract Class Variable !!!") {

			@Override
			public void innerAbstractClassAbstractMethod() {
				System.out.println("Inner Abstract Class Abstract Method anonymous Implementation !!");
			}
		};

		ica.innerAbstractClassAbstractMethod();
		ica.innerAbstractClassConcreateMethod();
		System.out.println(ica.innerAbstClassVar);
		System.out.println(ica.finalInnerAbstClassVar);
		System.out.println(InnerAbstractClass.staticInnerAbstClassVar);

		System.out.println("===================================================================");
		System.out.println();

		System.out.println("Inner Interface access !!");
		System.out.println("----------------------------------------------------------");

		OuterClass_InnerClassDemo.InnerInterface ici = new OuterClass_InnerClassDemo.InnerInterface() {

			@Override
			public void innerInterfaceAbstractMethod() {
				System.out.println("Inner Interface Abstract Method Implementation !!!");
			}
		};

		ici.innerInterfaceAbstractMethod();
		ici.innerInterfaceDefaultMethod();
		OuterClass_InnerClassDemo.InnerInterface.innerInterfaceStaticMethod();
		System.out.println(OuterClass_InnerClassDemo.InnerInterface.innerInterface);

		System.out.println("===================================================================");
		System.out.println();

		System.out.println("Inner Enum access !!");
		System.out.println("----------------------------------------------------------");

		OuterClass_InnerClassDemo.ColourEnum enumValue = OuterClass_InnerClassDemo.ColourEnum.GREEN;

		System.out.println("Enum Value is : " + enumValue);

		System.out.println("===================================================================");
		System.out.println();

		System.out.println("Outer Class access !!");
		System.out.println("----------------------------------------------------------");

		System.out.println(icd.finalStringVar);
		System.out.println(icd.stringVar);
		System.out.println(OuterClass_InnerClassDemo.staticStringVar);

		icd.concreateMethod();
		icd.finalMethod();
		OuterClass_InnerClassDemo.staticMethod();

		System.out.println("===================================================================");
		System.out.println();

		System.out.println("Inner Private class access !!");

		icd.innerPrivateClassAccessMethod();
		System.out.println("===================================================================");
		System.out.println();

		System.out.println("Inner Final Class access !!");
		System.out.println("----------------------------------------------------------");

		OuterClass_InnerClassDemo.InnerFinalClass ifc = new OuterClass_InnerClassDemo().new InnerFinalClass();
		ifc.innerFinalClassMethod();

		System.out.println("===================================================================");
		System.out.println();

		System.out.println("Inner Static Class access !!");
		System.out.println("----------------------------------------------------------");
		OuterClass_InnerClassDemo.InnerStaticClass isc = new OuterClass_InnerClassDemo.InnerStaticClass();
		isc.innerStaticClassMethod();

		System.out.println("===================================================================");
		System.out.println();

		System.out.println("InterFace Inner Class access !!");
		System.out.println("----------------------------------------------------------");

		OuterInterface_InnerClassInInterfaceDemo.InterfaceInnerClass iic = new OuterInterface_InnerClassInInterfaceDemo.InterfaceInnerClass();
		iic.interfaceinnerClassFinalMethod();
		iic.interfaceinnerInterfaceConcreateMethod();
		OuterInterface_InnerClassInInterfaceDemo.InterfaceInnerClass.interfaceinnerClassStaticMethod();

		OuterClass_InnerClassDemo outer = new OuterClass_InnerClassDemo();
		outer.innerInterfaceDefaultMethod();
		outer.interfaceAbstractMethod();
		
		System.out.println("===================================================================");
		System.out.println();

		System.out.println("Interface Anonymosly accessing !!");
		System.out.println("----------------------------------------------------------");

		OuterInterface_InnerClassInInterfaceDemo interdemo = new OuterInterface_InnerClassInInterfaceDemo() {

			
			@Override
			public void interfaceAbstractMethod() {
				System.out.println("This is from Inside Interface Anonymos inner class !!");
				
			}};
		
			interdemo.innerInterfaceDefaultMethod();
			interdemo.interfaceAbstractMethod();
			OuterInterface_InnerClassInInterfaceDemo.innerInterfaceStaticMethod();
			
		System.out.println("===================================================================");
		System.out.println();
		
		BigDecimal decimal = new BigDecimal(10);

	}

}
