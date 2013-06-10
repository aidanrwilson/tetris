package tertis.tetris.game.server;

import java.util.LinkedList;
import java.util.Queue;
import tertis.tetris.game.view.TetrisView;

/**
 * TODO maintains a queue of the players connected
 */
@SuppressWarnings("serial")
public class PlayerQueue extends LinkedList<TetrisView> {
	public void addPlayer(TetrisView tv) {
		add(tv);
	}
	
	public void removePlayer(TetrisView tv) {
		remove(tv);
	}
	
	public boolean reQueue() {
		add(removeFirst());
	}
	
	public TetrisView nextPlayer() {
		return getFirst();
	}
}
