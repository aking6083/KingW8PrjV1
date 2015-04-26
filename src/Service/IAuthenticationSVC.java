/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;
import domain.Login;

/**
 *
 * @author root
 */
public interface IAuthenticationSVC {
    public boolean authenticate(Login l);
}
