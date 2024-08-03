package junit5test;

import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.runners.Suite.SuiteClasses;

@SuiteClasses(junit5tests.Taggingtest.class)

@IncludeTags(value = { "regression","smoke" })
@ExcludeTags("sanity")


public class JUnit5Runner {

}
