package team147.buildings;

import team147.BaseRobot;
import battlecode.common.GameActionException;
import battlecode.common.RobotController;
import battlecode.common.RobotType;

public class Barracks extends BaseRobot {
	public Barracks(RobotController myRC) throws GameActionException {
		super(myRC);
		messaging.incrementNumBarracksSpawned();
		while (true) {
			if(messaging.getNumSoldiers() < 20)
				super.spawnRobot(RobotType.SOLDIER);
			rc.yield();
		}
	}

	@Override
	public void defaultPanicAction() {
		// TODO Auto-generated method stub

	}

	@Override
	public void defaultAttackAction() {
		// TODO Auto-generated method stub

	}

	@Override
	public void defaultDefendAction() {
		// TODO Auto-generated method stub

	}

	@Override
	public void defaultEconAction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void defaultExploreAction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void defaultTurnSetup() throws GameActionException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void defaultSpawnSetup() throws GameActionException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void defaultTurnEndAction() throws GameActionException {
		// TODO Auto-generated method stub
		
	}
}