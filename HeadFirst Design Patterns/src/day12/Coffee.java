package day12;

public class Coffee extends CaffeineBeverage{

	@Override
	void brew() {
		System.out.println("필터를 통해서 커피를 우려내는 중");
	}

	@Override
	void addCondiments() {
		System.out.println("설탕과 우유를 추가하는 중");
		
	}
}
