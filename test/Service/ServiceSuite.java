/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author root
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Service.IBookSvcTest.class, Service.BookSvcSerialImpTest.class, Service.BookSvcJDBCImplTest.class, Service.FactoryTest.class})
public class ServiceSuite {
    
}
