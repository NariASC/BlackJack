package ascSys.Trump;

import java.util.ArrayList;
import java.util.List;
//ArrayListを確保

public class Hand {

	private List<Card> cards = new ArrayList<>();
	
	public void addCard(Card card){
		this.cards.add(card);
	}
	
	public Card pickUpCard(Card card){
		return this.cards.remove(0);
	}
	
	
}
