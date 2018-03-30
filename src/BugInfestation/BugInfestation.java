package BugInfestation;
import java.util.Scanner;

public class BugInfestation {
	
	public static void main(String[] args) { // 함수
	
		double ONE_BUG_VOLUME = 0.002; //벌레 한마리의 부피
		double GROWTH_RATE = 0.95; //벌레가 매주 자라는 속도
		double newBugs = 0; //매주 늘어나는 벌레 수
		double newBugVolume = 0; //매주 늘어나는 벌레의 부피
		
		Scanner input = new Scanner(System.in); //스캐너를 생성
		System.out.println("Enter the total volume of your house in cubic feet: "); //무엇을 입력해야하는지 출력
		double houseVolume = input.nextDouble(); //입력값을 houseVolume에 저장
		System.out.println("Enter the estimate number of roaches in your house: "); //무엇을 입력해야하는지 출력
		double startPopulation = input.nextDouble(); //입력값을 저장
		double population = startPopulation; //population함수에 startPopulation을 복사
		double totalBugVolume = population * ONE_BUG_VOLUME; //totalBugVolume함수에 총 벌레들의 부피를 저장
		int countWeeks = 0; //countWeeks를 0으로 초기화
		
		while (totalBugVolume < houseVolume) //총 벌레의 부피가 집의 부피보다 작을 동안,
		{
			newBugs = population * GROWTH_RATE; //늘어난 벌레의 수를 계산
			newBugVolume = newBugs * ONE_BUG_VOLUME; //늘어난 벌레의 총 부피를 계산
			population = population + newBugs; //늘어난 숫자를 계산
			totalBugVolume = totalBugVolume + newBugVolume; //기존 부피에 새 벌레부피를 추가
			countWeeks = countWeeks + 1; //한주가 지났으므로 한주를 추가
		}
		
		System.out.println("Starting with a roach population of " + (int)startPopulation); //시작벌레수를 출력
		System.out.println("and a house with a volume of " + houseVolume + " cubic feet."); //집의 크기를 출력
		System.out.println("After " + countWeeks + " weeks,"); //몇주가 지났는지 출력
		System.out.println("The house will be filled with " + (int)population + " roaches."); //벌레수를 출력
		System.out.println("They will fill a volume of " + (int)totalBugVolume + " cubic feet."); //벌레의 부피를 출력
		System.out.println("Better call Debugging Experts inc."); //메세지 출력

		
	}
}
