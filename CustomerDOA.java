package com.company;

import com.company.Customer;



import java.sql.*;

class CustomerDAO {

    Connection conn;

    public CustomerDAO() {
        conn = DBConnection.getConnection();
    }

    public void addCustomer(Customer c){

        String query = "INSERT INTO customer (customer_id, email, name) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps =conn.prepareStatement(query);
            ps.setString(1,c.getCustomerId());
            ps.setString(2, c.getEmail());
            ps.setString(3, c.getName());

            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
