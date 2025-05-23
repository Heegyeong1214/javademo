package java009_inheritance.prob.part03;

public class MovieWork extends Movie {
	private int cinematic; // 작품성
	private int popular; // 대중성
	private int scenario; // 시나리오

	public MovieWork(String title, int director, int acter, int cinematic, int popular, int scenario) {
		super(title, director, acter);
		this.cinematic = cinematic;
		this.popular = popular;
		this.scenario = scenario;
	}

	@Override
	void display() {
		super.display();
		System.out.printf("감독 : %d, 배우 : %d, 작품성:%d, 대중성: %d, 대본:%d\n",director,acter,cinematic, popular, scenario);
		
		;
	}
}