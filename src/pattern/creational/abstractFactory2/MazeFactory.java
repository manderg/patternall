package pattern.creational.abstractFactory2;

import pattern.creational.abstractFactory2.Door;
import pattern.creational.abstractFactory2.Maze;
import pattern.creational.abstractFactory2.Room;
import pattern.creational.abstractFactory2.Wall;

public interface MazeFactory {

	Maze makeMaze();
	Wall makeWall();
	Room makeRoom(int no);
	Door makeDoor(Room room, Room room2);
	
}
