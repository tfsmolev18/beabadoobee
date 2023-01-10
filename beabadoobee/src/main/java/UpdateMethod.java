public int insertPlayer(Player player)
        {
            String sql = "INSERT INTO PLAYER (ID, Name, Nationality, Birth_date, Title) " + "Values (?, ?, ?, ?, ?)";

            return jdbcTemplate.update(sql, new Object[])
            {
                player.getName(),
                player.getNationality(),
                new Timestamp(player,getBirthDate().getTime()),
                player.getTitles(),
                player.getId()}
        }
        }
        @Override
public void run(String... args) throws Exception {
        //Inserting a player
        logger.info("Inserting Player 4: {}" , dao.insertPlayer(new player(4, "Thiem", "Austria", new Date(System.currentTimeMillis()), 17)));

        //Updating a player
        logger.info("Updating Player with Id 4: {}", dao.updatePlayer(new Player(4, "Thiem", "Austria", Date.valueOf("1993-09-03"),17)))''

        //View player by Id
        logger.info("Players with Id 4: {}", dao.getPlayerById(4));
}

public int deletePlayerByID(int id)
        {
                String sql="DELETE FROM PLAYER WHERE ID = ?";
                return jdbcTemplate.update(sql, new Object[] {id});
        }

        @Override
public void run(String... args) throws Exception
        {
                logger.info("Deleting Player with Id 2: {}", dao.deletePlayerById(2));
                logger.info("All Players Data: {}", dao.getAllPlayers());
        }

public void createTournamentTable()
        {
                String sql = "CREATE TABLE TOURNAMENT (ID INTEGER, NAME VARCHAR(50), LOCATION VARCHAR(50), PRIMARY KEY (ID))";

                jdbcTemplate.execute(sql);
                System.out.println("Table created");
        }

        @Override
public void run(String... args) throws Exception
        {
                dao.createTournamentTable();
        }