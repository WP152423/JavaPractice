/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.abstractclass
 *   |_InsertAction
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 18.
 * <pre>
 * @author : Leejaeho
 * @version : 1.0
 */
public class SybaseDB implements IDBManager {
	public void insert(){
		System.out.println("Sybase DB 저장");
	}
	public void	search(){
		System.out.println("Sybase DB 조회");
	}
	public void update(){
		System.out.println("Sybase DB 변경");
	}
	public void delete(){
		System.out.println("Sybase DB 삭제");
	}
}
