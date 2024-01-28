package questionOne;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Student {
	private String fname;
	private String lname;
	private String gender;
	private String regNumber;
	
	public Student(String fname, String lname, String gender, String regNumber) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.regNumber = regNumber;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}

	
	public void registerStudent() {
		String host = "jdbc:mysql://localhost/school";
		String user = "root";
		String password = "";

		// SQL query to insert data
		String sql = "INSERT INTO Student (Fname,Lname,Gender,RegNumber) VALUES (?, ?,?,?)";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try (
				
				// Establish the connection
				Connection connection = DriverManager.getConnection(host, user, password);
				
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				) {

			
			if(this.fname.isBlank() && this.lname.isBlank()&&this.gender.isBlank() && this.regNumber.isBlank()){
				JOptionPane.showMessageDialog(null, "Please fill in the required informations!.",
						"Error", JOptionPane.ERROR_MESSAGE);
			}else {
				// Set the values for the prepared statement
				preparedStatement.setString(1, this.fname);
				preparedStatement.setString(2, this.lname);
				preparedStatement.setString(3, this.gender);
				preparedStatement.setString(4, this.regNumber);

				// Execute the query
				int rowsAffected = preparedStatement.executeUpdate();

				// Check the result
				if (rowsAffected > 0) {
					// System.out.println("Data inserted successfully!");
					JOptionPane.showMessageDialog(null, "Data inserted successfully!.");
				} else {
					// System.out.println("Failed to insert data.");
					JOptionPane.showMessageDialog(null, "Registration has failed.",
							"Error", JOptionPane.ERROR_MESSAGE);
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unused") DefaultTableModel populateTable() {
		String host = "jdbc:mysql://localhost/school";
		String user = "root";
		String password = "";

		String sql = "SELECT * FROM Student"; 
		DefaultTableModel tableModel = null;
		try (Connection connection = DriverManager.getConnection(host, user, password);

				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				ResultSet resultSet = preparedStatement.executeQuery()) {

			// Get column names
			int columnCount = resultSet.getMetaData().getColumnCount();

			Vector<String> columnNames = new Vector<>();
			for (int i = 1; i <= columnCount; i++) {
				columnNames.add(resultSet.getMetaData().getColumnName(i));
			}

			// Get data rows
			Vector<Vector<Object>> data = new Vector<>();
			while (resultSet.next()) {
				Vector<Object> row = new Vector<>();
				for (int i = 1; i <= columnCount; i++) {
					row.add(resultSet.getObject(i));
				}
				data.add(row);
			}

			// Create DefaultTableModel and set data
			tableModel = new DefaultTableModel(data, columnNames);
			//table.setModel(tableModel);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tableModel;
	}
	public void deletedata(int id) {
		String url = "jdbc:mysql://localhost/school";
		String user = "root";
		String password = "";
		
		String sql = "DELETE FROM Student WHERE std_id = ?";
		if(id==0) 
			JOptionPane.showMessageDialog(null, "No id entered");
		try (
				// Establish the con
				Connection con = DriverManager.getConnection(url, user, password);
				// Create a prepared statement
				PreparedStatement stm = con.prepareStatement(sql);
				) {
		
			stm.setInt(1, id); 

			

			int result = JOptionPane.showConfirmDialog(null, "Do you really want to delete the user with id "+id+"\n?", "Question", JOptionPane.YES_NO_OPTION);

			// Check the user's choice
			if (result == JOptionPane.YES_OPTION) {
				//System.out.println("User clicked Yes");
				int rowsAffected = stm.executeUpdate();
				if (rowsAffected > 0) {
					JOptionPane.showMessageDialog(null, "The user with id: "+id+"\n was deleted!");

				} else {
					//System.out.println("Failed to delete data. No matching record found.");

					JOptionPane.showMessageDialog(null, "Failed to delete data. No matching record found.", "Error", JOptionPane.ERROR_MESSAGE);
				}
			} else {
				//System.out.println("User clicked No");
				JOptionPane.showMessageDialog(null, "We can't delete the user");


			}
			// Check the result


		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updatedata(int id) {
		String url = "jdbc:mysql://localhost/school";
        String user = "root";
        String password = "";

        // SQL query to update data
        String sql = "UPDATE Student SET Fname = ?, Lname = ?,Gender = ?, RegNumber = ? where std_id='"+id+"'";

        try (
            // Establish the con
            Connection con = DriverManager.getConnection(url, user, password);

            // Create a prepared statement
            PreparedStatement stm = con.prepareStatement(sql);
        ) {
            // Set the new values for the update
        	stm.setString(1, this.fname);
			stm.setString(2, this.lname);
			stm.setString(3, this.gender);
			stm.setString(4, this.regNumber);
            
            int result = JOptionPane.showConfirmDialog(null, "Do you really want to update student with id"+id+"\n?", "Question", JOptionPane.YES_NO_OPTION);
            
            // Check the user's choice
            if (result == JOptionPane.YES_OPTION) {
            	// Execute the update
                int rowsAffected = stm.executeUpdate();

                // Check the result
                if (rowsAffected > 0) {
                   // System.out.println("Data updated successfully!");
                    JOptionPane.showMessageDialog(null, "Data updated successfully!");

                } else {
                    System.out.println("Failed to update data. No matching record found.");
                    JOptionPane.showMessageDialog(null, "Failed to update data. No matching record found.", "Error", JOptionPane.ERROR_MESSAGE);

                }
            } else {
                //System.out.println("User clicked No");
                JOptionPane.showMessageDialog(null, "We will not delete your data");

            }
            

        } catch (SQLException e) {
            e.printStackTrace();
        }
	}

	


}
