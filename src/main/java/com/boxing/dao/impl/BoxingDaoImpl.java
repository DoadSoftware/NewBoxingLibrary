package com.boxing.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.boxing.dao.BoxingDao;
import com.boxing.model.Bugs;
import com.boxing.model.Fixture;
import com.boxing.model.Ground;
import com.boxing.model.MatchType;
import com.boxing.model.NameSuper;
import com.boxing.model.Player;
import com.boxing.model.Team;
import com.boxing.model.TeamColor;
import com.boxing.util.BoxingUtil;

@Transactional
@Repository("wrestlingDao")
public class BoxingDaoImpl implements BoxingDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Player getPlayer(int player_id) {
        return sessionFactory.getCurrentSession()
                .createQuery(
                        "from Player where PlayerId = :playerId",
                        Player.class)
                .setParameter("playerId", player_id)
                .uniqueResult();
    }

    @Override
    public Team getTeam(String whatToProcess, String valueToProcess) {

        switch (whatToProcess) {

            case BoxingUtil.TEAM:
                return sessionFactory.getCurrentSession()
                        .createQuery(
                                "from Team where TeamId = :teamId",
                                Team.class)
                        .setParameter("teamId", Integer.valueOf(valueToProcess))
                        .uniqueResult();

            default:
                return null;
        }
    }

    @Override
    public List<Player> getPlayers(String whatToProcess, String valueToProcess) {

        switch (whatToProcess) {

            case BoxingUtil.TEAM:
                return sessionFactory.getCurrentSession()
                        .createQuery(
                                "from Player where TeamId = :teamId",
                                Player.class)
                        .setParameter("teamId", Integer.valueOf(valueToProcess))
                        .getResultList();

            default:
                return null;
        }
    }

    @Override
    public Ground getGround(int ground_id) {
        return sessionFactory.getCurrentSession()
                .createQuery(
                        "from Ground where GroundId = :groundId",
                        Ground.class)
                .setParameter("groundId", ground_id)
                .uniqueResult();
    }

    @Override
    public List<Player> getAllPlayer() {
        return sessionFactory.getCurrentSession()
                .createQuery("from Player", Player.class)
                .getResultList();
    }

    @Override
    public List<Team> getTeam() {
        return sessionFactory.getCurrentSession()
                .createQuery("from Team", Team.class)
                .getResultList();
    }

    @Override
    public List<Fixture> getFixture() {
        return sessionFactory.getCurrentSession()
                .createQuery("from Fixture", Fixture.class)
                .getResultList();
    }

    @Override
    public List<Bugs> getBug() {
        return sessionFactory.getCurrentSession()
                .createQuery("from Bugs", Bugs.class)
                .getResultList();
    }

    @Override
    public List<TeamColor> getTeamColors() {
        return sessionFactory.getCurrentSession()
                .createQuery("from TeamColor", TeamColor.class)
                .getResultList();
    }

    @Override
    public List<MatchType> getMatchType() {
        return sessionFactory.getCurrentSession()
                .createQuery("from MatchType", MatchType.class)
                .getResultList();
    }

    @Override
    public List<NameSuper> getNameSupers() {
        return sessionFactory.getCurrentSession()
                .createQuery("from NameSuper", NameSuper.class)
                .getResultList();
    }
}