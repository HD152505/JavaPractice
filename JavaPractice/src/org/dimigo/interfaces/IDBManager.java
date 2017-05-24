/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *   |_ IDMManager
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 24.
 * </pre>
 *
 * @author       : 김용환
 * @vresion     : 1.0
 */
public interface IDBManager {
	
String ORACLE_DATABASE = "ORACLE";
String SYBASE_DATABASE = "SYBASE";

public  void insert();
public void search();
public void update();
public void delete();
public static IDBManager getDBObject(String databases){
	IDBManager db = null; 
	if(ORACLE_DATABASE.equals(databases)){
		return db = new OracleDB();
	}
	else if(SYBASE_DATABASE.equals(databases)){
		return db = new SybaseDB();
	}
	else return null;
}

}
