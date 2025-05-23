package java018_collection.part13;

public class Java200_User {

	public static void main(String[] args) {
		FruitBox<Orange> fOrange = new FruitBox<Orange>();
		fOrange.store(new Orange());
		openAndAllBox(fOrange);
		
		FruitBox<Apple> fApple = new FruitBox<Apple>();
		fApple.store(new Apple());
		openAndAllBox(fApple);
		
		FruitBox<Fruit> fFruit = new FruitBox<Fruit>();
		fFruit.store(new Fruit());
		openAndAllBox(fFruit);
		
		FruitBox<Seoul> fSeoul = new FruitBox<Seoul>();
		fSeoul.store(new Seoul());
		
		
		openAndAllBox(fSeoul);
		/////////////////////////////////////////////////
		openAndExtendsBox(fFruit);
		openAndExtendsBox(fApple);
		openAndExtendsBox(fOrange);
		//////////////////////////////////////////////
		openAndSuperBox(fFruit);
		openAndSuperBox(fSeoul);
		
	}//end main()
	
	public static void openAndAllBox(FruitBox<?> param) {
		System.out.println(param.pullout());		
	}//end openAndAllBox()
	
	
   public static void openAndExtendsBox(FruitBox<? extends Fruit> param) {
	   param.pullout().showYou();
   }//end openAndExtendsBox()
   
   public static void openAndSuperBox(FruitBox<? super Fruit> param) {
	   Object obj = param.pullout();
	   Seoul f = (Seoul)obj;
	   f.showYou();	   
   }  
   
}//end class
