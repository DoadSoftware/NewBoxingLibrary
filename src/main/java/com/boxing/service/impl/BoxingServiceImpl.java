package com.boxing.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boxing.dao.BoxingDao;
import com.boxing.model.Bugs;
import com.boxing.model.Fixture;
import com.boxing.model.Ground;
import com.boxing.model.MatchType;
import com.boxing.model.NameSuper;
import com.boxing.model.Player;
import com.boxing.model.Team;
import com.boxing.service.BoxingService;
import com.boxing.model.TeamColor;

@Service("wrestlingService")
@Transactional
public class BoxingServiceImpl implements BoxingService {

 @Autowired
 private BoxingDao wrestlingDao;
 
@Override
public Player getPlayer(int player_id) {
	return wrestlingDao.getPlayer(player_id);
}

@Override
public Team getTeam(String whatToProcess, String valueToProcess) {
	return wrestlingDao.getTeam(whatToProcess, valueToProcess);
}

@Override
public List<Player> getPlayers(String whatToProcess, String valueToProcess) {
	return wrestlingDao.getPlayers(whatToProcess, valueToProcess);
}

@Override
public Ground getGround(int ground_id) {
	return wrestlingDao.getGround(ground_id);
}

@Override
public List<TeamColor> getTeamColors() {
	return wrestlingDao.getTeamColors();
}

@Override
public List<Player> getAllPlayer() {
	return wrestlingDao.getAllPlayer();
}

@Override
public List<Team> getTeam() {
	return wrestlingDao.getTeam();
}

@Override
public List<Fixture> getFixture() {
	return wrestlingDao.getFixture();
}

@Override
public List<Bugs> getBug() {
	return wrestlingDao.getBug();
}

@Override
public List<MatchType> getMatchType() {
	return wrestlingDao.getMatchType();
}

@Override
public List<NameSuper> getNameSupers() {
	return wrestlingDao.getNameSupers();
}

}