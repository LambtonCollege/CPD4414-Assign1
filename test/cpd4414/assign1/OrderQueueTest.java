/*
 * Copyright 2015 Len Payne <len.payne@lambtoncollege.ca>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cpd4414.assign1;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Len Payne <len.payne@lambtoncollege.ca>
 */
public class OrderQueueTest {
    
    public OrderQueueTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testWhenCustomerExistsAndPurchasesExistThenTimeReceivedIsNow() {
        OrderQueue orderQueue = new OrderQueue();
        Order order = new Order("CUST00001", "ABC Construction");
        order.addPurchase(new Purchase("PROD0004", 450));
        order.addPurchase(new Purchase("PROD0006", 250));
        orderQueue.add(order);
        
        long expResult = new Date().getTime();
        long result = order.getTimeReceived().getTime();
        assertTrue(Math.abs(result - expResult) < 1000);
    }
    
    @Test
    public void testWhenNextOrderAndOrdersExistThenGetOrderWithNoTimeProcessed() {
        OrderQueue orderQueue = new OrderQueue();
        Order order1 = new Order("CUST00001", "ABC Construction");
        order1.addPurchase(new Purchase("PROD0004", 450));
        order1.addPurchase(new Purchase("PROD0006", 250));
        Order order2 = new Order("CUST00002", "DCB Construction");
        order2.addPurchase(new Purchase("PROD0004", 450));
        order2.addPurchase(new Purchase("PROD0006", 250));
        orderQueue.add(order1);
        orderQueue.add(order2);
        order1.setTimeReceived(new Date());
        order2.setTimeReceived(new Date());
        boolean earliestTimeReceived = false;
        //System.out.println(order1.getTimeFulfilled().getTime());
        long result1 = order1.getTimeReceived().getTime();
        long result2 = order1.getTimeReceived().getTime();
        
        if(result1 > result2){
            order1.getListOfPurchases();
        } else{
            order2.getListOfPurchases();
            earliestTimeReceived = true;
        }
        assertTrue(earliestTimeReceived);
    }
    
}
