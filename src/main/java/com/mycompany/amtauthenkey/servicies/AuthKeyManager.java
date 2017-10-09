
package com.mycompany.amtauthenkey.servicies;

import com.mycompany.amtauthenkey.model.AuthKey;
import java.util.Date;
import javax.ejb.Stateless;
/**
 *
 * @author kevin moreira
 */
@Stateless
public class AuthKeyManager {
    public AuthKey getRandomAuthKey()
    {
        return new AuthKey("123456789a", new Date(12, 10, 2010), new Date(11,2,2030));
    }
    
}
