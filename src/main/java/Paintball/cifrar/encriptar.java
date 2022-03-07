
package Paintball.cifrar;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

public class encriptar {
    
    private final String claveEncriptacion = "Tyrte6";

    public String getClaveEncriptacion() {
        return claveEncriptacion;
    }
    
    private SecretKeySpec crearClave(String clave) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        
        byte[] claveEncriptacion = clave.getBytes("UTF-8");//recive la clave y la transforma a un array de bytes
        
        MessageDigest sha = MessageDigest.getInstance("SHA-1");//crea el cifrado
        
        claveEncriptacion = sha.digest(claveEncriptacion);//le pasa los bytes de la clave
        claveEncriptacion = Arrays.copyOf(claveEncriptacion, 16);//lo va guardando en el array
        
        SecretKeySpec secretKey = new SecretKeySpec(claveEncriptacion, "AES");//crea la clave secreta con AES y el array de bytes

        return secretKey;//devuelve la clave secreta
    }
    
    public String encriptar(String datos, String claveSecreta) throws UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, NoSuchPaddingException {
        SecretKeySpec clavesecreta = this.crearClave(claveSecreta);//recoje la clave secreta
        
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");        
        cipher.init(Cipher.ENCRYPT_MODE, clavesecreta);//creo el cifrado con la clave creada

        byte[] datosEncriptar = datos.getBytes("UTF-8");//guardo los datos en un array de bytes
        byte[] bytesEncriptados = cipher.doFinal(datosEncriptar);//Encripto los datos
        String encriptado = Base64.getEncoder().encodeToString(bytesEncriptados);//guardo los datos ya encriptados en un string

        return encriptado;//devuelvo los datos encriptados
    }

    public String desencriptar(String datosEncriptados, String claveSecreta) throws UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {
        
        SecretKeySpec clavesecreta = this.crearClave(claveSecreta);//recojo la clave creada

        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
        cipher.init(Cipher.DECRYPT_MODE, clavesecreta);//creo el cifrado con la clave creada
        
        byte[] bytesEncriptados = Base64.getDecoder().decode(datosEncriptados);//recojo el string y lo transformo en un array de bytes
        byte[] datosDesencriptados = cipher.doFinal(bytesEncriptados);//desincripto los bytes y los guardo en otro array de bytes
        String datos = new String(datosDesencriptados);//transformo el array de bytes en un string
        
        return datos;//devuelvo el mensaje desencriptado
    }
    
}
