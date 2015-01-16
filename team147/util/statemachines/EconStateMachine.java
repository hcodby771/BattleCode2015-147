package team147.util.statemachines;

import team147.BaseRobot;
import team147.util.StateMachine;
import battlecode.common.MapLocation;
import battlecode.common.RobotInfo;

public class EconStateMachine extends StateMachine {
	public State currentState;

	public EconStateMachine(BaseRobot br) {
		super(br);
		currentState = updateState();
	}

	public State updateState() {
		RobotInfo enemies[] = br.rc.senseNearbyRobots(br.sensorRadiusSqured,
				br.enemyTeam);
		MapLocation currentLoc = br.rc.getLocation();

		for (RobotInfo enemy : enemies) {
			int enemyAttackRadiusSquared = enemy.type.attackRadiusSquared;
			if (enemyAttackRadiusSquared <= currentLoc
					.distanceSquaredTo(enemy.location)) {
				return State.PANIC;
			}
		}

		return null;
	}

	public void performNextMove() {
		// TODO Auto-generated method stub

	}

	public void sendStateMessages() {
		// TODO Auto-generated method stub

	}

}
