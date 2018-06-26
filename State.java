import java.awt.Graphics;

public abstract class State
{
   Game game;
   public State(Game game)
   {
      this.game = game;
   }

   public abstract void tick();
   public abstract void render(Graphics g);

   // Pretty much a separate Class
   private State currentState = null;

   public void setState(State state)
   {
      currentState = state;
   }

   public State getState()
   {
      return currentState;
   }

}
