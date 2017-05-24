/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *   |_ DBTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 24.
 * </pre>
 *
 * @author       : 김용환
 * @vresion     : 1.0
 */
public class DBTest  {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		IDBManager s = IDBManager.getDBObject(IDBManager.SYBASE_DATABASE);
		IDBManager o = IDBManager.getDBObject(IDBManager.ORACLE_DATABASE);
		System.out.println("<< 변경 전 >>");
		crud(s);
		System.out.println("<< 변경 후 >>");
		crud(o);
		
		

	}
	private static void crud(IDBManager db){
		db.insert();
		db.search();
		db.update();
		db.delete();
		
	}

}
