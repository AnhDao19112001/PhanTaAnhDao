package vn.codegym.repository;

import vn.codegym.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository implements IUserRepository{
    private static final String INSERT_USERS_SQL = "insert into users(name, email, country) values(?, ?, ?);";
    private static final String SORT_BY_NAME = "select * from users order by name;";
    private static final String FIND_BY_COUNTRY = "select * from users where country like ?;";

//    private static final String SELECT_ALL_USERS = "select * from users";

//    private static final String DELETE_USERS_SQL = "delete from users where id = ?;";

//    private static final String UPDATE_USERS_SQL = "update users set name = ?, email= ?, country =? where id = ?;";

    @Override
    public void add(User user) {
        CallableStatement callableStatement;
        try {
            callableStatement = DBRepository.getConnection().prepareCall("call insert_user(?,?,?)");
            callableStatement.setString(1, user.getName());
            callableStatement.setString(2, user.getEmail());
            callableStatement.setString(3, user.getCountry());
            callableStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public User findById(int id) {
        CallableStatement callableStatement = null;
        try {
            callableStatement = DBRepository.getConnection()
                    .prepareCall("call find_user_by_id (?)");
            callableStatement.setInt(1,id);
            User user;
            ResultSet resultSet = callableStatement.executeQuery();
            if (resultSet.next()) {
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setEmail(resultSet.getString("email"));
                user.setCountry(resultSet.getString("country"));
                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    //    @Override
//    public List<User> listAll() {
//        List<User> users = new ArrayList<>();
//        Connection connection = DBRepository.getConnection();
//        try {
//            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);
//            ResultSet resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()) {
//                int id = resultSet.getInt("id");
//                String name = resultSet.getString("name");
//                String email = resultSet.getString("email");
//                String country = resultSet.getString("country");
//                User user = new User(id, name, email, country);
//                users.add(user);
//            }
//
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return users;
    @Override
    public List<User> listAll(String countryName) {
        List<User> userList = new ArrayList<>();
        try {
            CallableStatement callableStatement = DBRepository.getConnection().prepareCall("call list_user (?)");
            callableStatement.setString(1, countryName);
            ResultSet resultSet = callableStatement.executeQuery();
            User user;
            while (resultSet.next()) {
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setEmail(resultSet.getString("email"));
                user.setCountry(resultSet.getString("country"));
                userList.add(user);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return userList;
    }

    @Override
    public List<User> findByCountry(String countrySearch) {
        List<User> users = new ArrayList<>();
        Connection connection = DBRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_BY_COUNTRY);
            preparedStatement.setString(1, "%" + countrySearch + "%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");

                User user = new User(id, name, email, country);
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public List<User> sortByName() {
        List<User> users = new ArrayList<>();
        Connection connection = DBRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SORT_BY_NAME);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                User user = new User(id, name, email, country);
                users.add(user);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return users;
    }
    //    @Override
//    public boolean delete(int id) {
//        boolean rowDeleted = false;
//        Connection connection = DBRepository.getConnection();
//        try {
//            PreparedStatement statement = connection.prepareStatement(DELETE_USERS_SQL);
//            statement.setInt(1, id);
//            rowDeleted = statement.executeUpdate() > 0;
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return rowDeleted;
//    }
    @Override
    public void delete(User user) {
        try {
            CallableStatement callableStatement = DBRepository.getConnection().prepareCall("call delete_user (?)");
            callableStatement.setInt(1, user.getId());
            callableStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //    @Override
//    public boolean update(User user) {
//        boolean rowUpdated = false;
//        Connection connection = DBRepository.getConnection();
//        try {
//            PreparedStatement statement = connection.prepareStatement(UPDATE_USERS_SQL);
//            statement.setString(1, user.getName());
//            statement.setString(2, user.getEmail());
//            statement.setString(3, user.getCountry());
//            statement.setInt(4, user.getId());
//            rowUpdated = statement.executeUpdate() > 0;
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//
//        return rowUpdated;
//    }
    @Override
    public void update(User user) {
        try {
            CallableStatement callableStatement = DBRepository.getConnection().prepareCall("call update_user(?, ?, ?, ?)");
            callableStatement.setString(1, user.getName());
            callableStatement.setString(2, user.getEmail());
            callableStatement.setString(3, user.getCountry());
            callableStatement.setInt(4, user.getId());
            callableStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addUserTransaction(User user, int[] permision) {
        PreparedStatement pstmt = null;

        // for assign permision to user
        PreparedStatement pstmtAssignment = null;

        // for getting user id
        ResultSet rs = null;
        Connection connection = DBRepository.getConnection();

        try {
            // set auto commit to false
            connection.setAutoCommit(false);

            // Insert user
            pstmt = connection.prepareStatement(INSERT_USERS_SQL, Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, user.getName());
            pstmt.setString(2, user.getEmail());
            pstmt.setString(3, user.getCountry());
            int rowAffected = pstmt.executeUpdate();

            // get user id
            rs = pstmt.getGeneratedKeys();
            int userId = 0;
            if (rs.next())
                userId = rs.getInt(1);

            // in case the insert operation successes, assign permision to user
            if (rowAffected == 1) {

                // assign permision to user
                String sqlPivot = "INSERT INTO user_permision(user_id,permision_id) VALUES(?,?)";
                pstmtAssignment = connection.prepareStatement(sqlPivot);
                for (int permisionId : permision) {
                    pstmtAssignment.setInt(1, userId);
                    pstmtAssignment.setInt(2, permisionId);
                    pstmtAssignment.executeUpdate();
                }
                connection.commit();
            } else {
                connection.rollback();
            }
        } catch (SQLException ex) {
            // roll back the transaction
            try {
                if (connection != null)
                    connection.rollback();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (pstmtAssignment != null) pstmtAssignment.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
