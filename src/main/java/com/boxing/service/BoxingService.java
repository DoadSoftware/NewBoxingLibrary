package com.boxing.service;

import java.util.List;

import com.boxing.model.Bugs;
import com.boxing.model.Fixture;
import com.boxing.model.Ground;
import com.boxing.model.MatchType;
import com.boxing.model.NameSuper;
import com.boxing.model.Player;
import com.boxing.model.Team;
import com.boxing.model.TeamColor;

public interface BoxingService {
  Player getPlayer(int player_id);
  Team getTeam(String whatToProcess, String valueToProcess);
  Ground getGround(int ground_id);
  List<Player> getPlayers(String whatToProcess, String valueToProcess);
  List<Player> getAllPlayer();
  List<Team> getTeam();
  List<Fixture> getFixture();
  List<Bugs> getBug();
  List<TeamColor> getTeamColors();
  List<MatchType> getMatchType();
  List<NameSuper> getNameSupers();
}