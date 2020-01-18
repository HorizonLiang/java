/**
 * description:
 * date:
 * author
 * version
 */

package annotation;

import org.junit.Test;

public class Testable {
    public void execute(){
        System.out.println("Executing...");
    }
    @Test
    void testExecute(){
        execute();
    }
}
