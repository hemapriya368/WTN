package music;

public interface playable {
public default void play() {
	System.out.println("playing");
}
}
