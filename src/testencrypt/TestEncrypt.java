package testencrypt;

/** 
 * @Course: SDEV 450 ~ Java Programming III
 * @Author Name: BillTinVT
 * @Assignment Name: testencrypt
 * @Date: Sep 28, 2016
 * @Description: 
 * 
 *   
 */
//Imports

//Begin Class TestEncrypt
public class TestEncrypt {

    //Begin Main Method
public static void main(String[] args) 
{
    final String secretKey = "DonaTellaNobody";
     
    String originalString = "ThisIsCushsPassword!";
    String encryptedString = AES.encrypt(originalString, secretKey) ;
    String decryptedString = AES.decrypt(encryptedString, secretKey) ;
     
    System.out.println(originalString);
    System.out.println(encryptedString);
    System.out.println(decryptedString);
}
} //End Class TestEncrypt
