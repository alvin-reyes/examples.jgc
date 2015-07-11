package com.macq.ci.tools.dao.impl;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.macq.ci.tools.dao.BaseDao;
import com.macq.ci.tools.dao.BaseJDBCDao;
import com.macq.ci.tools.dao.intf.RequestExecuteCompareDao;
import com.macq.ci.tools.entities.UcRequest;
import com.macq.ci.tools.exceptions.DaoException;

@Named("executeCompareDaoJdbc")
@Repository
public class RequestExecuteCompareJDBCDaoImpl extends
		BaseJDBCDao implements RequestExecuteCompareDao {


	public List<UcRequest> getAllComparisonRequest(boolean activeOnly)
			throws DaoException {

		List<UcRequest> listOfUcRequest = new ArrayList<UcRequest>();
		try {
			PreparedStatement statement = this.getConnection()
					.prepareStatement(
							"select * from uc_request where status = ?");
			statement.setString(1, "New");

			ResultSet rs = statement.executeQuery();

			while (rs.next()) {
				UcRequest ucRequest = new UcRequest();
				ucRequest.setCreatedBy(rs.getString("created_by"));
				ucRequest.setUpdatedBy(rs.getString("updated_by"));
				ucRequest.setCreatedDate(rs.getDate("created_date"));
				ucRequest.setUpdatedDate(rs.getDate("updated_date"));
				ucRequest.setSvnUrl1(rs.getString("svn_url_1"));
				ucRequest.setSvnUrl2(rs.getString("svn_url_2"));
				ucRequest.setEmail(rs.getString("email"));
				ucRequest.setStatus(rs.getString("status"));
				ucRequest.setId(rs.getLong("id"));

				listOfUcRequest.add(ucRequest);
			}

			return listOfUcRequest;

		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		return null;

	}


	public UcRequest requestCompare(UcRequest ucRequest) throws DaoException {

		try {
			PreparedStatement statement = this
					.getConnection()
					.prepareStatement(
							""
									+ "insert into uc_request (email,status,svn_url_1,svn_url_2,created_date,created_by,updated_date,updated_by) "
									+ "values (?,?,?,?,?,?,?,?)");

			statement.setString(1, ucRequest.getEmail());
			statement.setString(2, ucRequest.getStatus());
			statement.setString(3, ucRequest.getSvnUrl1());
			statement.setString(4, ucRequest.getSvnUrl2());
			statement.setDate(5, new Date(new java.util.Date().getTime()));
			statement.setString(6, ucRequest.getCreatedBy());
			statement.setDate(7, new Date(new java.util.Date().getTime()));
			statement.setString(8, ucRequest.getUpdatedBy());

			statement.execute();

			// Always 1 id.
			PreparedStatement statementGetId = this.getConnection()
					.prepareStatement("select max(id) as id from uc_request");
			ResultSet rs = statementGetId.executeQuery();

			while (rs.next()) {
				ucRequest.setId(rs.getLong("id"));
			}
			return ucRequest;

		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		return null;
	}


	public UcRequest updateComparisonRequest(UcRequest ucRequest)
			throws DaoException {

		try {
			PreparedStatement statementUpdate = this.getConnection()
					.prepareStatement(
							"" + "update uc_request set status = ?, updated_date = ? "
									+ "where id = ? ");

			statementUpdate.setString(1, "Complete");
			statementUpdate.setDate(2, new Date(new java.util.Date().getTime()));
			statementUpdate.setLong(3, ucRequest.getId());

			statementUpdate.executeUpdate();
			
			//	Let's insert a new output file 
			PreparedStatement statementInsertForOutput = this
					.getConnection()
					.prepareStatement(
							""
									+ "insert into uc_request_output (ucRequest_id,filename,created_date,created_by,updated_date,updated_by) "
									+ "values (?,?,?,?,?,?)");

			statementInsertForOutput.setLong(1, ucRequest.getId());
			statementInsertForOutput.setString(2, ucRequest.getUcRequestOutput().get(0).getFileName());
			statementInsertForOutput.setDate(3, new Date(new java.util.Date().getTime()));
			statementInsertForOutput.setString(4, ucRequest.getCreatedBy());
			statementInsertForOutput.setDate(5, new Date(new java.util.Date().getTime()));
			statementInsertForOutput.setString(6, ucRequest.getUpdatedBy());
			
			statementInsertForOutput.execute();
			
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}

		return ucRequest;

	}

}
