import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.util.Optional;

public class Logger_Test  implements TestWatcher {
    Log log=new Log();
    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        String testName = context.getDisplayName();
        String testFailCause = cause.getMessage() ;
        log.error(testName + " FAILED with cause : " + testFailCause);
    }

    @Override
    public void testSuccessful(ExtensionContext context) {
        String testName = context.getDisplayName();
        log.info(testName+"Passed");
    }

    @Override
    public void testAborted(ExtensionContext context, Throwable cause) {
    }
    @Override
    public void testDisabled(ExtensionContext context, Optional<String> reason) {

    }
}
