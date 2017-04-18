/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_PiggyBankTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 18.
 * <pre>
 * @author : Leejaeho
 * @version : 1.0
 */
public class PiggyBankTest {
	public static void main(String[] args) {
		FamilyMember[] family = 
			{
					new FamilyMember("아빠"),new FamilyMember("엄마"),
					new FamilyMember("나"),new FamilyMember("남동생")
			};
		FamilyMember.printMemberCnt();
		PiggyBank.putMoney(10000,family[0]);
		PiggyBank.putMoney(5000,family[1]);
		PiggyBank.putMoney(2000,family[2]);
		PiggyBank.putMoney(1000,family[3]);
		PiggyBank.printBalance();
		PiggyBank.putMoney(1000,family[2]);
		PiggyBank.printBalance();
		
		
		

	}

}
