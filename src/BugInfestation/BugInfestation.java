package BugInfestation;
import java.util.Scanner;

public class BugInfestation {
	
	public static void main(String[] args) { // �Լ�
	
		double ONE_BUG_VOLUME = 0.002; //���� �Ѹ����� ����
		double GROWTH_RATE = 0.95; //������ ���� �ڶ�� �ӵ�
		double newBugs = 0; //���� �þ�� ���� ��
		double newBugVolume = 0; //���� �þ�� ������ ����
		
		Scanner input = new Scanner(System.in); //��ĳ�ʸ� ����
		System.out.println("Enter the total volume of your house in cubic feet: "); //������ �Է��ؾ��ϴ��� ���
		double houseVolume = input.nextDouble(); //�Է°��� houseVolume�� ����
		System.out.println("Enter the estimate number of roaches in your house: "); //������ �Է��ؾ��ϴ��� ���
		double startPopulation = input.nextDouble(); //�Է°��� ����
		double population = startPopulation; //population�Լ��� startPopulation�� ����
		double totalBugVolume = population * ONE_BUG_VOLUME; //totalBugVolume�Լ��� �� �������� ���Ǹ� ����
		int countWeeks = 0; //countWeeks�� 0���� �ʱ�ȭ
		
		while (totalBugVolume < houseVolume) //�� ������ ���ǰ� ���� ���Ǻ��� ���� ����,
		{
			newBugs = population * GROWTH_RATE; //�þ ������ ���� ���
			newBugVolume = newBugs * ONE_BUG_VOLUME; //�þ ������ �� ���Ǹ� ���
			population = population + newBugs; //�þ ���ڸ� ���
			totalBugVolume = totalBugVolume + newBugVolume; //���� ���ǿ� �� �������Ǹ� �߰�
			countWeeks = countWeeks + 1; //���ְ� �������Ƿ� ���ָ� �߰�
		}
		
		System.out.println("Starting with a roach population of " + (int)startPopulation); //���۹������� ���
		System.out.println("and a house with a volume of " + houseVolume + " cubic feet."); //���� ũ�⸦ ���
		System.out.println("After " + countWeeks + " weeks,"); //���ְ� �������� ���
		System.out.println("The house will be filled with " + (int)population + " roaches."); //�������� ���
		System.out.println("They will fill a volume of " + (int)totalBugVolume + " cubic feet."); //������ ���Ǹ� ���
		System.out.println("Better call Debugging Experts inc."); //�޼��� ���

		
	}
}
