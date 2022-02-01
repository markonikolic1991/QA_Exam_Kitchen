package Kitchen;

import Pages.MenuPage;
import Pages.ReservePage;
import Pages.QuestionairePage;

public class Kitchen {
	
	private ReservePage reservePage;
	private MenuPage menuPage;
	private QuestionairePage questionairePage;
	
	public ReservePage getReservePage() {
		if (reservePage == null) {
			reservePage = new ReservePage();
		}
		return reservePage;
	}
	
	public MenuPage getMenuPage() {
		if (menuPage == null) {
			menuPage = new MenuPage();
		}
		return menuPage;
	}
	
	public QuestionairePage getQuestionairePage() {
		if (questionairePage == null) {
			questionairePage = new QuestionairePage();
		}
		return questionairePage;
	}

}

