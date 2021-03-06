package edu.srh.aupair.userProfileOperations;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface IUserProfileOperationsInterface {
	public ResultSet getProfileDetails(String persontype,int personId) throws SQLException;
	public void updateProfile(int personId,String firstname,String lastname,String contact,String aboutme,String title,String maritalstatus) throws SQLException;
	public ResultSet searchByPreference(int personId,String persontype,String gender,String qualification,String country,String city,String preferredLanguage,int rating) throws SQLException;
	public void deleteSelfProfile(int personId) throws SQLException;
	public ResultSet viewProposals(int personId,String persontype) throws SQLException;
	public int getHostId(int personId) throws SQLException;
}

